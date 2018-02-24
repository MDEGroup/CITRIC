lexer grammar Simian_ANTLR3;
@members {

	private void newline() {}

	public org.atl.engine.injectors.ebnf.EBNFInjector2 ei = null;

	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
		ei.reportError((Exception)e);
	}

	public Token emit() {
		org.atl.engine.injectors.ebnf.LocationTokenv3 ret = null;

		ret = new org.atl.engine.injectors.ebnf.LocationTokenv3(input, type, channel, tokenStartCharIndex, getCharIndex()-1);
		ret.setLine(tokenStartLine);
		ret.setText(text);
	  	ret.setCharPositionInLine(tokenStartCharPositionInLine);
		ret.setEndLine(getLine());
		ret.setEndColumn(getCharPositionInLine());
		emit(ret);

		return ret;
	}

}
@header {package org.atl.engine.injectors.ebnf;}

T41 : 'Found' ;
T42 : 'duplicate lines in' ;
T43 : 'blocks in' ;
T44 : 'files' ;
T45 : 'Processed a total of' ;
T46 : 'significant (' ;
T47 : 'raw) lines in' ;
T48 : 'Processing time:' ;
T49 : 'sec' ;
T50 : 'the following files:' ;
T51 : 'Between lines' ;
T52 : 'and' ;
T53 : 'in' ;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 147
NL
	:	(	'\r' '\n'
		|	'\n' '\r'	//Improbable
		|	'\r'
		|	'\n'
		)
	{newline();}
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 156
WS
	:	(	' '
		|	'\t'
		)
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 162
fragment
DIGIT
	:	'0'..'9'
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 167
fragment
ALPHA
	:	'a'..'z'
	|	'A'..'Z'
	|	'_'
	//For Unicode compatibility (from 0000 to 00ff)
	|	'\u00C0' .. '\u00D6'
	|	'\u00D8' .. '\u00F6'
	|	'\u00F8' .. '\u00FF'
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 178
fragment
SNAME
//	options {
//		testLiterals = true;
//	}
	:	(ALPHA) (ALPHA | DIGIT | '.' | ':' | '\\' | '-')*
;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 186
NAME
	:	(
			SNAME
//			s:SNAME {if(s.getType() != SNAME) $setType(s.getType());}
		|	'"'!
			(	ESC
			|	'\n' {newline();}
			|	~('\\'|'\"'|'\n')
			)*
			'"'!
			{setText(ei.unescapeString(getText(), 1));}
		)
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 200
INT
	:	(DIGIT)+
//		(('.' DIGIT)=> '.' (DIGIT)+ {$setType(FLOAT);})?
	;

	// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 205
FLOAT	:	DIGIT+ '.' DIGIT*	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 207
fragment
ESC
	:	'\\'!
		(	'n' //{setText("\n");}
		|	'r' //{setText("\r");}
		|	't' //{setText("\t");}
		|	'b' //{setText("\b");}
		|	'f' //{setText("\f");}
		|	'"' //{setText("\"");}
		|	'\'' //{setText("\'");}
		|	'\\' //{setText("\\");}
		|	(
				('0'..'3')
				(
//					options {
//						warnWhenFollowAmbig = false;
//					}
				:	('0'..'7')
					(
//						options {
//							warnWhenFollowAmbig = false;
//						}
					:	'0'..'7'
					)?
				)?
			|	('4'..'7')
				(
//					options {
//						warnWhenFollowAmbig = false;
//					}
				:	('0'..'7')
				)?
			)
				{
//					String s = getText();
//					int i;
//					int ret = 0;
//					String ans;
//					for (i=0; i<s.length(); ++i)
//						ret = ret*8 + s.charAt(i) - '0';
//					ans = String.valueOf((char) ret);
//					setText(ans);
				}
		)
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 253
STRING
	:	'\''!
		(	ESC
		|	'\n' {newline();}
		|	~('\\'|'\''|'\n')
		)*
		'\''!
			{setText(ei.unescapeString(getText(), 1));}
	;

	

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 265
LSQUARE @init {}
	:	'['
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 273
RSQUARE @init {}
	:	']'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 281
EXCL @init {}
	:	'!'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 289
COMA @init {}
	:	','
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 297
LPAREN @init {}
	:	'('
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 305
RPAREN @init {}
	:	')'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 313
LCURLY @init {}
	:	'{'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 321
RCURLY @init {}
	:	'}'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 329
SEMI @init {}
	:	';'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 337
PIPE @init {}
	:	'|'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 345
SHARP @init {}
	:	'#'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 353
QMARK @init {}
	:	'?'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 361
COLONCOLON @init {}
	:	'::'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 369
POINT @init {}
	:	'.'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 377
RARROW @init {}
	:	'->'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 385
MINUS @init {}
	:	'-'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 393
STAR @init {}
	:	'*'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 401
SLASH @init {}
	:	'/'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 409
PLUS @init {}
	:	'+'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 417
EQ @init {}
	:	'='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 425
GT @init {}
	:	'>'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 433
LT @init {}
	:	'<'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 441
GE @init {}
	:	'>='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 449
LE @init {}
	:	'<='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 457
NE @init {}
	:	'<>'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 465
LARROW @init {}
	:	'<-'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\Simian\Syntax\Simian_ANTLR3.g" 473
COMMENT @init {}
	:	(('--' (~('\r'| '\n'))*))
  {
   
  }

	;
