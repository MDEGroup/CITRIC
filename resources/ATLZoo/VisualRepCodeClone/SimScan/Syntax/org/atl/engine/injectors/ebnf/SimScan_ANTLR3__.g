lexer grammar SimScan_ANTLR3;
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

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 136
NL
	:	(	'\r' '\n'
		|	'\n' '\r'	//Improbable
		|	'\r'
		|	'\n'
		)
	{newline();}
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 145
WS
	:	(	' '
		|	'\t'
		)
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 151
fragment
DIGIT
	:	'0'..'9'
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 156
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

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 167
fragment
SNAME
//	options {
//		testLiterals = true;
//	}
	:	(ALPHA) (ALPHA | DIGIT | '.' | '\\' | '-'  | ' ')*
;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 175
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

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 189
INT
	:	(DIGIT)+
//		(('.' DIGIT)=> '.' (DIGIT)+ {$setType(FLOAT);})?
	;

	// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 194
FLOAT	:	DIGIT+ '.' DIGIT*	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 196
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

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 242
STRING
	:	'\''!
		(	ESC
		|	'\n' {newline();}
		|	~('\\'|'\''|'\n')
		)*
		'\''!
			{setText(ei.unescapeString(getText(), 1));}
	;

	

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 254
LSQUARE @init {}
	:	'['
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 262
RSQUARE @init {}
	:	']'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 270
EXCL @init {}
	:	'!'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 278
COMA @init {}
	:	','
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 286
LPAREN @init {}
	:	'('
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 294
RPAREN @init {}
	:	')'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 302
LCURLY @init {}
	:	'{'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 310
RCURLY @init {}
	:	'}'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 318
SEMI @init {}
	:	';'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 326
COLON @init {}
	:	':'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 334
COLONBS @init {}
	:	':\\'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 342
PIPE @init {}
	:	'|'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 350
SHARP @init {}
	:	'#'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 358
QMARK @init {}
	:	'?'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 366
COLONCOLON @init {}
	:	'::'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 374
POINT @init {}
	:	'.'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 382
RARROW @init {}
	:	'->'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 390
MINUS @init {}
	:	'-'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 398
STAR @init {}
	:	'*'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 406
SLASH @init {}
	:	'/'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 414
PLUS @init {}
	:	'+'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 422
EQ @init {}
	:	'='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 430
GT @init {}
	:	'>'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 438
LT @init {}
	:	'<'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 446
GE @init {}
	:	'>='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 454
LE @init {}
	:	'<='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 462
NE @init {}
	:	'<>'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 470
LARROW @init {}
	:	'<-'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\SimScan\Syntax\SimScan_ANTLR3.g" 478
COMMENT @init {}
	:	(('--' (~('\r'| '\n'))*))
  {
   
  }

	;
