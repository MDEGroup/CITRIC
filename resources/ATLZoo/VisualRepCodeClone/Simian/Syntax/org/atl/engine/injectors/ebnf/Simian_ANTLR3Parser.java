// $ANTLR 3.0 C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g 2007-11-01 14:02:32
package org.atl.engine.injectors.ebnf;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Simian_ANTLR3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NAME", "STRING", "INT", "FLOAT", "NL", "WS", "DIGIT", "ALPHA", "SNAME", "ESC", "LSQUARE", "RSQUARE", "EXCL", "COMA", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "SEMI", "PIPE", "SHARP", "QMARK", "COLONCOLON", "POINT", "RARROW", "MINUS", "STAR", "SLASH", "PLUS", "EQ", "GT", "LT", "GE", "LE", "NE", "LARROW", "COMMENT", "'Found'", "'duplicate lines in'", "'blocks in'", "'files'", "'Processed a total of'", "'significant ('", "'raw) lines in'", "'Processing time:'", "'sec'", "'the following files:'", "'Between lines'", "'and'", "'in'"
    };
    public static final int MINUS=29;
    public static final int LSQUARE=14;
    public static final int SNAME=12;
    public static final int SLASH=31;
    public static final int SHARP=24;
    public static final int POINT=27;
    public static final int WS=9;
    public static final int ALPHA=11;
    public static final int EQ=33;
    public static final int STRING=5;
    public static final int FLOAT=7;
    public static final int RARROW=28;
    public static final int EXCL=16;
    public static final int LT=35;
    public static final int NE=38;
    public static final int GT=34;
    public static final int COMMENT=40;
    public static final int LARROW=39;
    public static final int RSQUARE=15;
    public static final int ESC=13;
    public static final int PIPE=23;
    public static final int SEMI=22;
    public static final int GE=36;
    public static final int COLONCOLON=26;
    public static final int RCURLY=21;
    public static final int NL=8;
    public static final int LCURLY=20;
    public static final int INT=6;
    public static final int QMARK=25;
    public static final int EOF=-1;
    public static final int LE=37;
    public static final int RPAREN=19;
    public static final int LPAREN=18;
    public static final int PLUS=32;
    public static final int DIGIT=10;
    public static final int COMA=17;
    public static final int STAR=30;
    public static final int NAME=4;

        public Simian_ANTLR3Parser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g"; }


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
     Simian_ANTLR3Lexer lex = new 
     Simian_ANTLR3Lexer(input);
    						CommonTokenStream tokens = new CommonTokenStream(lex);
    						tokens.discardTokenType(WS);
    						tokens.discardTokenType(COMMENT);
    						tokens.discardTokenType(NL);
    						
     Simian_ANTLR3Parser parser = new 
     Simian_ANTLR3Parser(tokens);
    						parser.main();
    					}



    // $ANTLR start main
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:60:1: main returns [Object ret2] : ( (ret= clonePairs ) EOF ) ;
    public final Object main() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:61:4: ( ( (ret= clonePairs ) EOF ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:61:4: ( (ret= clonePairs ) EOF )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:61:4: ( (ret= clonePairs ) EOF )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:61:5: (ret= clonePairs ) EOF
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:61:5: (ret= clonePairs )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:61:6: ret= clonePairs
            {
            pushFollow(FOLLOW_clonePairs_in_main46);
            ret=clonePairs();
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:68:1: identifier returns [Object ret2] : ast= NAME ;
    public final Object identifier() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:69:4: (ast= NAME )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:69:4: ast= NAME
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:76:1: stringSymbol returns [Object ret2] : ast= STRING ;
    public final Object stringSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:77:4: (ast= STRING )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:77:4: ast= STRING
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:84:1: integerSymbol returns [Object ret2] : ast= INT ;
    public final Object integerSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:85:4: (ast= INT )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:85:4: ast= INT
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:92:1: floatSymbol returns [Object ret2] : ast= FLOAT ;
    public final Object floatSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:93:4: (ast= FLOAT )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:93:4: ast= FLOAT
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


    // $ANTLR start clonePairs
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:100:1: clonePairs returns [Object ret2] : ( ( ( ( (temp= clonePair ( (temp= clonePair ) )* ) )? ) ) temp= summary ) ;
    public final Object clonePairs() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("ClonePairs", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:4: ( ( ( ( ( (temp= clonePair ( (temp= clonePair ) )* ) )? ) ) temp= summary ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:4: ( ( ( ( (temp= clonePair ( (temp= clonePair ) )* ) )? ) ) temp= summary )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:4: ( ( ( ( (temp= clonePair ( (temp= clonePair ) )* ) )? ) ) temp= summary )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:5: ( ( ( (temp= clonePair ( (temp= clonePair ) )* ) )? ) ) temp= summary
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:5: ( ( ( (temp= clonePair ( (temp= clonePair ) )* ) )? ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:6: ( ( (temp= clonePair ( (temp= clonePair ) )* ) )? )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:6: ( ( (temp= clonePair ( (temp= clonePair ) )* ) )? )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:7: ( (temp= clonePair ( (temp= clonePair ) )* ) )?
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:7: ( (temp= clonePair ( (temp= clonePair ) )* ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==41) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==INT) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==42) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==50) ) {
                            alt2=1;
                        }
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:8: (temp= clonePair ( (temp= clonePair ) )* )
                    {
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:8: (temp= clonePair ( (temp= clonePair ) )* )
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:9: temp= clonePair ( (temp= clonePair ) )*
                    {
                    pushFollow(FOLLOW_clonePair_in_clonePairs193);
                    temp=clonePair();
                    _fsp--;

                    ei.set(ret, "clonepart", temp);
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:58: ( (temp= clonePair ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==41) ) {
                            int LA1_1 = input.LA(2);

                            if ( (LA1_1==INT) ) {
                                int LA1_2 = input.LA(3);

                                if ( (LA1_2==42) ) {
                                    int LA1_3 = input.LA(4);

                                    if ( (LA1_3==50) ) {
                                        alt1=1;
                                    }


                                }


                            }


                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:59: (temp= clonePair )
                    	    {
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:59: (temp= clonePair )
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:101:60: temp= clonePair
                    	    {
                    	    pushFollow(FOLLOW_clonePair_in_clonePairs201);
                    	    temp=clonePair();
                    	    _fsp--;

                    	    ei.set(ret, "clonepart", temp);

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

            pushFollow(FOLLOW_summary_in_clonePairs215);
            temp=summary();
            _fsp--;

            ei.set(ret, "summary", temp);

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
    // $ANTLR end clonePairs


    // $ANTLR start summary
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:111:1: summary returns [Object ret2] : ( 'Found' temp= integerSymbol 'duplicate lines in' temp= integerSymbol 'blocks in' temp= integerSymbol 'files' 'Processed a total of' temp= integerSymbol 'significant (' temp= integerSymbol 'raw) lines in' temp= integerSymbol 'files' 'Processing time:' temp= floatSymbol 'sec' ) ;
    public final Object summary() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("Summary", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:112:4: ( ( 'Found' temp= integerSymbol 'duplicate lines in' temp= integerSymbol 'blocks in' temp= integerSymbol 'files' 'Processed a total of' temp= integerSymbol 'significant (' temp= integerSymbol 'raw) lines in' temp= integerSymbol 'files' 'Processing time:' temp= floatSymbol 'sec' ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:112:4: ( 'Found' temp= integerSymbol 'duplicate lines in' temp= integerSymbol 'blocks in' temp= integerSymbol 'files' 'Processed a total of' temp= integerSymbol 'significant (' temp= integerSymbol 'raw) lines in' temp= integerSymbol 'files' 'Processing time:' temp= floatSymbol 'sec' )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:112:4: ( 'Found' temp= integerSymbol 'duplicate lines in' temp= integerSymbol 'blocks in' temp= integerSymbol 'files' 'Processed a total of' temp= integerSymbol 'significant (' temp= integerSymbol 'raw) lines in' temp= integerSymbol 'files' 'Processing time:' temp= floatSymbol 'sec' )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:112:5: 'Found' temp= integerSymbol 'duplicate lines in' temp= integerSymbol 'blocks in' temp= integerSymbol 'files' 'Processed a total of' temp= integerSymbol 'significant (' temp= integerSymbol 'raw) lines in' temp= integerSymbol 'files' 'Processing time:' temp= floatSymbol 'sec'
            {
            match(input,41,FOLLOW_41_in_summary243); 
            pushFollow(FOLLOW_integerSymbol_in_summary247);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "total_lines", temp);
            match(input,42,FOLLOW_42_in_summary251); 
            pushFollow(FOLLOW_integerSymbol_in_summary255);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "total_blocks", temp);
            match(input,43,FOLLOW_43_in_summary259); 
            pushFollow(FOLLOW_integerSymbol_in_summary263);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "clone_files", temp);
            match(input,44,FOLLOW_44_in_summary267); 
            match(input,45,FOLLOW_45_in_summary269); 
            pushFollow(FOLLOW_integerSymbol_in_summary273);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "sig_lines", temp);
            match(input,46,FOLLOW_46_in_summary277); 
            pushFollow(FOLLOW_integerSymbol_in_summary281);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "raw_lines", temp);
            match(input,47,FOLLOW_47_in_summary285); 
            pushFollow(FOLLOW_integerSymbol_in_summary289);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "total_files", temp);
            match(input,44,FOLLOW_44_in_summary293); 
            match(input,48,FOLLOW_48_in_summary295); 
            pushFollow(FOLLOW_floatSymbol_in_summary299);
            temp=floatSymbol();
            _fsp--;

            ei.set(ret, "process_time", temp);
            match(input,49,FOLLOW_49_in_summary303); 

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
    // $ANTLR end summary


    // $ANTLR start clonePair
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:122:1: clonePair returns [Object ret2] : ( 'Found' temp= integerSymbol 'duplicate lines in' 'the following files:' ( ( ( (temp= clone_ ( (temp= clone_ ) )* ) )? ) ) ) ;
    public final Object clonePair() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("ClonePair", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:4: ( ( 'Found' temp= integerSymbol 'duplicate lines in' 'the following files:' ( ( ( (temp= clone_ ( (temp= clone_ ) )* ) )? ) ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:4: ( 'Found' temp= integerSymbol 'duplicate lines in' 'the following files:' ( ( ( (temp= clone_ ( (temp= clone_ ) )* ) )? ) ) )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:4: ( 'Found' temp= integerSymbol 'duplicate lines in' 'the following files:' ( ( ( (temp= clone_ ( (temp= clone_ ) )* ) )? ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:5: 'Found' temp= integerSymbol 'duplicate lines in' 'the following files:' ( ( ( (temp= clone_ ( (temp= clone_ ) )* ) )? ) )
            {
            match(input,41,FOLLOW_41_in_clonePair329); 
            pushFollow(FOLLOW_integerSymbol_in_clonePair333);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "totallines", temp);
            match(input,42,FOLLOW_42_in_clonePair337); 
            match(input,50,FOLLOW_50_in_clonePair339); 
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:111: ( ( ( (temp= clone_ ( (temp= clone_ ) )* ) )? ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:112: ( ( (temp= clone_ ( (temp= clone_ ) )* ) )? )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:112: ( ( (temp= clone_ ( (temp= clone_ ) )* ) )? )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:113: ( (temp= clone_ ( (temp= clone_ ) )* ) )?
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:113: ( (temp= clone_ ( (temp= clone_ ) )* ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==51) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:114: (temp= clone_ ( (temp= clone_ ) )* )
                    {
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:114: (temp= clone_ ( (temp= clone_ ) )* )
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:115: temp= clone_ ( (temp= clone_ ) )*
                    {
                    pushFollow(FOLLOW_clone__in_clonePair347);
                    temp=clone_();
                    _fsp--;

                    ei.set(ret, "clonesubpart", temp);
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:164: ( (temp= clone_ ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==51) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:165: (temp= clone_ )
                    	    {
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:165: (temp= clone_ )
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:123:166: temp= clone_
                    	    {
                    	    pushFollow(FOLLOW_clone__in_clonePair355);
                    	    temp=clone_();
                    	    _fsp--;

                    	    ei.set(ret, "clonesubpart", temp);

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
    // $ANTLR end clonePair


    // $ANTLR start clone_
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:133:1: clone_ returns [Object ret2] : ( 'Between lines' temp= integerSymbol 'and' temp= integerSymbol 'in' temp= identifier ) ;
    public final Object clone_() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("Clone", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:134:4: ( ( 'Between lines' temp= integerSymbol 'and' temp= integerSymbol 'in' temp= identifier ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:134:4: ( 'Between lines' temp= integerSymbol 'and' temp= integerSymbol 'in' temp= identifier )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:134:4: ( 'Between lines' temp= integerSymbol 'and' temp= integerSymbol 'in' temp= identifier )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\Simian\\Syntax\\Simian_ANTLR3.g:134:5: 'Between lines' temp= integerSymbol 'and' temp= integerSymbol 'in' temp= identifier
            {
            match(input,51,FOLLOW_51_in_clone_391); 
            pushFollow(FOLLOW_integerSymbol_in_clone_395);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "start_line", temp);
            match(input,52,FOLLOW_52_in_clone_399); 
            pushFollow(FOLLOW_integerSymbol_in_clone_403);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "end_line", temp);
            match(input,53,FOLLOW_53_in_clone_407); 
            pushFollow(FOLLOW_identifier_in_clone_411);
            temp=identifier();
            _fsp--;

            ei.set(ret, "file", temp);

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
    // $ANTLR end clone_


 

    public static final BitSet FOLLOW_clonePairs_in_main46 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_main49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_identifier76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringSymbol104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integerSymbol132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_floatSymbol160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clonePair_in_clonePairs193 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_clonePair_in_clonePairs201 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_summary_in_clonePairs215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_summary243 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_summary247 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_summary251 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_summary255 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_summary259 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_summary263 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_summary267 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_summary269 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_summary273 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_summary277 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_summary281 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_summary285 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_summary289 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_summary293 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_summary295 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_floatSymbol_in_summary299 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_summary303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_clonePair329 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_clonePair333 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_clonePair337 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_clonePair339 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_clone__in_clonePair347 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_clone__in_clonePair355 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_clone_391 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_clone_395 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_clone_399 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_clone_403 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_clone_407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_clone_411 = new BitSet(new long[]{0x0000000000000002L});

}