// Generated from C:/Users/Carlos Manrique/IdeaProjects/CmmCompiler/src/parser\Cmm.g4 by ANTLR 4.8
package parser;


import ast.*;
import ast.expression.*;
import ast.program.*;
import ast.statement.*;
import ast.type.*;
import java.util.*;
import parser.*;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, WHITE_SPACE=37, NEW_LINE=38, 
		TAB=39, SINGLE_LINE_COMMENT=40, MULTILINE_COMMENT=41, REAL_CONSTANT=42, 
		ID=43, INT_CONSTANT=44, CHAR_CONSTANT=45;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_mainFunction = 2, RULE_variableDefinition = 3, 
		RULE_functionDefinition = 4, RULE_functionParameters = 5, RULE_functionBlock = 6, 
		RULE_expression = 7, RULE_statement = 8, RULE_functionArguments = 9, RULE_block = 10, 
		RULE_type = 11, RULE_voidType = 12, RULE_recordType = 13, RULE_recordField = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "mainFunction", "variableDefinition", "functionDefinition", 
			"functionParameters", "functionBlock", "expression", "statement", "functionArguments", 
			"block", "type", "voidType", "recordType", "recordField"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'('", "')'", "','", "';'", "'{'", "'}'", "'['", "']'", 
			"'.'", "'-'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", 
			"'!='", "'=='", "'&&'", "'||'", "'!'", "'='", "'while'", "'if'", "'else'", 
			"'return'", "'read'", "'write'", "'int'", "'char'", "'double'", "'void'", 
			"'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WHITE_SPACE", "NEW_LINE", "TAB", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
			"REAL_CONSTANT", "ID", "INT_CONSTANT", "CHAR_CONSTANT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> definitions = new ArrayList<Definition>();
		public DefinitionContext definition;
		public MainFunctionContext mainFunction;
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					((ProgramContext)_localctx).definition = definition();
					_localctx.definitions.addAll(((ProgramContext)_localctx).definition.ast);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			((ProgramContext)_localctx).mainFunction = mainFunction();
			_localctx.definitions.add(((ProgramContext)_localctx).mainFunction.ast);
			setState(40);
			match(EOF);
			((ProgramContext)_localctx).ast =  new Program(0,0,_localctx.definitions);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public VariableDefinitionContext variableDefinition;
		public FunctionDefinitionContext functionDefinition;
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((DefinitionContext)_localctx).variableDefinition = variableDefinition();
				 _localctx.ast.addAll(((DefinitionContext)_localctx).variableDefinition.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				((DefinitionContext)_localctx).functionDefinition = functionDefinition();
				 _localctx.ast.add(((DefinitionContext)_localctx).functionDefinition.ast);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainFunctionContext extends ParserRuleContext {
		public Definition ast;
		public VoidTypeContext voidType;
		public Token main;
		public FunctionBlockContext functionBlock;
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			((MainFunctionContext)_localctx).voidType = voidType();
			setState(52);
			((MainFunctionContext)_localctx).main = match(T__0);
			setState(53);
			match(T__1);
			setState(54);
			match(T__2);
			setState(55);
			((MainFunctionContext)_localctx).functionBlock = functionBlock();
			 ((MainFunctionContext)_localctx).ast =  new FunctionDefinition((((MainFunctionContext)_localctx).voidType!=null?(((MainFunctionContext)_localctx).voidType.start):null).getLine(), (((MainFunctionContext)_localctx).voidType!=null?(((MainFunctionContext)_localctx).voidType.start):null).getCharPositionInLine()+1,
			                         ((MainFunctionContext)_localctx).functionBlock.ast,
			                         new FunctionType((((MainFunctionContext)_localctx).voidType!=null?(((MainFunctionContext)_localctx).voidType.start):null).getLine(), (((MainFunctionContext)_localctx).voidType!=null?(((MainFunctionContext)_localctx).voidType.start):null).getCharPositionInLine()+1,((MainFunctionContext)_localctx).voidType.ast),
			                         "main");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<VariableDefinition>();
		public TypeContext type;
		public Token id1;
		public Token id2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((VariableDefinitionContext)_localctx).type = type(0);
			setState(59);
			((VariableDefinitionContext)_localctx).id1 = match(ID);
			 _localctx.ast.add(new VariableDefinition((((VariableDefinitionContext)_localctx).type!=null?(((VariableDefinitionContext)_localctx).type.start):null).getLine(), (((VariableDefinitionContext)_localctx).type!=null?(((VariableDefinitionContext)_localctx).type.start):null).getCharPositionInLine()+1, ((VariableDefinitionContext)_localctx).type.ast, (((VariableDefinitionContext)_localctx).id1!=null?((VariableDefinitionContext)_localctx).id1.getText():null)));
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(61);
				match(T__3);
				setState(62);
				((VariableDefinitionContext)_localctx).id2 = match(ID);
				 _localctx.ast.add(new VariableDefinition((((VariableDefinitionContext)_localctx).type!=null?(((VariableDefinitionContext)_localctx).type.start):null).getLine(), (((VariableDefinitionContext)_localctx).type!=null?(((VariableDefinitionContext)_localctx).type.start):null).getCharPositionInLine()+1, ((VariableDefinitionContext)_localctx).type.ast, (((VariableDefinitionContext)_localctx).id2!=null?((VariableDefinitionContext)_localctx).id2.getText():null)));
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public Definition ast;
		public TypeContext type;
		public Token ID;
		public FunctionParametersContext functionParameters;
		public FunctionBlockContext functionBlock;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public FunctionParametersContext functionParameters() {
			return getRuleContext(FunctionParametersContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((FunctionDefinitionContext)_localctx).type = type(0);
			setState(72);
			((FunctionDefinitionContext)_localctx).ID = match(ID);
			setState(73);
			match(T__1);
			setState(74);
			((FunctionDefinitionContext)_localctx).functionParameters = functionParameters();
			setState(75);
			match(T__2);
			setState(76);
			((FunctionDefinitionContext)_localctx).functionBlock = functionBlock();
			((FunctionDefinitionContext)_localctx).ast =  new FunctionDefinition((((FunctionDefinitionContext)_localctx).type!=null?(((FunctionDefinitionContext)_localctx).type.start):null).getLine(), (((FunctionDefinitionContext)_localctx).type!=null?(((FunctionDefinitionContext)_localctx).type.start):null).getCharPositionInLine()+1,
			                ((FunctionDefinitionContext)_localctx).functionBlock.ast,
			                new FunctionType((((FunctionDefinitionContext)_localctx).type!=null?(((FunctionDefinitionContext)_localctx).type.start):null).getLine(), (((FunctionDefinitionContext)_localctx).type!=null?(((FunctionDefinitionContext)_localctx).type.start):null).getCharPositionInLine()+1, ((FunctionDefinitionContext)_localctx).type.ast, ((FunctionDefinitionContext)_localctx).functionParameters.ast),
			                (((FunctionDefinitionContext)_localctx).ID!=null?((FunctionDefinitionContext)_localctx).ID.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParametersContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<VariableDefinition>();
		public TypeContext t1;
		public Token id1;
		public TypeContext t2;
		public Token id2;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public FunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameters; }
	}

	public final FunctionParametersContext functionParameters() throws RecognitionException {
		FunctionParametersContext _localctx = new FunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionParameters);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				((FunctionParametersContext)_localctx).t1 = type(0);
				setState(81);
				((FunctionParametersContext)_localctx).id1 = match(ID);
				 _localctx.ast.add(new VariableDefinition((((FunctionParametersContext)_localctx).t1!=null?(((FunctionParametersContext)_localctx).t1.start):null).getLine(), (((FunctionParametersContext)_localctx).t1!=null?(((FunctionParametersContext)_localctx).t1.start):null).getCharPositionInLine()+1, ((FunctionParametersContext)_localctx).t1.ast, (((FunctionParametersContext)_localctx).id1!=null?((FunctionParametersContext)_localctx).id1.getText():null)));
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(83);
					match(T__3);
					setState(84);
					((FunctionParametersContext)_localctx).t2 = type(0);
					setState(85);
					((FunctionParametersContext)_localctx).id2 = match(ID);
					 _localctx.ast.add(new VariableDefinition((((FunctionParametersContext)_localctx).t2!=null?(((FunctionParametersContext)_localctx).t2.start):null).getLine(), (((FunctionParametersContext)_localctx).t2!=null?(((FunctionParametersContext)_localctx).t2.start):null).getCharPositionInLine()+1, ((FunctionParametersContext)_localctx).t2.ast, (((FunctionParametersContext)_localctx).id2!=null?((FunctionParametersContext)_localctx).id2.getText():null)));
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public VariableDefinitionContext variableDefinition;
		public StatementContext statement;
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__5);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				{
				setState(96);
				((FunctionBlockContext)_localctx).variableDefinition = variableDefinition();
				_localctx.ast.addAll(((FunctionBlockContext)_localctx).variableDefinition.ast);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__10) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0)) {
				{
				{
				setState(104);
				((FunctionBlockContext)_localctx).statement = statement();
				_localctx.ast.addAll(((FunctionBlockContext)_localctx).statement.ast);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext var;
		public ExpressionContext exp;
		public ExpressionContext exp1;
		public Token p;
		public TypeContext type;
		public ExpressionContext expression;
		public Token ID;
		public FunctionArgumentsContext functionArguments;
		public Token op;
		public Token INT_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token REAL_CONSTANT;
		public ExpressionContext exp2;
		public ExpressionContext index;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(CmmParser.REAL_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(115);
				((ExpressionContext)_localctx).p = match(T__1);
				setState(116);
				((ExpressionContext)_localctx).type = type(0);
				setState(117);
				match(T__2);
				setState(118);
				((ExpressionContext)_localctx).expression = expression(15);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).p.getLine(), ((ExpressionContext)_localctx).p.getCharPositionInLine()+1,
				                                  ((ExpressionContext)_localctx).type.ast, ((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 2:
				{
				setState(121);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(122);
				match(T__1);
				setState(123);
				((ExpressionContext)_localctx).functionArguments = functionArguments();
				setState(124);
				match(T__2);
				 ((ExpressionContext)_localctx).ast =  new FunctionInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,
				                                      new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)),
				                                      ((ExpressionContext)_localctx).functionArguments.ast);
				}
				break;
			case 3:
				{
				setState(127);
				((ExpressionContext)_localctx).op = match(T__1);
				setState(128);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(129);
				match(T__2);
				   ((ExpressionContext)_localctx).expression.ast.setLine(((ExpressionContext)_localctx).op.getLine());
				                    ((ExpressionContext)_localctx).expression.ast.setColumn(((ExpressionContext)_localctx).op.getCharPositionInLine()+1);
				                    ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 4:
				{
				setState(132);
				((ExpressionContext)_localctx).op = match(T__10);
				setState(133);
				((ExpressionContext)_localctx).expression = expression(10);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1, ((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 5:
				{
				setState(136);
				((ExpressionContext)_localctx).op = match(T__23);
				setState(137);
				((ExpressionContext)_localctx).expression = expression(5);
				 ((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1, ((ExpressionContext)_localctx).expression.ast);
				}
				break;
			case 6:
				{
				setState(140);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 7:
				{
				setState(142);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntegerLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(), ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,
				                                        LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 8:
				{
				setState(144);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharacterLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,
				                                        LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 9:
				{
				setState(146);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,
				                                                        LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(151);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(10);
						 ((ExpressionContext)_localctx).ast =  new ArithmeticExpression((((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getLine(), (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getCharPositionInLine()+1,
						                                                            (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).exp1.ast, ((ExpressionContext)_localctx).exp2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(156);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__14) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(9);
						 ((ExpressionContext)_localctx).ast =  new ArithmeticExpression((((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getLine(), (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getCharPositionInLine()+1,
						                                                            (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).exp1.ast, ((ExpressionContext)_localctx).exp2.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(161);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(8);
						 ((ExpressionContext)_localctx).ast =  new ComparisonExpression((((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getLine(), (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getCharPositionInLine()+1,
						                                                         (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).exp1.ast, ((ExpressionContext)_localctx).exp2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(166);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(7);
						 ((ExpressionContext)_localctx).ast =  new LogicalExpression((((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getLine(), (((ExpressionContext)_localctx).exp1!=null?(((ExpressionContext)_localctx).exp1.start):null).getCharPositionInLine()+1,
						                                                  (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).exp1.ast, ((ExpressionContext)_localctx).exp2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.var = _prevctx;
						_localctx.var = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(171);
						match(T__7);
						setState(172);
						((ExpressionContext)_localctx).index = ((ExpressionContext)_localctx).expression = expression(0);
						setState(173);
						match(T__8);
						 ((ExpressionContext)_localctx).ast =  new ArrayIndexing((((ExpressionContext)_localctx).var!=null?(((ExpressionContext)_localctx).var.start):null).getLine(), (((ExpressionContext)_localctx).var!=null?(((ExpressionContext)_localctx).var.start):null).getCharPositionInLine()+1,
						                                                     ((ExpressionContext)_localctx).var.ast, ((ExpressionContext)_localctx).index.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(177);
						match(T__9);
						setState(178);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new FieldAccess((((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getLine(), (((ExpressionContext)_localctx).exp!=null?(((ExpressionContext)_localctx).exp.start):null).getCharPositionInLine()+1,
						                                                    ((ExpressionContext)_localctx).exp.ast, (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public IfElse ifelse = new IfElse(0,0);
		public MultipleAssignment ma = new MultipleAssignment(0,0);
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public ExpressionContext exp3;
		public ExpressionContext exp4;
		public Token w;
		public ExpressionContext expression;
		public BlockContext block;
		public Token i;
		public BlockContext b1;
		public BlockContext b2;
		public Token r;
		public Token read;
		public ExpressionContext exps2;
		public Token write;
		public Token ID;
		public FunctionArgumentsContext functionArguments;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				((StatementContext)_localctx).exp1 = expression(0);
				 _localctx.ma.setLine((((StatementContext)_localctx).exp1!=null?(((StatementContext)_localctx).exp1.start):null).getLine()); _localctx.ma.setColumn((((StatementContext)_localctx).exp1!=null?(((StatementContext)_localctx).exp1.start):null).getCharPositionInLine()+1);
				                              _localctx.ma.addLeft(((StatementContext)_localctx).exp1.ast);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(187);
					match(T__3);
					setState(188);
					((StatementContext)_localctx).exp2 = expression(0);
					_localctx.ma.addLeft(((StatementContext)_localctx).exp2.ast);
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(T__24);
				setState(197);
				((StatementContext)_localctx).exp3 = expression(0);
				_localctx.ma.addRight(((StatementContext)_localctx).exp3.ast);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(199);
					match(T__3);
					setState(200);
					((StatementContext)_localctx).exp4 = expression(0);
					_localctx.ma.addRight(((StatementContext)_localctx).exp4.ast);
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(T__4);
				 _localctx.ast.add(_localctx.ma);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				((StatementContext)_localctx).exp1 = expression(0);
				setState(212);
				match(T__24);
				setState(213);
				((StatementContext)_localctx).exp2 = expression(0);
				setState(214);
				match(T__4);
				 _localctx.ast.add(new Assignment((((StatementContext)_localctx).exp1!=null?(((StatementContext)_localctx).exp1.start):null).getLine(), (((StatementContext)_localctx).exp1!=null?(((StatementContext)_localctx).exp1.start):null).getCharPositionInLine()+1,
				                                ((StatementContext)_localctx).exp1.ast, ((StatementContext)_localctx).exp2.ast));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				((StatementContext)_localctx).w = match(T__25);
				setState(218);
				match(T__1);
				setState(219);
				((StatementContext)_localctx).expression = expression(0);
				setState(220);
				match(T__2);
				setState(221);
				((StatementContext)_localctx).block = block();
				 _localctx.ast.add(new While(((StatementContext)_localctx).w.getLine(), ((StatementContext)_localctx).w.getCharPositionInLine()+1,
				                                ((StatementContext)_localctx).expression.ast, ((StatementContext)_localctx).block.ast));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				((StatementContext)_localctx).i = match(T__26);
				setState(225);
				match(T__1);
				setState(226);
				((StatementContext)_localctx).expression = expression(0);
				setState(227);
				match(T__2);
				setState(228);
				((StatementContext)_localctx).b1 = block();
				 _localctx.ifelse.setLine(((StatementContext)_localctx).i.getLine());
				                  _localctx.ifelse.setColumn(((StatementContext)_localctx).i.getCharPositionInLine()+1);
				                  _localctx.ifelse.setCondition(((StatementContext)_localctx).expression.ast);
				                  _localctx.ifelse.setIfBody(((StatementContext)_localctx).b1.ast);
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(230);
					match(T__27);
					setState(231);
					((StatementContext)_localctx).b2 = block();
					 _localctx.ifelse.setElseBody(((StatementContext)_localctx).b2.ast);
					}
					break;
				}
				 _localctx.ast.add(_localctx.ifelse);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				((StatementContext)_localctx).r = match(T__28);
				setState(239);
				((StatementContext)_localctx).expression = expression(0);
				setState(240);
				match(T__4);
				 _localctx.ast.add(new Return(((StatementContext)_localctx).r.getLine(), ((StatementContext)_localctx).r.getCharPositionInLine()+1, ((StatementContext)_localctx).expression.ast));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				((StatementContext)_localctx).read = match(T__29);
				setState(244);
				((StatementContext)_localctx).exp1 = expression(0);
				 _localctx.ast.add(new Read(((StatementContext)_localctx).read.getLine(), ((StatementContext)_localctx).read.getCharPositionInLine()+1, ((StatementContext)_localctx).exp1.ast));
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(246);
					match(T__3);
					setState(247);
					((StatementContext)_localctx).exps2 = expression(0);
					 _localctx.ast.add(new Read(((StatementContext)_localctx).read.getLine(), ((StatementContext)_localctx).read.getCharPositionInLine()+1, ((StatementContext)_localctx).exps2.ast)); 
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(T__4);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(257);
				((StatementContext)_localctx).write = match(T__30);
				setState(258);
				((StatementContext)_localctx).exp1 = expression(0);
				 _localctx.ast.add(new Write(((StatementContext)_localctx).write.getLine(), ((StatementContext)_localctx).write.getCharPositionInLine()+1, ((StatementContext)_localctx).exp1.ast));
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(260);
					match(T__3);
					setState(261);
					((StatementContext)_localctx).exps2 = expression(0);
					 _localctx.ast.add(new Write(((StatementContext)_localctx).write.getLine(), ((StatementContext)_localctx).write.getCharPositionInLine()+1, ((StatementContext)_localctx).exps2.ast)); 
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(269);
				match(T__4);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				((StatementContext)_localctx).ID = match(ID);
				setState(272);
				match(T__1);
				setState(273);
				((StatementContext)_localctx).functionArguments = functionArguments();
				setState(274);
				match(T__2);
				setState(275);
				match(T__4);
				 _localctx.ast.add(new FunctionInvocation(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1,
				                                                new Variable(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1, (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)),
				                                                ((StatementContext)_localctx).functionArguments.ast));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<Expression>();
		public ExpressionContext exp1;
		public ExpressionContext exp2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionArguments);
		int _la;
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__1:
			case T__10:
			case T__23:
			case REAL_CONSTANT:
			case ID:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				((FunctionArgumentsContext)_localctx).exp1 = expression(0);
				_localctx.ast.add(((FunctionArgumentsContext)_localctx).exp1.ast);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(283);
					match(T__3);
					setState(284);
					((FunctionArgumentsContext)_localctx).exp2 = expression(0);
					_localctx.ast.add(((FunctionArgumentsContext)_localctx).exp2.ast);
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__10:
			case T__23:
			case T__25:
			case T__26:
			case T__28:
			case T__29:
			case T__30:
			case REAL_CONSTANT:
			case ID:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				((BlockContext)_localctx).statement = statement();
				 _localctx.ast.addAll(((BlockContext)_localctx).statement.ast);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__5);
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(298);
					((BlockContext)_localctx).statement = statement();
					_localctx.ast.addAll(((BlockContext)_localctx).statement.ast);
					}
					}
					setState(303); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__10) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << REAL_CONSTANT) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT))) != 0) );
				setState(305);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public TypeContext at;
		public Token t;
		public RecordTypeContext recordType;
		public VoidTypeContext voidType;
		public Token INT_CONSTANT;
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				{
				setState(310);
				((TypeContext)_localctx).t = match(T__31);
				 ((TypeContext)_localctx).ast =  new IntegerType(((TypeContext)_localctx).t.getLine(), ((TypeContext)_localctx).t.getCharPositionInLine()+1);
				}
				break;
			case T__32:
				{
				setState(312);
				((TypeContext)_localctx).t = match(T__32);
				 ((TypeContext)_localctx).ast =  new CharacterType(((TypeContext)_localctx).t.getLine(), ((TypeContext)_localctx).t.getCharPositionInLine()+1);
				}
				break;
			case T__33:
				{
				setState(314);
				((TypeContext)_localctx).t = match(T__33);
				 ((TypeContext)_localctx).ast =  new DoubleType(((TypeContext)_localctx).t.getLine(), ((TypeContext)_localctx).t.getCharPositionInLine()+1);
				}
				break;
			case T__35:
				{
				setState(316);
				((TypeContext)_localctx).recordType = recordType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).recordType.ast;
				}
				break;
			case T__34:
				{
				setState(319);
				((TypeContext)_localctx).voidType = voidType();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).voidType.ast;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.at = _prevctx;
					_localctx.at = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(324);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(325);
					match(T__7);
					setState(326);
					((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
					setState(327);
					match(T__8);
					 ((TypeContext)_localctx).ast =  ArrayType.createArray((((TypeContext)_localctx).at!=null?(((TypeContext)_localctx).at.start):null).getLine(), (((TypeContext)_localctx).at!=null?(((TypeContext)_localctx).at.start):null).getCharPositionInLine()+1,
					                                       ((TypeContext)_localctx).at.ast, LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)));
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VoidTypeContext extends ParserRuleContext {
		public VoidType ast;
		public Token v;
		public VoidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidType; }
	}

	public final VoidTypeContext voidType() throws RecognitionException {
		VoidTypeContext _localctx = new VoidTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_voidType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			((VoidTypeContext)_localctx).v = match(T__34);
			((VoidTypeContext)_localctx).ast =  new VoidType(((VoidTypeContext)_localctx).v.getLine(), ((VoidTypeContext)_localctx).v.getCharPositionInLine()+1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordTypeContext extends ParserRuleContext {
		public Type ast;
		public List<RecordField> fields = new ArrayList<RecordField>();
		public Token struct;
		public RecordFieldContext recordField;
		public List<RecordFieldContext> recordField() {
			return getRuleContexts(RecordFieldContext.class);
		}
		public RecordFieldContext recordField(int i) {
			return getRuleContext(RecordFieldContext.class,i);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			((RecordTypeContext)_localctx).struct = match(T__35);
			setState(338);
			match(T__5);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) {
				{
				{
				setState(339);
				((RecordTypeContext)_localctx).recordField = recordField();
				_localctx.fields.addAll(((RecordTypeContext)_localctx).recordField.ast);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			match(T__6);
			 ((RecordTypeContext)_localctx).ast =  new RecordType(((RecordTypeContext)_localctx).struct.getLine(), ((RecordTypeContext)_localctx).struct.getCharPositionInLine()+1, _localctx.fields);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordFieldContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<RecordField>();
		public TypeContext type;
		public Token id1;
		public Token id2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public RecordFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordField; }
	}

	public final RecordFieldContext recordField() throws RecognitionException {
		RecordFieldContext _localctx = new RecordFieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_recordField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			((RecordFieldContext)_localctx).type = type(0);
			setState(351);
			((RecordFieldContext)_localctx).id1 = match(ID);
			 _localctx.ast.add(new RecordField((((RecordFieldContext)_localctx).type!=null?(((RecordFieldContext)_localctx).type.start):null).getLine(), (((RecordFieldContext)_localctx).type!=null?(((RecordFieldContext)_localctx).type.start):null).getCharPositionInLine()+1, ((RecordFieldContext)_localctx).type.ast, (((RecordFieldContext)_localctx).id1!=null?((RecordFieldContext)_localctx).id1.getText():null)));
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(353);
				match(T__3);
				setState(354);
				((RecordFieldContext)_localctx).id2 = match(ID);
				 _localctx.ast.add(new RecordField((((RecordFieldContext)_localctx).type!=null?(((RecordFieldContext)_localctx).type.start):null).getLine(), (((RecordFieldContext)_localctx).type!=null?(((RecordFieldContext)_localctx).type.start):null).getCharPositionInLine()+1, ((RecordFieldContext)_localctx).type.ast, (((RecordFieldContext)_localctx).id2!=null?((RecordFieldContext)_localctx).id2.getText():null)));
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 11:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\7\2$\n\2"+
		"\f\2\16\2\'\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\64\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5C\n\5\f\5\16"+
		"\5F\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\5\7`\n\7\3\b\3\b\3\b\3\b\7\bf\n"+
		"\b\f\b\16\bi\13\b\3\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0097\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b7\n\t\f\t"+
		"\16\t\u00ba\13\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c2\n\n\f\n\16\n\u00c5"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ce\n\n\f\n\16\n\u00d1\13\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ed\n\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00fd\n\n\f\n\16\n\u0100\13\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u010b\n\n\f\n\16\n\u010e\13\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0119\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0122\n\13\f\13\16\13\u0125\13\13\5\13\u0127\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u0130\n\f\r\f\16\f\u0131\3\f\3\f\5\f\u0136"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0145\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u014c\n\r\f\r\16\r\u014f\13\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\7\17\u0159\n\17\f\17\16\17\u015c\13\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0167\n\20\f\20\16\20\u016a"+
		"\13\20\3\20\3\20\3\20\2\4\20\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\6\3\2\16\20\4\2\r\r\21\21\3\2\22\27\3\2\30\31\2\u018a\2%\3\2\2\2"+
		"\4\63\3\2\2\2\6\65\3\2\2\2\b<\3\2\2\2\nI\3\2\2\2\f_\3\2\2\2\16a\3\2\2"+
		"\2\20\u0096\3\2\2\2\22\u0118\3\2\2\2\24\u0126\3\2\2\2\26\u0135\3\2\2\2"+
		"\30\u0144\3\2\2\2\32\u0150\3\2\2\2\34\u0153\3\2\2\2\36\u0160\3\2\2\2 "+
		"!\5\4\3\2!\"\b\2\1\2\"$\3\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2"+
		"\2&(\3\2\2\2\'%\3\2\2\2()\5\6\4\2)*\b\2\1\2*+\7\2\2\3+,\b\2\1\2,\3\3\2"+
		"\2\2-.\5\b\5\2./\b\3\1\2/\64\3\2\2\2\60\61\5\n\6\2\61\62\b\3\1\2\62\64"+
		"\3\2\2\2\63-\3\2\2\2\63\60\3\2\2\2\64\5\3\2\2\2\65\66\5\32\16\2\66\67"+
		"\7\3\2\2\678\7\4\2\289\7\5\2\29:\5\16\b\2:;\b\4\1\2;\7\3\2\2\2<=\5\30"+
		"\r\2=>\7-\2\2>D\b\5\1\2?@\7\6\2\2@A\7-\2\2AC\b\5\1\2B?\3\2\2\2CF\3\2\2"+
		"\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\7\2\2H\t\3\2\2\2IJ\5\30"+
		"\r\2JK\7-\2\2KL\7\4\2\2LM\5\f\7\2MN\7\5\2\2NO\5\16\b\2OP\b\6\1\2P\13\3"+
		"\2\2\2Q`\3\2\2\2RS\5\30\r\2ST\7-\2\2T\\\b\7\1\2UV\7\6\2\2VW\5\30\r\2W"+
		"X\7-\2\2XY\b\7\1\2Y[\3\2\2\2ZU\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2"+
		"]`\3\2\2\2^\\\3\2\2\2_Q\3\2\2\2_R\3\2\2\2`\r\3\2\2\2ag\7\b\2\2bc\5\b\5"+
		"\2cd\b\b\1\2df\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2ho\3\2\2"+
		"\2ig\3\2\2\2jk\5\22\n\2kl\b\b\1\2ln\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2"+
		"\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\t\2\2s\17\3\2\2\2tu\b\t\1\2uv\7"+
		"\4\2\2vw\5\30\r\2wx\7\5\2\2xy\5\20\t\21yz\b\t\1\2z\u0097\3\2\2\2{|\7-"+
		"\2\2|}\7\4\2\2}~\5\24\13\2~\177\7\5\2\2\177\u0080\b\t\1\2\u0080\u0097"+
		"\3\2\2\2\u0081\u0082\7\4\2\2\u0082\u0083\5\20\t\2\u0083\u0084\7\5\2\2"+
		"\u0084\u0085\b\t\1\2\u0085\u0097\3\2\2\2\u0086\u0087\7\r\2\2\u0087\u0088"+
		"\5\20\t\f\u0088\u0089\b\t\1\2\u0089\u0097\3\2\2\2\u008a\u008b\7\32\2\2"+
		"\u008b\u008c\5\20\t\7\u008c\u008d\b\t\1\2\u008d\u0097\3\2\2\2\u008e\u008f"+
		"\7-\2\2\u008f\u0097\b\t\1\2\u0090\u0091\7.\2\2\u0091\u0097\b\t\1\2\u0092"+
		"\u0093\7/\2\2\u0093\u0097\b\t\1\2\u0094\u0095\7,\2\2\u0095\u0097\b\t\1"+
		"\2\u0096t\3\2\2\2\u0096{\3\2\2\2\u0096\u0081\3\2\2\2\u0096\u0086\3\2\2"+
		"\2\u0096\u008a\3\2\2\2\u0096\u008e\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0092"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u00b8\3\2\2\2\u0098\u0099\f\13\2\2"+
		"\u0099\u009a\t\2\2\2\u009a\u009b\5\20\t\f\u009b\u009c\b\t\1\2\u009c\u00b7"+
		"\3\2\2\2\u009d\u009e\f\n\2\2\u009e\u009f\t\3\2\2\u009f\u00a0\5\20\t\13"+
		"\u00a0\u00a1\b\t\1\2\u00a1\u00b7\3\2\2\2\u00a2\u00a3\f\t\2\2\u00a3\u00a4"+
		"\t\4\2\2\u00a4\u00a5\5\20\t\n\u00a5\u00a6\b\t\1\2\u00a6\u00b7\3\2\2\2"+
		"\u00a7\u00a8\f\b\2\2\u00a8\u00a9\t\5\2\2\u00a9\u00aa\5\20\t\t\u00aa\u00ab"+
		"\b\t\1\2\u00ab\u00b7\3\2\2\2\u00ac\u00ad\f\16\2\2\u00ad\u00ae\7\n\2\2"+
		"\u00ae\u00af\5\20\t\2\u00af\u00b0\7\13\2\2\u00b0\u00b1\b\t\1\2\u00b1\u00b7"+
		"\3\2\2\2\u00b2\u00b3\f\r\2\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5\7-\2\2\u00b5"+
		"\u00b7\b\t\1\2\u00b6\u0098\3\2\2\2\u00b6\u009d\3\2\2\2\u00b6\u00a2\3\2"+
		"\2\2\u00b6\u00a7\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\21\3\2\2"+
		"\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\5\20\t\2\u00bc\u00c3\b\n\1\2\u00bd"+
		"\u00be\7\6\2\2\u00be\u00bf\5\20\t\2\u00bf\u00c0\b\n\1\2\u00c0\u00c2\3"+
		"\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\33"+
		"\2\2\u00c7\u00c8\5\20\t\2\u00c8\u00cf\b\n\1\2\u00c9\u00ca\7\6\2\2\u00ca"+
		"\u00cb\5\20\t\2\u00cb\u00cc\b\n\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c9\3"+
		"\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\7\2\2\u00d3\u00d4\b\n"+
		"\1\2\u00d4\u0119\3\2\2\2\u00d5\u00d6\5\20\t\2\u00d6\u00d7\7\33\2\2\u00d7"+
		"\u00d8\5\20\t\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\b\n\1\2\u00da\u0119\3"+
		"\2\2\2\u00db\u00dc\7\34\2\2\u00dc\u00dd\7\4\2\2\u00dd\u00de\5\20\t\2\u00de"+
		"\u00df\7\5\2\2\u00df\u00e0\5\26\f\2\u00e0\u00e1\b\n\1\2\u00e1\u0119\3"+
		"\2\2\2\u00e2\u00e3\7\35\2\2\u00e3\u00e4\7\4\2\2\u00e4\u00e5\5\20\t\2\u00e5"+
		"\u00e6\7\5\2\2\u00e6\u00e7\5\26\f\2\u00e7\u00ec\b\n\1\2\u00e8\u00e9\7"+
		"\36\2\2\u00e9\u00ea\5\26\f\2\u00ea\u00eb\b\n\1\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00e8\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\n"+
		"\1\2\u00ef\u0119\3\2\2\2\u00f0\u00f1\7\37\2\2\u00f1\u00f2\5\20\t\2\u00f2"+
		"\u00f3\7\7\2\2\u00f3\u00f4\b\n\1\2\u00f4\u0119\3\2\2\2\u00f5\u00f6\7 "+
		"\2\2\u00f6\u00f7\5\20\t\2\u00f7\u00fe\b\n\1\2\u00f8\u00f9\7\6\2\2\u00f9"+
		"\u00fa\5\20\t\2\u00fa\u00fb\b\n\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00f8\3"+
		"\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\7\2\2\u0102\u0119\3\2"+
		"\2\2\u0103\u0104\7!\2\2\u0104\u0105\5\20\t\2\u0105\u010c\b\n\1\2\u0106"+
		"\u0107\7\6\2\2\u0107\u0108\5\20\t\2\u0108\u0109\b\n\1\2\u0109\u010b\3"+
		"\2\2\2\u010a\u0106\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\7"+
		"\2\2\u0110\u0119\3\2\2\2\u0111\u0112\7-\2\2\u0112\u0113\7\4\2\2\u0113"+
		"\u0114\5\24\13\2\u0114\u0115\7\5\2\2\u0115\u0116\7\7\2\2\u0116\u0117\b"+
		"\n\1\2\u0117\u0119\3\2\2\2\u0118\u00bb\3\2\2\2\u0118\u00d5\3\2\2\2\u0118"+
		"\u00db\3\2\2\2\u0118\u00e2\3\2\2\2\u0118\u00f0\3\2\2\2\u0118\u00f5\3\2"+
		"\2\2\u0118\u0103\3\2\2\2\u0118\u0111\3\2\2\2\u0119\23\3\2\2\2\u011a\u0127"+
		"\3\2\2\2\u011b\u011c\5\20\t\2\u011c\u0123\b\13\1\2\u011d\u011e\7\6\2\2"+
		"\u011e\u011f\5\20\t\2\u011f\u0120\b\13\1\2\u0120\u0122\3\2\2\2\u0121\u011d"+
		"\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u011a\3\2\2\2\u0126\u011b\3\2"+
		"\2\2\u0127\25\3\2\2\2\u0128\u0129\5\22\n\2\u0129\u012a\b\f\1\2\u012a\u0136"+
		"\3\2\2\2\u012b\u012f\7\b\2\2\u012c\u012d\5\22\n\2\u012d\u012e\b\f\1\2"+
		"\u012e\u0130\3\2\2\2\u012f\u012c\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\t\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u0128\3\2\2\2\u0135\u012b\3\2\2\2\u0136\27\3\2\2"+
		"\2\u0137\u0138\b\r\1\2\u0138\u0139\7\"\2\2\u0139\u0145\b\r\1\2\u013a\u013b"+
		"\7#\2\2\u013b\u0145\b\r\1\2\u013c\u013d\7$\2\2\u013d\u0145\b\r\1\2\u013e"+
		"\u013f\5\34\17\2\u013f\u0140\b\r\1\2\u0140\u0145\3\2\2\2\u0141\u0142\5"+
		"\32\16\2\u0142\u0143\b\r\1\2\u0143\u0145\3\2\2\2\u0144\u0137\3\2\2\2\u0144"+
		"\u013a\3\2\2\2\u0144\u013c\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u0141\3\2"+
		"\2\2\u0145\u014d\3\2\2\2\u0146\u0147\f\5\2\2\u0147\u0148\7\n\2\2\u0148"+
		"\u0149\7.\2\2\u0149\u014a\7\13\2\2\u014a\u014c\b\r\1\2\u014b\u0146\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\31\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7%\2\2\u0151\u0152\b\16\1"+
		"\2\u0152\33\3\2\2\2\u0153\u0154\7&\2\2\u0154\u015a\7\b\2\2\u0155\u0156"+
		"\5\36\20\2\u0156\u0157\b\17\1\2\u0157\u0159\3\2\2\2\u0158\u0155\3\2\2"+
		"\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015d"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\t\2\2\u015e\u015f\b\17\1\2"+
		"\u015f\35\3\2\2\2\u0160\u0161\5\30\r\2\u0161\u0162\7-\2\2\u0162\u0168"+
		"\b\20\1\2\u0163\u0164\7\6\2\2\u0164\u0165\7-\2\2\u0165\u0167\b\20\1\2"+
		"\u0166\u0163\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7\7\2\2\u016c"+
		"\37\3\2\2\2\32%\63D\\_go\u0096\u00b6\u00b8\u00c3\u00cf\u00ec\u00fe\u010c"+
		"\u0118\u0123\u0126\u0131\u0135\u0144\u014d\u015a\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}