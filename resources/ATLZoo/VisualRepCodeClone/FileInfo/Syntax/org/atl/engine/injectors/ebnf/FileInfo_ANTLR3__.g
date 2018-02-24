lexer grammar FileInfo_ANTLR3;
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

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 125
NL
	:	(	'\r' '\n'
		|	'\n' '\r'	//Improbable
		|	'\r'
		|	'\n'
		)
	{newline();}
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 134
WS
	:	(	' '
		|	'\t'
		)
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 140
fragment
DIGIT
	:	'0'..'9'
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 145
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

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 156
fragment
SNAME
//	options {
//		testLiterals = true;
//	}
	:	(ALPHA) (ALPHA | DIGIT | '.' | ':' | '\\' | '-' | ' ' | '/')*
;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 164
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

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 178
INT
	:	(DIGIT)+
//		(('.' DIGIT)=> '.' (DIGIT)+ {$setType(FLOAT);})?
	;

	// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 183
FLOAT	:	DIGIT+ '.' DIGIT*	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 185
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

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 231
STRING
	:	'\''!
		(	ESC
		|	'\n' {newline();}
		|	~('\\'|'\''|'\n')
		)*
		'\''!
			{setText(ei.unescapeString(getText(), 1));}
	;

	

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 243
LSQUARE @init {}
	:	'['
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 251
RSQUARE @init {}
	:	']'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 259
EXCL @init {}
	:	'!'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 267
COMA @init {}
	:	','
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 275
LPAREN @init {}
	:	'('
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 283
RPAREN @init {}
	:	')'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 291
LCURLY @init {}
	:	'{'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 299
RCURLY @init {}
	:	'}'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 307
SEMI @init {}
	:	';'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 315
PIPE @init {}
	:	'|'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 323
SHARP @init {}
	:	'#'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 331
QMARK @init {}
	:	'?'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 339
COLONCOLON @init {}
	:	'::'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 347
POINT @init {}
	:	'.'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 355
RARROW @init {}
	:	'->'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 363
MINUS @init {}
	:	'-'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 371
STAR @init {}
	:	'*'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 379
SLASH @init {}
	:	'/'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 387
PLUS @init {}
	:	'+'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 395
EQ @init {}
	:	'='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 403
GT @init {}
	:	'>'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 411
LT @init {}
	:	'<'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 419
GE @init {}
	:	'>='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 427
LE @init {}
	:	'<='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 435
NE @init {}
	:	'<>'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 443
LARROW @init {}
	:	'<-'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\FileInfo\Syntax\FileInfo_ANTLR3.g" 451
COMMENT @init {}
	:	(('--' (~('\r'| '\n'))*))
  {
   
  }

	;
