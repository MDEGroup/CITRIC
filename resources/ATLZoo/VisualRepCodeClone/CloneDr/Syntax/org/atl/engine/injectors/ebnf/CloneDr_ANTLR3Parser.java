// $ANTLR 3.0 C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g 2007-12-03 23:02:33
package org.atl.engine.injectors.ebnf;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CloneDr_ANTLR3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NAME", "STRING", "INT", "FLOAT", "NL", "WS", "DIGIT", "ALPHA", "SNAME", "ESC", "LSQUARE", "RSQUARE", "EXCL", "COMA", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "SEMI", "COLON", "PIPE", "SHARP", "QMARK", "COLONCOLON", "POINT", "RARROW", "MINUS", "STAR", "SLASH", "PLUS", "EQ", "GT", "LT", "GE", "LE", "NE", "LARROW", "COMMENT", "'#1'", "'\t'", "'\t+'", "'#2'", "'#3'"
    };
    public static final int MINUS=30;
    public static final int LSQUARE=14;
    public static final int SNAME=12;
    public static final int SLASH=32;
    public static final int SHARP=25;
    public static final int POINT=28;
    public static final int WS=9;
    public static final int ALPHA=11;
    public static final int EQ=34;
    public static final int STRING=5;
    public static final int FLOAT=7;
    public static final int RARROW=29;
    public static final int EXCL=16;
    public static final int LT=36;
    public static final int NE=39;
    public static final int GT=35;
    public static final int COMMENT=41;
    public static final int LARROW=40;
    public static final int RSQUARE=15;
    public static final int ESC=13;
    public static final int PIPE=24;
    public static final int SEMI=22;
    public static final int GE=37;
    public static final int COLONCOLON=27;
    public static final int RCURLY=21;
    public static final int NL=8;
    public static final int LCURLY=20;
    public static final int INT=6;
    public static final int QMARK=26;
    public static final int EOF=-1;
    public static final int LE=38;
    public static final int RPAREN=19;
    public static final int COLON=23;
    public static final int LPAREN=18;
    public static final int PLUS=33;
    public static final int DIGIT=10;
    public static final int COMA=17;
    public static final int STAR=31;
    public static final int NAME=4;

        public CloneDr_ANTLR3Parser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g"; }


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
     CloneDr_ANTLR3Lexer lex = new 
     CloneDr_ANTLR3Lexer(input);
    						CommonTokenStream tokens = new CommonTokenStream(lex);
    						tokens.discardTokenType(WS);
    						tokens.discardTokenType(COMMENT);
    						tokens.discardTokenType(NL);
    						
     CloneDr_ANTLR3Parser parser = new 
     CloneDr_ANTLR3Parser(tokens);
    						parser.main();
    					}



    // $ANTLR start main
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:60:1: main returns [Object ret2] : ( (ret= cloneDr ) EOF ) ;
    public final Object main() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:61:4: ( ( (ret= cloneDr ) EOF ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:61:4: ( (ret= cloneDr ) EOF )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:61:4: ( (ret= cloneDr ) EOF )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:61:5: (ret= cloneDr ) EOF
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:61:5: (ret= cloneDr )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:61:6: ret= cloneDr
            {
            pushFollow(FOLLOW_cloneDr_in_main46);
            ret=cloneDr();
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:68:1: identifier returns [Object ret2] : ast= NAME ;
    public final Object identifier() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:69:4: (ast= NAME )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:69:4: ast= NAME
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:76:1: stringSymbol returns [Object ret2] : ast= STRING ;
    public final Object stringSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:77:4: (ast= STRING )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:77:4: ast= STRING
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:84:1: integerSymbol returns [Object ret2] : ast= INT ;
    public final Object integerSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:85:4: (ast= INT )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:85:4: ast= INT
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:92:1: floatSymbol returns [Object ret2] : ast= FLOAT ;
    public final Object floatSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:93:4: (ast= FLOAT )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:93:4: ast= FLOAT
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


    // $ANTLR start cloneDr
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:100:1: cloneDr returns [Object ret2] : ( ( ( ( (temp= cDGroup ( (temp= cDGroup ) )* ) )? ) ) ) ;
    public final Object cloneDr() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("CloneDr", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:4: ( ( ( ( ( (temp= cDGroup ( (temp= cDGroup ) )* ) )? ) ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:4: ( ( ( ( (temp= cDGroup ( (temp= cDGroup ) )* ) )? ) ) )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:4: ( ( ( ( (temp= cDGroup ( (temp= cDGroup ) )* ) )? ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:5: ( ( ( (temp= cDGroup ( (temp= cDGroup ) )* ) )? ) )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:5: ( ( ( (temp= cDGroup ( (temp= cDGroup ) )* ) )? ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:6: ( ( (temp= cDGroup ( (temp= cDGroup ) )* ) )? )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:6: ( ( (temp= cDGroup ( (temp= cDGroup ) )* ) )? )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:7: ( (temp= cDGroup ( (temp= cDGroup ) )* ) )?
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:7: ( (temp= cDGroup ( (temp= cDGroup ) )* ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==42) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:8: (temp= cDGroup ( (temp= cDGroup ) )* )
                    {
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:8: (temp= cDGroup ( (temp= cDGroup ) )* )
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:9: temp= cDGroup ( (temp= cDGroup ) )*
                    {
                    pushFollow(FOLLOW_cDGroup_in_cloneDr193);
                    temp=cDGroup();
                    _fsp--;

                    ei.set(ret, "groups", temp);
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:53: ( (temp= cDGroup ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==42) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:54: (temp= cDGroup )
                    	    {
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:54: (temp= cDGroup )
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:101:55: temp= cDGroup
                    	    {
                    	    pushFollow(FOLLOW_cDGroup_in_cloneDr201);
                    	    temp=cDGroup();
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
    // $ANTLR end cloneDr


    // $ANTLR start cDGroup
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:111:1: cDGroup returns [Object ret2] : (temp= cDHead ( (temp= cDUnit ( (temp= cDUnit ) )* ) ) ( (temp= cDVarible ( (temp= cDVarible ) )* ) )? ) ;
    public final Object cDGroup() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("CDGroup", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:4: ( (temp= cDHead ( (temp= cDUnit ( (temp= cDUnit ) )* ) ) ( (temp= cDVarible ( (temp= cDVarible ) )* ) )? ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:4: (temp= cDHead ( (temp= cDUnit ( (temp= cDUnit ) )* ) ) ( (temp= cDVarible ( (temp= cDVarible ) )* ) )? )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:4: (temp= cDHead ( (temp= cDUnit ( (temp= cDUnit ) )* ) ) ( (temp= cDVarible ( (temp= cDVarible ) )* ) )? )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:5: temp= cDHead ( (temp= cDUnit ( (temp= cDUnit ) )* ) ) ( (temp= cDVarible ( (temp= cDVarible ) )* ) )?
            {
            pushFollow(FOLLOW_cDHead_in_cDGroup239);
            temp=cDHead();
            _fsp--;

            ei.set(ret, "head", temp);
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:46: ( (temp= cDUnit ( (temp= cDUnit ) )* ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:47: (temp= cDUnit ( (temp= cDUnit ) )* )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:47: (temp= cDUnit ( (temp= cDUnit ) )* )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:48: temp= cDUnit ( (temp= cDUnit ) )*
            {
            pushFollow(FOLLOW_cDUnit_in_cDGroup247);
            temp=cDUnit();
            _fsp--;

            ei.set(ret, "units", temp);
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:90: ( (temp= cDUnit ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==45) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:91: (temp= cDUnit )
            	    {
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:91: (temp= cDUnit )
            	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:92: temp= cDUnit
            	    {
            	    pushFollow(FOLLOW_cDUnit_in_cDGroup255);
            	    temp=cDUnit();
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

            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:139: ( (temp= cDVarible ( (temp= cDVarible ) )* ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==46) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:140: (temp= cDVarible ( (temp= cDVarible ) )* )
                    {
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:140: (temp= cDVarible ( (temp= cDVarible ) )* )
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:141: temp= cDVarible ( (temp= cDVarible ) )*
                    {
                    pushFollow(FOLLOW_cDVarible_in_cDGroup268);
                    temp=cDVarible();
                    _fsp--;

                    ei.set(ret, "varibles", temp);
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:189: ( (temp= cDVarible ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==46) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:190: (temp= cDVarible )
                    	    {
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:190: (temp= cDVarible )
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:112:191: temp= cDVarible
                    	    {
                    	    pushFollow(FOLLOW_cDVarible_in_cDGroup276);
                    	    temp=cDVarible();
                    	    _fsp--;

                    	    ei.set(ret, "varibles", temp);

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }
                    break;

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
    // $ANTLR end cDGroup


    // $ANTLR start cDHead
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:122:1: cDHead returns [Object ret2] : ( '#1' '\t' temp= identifier '\t+' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier ) ;
    public final Object cDHead() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("CDHead", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:123:4: ( ( '#1' '\t' temp= identifier '\t+' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:123:4: ( '#1' '\t' temp= identifier '\t+' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:123:4: ( '#1' '\t' temp= identifier '\t+' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:123:5: '#1' '\t' temp= identifier '\t+' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier
            {
            match(input,42,FOLLOW_42_in_cDHead310); 
            match(input,43,FOLLOW_43_in_cDHead312); 
            pushFollow(FOLLOW_identifier_in_cDHead316);
            temp=identifier();
            _fsp--;

            ei.set(ret, "tid", temp);
            match(input,44,FOLLOW_44_in_cDHead320); 
            pushFollow(FOLLOW_identifier_in_cDHead324);
            temp=identifier();
            _fsp--;

            ei.set(ret, "tno", temp);
            match(input,43,FOLLOW_43_in_cDHead328); 
            pushFollow(FOLLOW_identifier_in_cDHead332);
            temp=identifier();
            _fsp--;

            ei.set(ret, "tname", temp);
            match(input,43,FOLLOW_43_in_cDHead336); 
            pushFollow(FOLLOW_identifier_in_cDHead340);
            temp=identifier();
            _fsp--;

            ei.set(ret, "sim", temp);
            match(input,43,FOLLOW_43_in_cDHead344); 
            pushFollow(FOLLOW_identifier_in_cDHead348);
            temp=identifier();
            _fsp--;

            ei.set(ret, "pcount", temp);
            match(input,43,FOLLOW_43_in_cDHead352); 
            pushFollow(FOLLOW_identifier_in_cDHead356);
            temp=identifier();
            _fsp--;

            ei.set(ret, "nclones", temp);
            match(input,43,FOLLOW_43_in_cDHead360); 
            pushFollow(FOLLOW_identifier_in_cDHead364);
            temp=identifier();
            _fsp--;

            ei.set(ret, "esloc", temp);

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
    // $ANTLR end cDHead


    // $ANTLR start cDUnit
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:133:1: cDUnit returns [Object ret2] : ( '#2' '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier ) ;
    public final Object cDUnit() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("CDUnit", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:134:4: ( ( '#2' '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:134:4: ( '#2' '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:134:4: ( '#2' '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:134:5: '#2' '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier
            {
            match(input,45,FOLLOW_45_in_cDUnit392); 
            match(input,43,FOLLOW_43_in_cDUnit394); 
            pushFollow(FOLLOW_identifier_in_cDUnit398);
            temp=identifier();
            _fsp--;

            ei.set(ret, "tid", temp);
            match(input,43,FOLLOW_43_in_cDUnit402); 
            pushFollow(FOLLOW_identifier_in_cDUnit406);
            temp=identifier();
            _fsp--;

            ei.set(ret, "rno", temp);
            match(input,43,FOLLOW_43_in_cDUnit410); 
            pushFollow(FOLLOW_identifier_in_cDUnit414);
            temp=identifier();
            _fsp--;

            ei.set(ret, "startLine", temp);
            match(input,43,FOLLOW_43_in_cDUnit418); 
            pushFollow(FOLLOW_identifier_in_cDUnit422);
            temp=identifier();
            _fsp--;

            ei.set(ret, "startC", temp);
            match(input,43,FOLLOW_43_in_cDUnit426); 
            pushFollow(FOLLOW_identifier_in_cDUnit430);
            temp=identifier();
            _fsp--;

            ei.set(ret, "endLine", temp);
            match(input,43,FOLLOW_43_in_cDUnit434); 
            pushFollow(FOLLOW_identifier_in_cDUnit438);
            temp=identifier();
            _fsp--;

            ei.set(ret, "endC", temp);
            match(input,43,FOLLOW_43_in_cDUnit442); 
            pushFollow(FOLLOW_identifier_in_cDUnit446);
            temp=identifier();
            _fsp--;

            ei.set(ret, "fileName", temp);

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
    // $ANTLR end cDUnit


    // $ANTLR start cDVarible
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:144:1: cDVarible returns [Object ret2] : ( '#3' '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier ) ;
    public final Object cDVarible() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("CDVarible", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:145:4: ( ( '#3' '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:145:4: ( '#3' '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:145:4: ( '#3' '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\CloneDr\\Syntax\\CloneDr_ANTLR3.g:145:5: '#3' '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier '\t' temp= identifier
            {
            match(input,46,FOLLOW_46_in_cDVarible474); 
            match(input,43,FOLLOW_43_in_cDVarible476); 
            pushFollow(FOLLOW_identifier_in_cDVarible480);
            temp=identifier();
            _fsp--;

            ei.set(ret, "tid", temp);
            match(input,43,FOLLOW_43_in_cDVarible484); 
            pushFollow(FOLLOW_identifier_in_cDVarible488);
            temp=identifier();
            _fsp--;

            ei.set(ret, "cid", temp);
            match(input,43,FOLLOW_43_in_cDVarible492); 
            pushFollow(FOLLOW_identifier_in_cDVarible496);
            temp=identifier();
            _fsp--;

            ei.set(ret, "pno", temp);
            match(input,43,FOLLOW_43_in_cDVarible500); 
            pushFollow(FOLLOW_identifier_in_cDVarible504);
            temp=identifier();
            _fsp--;

            ei.set(ret, "ai", temp);
            match(input,43,FOLLOW_43_in_cDVarible508); 
            pushFollow(FOLLOW_identifier_in_cDVarible512);
            temp=identifier();
            _fsp--;

            ei.set(ret, "sl", temp);
            match(input,43,FOLLOW_43_in_cDVarible516); 
            pushFollow(FOLLOW_identifier_in_cDVarible520);
            temp=identifier();
            _fsp--;

            ei.set(ret, "sc", temp);
            match(input,43,FOLLOW_43_in_cDVarible524); 
            pushFollow(FOLLOW_identifier_in_cDVarible528);
            temp=identifier();
            _fsp--;

            ei.set(ret, "el", temp);
            match(input,43,FOLLOW_43_in_cDVarible532); 
            pushFollow(FOLLOW_identifier_in_cDVarible536);
            temp=identifier();
            _fsp--;

            ei.set(ret, "ec", temp);
            match(input,43,FOLLOW_43_in_cDVarible540); 
            pushFollow(FOLLOW_identifier_in_cDVarible544);
            temp=identifier();
            _fsp--;

            ei.set(ret, "fileName", temp);

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
    // $ANTLR end cDVarible


 

    public static final BitSet FOLLOW_cloneDr_in_main46 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_main49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_identifier76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringSymbol104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integerSymbol132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_floatSymbol160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cDGroup_in_cloneDr193 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_cDGroup_in_cloneDr201 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_cDHead_in_cDGroup239 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_cDUnit_in_cDGroup247 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_cDUnit_in_cDGroup255 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_cDVarible_in_cDGroup268 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_cDVarible_in_cDGroup276 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_42_in_cDHead310 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDHead312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDHead316 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_cDHead320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDHead324 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDHead328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDHead332 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDHead336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDHead340 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDHead344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDHead348 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDHead352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDHead356 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDHead360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDHead364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_cDUnit392 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDUnit394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDUnit398 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDUnit402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDUnit406 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDUnit410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDUnit414 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDUnit418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDUnit422 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDUnit426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDUnit430 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDUnit434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDUnit438 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDUnit442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDUnit446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_cDVarible474 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDVarible476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDVarible480 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDVarible484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDVarible488 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDVarible492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDVarible496 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDVarible500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDVarible504 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDVarible508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDVarible512 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDVarible516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDVarible520 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDVarible524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDVarible528 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDVarible532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDVarible536 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_cDVarible540 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_cDVarible544 = new BitSet(new long[]{0x0000000000000002L});

}