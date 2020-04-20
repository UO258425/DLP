package codegeneration;

import ast.expression.*;

public class ValueCGVisitor extends AbstractCGVisitor<Void, Void> {

    private CodeGenerator cg;

    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator cg){
        this.cg = cg;
    }

    public void setAddressCGVisitor(AddressCGVisitor av){
        addressCGVisitor = av;
    }



    /*
      value[[CharacterLiteral: expression -> CHAR_CONSTANT ]]=
          <pushb> expression.value
    */
    @Override
    public Void visit(CharacterLiteral characterLiteral, Void param){
        cg.push(characterLiteral.getType().getSuffix(), characterLiteral.getValue());
        return null;
    }

    /*
      value[[IntegerLiteral: expression -> INT_CONSTANT]] =
          <pushi> expression.value
    */
    @Override
    public Void visit(IntegerLiteral integerLiteral, Void param){
        cg.push(integerLiteral.getType().getSuffix(), integerLiteral.getValue());
        return null;
    }

    /*
      value[[DoubleLiteral: expression -> REAL_CONSTANT]] =
          <pushf> expression.value
    */
    @Override
    public Void visit(DoubleLiteral doubleLiteral, Void param){
        cg.push(doubleLiteral.getType().getSuffix(), doubleLiteral.getValue());
        return null;
    }

    /*
      value[[Arithmetic: expression1 -> expression2 (+|-|*|/) expression3)]] =
           value[[expression2]]
           value[[expression3]]
           cg.arithmetic(operation, expression1.type)
    */
    @Override
    public Void visit(ArithmeticExpression arithmeticExpression, Void param){
        arithmeticExpression.getLeft().accept(this, null);
        arithmeticExpression.getRight().accept(this, null);
        cg.arithmetic(arithmeticExpression.getOperation(), arithmeticExpression.getType().getSuffix());
        return null;
    }

    /*
      value[[Cast: expression1 -> type expression2]] =
          value[[expression2]]
          expression2.type.suffix <2> type.suffix
    */
    @Override
    public Void visit(Cast cast, Void param){
        cast.getExpression().accept(this, param);
        cg.cast(cast.getExpression().getType().getSuffix(), cast.getType().getSuffix());
        return null;
    }

    /*
      value[[Variable: expression1 -> ID]]=
          address[[expression1]]
          <load> exppression1.type.suffix()
    */
    @Override
    public Void visit(Variable variable, Void param){
        variable.accept(addressCGVisitor, param);
        cg.load(variable.getType().getSuffix());
        return null;
    }

    /*
      value[[LogicalExpression: expression1 -> expression2 ('>'|'>='|'<'|'<='|'!='|'=='|'&&'|'||') expression3)]]=
           value[[expression2]]
           value[[expression3]]
           cg.logical(operation, expression1.type)
     */
    @Override
    public Void visit(LogicalExpression logicalExpression, Void param){
        logicalExpression.getLeft().accept(this, null);
        logicalExpression.getRight().accept(this, null);
        cg.logical(logicalExpression.getOperation(), logicalExpression.getType().getSuffix());
        return null;
    }
}
