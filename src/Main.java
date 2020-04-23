import ast.program.Program;
import codegeneration.*;
import error.ErrorHandler;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.CmmLexer;
import parser.CmmParser;
import semantic.IdentificationVisitor;
import semantic.TypeCheckingVisitor;

public class Main {
	
	public static void main(String... args) throws Exception {
		   if (args.length<2) {
		        System.err.println("Please, pass me the input file and the output file.");
		        return;
		    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		CmmLexer lexer = new CmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		CmmParser parser = new CmmParser(tokens);	
		Program ast = parser.program().ast;

		//Semantic phase
		IdentificationVisitor identificationVisitor = new IdentificationVisitor();
		identificationVisitor.visit(ast, null);

		TypeCheckingVisitor typeCheckingVisitor = new TypeCheckingVisitor();
		typeCheckingVisitor.visit(ast, null);

		//Code generation phase
		OffsetVisitor offsetVisitor = new OffsetVisitor();
		offsetVisitor.visit(ast, null);

		String outputFileName = args[1];
		CodeGenerator codeGenerator = new CodeGenerator(outputFileName);
		codeGenerator.sourceComment(args[0]);

		ExecuteCGVisitor executeCGVisitor = new ExecuteCGVisitor(codeGenerator);
		AddressCGVisitor addressCGVisitor = new AddressCGVisitor(codeGenerator);
		ValueCGVisitor valueCGVisitor = new ValueCGVisitor(codeGenerator);

		valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
		executeCGVisitor.setAddressCGVisitor(addressCGVisitor);
		executeCGVisitor.setValueCGVisitor(valueCGVisitor);
		addressCGVisitor.setValueCGVisitor(valueCGVisitor);

		executeCGVisitor.visit(ast, null);

		if(ErrorHandler.getInstance().anyError())
			ErrorHandler.getInstance().showErrors(System.err);

		IntrospectorModel model = new IntrospectorModel("Program", ast);
		new IntrospectorTree("Program", model);

	}



}
