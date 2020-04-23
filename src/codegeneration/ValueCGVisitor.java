package codegeneration;

import ast.expression.*;
import ast.statement.FunctionInvocation;

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
        cg.push(characterLiteral.getType().getSuffix(), Integer.valueOf(characterLiteral.getValue()));
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
      value[[LogicalExpression: expression1 -> expression2 ('&&'|'||') expression3)]]=
           value[[expression2]]
           value[[expression3]]
           cg.logical(operation, expression1.type)
     */
    @Override
    public Void visit(LogicalExpression logicalExpression, Void param){
        logicalExpression.getLeft().accept(this, param);
        logicalExpression.getRight().accept(this, param);
        cg.logical(logicalExpression.getOperation(), logicalExpression.getType().getSuffix());
        return null;
    }

    /*
    value[[ComparisonExpression: expression1 -> expression2 ('>'|'>='|'<'|'<='|'!='|'==') expression3]]=
        value[[expression2]]
        value[[expression3]]
        cg.comparison(operation, expression1.type)
    */
    @Override
    public Void visit(ComparisonExpression comparisonExpression, Void param){
        comparisonExpression.getLeft().accept(this, param);
        comparisonExpression.getRight().accept(this, param);
        cg.comparison(comparisonExpression.getOperation(), comparisonExpression.getType().getSuffix());
        return null;
    }


    /*
    value[[FieldAccess exp1 -> exp2 ID]]=
        address[[exp1]]
        <load > exp1.type.suffix
     */
    @Override
    public Void visit(FieldAccess fieldAccess, Void param){
        fieldAccess.accept(addressCGVisitor, param);
        cg.load(fieldAccess.getType().getSuffix());
        return null;
    }

    /*
    value[[Indexing: exp1 -> exp2 exp3]]=
        address[[exp1]]
        <load > exp1.type.suffix
    */
    @Override
    public Void visit(ArrayIndexing arrayIndexing, Void param){
        arrayIndexing.accept(addressCGVisitor, param);
        cg.load(arrayIndexing.getType().getSuffix());
        return null;
    }

    /*
    value[[FunctionInvocation: expression -> ID expressions*]]=
        expressions*.foreach(exp -> value[[exp]])
        <call > ID
    */
    @Override
    public Void visit(FunctionInvocation functionInvocation, Void param){
        functionInvocation.getParameters().forEach(exp ->  exp.accept(this, param));
        cg.call(functionInvocation.getFunction().getName());
        return null;
    }


    /*
    value[[UnaryNot: exp1 -> exp2]]=
        value[[exp2]]
        <not>
     */
    @Override
    public Void visit(UnaryNot unaryNot, Void param){
        unaryNot.getExpression().accept(this, param);
        cg.not();
        return null;
    }

    /*
    value[[UnaryNot: exp1 -> exp2]]=
        <push> exp2.type.suffix < > 0
        value[[exp2]]
        <sub> exp2.type.suffix
    */
    @Override
    public Void visit(UnaryMinus unaryMinus, Void param){
        cg.push(unaryMinus.getExpression().getType().getSuffix(), 0);
        unaryMinus.getExpression().accept(this, param);
        cg.sub(unaryMinus.getType().getSuffix());
        return null;
    }


}
