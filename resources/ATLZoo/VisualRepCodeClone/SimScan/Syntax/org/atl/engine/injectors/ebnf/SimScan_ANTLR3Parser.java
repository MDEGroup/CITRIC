// $ANTLR 3.0 C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g 2007-11-02 14:08:32
package org.atl.engine.injectors.ebnf;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SimScan_ANTLR3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NAME", "STRING", "INT", "FLOAT", "COMA", "MINUS", "COLONBS", "COLON", "NL", "WS", "DIGIT", "ALPHA", "SNAME", "ESC", "LSQUARE", "RSQUARE", "EXCL", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "SEMI", "PIPE", "SHARP", "QMARK", "COLONCOLON", "POINT", "RARROW", "STAR", "SLASH", "PLUS", "EQ", "GT", "LT", "GE", "LE", "NE", "LARROW", "COMMENT"
    };
    public static final int MINUS=9;
    public static final int LSQUARE=18;
    public static final int SNAME=16;
    public static final int SLASH=33;
    public static final int SHARP=27;
    public static final int POINT=30;
    public static final int WS=13;
    public static final int ALPHA=15;
    public static final int EQ=35;
    public static final int STRING=5;
    public static final int FLOAT=7;
    public static final int RARROW=31;
    public static final int EXCL=20;
    public static final int LT=37;
    public static final int NE=40;
    public static final int GT=36;
    public static final int COMMENT=42;
    public static final int LARROW=41;
    public static final int RSQUARE=19;
    public static final int ESC=17;
    public static final int PIPE=26;
    public static final int SEMI=25;
    public static final int GE=38;
    public static final int COLONCOLON=29;
    public static final int RCURLY=24;
    public static final int NL=12;
    public static final int LCURLY=23;
    public static final int INT=6;
    public static final int QMARK=28;
    public static final int EOF=-1;
    public static final int LE=39;
    public static final int RPAREN=22;
    public static final int COLON=11;
    public static final int LPAREN=21;
    public static final int COLONBS=10;
    public static final int PLUS=34;
    public static final int COMA=8;
    public static final int DIGIT=14;
    public static final int STAR=32;
    public static final int NAME=4;

        public SimScan_ANTLR3Parser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g"; }


     public org.atl.engine.injectors.ebnf.EBNFInjector2 ei = null;
     
    //	public void reportError(RecognitionException ex) {
    //		ei.reportError((Exception)ex);
    //	}
    	
    //	public void emitErrorMessage(String s) {
    //		ei.reportError(s);
    //	}

    	public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    		ei.reportError((Exception)e);
    	}

    	//TODO: what about warnings?
    //	public void reportWarning(String s) {
    //		ei.reportWarning(s);
    //	}
    	
     public static void main(String[] args) throws Exception {
    						CharStream input = new ANTLRFileStream(args[0]);
     SimScan_ANTLR3Lexer lex = new 
     SimScan_ANTLR3Lexer(input);
    						CommonTokenStream tokens = new CommonTokenStream(lex);
    						tokens.discardTokenType(WS);
    						tokens.discardTokenType(COMMENT);
    						tokens.discardTokenType(NL);
    						
     SimScan_ANTLR3Parser parser = new 
     SimScan_ANTLR3Parser(tokens);
    						parser.main();
    					}



    // $ANTLR start main
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:60:1: main returns [Object ret2] : ( (ret= simScan ) EOF ) ;
    public final Object main() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:61:4: ( ( (ret= simScan ) EOF ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:61:4: ( (ret= simScan ) EOF )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:61:4: ( (ret= simScan ) EOF )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:61:5: (ret= simScan ) EOF
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:61:5: (ret= simScan )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:61:6: ret= simScan
            {
            pushFollow(FOLLOW_simScan_in_main46);
            ret=simScan();
            _fsp--;


            }

            match(input,EOF,FOLLOW_EOF_in_main49); 

            }


               ret2=ret;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end main


    // $ANTLR start identifier
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:68:1: identifier returns [Object ret2] : ast= NAME ;
    public final Object identifier() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:69:4: (ast= NAME )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:69:4: ast= NAME
            {
            ast=(Token)input.LT(1);
            match(input,NAME,FOLLOW_NAME_in_identifier76); 
            ret = ast.getText(); ei.setToken((Object)ast);

               ret2=ret;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end identifier


    // $ANTLR start stringSymbol
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:76:1: stringSymbol returns [Object ret2] : ast= STRING ;
    public final Object stringSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:77:4: (ast= STRING )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:77:4: ast= STRING
            {
            ast=(Token)input.LT(1);
            match(input,STRING,FOLLOW_STRING_in_stringSymbol104); 
            ret = ast.getText(); ei.setToken((Object)ast);

               ret2=ret;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end stringSymbol


    // $ANTLR start integerSymbol
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:84:1: integerSymbol returns [Object ret2] : ast= INT ;
    public final Object integerSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:85:4: (ast= INT )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:85:4: ast= INT
            {
            ast=(Token)input.LT(1);
            match(input,INT,FOLLOW_INT_in_integerSymbol132); 
            ret = Integer.valueOf(ast.getText()); ei.setToken((Object)ast);

               ret2=ret;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end integerSymbol


    // $ANTLR start floatSymbol
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:92:1: floatSymbol returns [Object ret2] : ast= FLOAT ;
    public final Object floatSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:93:4: (ast= FLOAT )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:93:4: ast= FLOAT
            {
            ast=(Token)input.LT(1);
            match(input,FLOAT,FOLLOW_FLOAT_in_floatSymbol160); 
            ret = Double.valueOf(ast.getText()); ei.setToken((Object)ast);

               ret2=ret;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end floatSymbol


    // $ANTLR start simScan
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:100:1: simScan returns [Object ret2] : ( ( ( ( (temp= sSGroup ( (temp= sSGroup ) )* ) )? ) ) ) ;
    public final Object simScan() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("SimScan", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:4: ( ( ( ( ( (temp= sSGroup ( (temp= sSGroup ) )* ) )? ) ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:4: ( ( ( ( (temp= sSGroup ( (temp= sSGroup ) )* ) )? ) ) )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:4: ( ( ( ( (temp= sSGroup ( (temp= sSGroup ) )* ) )? ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:5: ( ( ( (temp= sSGroup ( (temp= sSGroup ) )* ) )? ) )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:5: ( ( ( (temp= sSGroup ( (temp= sSGroup ) )* ) )? ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:6: ( ( (temp= sSGroup ( (temp= sSGroup ) )* ) )? )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:6: ( ( (temp= sSGroup ( (temp= sSGroup ) )* ) )? )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:7: ( (temp= sSGroup ( (temp= sSGroup ) )* ) )?
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:7: ( (temp= sSGroup ( (temp= sSGroup ) )* ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==INT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:8: (temp= sSGroup ( (temp= sSGroup ) )* )
                    {
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:8: (temp= sSGroup ( (temp= sSGroup ) )* )
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:9: temp= sSGroup ( (temp= sSGroup ) )*
                    {
                    pushFollow(FOLLOW_sSGroup_in_simScan193);
                    temp=sSGroup();
                    _fsp--;

                    ei.set(ret, "groups", temp);
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:53: ( (temp= sSGroup ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==INT) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:54: (temp= sSGroup )
                    	    {
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:54: (temp= sSGroup )
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:101:55: temp= sSGroup
                    	    {
                    	    pushFollow(FOLLOW_sSGroup_in_simScan201);
                    	    temp=sSGroup();
                    	    _fsp--;

                    	    ei.set(ret, "groups", temp);

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }


            }


            }


               ei.leaveContext(false);
               if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.atl.engine.injectors.ebnf.LocationTokenv3)input.LT(-1)).getEndLine() + ":" + (((org.atl.engine.injectors.ebnf.LocationTokenv3)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
            	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
               ret2=ret;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end simScan


    // $ANTLR start sSGroup
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:111:1: sSGroup returns [Object ret2] : ( ( (temp= sSUnit ( ( ( COMA ) temp= sSUnit ) )* ) ) ) ;
    public final Object sSGroup() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("SSGroup", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:4: ( ( ( (temp= sSUnit ( ( ( COMA ) temp= sSUnit ) )* ) ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:4: ( ( (temp= sSUnit ( ( ( COMA ) temp= sSUnit ) )* ) ) )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:4: ( ( (temp= sSUnit ( ( ( COMA ) temp= sSUnit ) )* ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:5: ( (temp= sSUnit ( ( ( COMA ) temp= sSUnit ) )* ) )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:5: ( (temp= sSUnit ( ( ( COMA ) temp= sSUnit ) )* ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:6: (temp= sSUnit ( ( ( COMA ) temp= sSUnit ) )* )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:6: (temp= sSUnit ( ( ( COMA ) temp= sSUnit ) )* )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:7: temp= sSUnit ( ( ( COMA ) temp= sSUnit ) )*
            {
            pushFollow(FOLLOW_sSUnit_in_sSGroup241);
            temp=sSUnit();
            _fsp--;

            ei.set(ret, "units", temp);
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:49: ( ( ( COMA ) temp= sSUnit ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:50: ( ( COMA ) temp= sSUnit )
            	    {
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:50: ( ( COMA ) temp= sSUnit )
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:51: ( COMA ) temp= sSUnit
            	    {
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:51: ( COMA )
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:112:52: COMA
            	    {
            	    match(input,COMA,FOLLOW_COMA_in_sSGroup248); 

            	    }

            	    pushFollow(FOLLOW_sSUnit_in_sSGroup253);
            	    temp=sSUnit();
            	    _fsp--;

            	    ei.set(ret, "units", temp);

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            }


               ei.leaveContext(false);
               if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.atl.engine.injectors.ebnf.LocationTokenv3)input.LT(-1)).getEndLine() + ":" + (((org.atl.engine.injectors.ebnf.LocationTokenv3)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
            	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
               ret2=ret;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end sSGroup


    // $ANTLR start sSUnit
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:122:1: sSUnit returns [Object ret2] : (temp= integerSymbol MINUS temp= identifier COLONBS temp= identifier COLON temp= integerSymbol MINUS temp= integerSymbol ) ;
    public final Object sSUnit() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("SSUnit", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:123:4: ( (temp= integerSymbol MINUS temp= identifier COLONBS temp= identifier COLON temp= integerSymbol MINUS temp= integerSymbol ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:123:4: (temp= integerSymbol MINUS temp= identifier COLONBS temp= identifier COLON temp= integerSymbol MINUS temp= integerSymbol )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:123:4: (temp= integerSymbol MINUS temp= identifier COLONBS temp= identifier COLON temp= integerSymbol MINUS temp= integerSymbol )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\SimScan\\Syntax\\SimScan_ANTLR3.g:123:5: temp= integerSymbol MINUS temp= identifier COLONBS temp= identifier COLON temp= integerSymbol MINUS temp= integerSymbol
            {
            pushFollow(FOLLOW_integerSymbol_in_sSUnit288);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "nodeNo", temp);
            match(input,MINUS,FOLLOW_MINUS_in_sSUnit292); 
            pushFollow(FOLLOW_identifier_in_sSUnit296);
            temp=identifier();
            _fsp--;

            ei.set(ret, "drive", temp);
            match(input,COLONBS,FOLLOW_COLONBS_in_sSUnit300); 
            pushFollow(FOLLOW_identifier_in_sSUnit304);
            temp=identifier();
            _fsp--;

            ei.set(ret, "fileName", temp);
            match(input,COLON,FOLLOW_COLON_in_sSUnit308); 
            pushFollow(FOLLOW_integerSymbol_in_sSUnit312);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "startLine", temp);
            match(input,MINUS,FOLLOW_MINUS_in_sSUnit316); 
            pushFollow(FOLLOW_integerSymbol_in_sSUnit320);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "endLine", temp);

            }


               ei.leaveContext(false);
               if(input.LT(-1) != null) ei.setLocation(ret, firstToken.getLine() + ":" + (firstToken.getCharPositionInLine() + 1) + "-" + ((org.atl.engine.injectors.ebnf.LocationTokenv3)input.LT(-1)).getEndLine() + ":" + (((org.atl.engine.injectors.ebnf.LocationTokenv3)input.LT(-1)).getEndColumn() + 1));ei.setCommentsBefore(ret, new Object[] {input, firstToken});
            	   ei.setCommentsAfter(ret, new Object[] {input, input.LT(-1)});
               ret2=ret;
              

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end sSUnit


 

    public static final BitSet FOLLOW_simScan_in_main46 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_main49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_identifier76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringSymbol104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integerSymbol132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_floatSymbol160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sSGroup_in_simScan193 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_sSGroup_in_simScan201 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_sSUnit_in_sSGroup241 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_COMA_in_sSGroup248 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_sSUnit_in_sSGroup253 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_integerSymbol_in_sSUnit288 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MINUS_in_sSUnit292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_sSUnit296 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLONBS_in_sSUnit300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_sSUnit304 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_sSUnit308 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_sSUnit312 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_MINUS_in_sSUnit316 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_sSUnit320 = new BitSet(new long[]{0x0000000000000002L});

}