// $ANTLR 3.0 C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g 2007-11-01 14:02:33
package org.atl.engine.injectors.ebnf;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Simian_ANTLR3Lexer extends Lexer {
    public static final int MINUS=29;
    public static final int SHARP=24;
    public static final int FLOAT=7;
    public static final int LARROW=39;
    public static final int T45=45;
    public static final int PIPE=23;
    public static final int RCURLY=21;
    public static final int NL=8;
    public static final int LCURLY=20;
    public static final int INT=6;
    public static final int LE=37;
    public static final int T51=51;
    public static final int RPAREN=19;
    public static final int LPAREN=18;
    public static final int T46=46;
    public static final int PLUS=32;
    public static final int DIGIT=10;
    public static final int T41=41;
    public static final int T44=44;
    public static final int LSQUARE=14;
    public static final int SNAME=12;
    public static final int SLASH=31;
    public static final int POINT=27;
    public static final int T50=50;
    public static final int WS=9;
    public static final int ALPHA=11;
    public static final int STRING=5;
    public static final int EQ=33;
    public static final int T43=43;
    public static final int EXCL=16;
    public static final int RARROW=28;
    public static final int LT=35;
    public static final int GT=34;
    public static final int NE=38;
    public static final int T42=42;
    public static final int COMMENT=40;
    public static final int RSQUARE=15;
    public static final int ESC=13;
    public static final int SEMI=22;
    public static final int GE=36;
    public static final int COLONCOLON=26;
    public static final int T48=48;
    public static final int EOF=-1;
    public static final int QMARK=25;
    public static final int T47=47;
    public static final int Tokens=54;
    public static final int T53=53;
    public static final int T49=49;
    public static final int COMA=17;
    public static final int STAR=30;
    public static final int T52=52;
    public static final int NAME=4;


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


    public Simian_ANTLR3Lexer() {;} 
    public Simian_ANTLR3Lexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g"; }

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:29:7: ( 'Found' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:29:7: 'Found'
            {
            match("Found"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:30:7: ( 'duplicate lines in' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:30:7: 'duplicate lines in'
            {
            match("duplicate lines in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:31:7: ( 'blocks in' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:31:7: 'blocks in'
            {
            match("blocks in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:32:7: ( 'files' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:32:7: 'files'
            {
            match("files"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:33:7: ( 'Processed a total of' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:33:7: 'Processed a total of'
            {
            match("Processed a total of"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:34:7: ( 'significant (' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:34:7: 'significant ('
            {
            match("significant ("); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:35:7: ( 'raw) lines in' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:35:7: 'raw) lines in'
            {
            match("raw) lines in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:36:7: ( 'Processing time:' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:36:7: 'Processing time:'
            {
            match("Processing time:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:37:7: ( 'sec' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:37:7: 'sec'
            {
            match("sec"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:38:7: ( 'the following files:' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:38:7: 'the following files:'
            {
            match("the following files:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:39:7: ( 'Between lines' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:39:7: 'Between lines'
            {
            match("Between lines"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:40:7: ( 'and' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:40:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:41:7: ( 'in' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:41:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start NL
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:148:4: ( ( '\\r' '\\n' | '\\n' '\\r' | '\\r' | '\\n' ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:148:4: ( '\\r' '\\n' | '\\n' '\\r' | '\\r' | '\\n' )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:148:4: ( '\\r' '\\n' | '\\n' '\\r' | '\\r' | '\\n' )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='\n') ) {
                    alt1=1;
                }
                else {
                    alt1=3;}
            }
            else if ( (LA1_0=='\n') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='\r') ) {
                    alt1=2;
                }
                else {
                    alt1=4;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("148:4: ( '\\r' '\\n' | '\\n' '\\r' | '\\r' | '\\n' )", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:148:6: '\\r' '\\n'
                    {
                    match('\r'); 
                    match('\n'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:149:5: '\\n' '\\r'
                    {
                    match('\n'); 
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:150:5: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:151:5: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

            newline();

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NL

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:157:4: ( ( ' ' | '\\t' ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:157:4: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:164:4: ( '0' .. '9' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:164:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start ALPHA
    public final void mALPHA() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:169:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u00FF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ALPHA

    // $ANTLR start SNAME
    public final void mSNAME() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:183:4: ( ( ALPHA ) ( ALPHA | DIGIT | '.' | ':' | '\\\\' | '-' )* )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:183:4: ( ALPHA ) ( ALPHA | DIGIT | '.' | ':' | '\\\\' | '-' )*
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:183:4: ( ALPHA )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:183:5: ALPHA
            {
            mALPHA(); 

            }

            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:183:12: ( ALPHA | DIGIT | '.' | ':' | '\\\\' | '-' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='-' && LA2_0<='.')||(LA2_0>='0' && LA2_0<=':')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='\\'||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u00FF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u00FF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end SNAME

    // $ANTLR start NAME
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:187:4: ( ( SNAME | '\"' ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )* '\"' ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:187:4: ( SNAME | '\"' ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )* '\"' )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:187:4: ( SNAME | '\"' ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )* '\"' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||(LA4_0>='\u00C0' && LA4_0<='\u00D6')||(LA4_0>='\u00D8' && LA4_0<='\u00F6')||(LA4_0>='\u00F8' && LA4_0<='\u00FF')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='\"') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("187:4: ( SNAME | '\"' ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )* '\"' )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:188:4: SNAME
                    {
                    mSNAME(); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:190:5: '\"' ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )* '\"'
                    {
                    match('\"'); 
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:191:4: ( ESC | '\\n' | ~ ( '\\\\' | '\\\"' | '\\n' ) )*
                    loop3:
                    do {
                        int alt3=4;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( (LA3_0=='\n') ) {
                            alt3=2;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                            alt3=3;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:191:6: ESC
                    	    {
                    	    mESC(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:192:6: '\\n'
                    	    {
                    	    match('\n'); 
                    	    newline();

                    	    }
                    	    break;
                    	case 3 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:193:6: ~ ( '\\\\' | '\\\"' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 
                    setText(ei.unescapeString(getText(), 1));

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NAME

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:201:4: ( ( DIGIT )+ )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:201:4: ( DIGIT )+
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:201:4: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:201:5: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INT

    // $ANTLR start FLOAT
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:205:9: ( ( DIGIT )+ '.' ( DIGIT )* )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:205:9: ( DIGIT )+ '.' ( DIGIT )*
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:205:9: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:205:9: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('.'); 
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:205:20: ( DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:205:20: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FLOAT

    // $ANTLR start ESC
    public final void mESC() throws RecognitionException {
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:209:4: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:209:4: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? ) )
            {
            match('\\'); 
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:210:3: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt12=1;
                }
                break;
            case 'r':
                {
                alt12=2;
                }
                break;
            case 't':
                {
                alt12=3;
                }
                break;
            case 'b':
                {
                alt12=4;
                }
                break;
            case 'f':
                {
                alt12=5;
                }
                break;
            case '\"':
                {
                alt12=6;
                }
                break;
            case '\'':
                {
                alt12=7;
                }
                break;
            case '\\':
                {
                alt12=8;
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("210:3: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:210:5: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:211:5: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:212:5: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:213:5: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:214:5: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:215:5: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:216:5: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:217:5: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:218:5: ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? )
                    {
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:218:5: ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>='0' && LA11_0<='3')) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_0>='4' && LA11_0<='7')) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("218:5: ( ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )? | ( '4' .. '7' ) ( ( '0' .. '7' ) )? )", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:219:5: ( '0' .. '3' ) ( ( '0' .. '7' ) ( '0' .. '7' )? )?
                            {
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:219:5: ( '0' .. '3' )
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:219:6: '0' .. '3'
                            {
                            matchRange('0','3'); 

                            }

                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:220:5: ( ( '0' .. '7' ) ( '0' .. '7' )? )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( ((LA9_0>='0' && LA9_0<='7')) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:224:7: ( '0' .. '7' ) ( '0' .. '7' )?
                                    {
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:224:7: ( '0' .. '7' )
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:224:8: '0' .. '7'
                                    {
                                    matchRange('0','7'); 

                                    }

                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:225:6: ( '0' .. '7' )?
                                    int alt8=2;
                                    int LA8_0 = input.LA(1);

                                    if ( ((LA8_0>='0' && LA8_0<='7')) ) {
                                        alt8=1;
                                    }
                                    switch (alt8) {
                                        case 1 :
                                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:229:8: '0' .. '7'
                                            {
                                            matchRange('0','7'); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:232:6: ( '4' .. '7' ) ( ( '0' .. '7' ) )?
                            {
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:232:6: ( '4' .. '7' )
                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:232:7: '4' .. '7'
                            {
                            matchRange('4','7'); 

                            }

                            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:233:5: ( ( '0' .. '7' ) )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( ((LA10_0>='0' && LA10_0<='7')) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:237:7: ( '0' .. '7' )
                                    {
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:237:7: ( '0' .. '7' )
                                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:237:8: '0' .. '7'
                                    {
                                    matchRange('0','7'); 

                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    
                    //					String s = getText();
                    //					int i;
                    //					int ret = 0;
                    //					String ans;
                    //					for (i=0; i<s.length(); ++i)
                    //						ret = ret*8 + s.charAt(i) - '0';
                    //					ans = String.valueOf((char) ret);
                    //					setText(ans);
                    				

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ESC

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:254:4: ( '\\'' ( ESC | '\\n' | ~ ( '\\\\' | '\\'' | '\\n' ) )* '\\'' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:254:4: '\\'' ( ESC | '\\n' | ~ ( '\\\\' | '\\'' | '\\n' ) )* '\\''
            {
            match('\''); 
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:255:3: ( ESC | '\\n' | ~ ( '\\\\' | '\\'' | '\\n' ) )*
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\\') ) {
                    alt13=1;
                }
                else if ( (LA13_0=='\n') ) {
                    alt13=2;
                }
                else if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFE')) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:255:5: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:256:5: '\\n'
            	    {
            	    match('\n'); 
            	    newline();

            	    }
            	    break;
            	case 3 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:257:5: ~ ( '\\\\' | '\\'' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match('\''); 
            setText(ei.unescapeString(getText(), 1));

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start LSQUARE
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:266:4: ( '[' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:266:4: '['
            {
            match('['); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LSQUARE

    // $ANTLR start RSQUARE
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:274:4: ( ']' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:274:4: ']'
            {
            match(']'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RSQUARE

    // $ANTLR start EXCL
    public final void mEXCL() throws RecognitionException {
        try {
            int _type = EXCL;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:282:4: ( '!' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:282:4: '!'
            {
            match('!'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EXCL

    // $ANTLR start COMA
    public final void mCOMA() throws RecognitionException {
        try {
            int _type = COMA;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:290:4: ( ',' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:290:4: ','
            {
            match(','); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMA

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:298:4: ( '(' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:298:4: '('
            {
            match('('); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:306:4: ( ')' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:306:4: ')'
            {
            match(')'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LCURLY
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:314:4: ( '{' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:314:4: '{'
            {
            match('{'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LCURLY

    // $ANTLR start RCURLY
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:322:4: ( '}' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:322:4: '}'
            {
            match('}'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RCURLY

    // $ANTLR start SEMI
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:330:4: ( ';' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:330:4: ';'
            {
            match(';'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SEMI

    // $ANTLR start PIPE
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:338:4: ( '|' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:338:4: '|'
            {
            match('|'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PIPE

    // $ANTLR start SHARP
    public final void mSHARP() throws RecognitionException {
        try {
            int _type = SHARP;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:346:4: ( '#' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:346:4: '#'
            {
            match('#'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SHARP

    // $ANTLR start QMARK
    public final void mQMARK() throws RecognitionException {
        try {
            int _type = QMARK;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:354:4: ( '?' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:354:4: '?'
            {
            match('?'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QMARK

    // $ANTLR start COLONCOLON
    public final void mCOLONCOLON() throws RecognitionException {
        try {
            int _type = COLONCOLON;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:362:4: ( '::' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:362:4: '::'
            {
            match("::"); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COLONCOLON

    // $ANTLR start POINT
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:370:4: ( '.' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:370:4: '.'
            {
            match('.'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end POINT

    // $ANTLR start RARROW
    public final void mRARROW() throws RecognitionException {
        try {
            int _type = RARROW;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:378:4: ( '->' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:378:4: '->'
            {
            match("->"); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RARROW

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:386:4: ( '-' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:386:4: '-'
            {
            match('-'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start STAR
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:394:4: ( '*' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:394:4: '*'
            {
            match('*'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STAR

    // $ANTLR start SLASH
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:402:4: ( '/' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:402:4: '/'
            {
            match('/'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SLASH

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:410:4: ( '+' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:410:4: '+'
            {
            match('+'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start EQ
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:418:4: ( '=' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:418:4: '='
            {
            match('='); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQ

    // $ANTLR start GT
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:426:4: ( '>' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:426:4: '>'
            {
            match('>'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GT

    // $ANTLR start LT
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:434:4: ( '<' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:434:4: '<'
            {
            match('<'); 

               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LT

    // $ANTLR start GE
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:442:4: ( '>=' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:442:4: '>='
            {
            match(">="); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GE

    // $ANTLR start LE
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:450:4: ( '<=' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:450:4: '<='
            {
            match("<="); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LE

    // $ANTLR start NE
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:458:4: ( '<>' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:458:4: '<>'
            {
            match("<>"); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NE

    // $ANTLR start LARROW
    public final void mLARROW() throws RecognitionException {
        try {
            int _type = LARROW;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:466:4: ( '<-' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:466:4: '<-'
            {
            match("<-"); 


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LARROW

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:474:4: ( ( ( '--' (~ ( '\\r' | '\\n' ) )* ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:474:4: ( ( '--' (~ ( '\\r' | '\\n' ) )* ) )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:474:4: ( ( '--' (~ ( '\\r' | '\\n' ) )* ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:474:5: ( '--' (~ ( '\\r' | '\\n' ) )* )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:474:5: ( '--' (~ ( '\\r' | '\\n' ) )* )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:474:6: '--' (~ ( '\\r' | '\\n' ) )*
            {
            match("--"); 

            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:474:11: (~ ( '\\r' | '\\n' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFE')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:474:12: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


               
              

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    public void mTokens() throws RecognitionException {
        // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:10: ( T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | NL | WS | NAME | INT | FLOAT | STRING | LSQUARE | RSQUARE | EXCL | COMA | LPAREN | RPAREN | LCURLY | RCURLY | SEMI | PIPE | SHARP | QMARK | COLONCOLON | POINT | RARROW | MINUS | STAR | SLASH | PLUS | EQ | GT | LT | GE | LE | NE | LARROW | COMMENT )
        int alt15=46;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:10: T41
                {
                mT41(); 

                }
                break;
            case 2 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:14: T42
                {
                mT42(); 

                }
                break;
            case 3 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:18: T43
                {
                mT43(); 

                }
                break;
            case 4 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:22: T44
                {
                mT44(); 

                }
                break;
            case 5 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:26: T45
                {
                mT45(); 

                }
                break;
            case 6 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:30: T46
                {
                mT46(); 

                }
                break;
            case 7 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:34: T47
                {
                mT47(); 

                }
                break;
            case 8 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:38: T48
                {
                mT48(); 

                }
                break;
            case 9 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:42: T49
                {
                mT49(); 

                }
                break;
            case 10 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:46: T50
                {
                mT50(); 

                }
                break;
            case 11 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:50: T51
                {
                mT51(); 

                }
                break;
            case 12 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:54: T52
                {
                mT52(); 

                }
                break;
            case 13 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:58: T53
                {
                mT53(); 

                }
                break;
            case 14 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:62: NL
                {
                mNL(); 

                }
                break;
            case 15 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:65: WS
                {
                mWS(); 

                }
                break;
            case 16 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:68: NAME
                {
                mNAME(); 

                }
                break;
            case 17 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:73: INT
                {
                mINT(); 

                }
                break;
            case 18 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:77: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 19 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:83: STRING
                {
                mSTRING(); 

                }
                break;
            case 20 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:90: LSQUARE
                {
                mLSQUARE(); 

                }
                break;
            case 21 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:98: RSQUARE
                {
                mRSQUARE(); 

                }
                break;
            case 22 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:106: EXCL
                {
                mEXCL(); 

                }
                break;
            case 23 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:111: COMA
                {
                mCOMA(); 

                }
                break;
            case 24 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:116: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 25 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:123: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 26 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:130: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 27 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:137: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 28 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:144: SEMI
                {
                mSEMI(); 

                }
                break;
            case 29 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:149: PIPE
                {
                mPIPE(); 

                }
                break;
            case 30 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:154: SHARP
                {
                mSHARP(); 

                }
                break;
            case 31 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:160: QMARK
                {
                mQMARK(); 

                }
                break;
            case 32 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:166: COLONCOLON
                {
                mCOLONCOLON(); 

                }
                break;
            case 33 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:177: POINT
                {
                mPOINT(); 

                }
                break;
            case 34 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:183: RARROW
                {
                mRARROW(); 

                }
                break;
            case 35 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:190: MINUS
                {
                mMINUS(); 

                }
                break;
            case 36 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:196: STAR
                {
                mSTAR(); 

                }
                break;
            case 37 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:201: SLASH
                {
                mSLASH(); 

                }
                break;
            case 38 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:207: PLUS
                {
                mPLUS(); 

                }
                break;
            case 39 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:212: EQ
                {
                mEQ(); 

                }
                break;
            case 40 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:215: GT
                {
                mGT(); 

                }
                break;
            case 41 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:218: LT
                {
                mLT(); 

                }
                break;
            case 42 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:221: GE
                {
                mGE(); 

                }
                break;
            case 43 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:224: LE
                {
                mLE(); 

                }
                break;
            case 44 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:227: NE
                {
                mNE(); 

                }
                break;
            case 45 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:230: LARROW
                {
                mLARROW(); 

                }
                break;
            case 46 :
                // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:1:237: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\13\16\3\uffff\1\62\17\uffff\1\66\4\uffff\1\70\1\74\13\16"+
        "\1\110\13\uffff\6\16\1\117\3\16\1\123\1\uffff\6\16\3\uffff\1\16"+
        "\1\uffff\1\133\2\16\1\136\3\16\1\uffff\2\16\1\uffff\4\16\1\uffff"+
        "\7\16\1\uffff\4\16\2\uffff\2\16\1\uffff\1\16\1\uffff";
    static final String DFA15_eofS =
        "\167\uffff";
    static final String DFA15_minS =
        "\1\11\1\157\1\165\1\154\1\151\1\162\1\145\1\141\1\150\1\145\2\156"+
        "\3\uffff\1\56\17\uffff\1\55\4\uffff\1\75\1\55\1\165\1\160\1\157"+
        "\1\154\1\157\1\147\1\143\1\167\1\145\1\164\1\144\1\55\13\uffff\1"+
        "\156\1\154\1\143\1\145\1\143\1\156\1\55\1\51\1\40\1\167\1\55\1\uffff"+
        "\1\144\1\151\1\153\1\163\1\145\1\151\3\uffff\1\145\1\uffff\1\55"+
        "\1\143\1\163\1\55\1\163\1\146\1\145\1\uffff\1\141\1\40\1\uffff\1"+
        "\163\1\151\1\156\1\164\1\uffff\1\145\1\143\1\40\1\145\1\144\1\156"+
        "\1\141\1\uffff\2\40\1\147\1\156\2\uffff\1\40\1\164\1\uffff\1\40"+
        "\1\uffff";
    static final String DFA15_maxS =
        "\1\u00ff\1\157\1\165\1\154\1\151\1\162\1\151\1\141\1\150\1\145\2"+
        "\156\3\uffff\1\71\17\uffff\1\76\4\uffff\1\75\1\76\1\165\1\160\1"+
        "\157\1\154\1\157\1\147\1\143\1\167\1\145\1\164\1\144\1\u00ff\13"+
        "\uffff\1\156\1\154\1\143\1\145\1\143\1\156\1\u00ff\1\51\1\40\1\167"+
        "\1\u00ff\1\uffff\1\144\1\151\1\153\1\163\1\145\1\151\3\uffff\1\145"+
        "\1\uffff\1\u00ff\1\143\1\163\1\u00ff\1\163\1\146\1\145\1\uffff\1"+
        "\141\1\40\1\uffff\1\163\1\151\1\156\1\164\1\uffff\1\151\1\143\1"+
        "\40\1\145\1\144\1\156\1\141\1\uffff\2\40\1\147\1\156\2\uffff\1\40"+
        "\1\164\1\uffff\1\40\1\uffff";
    static final String DFA15_acceptS =
        "\14\uffff\1\16\1\17\1\20\1\uffff\1\23\1\24\1\25\1\26\1\27\1\30\1"+
        "\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\uffff\1\44\1\45\1"+
        "\46\1\47\16\uffff\1\21\1\22\1\56\1\42\1\43\1\52\1\50\1\55\1\53\1"+
        "\54\1\51\13\uffff\1\15\6\uffff\1\11\1\7\1\12\1\uffff\1\14\7\uffff"+
        "\1\1\2\uffff\1\4\4\uffff\1\3\7\uffff\1\13\4\uffff\1\2\1\5\2\uffff"+
        "\1\10\1\uffff\1\6";
    static final String DFA15_specialS =
        "\167\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\15\1\14\2\uffff\1\14\22\uffff\1\15\1\23\1\16\1\33\3\uffff"+
            "\1\20\1\25\1\26\1\40\1\42\1\24\1\37\1\36\1\41\12\17\1\35\1\31"+
            "\1\45\1\43\1\44\1\34\1\uffff\1\16\1\11\3\16\1\1\11\16\1\5\12"+
            "\16\1\21\1\uffff\1\22\1\uffff\1\16\1\uffff\1\12\1\3\1\16\1\2"+
            "\1\16\1\4\2\16\1\13\10\16\1\7\1\6\1\10\6\16\1\27\1\32\1\30\102"+
            "\uffff\27\16\1\uffff\37\16\1\uffff\10\16",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\54\3\uffff\1\53",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "\1\63\1\uffff\12\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\20\uffff\1\65",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\71\17\uffff\1\72\1\73",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\2\16\1\uffff\13\16\6\uffff\32\16\1\uffff\1\16\2\uffff\1\16"+
            "\1\uffff\32\16\105\uffff\27\16\1\uffff\37\16\1\uffff\10\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\2\16\1\uffff\13\16\6\uffff\32\16\1\uffff\1\16\2\uffff\1\16"+
            "\1\uffff\32\16\105\uffff\27\16\1\uffff\37\16\1\uffff\10\16",
            "\1\120",
            "\1\121",
            "\1\122",
            "\2\16\1\uffff\13\16\6\uffff\32\16\1\uffff\1\16\2\uffff\1\16"+
            "\1\uffff\32\16\105\uffff\27\16\1\uffff\37\16\1\uffff\10\16",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "\1\132",
            "",
            "\2\16\1\uffff\13\16\6\uffff\32\16\1\uffff\1\16\2\uffff\1\16"+
            "\1\uffff\32\16\105\uffff\27\16\1\uffff\37\16\1\uffff\10\16",
            "\1\134",
            "\1\135",
            "\2\16\1\uffff\13\16\6\uffff\32\16\1\uffff\1\16\2\uffff\1\16"+
            "\1\uffff\32\16\105\uffff\27\16\1\uffff\37\16\1\uffff\10\16",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150\3\uffff\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "",
            "\1\164",
            "\1\165",
            "",
            "\1\166",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | NL | WS | NAME | INT | FLOAT | STRING | LSQUARE | RSQUARE | EXCL | COMA | LPAREN | RPAREN | LCURLY | RCURLY | SEMI | PIPE | SHARP | QMARK | COLONCOLON | POINT | RARROW | MINUS | STAR | SLASH | PLUS | EQ | GT | LT | GE | LE | NE | LARROW | COMMENT );";
        }
    }
 

}