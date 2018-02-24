// $ANTLR 3.0 C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g 2007-12-03 23:08:16
package org.atl.engine.injectors.ebnf;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FileInfo_ANTLR3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NAME", "STRING", "INT", "FLOAT", "NL", "WS", "DIGIT", "ALPHA", "SNAME", "ESC", "LSQUARE", "RSQUARE", "EXCL", "COMA", "LPAREN", "RPAREN", "LCURLY", "RCURLY", "SEMI", "PIPE", "SHARP", "QMARK", "COLONCOLON", "POINT", "RARROW", "MINUS", "STAR", "SLASH", "PLUS", "EQ", "GT", "LT", "GE", "LE", "NE", "LARROW", "COMMENT"
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

        public FileInfo_ANTLR3Parser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g"; }


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
     FileInfo_ANTLR3Lexer lex = new 
     FileInfo_ANTLR3Lexer(input);
    						CommonTokenStream tokens = new CommonTokenStream(lex);
    						tokens.discardTokenType(WS);
    						tokens.discardTokenType(COMMENT);
    						tokens.discardTokenType(NL);
    						
     FileInfo_ANTLR3Parser parser = new 
     FileInfo_ANTLR3Parser(tokens);
    						parser.main();
    					}



    // $ANTLR start main
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:60:1: main returns [Object ret2] : ( (ret= fileInfo ) EOF ) ;
    public final Object main() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:61:4: ( ( (ret= fileInfo ) EOF ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:61:4: ( (ret= fileInfo ) EOF )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:61:4: ( (ret= fileInfo ) EOF )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:61:5: (ret= fileInfo ) EOF
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:61:5: (ret= fileInfo )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:61:6: ret= fileInfo
            {
            pushFollow(FOLLOW_fileInfo_in_main46);
            ret=fileInfo();
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:68:1: identifier returns [Object ret2] : ast= NAME ;
    public final Object identifier() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:69:4: (ast= NAME )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:69:4: ast= NAME
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:76:1: stringSymbol returns [Object ret2] : ast= STRING ;
    public final Object stringSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:77:4: (ast= STRING )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:77:4: ast= STRING
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:84:1: integerSymbol returns [Object ret2] : ast= INT ;
    public final Object integerSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:85:4: (ast= INT )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:85:4: ast= INT
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
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:92:1: floatSymbol returns [Object ret2] : ast= FLOAT ;
    public final Object floatSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:93:4: (ast= FLOAT )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:93:4: ast= FLOAT
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


    // $ANTLR start fileInfo
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:100:1: fileInfo returns [Object ret2] : ( ( ( ( (temp= file ( (temp= file ) )* ) )? ) ) ) ;
    public final Object fileInfo() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("FileInfo", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:4: ( ( ( ( ( (temp= file ( (temp= file ) )* ) )? ) ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:4: ( ( ( ( (temp= file ( (temp= file ) )* ) )? ) ) )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:4: ( ( ( ( (temp= file ( (temp= file ) )* ) )? ) ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:5: ( ( ( (temp= file ( (temp= file ) )* ) )? ) )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:5: ( ( ( (temp= file ( (temp= file ) )* ) )? ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:6: ( ( (temp= file ( (temp= file ) )* ) )? )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:6: ( ( (temp= file ( (temp= file ) )* ) )? )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:7: ( (temp= file ( (temp= file ) )* ) )?
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:7: ( (temp= file ( (temp= file ) )* ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NAME) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:8: (temp= file ( (temp= file ) )* )
                    {
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:8: (temp= file ( (temp= file ) )* )
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:9: temp= file ( (temp= file ) )*
                    {
                    pushFollow(FOLLOW_file_in_fileInfo193);
                    temp=file();
                    _fsp--;

                    ei.set(ret, "file", temp);
                    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:48: ( (temp= file ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==NAME) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:49: (temp= file )
                    	    {
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:49: (temp= file )
                    	    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:101:50: temp= file
                    	    {
                    	    pushFollow(FOLLOW_file_in_fileInfo201);
                    	    temp=file();
                    	    _fsp--;

                    	    ei.set(ret, "file", temp);

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
    // $ANTLR end fileInfo


    // $ANTLR start file
    // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:111:1: file returns [Object ret2] : (temp= identifier temp= integerSymbol ) ;
    public final Object file() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        Object ret=(backtracking==0) ? ei.create("File", false, false) : null;org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:112:4: ( (temp= identifier temp= integerSymbol ) )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:112:4: (temp= identifier temp= integerSymbol )
            {
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:112:4: (temp= identifier temp= integerSymbol )
            // C:\\Documents and Settings\\yusun\\My Documents\\Java\\Eclipse Projects\\FileInfo\\Syntax\\FileInfo_ANTLR3.g:112:5: temp= identifier temp= integerSymbol
            {
            pushFollow(FOLLOW_identifier_in_file239);
            temp=identifier();
            _fsp--;

            ei.set(ret, "name", temp);
            pushFollow(FOLLOW_integerSymbol_in_file245);
            temp=integerSymbol();
            _fsp--;

            ei.set(ret, "totallines", temp);

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
    // $ANTLR end file


 

    public static final BitSet FOLLOW_fileInfo_in_main46 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_main49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_identifier76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringSymbol104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integerSymbol132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_floatSymbol160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_file_in_fileInfo193 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_file_in_fileInfo201 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_identifier_in_file239 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_integerSymbol_in_file245 = new BitSet(new long[]{0x0000000000000002L});

}