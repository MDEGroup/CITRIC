lexer grammar CloneDr_ANTLR3;
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

T42 : '#1' ;
T43 : '	' ;
T44 : '	+' ;
T45 : '#2' ;
T46 : '#3' ;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 158
NL
	:	(	'\r' '\n'
		|	'\n' '\r'	//Improbable
		|	'\r'
		|	'\n'
		)
	{newline();}
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 167
WS
	:	(	' '
		|	'\t'
		)
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 173
fragment
DIGIT
	:	'0'..'9'
	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 178
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

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 189
fragment
SNAME
//	options {
//		testLiterals = true;
//	}
	:	(ALPHA | DIGIT | ' ' | '.' | ':' | '\\' | '-' | '/' )*
;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 197
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

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 211
INT
	:	(DIGIT)+
//		(('.' DIGIT)=> '.' (DIGIT)+ {$setType(FLOAT);})?
	;

	// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 216
FLOAT	:	DIGIT+ '.' DIGIT*	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 218
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

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 264
STRING
	:	'\''!
		(	ESC
		|	'\n' {newline();}
		|	~('\\'|'\''|'\n')
		)*
		'\''!
			{setText(ei.unescapeString(getText(), 1));}
	;

	

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 276
LSQUARE @init {}
	:	'['
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 284
RSQUARE @init {}
	:	']'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 292
EXCL @init {}
	:	'!'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 300
COMA @init {}
	:	','
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 308
LPAREN @init {}
	:	'('
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 316
RPAREN @init {}
	:	')'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 324
LCURLY @init {}
	:	'{'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 332
RCURLY @init {}
	:	'}'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 340
SEMI @init {}
	:	';'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 348
COLON @init {}
	:	':'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 356
PIPE @init {}
	:	'|'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 364
SHARP @init {}
	:	'#'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 372
QMARK @init {}
	:	'?'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 380
COLONCOLON @init {}
	:	'::'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 388
POINT @init {}
	:	'.'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 396
RARROW @init {}
	:	'->'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 404
MINUS @init {}
	:	'-'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 412
STAR @init {}
	:	'*'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 420
SLASH @init {}
	:	'/'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 428
PLUS @init {}
	:	'+'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 436
EQ @init {}
	:	'='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 444
GT @init {}
	:	'>'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 452
LT @init {}
	:	'<'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 460
GE @init {}
	:	'>='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 468
LE @init {}
	:	'<='
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 476
NE @init {}
	:	'<>'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 484
LARROW @init {}
	:	'<-'
  {
   
  }

	;

// $ANTLR src "C:\Documents and Settings\yusun\My Documents\Java\Eclipse Projects\CloneDr\Syntax\CloneDr_ANTLR3.g" 492
COMMENT @init {}
	:	(('--' (~('\r'| '\n'))*))
  {
   
  }

	;
