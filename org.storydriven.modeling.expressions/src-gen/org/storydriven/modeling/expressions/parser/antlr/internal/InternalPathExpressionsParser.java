package org.storydriven.modeling.expressions.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.storydriven.modeling.expressions.services.PathExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPathExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'|'", "'.'", "'['", "','", "']'", "'!'", "'NO_REPEAT'", "'+'", "'*'", "'-->'", "'<>-->'", "'--><>'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalPathExpressionsParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g"; }



     	private PathExpressionsGrammarAccess grammarAccess;
     	
        public InternalPathExpressionsParser(TokenStream input, IAstFactory factory, PathExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PathExpression";	
       	}
       	
       	@Override
       	protected PathExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRulePathExpression
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:78:1: entryRulePathExpression returns [EObject current=null] : iv_rulePathExpression= rulePathExpression EOF ;
    public final EObject entryRulePathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpression = null;


        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:79:2: (iv_rulePathExpression= rulePathExpression EOF )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:80:2: iv_rulePathExpression= rulePathExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPathExpressionRule(), currentNode); 
            pushFollow(FOLLOW_rulePathExpression_in_entryRulePathExpression75);
            iv_rulePathExpression=rulePathExpression();
            _fsp--;

             current =iv_rulePathExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpression85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePathExpression


    // $ANTLR start rulePathExpression
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:87:1: rulePathExpression returns [EObject current=null] : ( ( (lv_pathAlternatives_0_0= rulePath ) ) | ( '(' ( (lv_pathAlternatives_2_0= rulePath ) ) ')' ( '|' '(' ( (lv_pathAlternatives_6_0= rulePath ) ) ')' )+ ) ) ;
    public final EObject rulePathExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_pathAlternatives_0_0 = null;

        EObject lv_pathAlternatives_2_0 = null;

        EObject lv_pathAlternatives_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:92:6: ( ( ( (lv_pathAlternatives_0_0= rulePath ) ) | ( '(' ( (lv_pathAlternatives_2_0= rulePath ) ) ')' ( '|' '(' ( (lv_pathAlternatives_6_0= rulePath ) ) ')' )+ ) ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:93:1: ( ( (lv_pathAlternatives_0_0= rulePath ) ) | ( '(' ( (lv_pathAlternatives_2_0= rulePath ) ) ')' ( '|' '(' ( (lv_pathAlternatives_6_0= rulePath ) ) ')' )+ ) )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:93:1: ( ( (lv_pathAlternatives_0_0= rulePath ) ) | ( '(' ( (lv_pathAlternatives_2_0= rulePath ) ) ')' ( '|' '(' ( (lv_pathAlternatives_6_0= rulePath ) ) ')' )+ ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:93:2: ( (lv_pathAlternatives_0_0= rulePath ) )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:93:2: ( (lv_pathAlternatives_0_0= rulePath ) )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:94:1: (lv_pathAlternatives_0_0= rulePath )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:94:1: (lv_pathAlternatives_0_0= rulePath )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:95:3: lv_pathAlternatives_0_0= rulePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePath_in_rulePathExpression131);
                    lv_pathAlternatives_0_0=rulePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPathExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"pathAlternatives",
                    	        		lv_pathAlternatives_0_0, 
                    	        		"Path", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:118:6: ( '(' ( (lv_pathAlternatives_2_0= rulePath ) ) ')' ( '|' '(' ( (lv_pathAlternatives_6_0= rulePath ) ) ')' )+ )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:118:6: ( '(' ( (lv_pathAlternatives_2_0= rulePath ) ) ')' ( '|' '(' ( (lv_pathAlternatives_6_0= rulePath ) ) ')' )+ )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:118:8: '(' ( (lv_pathAlternatives_2_0= rulePath ) ) ')' ( '|' '(' ( (lv_pathAlternatives_6_0= rulePath ) ) ')' )+
                    {
                    match(input,11,FOLLOW_11_in_rulePathExpression148); 

                            createLeafNode(grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_0(), null); 
                        
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:122:1: ( (lv_pathAlternatives_2_0= rulePath ) )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:123:1: (lv_pathAlternatives_2_0= rulePath )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:123:1: (lv_pathAlternatives_2_0= rulePath )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:124:3: lv_pathAlternatives_2_0= rulePath
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePath_in_rulePathExpression169);
                    lv_pathAlternatives_2_0=rulePath();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPathExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"pathAlternatives",
                    	        		lv_pathAlternatives_2_0, 
                    	        		"Path", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    match(input,12,FOLLOW_12_in_rulePathExpression179); 

                            createLeafNode(grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_2(), null); 
                        
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:150:1: ( '|' '(' ( (lv_pathAlternatives_6_0= rulePath ) ) ')' )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:150:3: '|' '(' ( (lv_pathAlternatives_6_0= rulePath ) ) ')'
                    	    {
                    	    match(input,13,FOLLOW_13_in_rulePathExpression190); 

                    	            createLeafNode(grammarAccess.getPathExpressionAccess().getVerticalLineKeyword_1_3_0(), null); 
                    	        
                    	    match(input,11,FOLLOW_11_in_rulePathExpression200); 

                    	            createLeafNode(grammarAccess.getPathExpressionAccess().getLeftParenthesisKeyword_1_3_1(), null); 
                    	        
                    	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:158:1: ( (lv_pathAlternatives_6_0= rulePath ) )
                    	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:159:1: (lv_pathAlternatives_6_0= rulePath )
                    	    {
                    	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:159:1: (lv_pathAlternatives_6_0= rulePath )
                    	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:160:3: lv_pathAlternatives_6_0= rulePath
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPathExpressionAccess().getPathAlternativesPathParserRuleCall_1_3_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePath_in_rulePathExpression221);
                    	    lv_pathAlternatives_6_0=rulePath();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPathExpressionRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"pathAlternatives",
                    	    	        		lv_pathAlternatives_6_0, 
                    	    	        		"Path", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }

                    	    match(input,12,FOLLOW_12_in_rulePathExpression231); 

                    	            createLeafNode(grammarAccess.getPathExpressionAccess().getRightParenthesisKeyword_1_3_3(), null); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePathExpression


    // $ANTLR start entryRulePath
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:194:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:195:2: (iv_rulePath= rulePath EOF )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:196:2: iv_rulePath= rulePath EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPathRule(), currentNode); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath270);
            iv_rulePath=rulePath();
            _fsp--;

             current =iv_rulePath; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath280); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePath


    // $ANTLR start rulePath
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:203:1: rulePath returns [EObject current=null] : ( ( (lv_segments_0_0= rulePathSegment ) ) ( '.' ( (lv_segments_2_0= rulePathSegment ) ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        EObject lv_segments_0_0 = null;

        EObject lv_segments_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:208:6: ( ( ( (lv_segments_0_0= rulePathSegment ) ) ( '.' ( (lv_segments_2_0= rulePathSegment ) ) )* ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:209:1: ( ( (lv_segments_0_0= rulePathSegment ) ) ( '.' ( (lv_segments_2_0= rulePathSegment ) ) )* )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:209:1: ( ( (lv_segments_0_0= rulePathSegment ) ) ( '.' ( (lv_segments_2_0= rulePathSegment ) ) )* )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:209:2: ( (lv_segments_0_0= rulePathSegment ) ) ( '.' ( (lv_segments_2_0= rulePathSegment ) ) )*
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:209:2: ( (lv_segments_0_0= rulePathSegment ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:210:1: (lv_segments_0_0= rulePathSegment )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:210:1: (lv_segments_0_0= rulePathSegment )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:211:3: lv_segments_0_0= rulePathSegment
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_rulePathSegment_in_rulePath326);
            lv_segments_0_0=rulePathSegment();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPathRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"segments",
            	        		lv_segments_0_0, 
            	        		"PathSegment", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:233:2: ( '.' ( (lv_segments_2_0= rulePathSegment ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:233:4: '.' ( (lv_segments_2_0= rulePathSegment ) )
            	    {
            	    match(input,14,FOLLOW_14_in_rulePath337); 

            	            createLeafNode(grammarAccess.getPathAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:237:1: ( (lv_segments_2_0= rulePathSegment ) )
            	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:238:1: (lv_segments_2_0= rulePathSegment )
            	    {
            	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:238:1: (lv_segments_2_0= rulePathSegment )
            	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:239:3: lv_segments_2_0= rulePathSegment
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getPathAccess().getSegmentsPathSegmentParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePathSegment_in_rulePath358);
            	    lv_segments_2_0=rulePathSegment();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getPathRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"segments",
            	    	        		lv_segments_2_0, 
            	    	        		"PathSegment", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePath


    // $ANTLR start entryRulePathSegment
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:269:1: entryRulePathSegment returns [EObject current=null] : iv_rulePathSegment= rulePathSegment EOF ;
    public final EObject entryRulePathSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathSegment = null;


        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:270:2: (iv_rulePathSegment= rulePathSegment EOF )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:271:2: iv_rulePathSegment= rulePathSegment EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPathSegmentRule(), currentNode); 
            pushFollow(FOLLOW_rulePathSegment_in_entryRulePathSegment396);
            iv_rulePathSegment=rulePathSegment();
            _fsp--;

             current =iv_rulePathSegment; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathSegment406); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePathSegment


    // $ANTLR start rulePathSegment
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:278:1: rulePathSegment returns [EObject current=null] : ( ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | ( '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) ( '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ ')' ) ) ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )? ) ;
    public final EObject rulePathSegment() throws RecognitionException {
        EObject current = null;

        EObject lv_alternatives_0_0 = null;

        EObject lv_alternatives_2_0 = null;

        EObject lv_alternatives_4_0 = null;

        Enumerator lv_repeatOperator_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:283:6: ( ( ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | ( '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) ( '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ ')' ) ) ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )? ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:284:1: ( ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | ( '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) ( '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ ')' ) ) ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )? )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:284:1: ( ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | ( '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) ( '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ ')' ) ) ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )? )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:284:2: ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | ( '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) ( '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ ')' ) ) ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )?
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:284:2: ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | ( '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) ( '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ ')' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=22 && LA5_0<=24)) ) {
                alt5=1;
            }
            else if ( (LA5_0==11) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("284:2: ( ( (lv_alternatives_0_0= rulePathSegmentDescription ) ) | ( '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) ( '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ ')' ) )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:284:3: ( (lv_alternatives_0_0= rulePathSegmentDescription ) )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:284:3: ( (lv_alternatives_0_0= rulePathSegmentDescription ) )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:285:1: (lv_alternatives_0_0= rulePathSegmentDescription )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:285:1: (lv_alternatives_0_0= rulePathSegmentDescription )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:286:3: lv_alternatives_0_0= rulePathSegmentDescription
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePathSegmentDescription_in_rulePathSegment453);
                    lv_alternatives_0_0=rulePathSegmentDescription();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPathSegmentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"alternatives",
                    	        		lv_alternatives_0_0, 
                    	        		"PathSegmentDescription", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:309:6: ( '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) ( '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ ')' )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:309:6: ( '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) ( '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ ')' )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:309:8: '(' ( (lv_alternatives_2_0= rulePathSegmentDescription ) ) ( '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+ ')'
                    {
                    match(input,11,FOLLOW_11_in_rulePathSegment470); 

                            createLeafNode(grammarAccess.getPathSegmentAccess().getLeftParenthesisKeyword_0_1_0(), null); 
                        
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:313:1: ( (lv_alternatives_2_0= rulePathSegmentDescription ) )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:314:1: (lv_alternatives_2_0= rulePathSegmentDescription )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:314:1: (lv_alternatives_2_0= rulePathSegmentDescription )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:315:3: lv_alternatives_2_0= rulePathSegmentDescription
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_rulePathSegmentDescription_in_rulePathSegment491);
                    lv_alternatives_2_0=rulePathSegmentDescription();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPathSegmentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"alternatives",
                    	        		lv_alternatives_2_0, 
                    	        		"PathSegmentDescription", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:337:2: ( '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==13) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:337:4: '|' ( (lv_alternatives_4_0= rulePathSegmentDescription ) )
                    	    {
                    	    match(input,13,FOLLOW_13_in_rulePathSegment502); 

                    	            createLeafNode(grammarAccess.getPathSegmentAccess().getVerticalLineKeyword_0_1_2_0(), null); 
                    	        
                    	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:341:1: ( (lv_alternatives_4_0= rulePathSegmentDescription ) )
                    	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:342:1: (lv_alternatives_4_0= rulePathSegmentDescription )
                    	    {
                    	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:342:1: (lv_alternatives_4_0= rulePathSegmentDescription )
                    	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:343:3: lv_alternatives_4_0= rulePathSegmentDescription
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getPathSegmentAccess().getAlternativesPathSegmentDescriptionParserRuleCall_0_1_2_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePathSegmentDescription_in_rulePathSegment523);
                    	    lv_alternatives_4_0=rulePathSegmentDescription();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getPathSegmentRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"alternatives",
                    	    	        		lv_alternatives_4_0, 
                    	    	        		"PathSegmentDescription", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    match(input,12,FOLLOW_12_in_rulePathSegment535); 

                            createLeafNode(grammarAccess.getPathSegmentAccess().getRightParenthesisKeyword_0_1_3(), null); 
                        

                    }


                    }
                    break;

            }

            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:369:3: ( (lv_repeatOperator_6_0= ruleRepeatOperator ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=19 && LA6_0<=21)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:370:1: (lv_repeatOperator_6_0= ruleRepeatOperator )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:370:1: (lv_repeatOperator_6_0= ruleRepeatOperator )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:371:3: lv_repeatOperator_6_0= ruleRepeatOperator
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPathSegmentAccess().getRepeatOperatorRepeatOperatorEnumRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRepeatOperator_in_rulePathSegment558);
                    lv_repeatOperator_6_0=ruleRepeatOperator();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPathSegmentRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"repeatOperator",
                    	        		lv_repeatOperator_6_0, 
                    	        		"RepeatOperator", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePathSegment


    // $ANTLR start entryRulePathSegmentDescription
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:401:1: entryRulePathSegmentDescription returns [EObject current=null] : iv_rulePathSegmentDescription= rulePathSegmentDescription EOF ;
    public final EObject entryRulePathSegmentDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathSegmentDescription = null;


        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:402:2: (iv_rulePathSegmentDescription= rulePathSegmentDescription EOF )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:403:2: iv_rulePathSegmentDescription= rulePathSegmentDescription EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPathSegmentDescriptionRule(), currentNode); 
            pushFollow(FOLLOW_rulePathSegmentDescription_in_entryRulePathSegmentDescription595);
            iv_rulePathSegmentDescription=rulePathSegmentDescription();
            _fsp--;

             current =iv_rulePathSegmentDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathSegmentDescription605); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRulePathSegmentDescription


    // $ANTLR start rulePathSegmentDescription
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:410:1: rulePathSegmentDescription returns [EObject current=null] : ( (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription ) ( (lv_restrictionList_2_0= ruleRestrictionList ) )? ) ;
    public final EObject rulePathSegmentDescription() throws RecognitionException {
        EObject current = null;

        EObject this_ImplicitPathDescription_0 = null;

        EObject this_ExplicitPathDescription_1 = null;

        EObject lv_restrictionList_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:415:6: ( ( (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription ) ( (lv_restrictionList_2_0= ruleRestrictionList ) )? ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:416:1: ( (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription ) ( (lv_restrictionList_2_0= ruleRestrictionList ) )? )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:416:1: ( (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription ) ( (lv_restrictionList_2_0= ruleRestrictionList ) )? )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:416:2: (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription ) ( (lv_restrictionList_2_0= ruleRestrictionList ) )?
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:416:2: (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=22 && LA7_0<=24)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("416:2: (this_ImplicitPathDescription_0= ruleImplicitPathDescription | this_ExplicitPathDescription_1= ruleExplicitPathDescription )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:417:5: this_ImplicitPathDescription_0= ruleImplicitPathDescription
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPathSegmentDescriptionAccess().getImplicitPathDescriptionParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleImplicitPathDescription_in_rulePathSegmentDescription653);
                    this_ImplicitPathDescription_0=ruleImplicitPathDescription();
                    _fsp--;

                     
                            current = this_ImplicitPathDescription_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:427:5: this_ExplicitPathDescription_1= ruleExplicitPathDescription
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getPathSegmentDescriptionAccess().getExplicitPathDescriptionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExplicitPathDescription_in_rulePathSegmentDescription680);
                    this_ExplicitPathDescription_1=ruleExplicitPathDescription();
                    _fsp--;

                     
                            current = this_ExplicitPathDescription_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }

            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:435:2: ( (lv_restrictionList_2_0= ruleRestrictionList ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:436:1: (lv_restrictionList_2_0= ruleRestrictionList )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:436:1: (lv_restrictionList_2_0= ruleRestrictionList )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:437:3: lv_restrictionList_2_0= ruleRestrictionList
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPathSegmentDescriptionAccess().getRestrictionListRestrictionListParserRuleCall_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleRestrictionList_in_rulePathSegmentDescription701);
                    lv_restrictionList_2_0=ruleRestrictionList();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPathSegmentDescriptionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"restrictionList",
                    	        		lv_restrictionList_2_0, 
                    	        		"RestrictionList", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end rulePathSegmentDescription


    // $ANTLR start entryRuleRestrictionList
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:467:1: entryRuleRestrictionList returns [EObject current=null] : iv_ruleRestrictionList= ruleRestrictionList EOF ;
    public final EObject entryRuleRestrictionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionList = null;


        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:468:2: (iv_ruleRestrictionList= ruleRestrictionList EOF )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:469:2: iv_ruleRestrictionList= ruleRestrictionList EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRestrictionListRule(), currentNode); 
            pushFollow(FOLLOW_ruleRestrictionList_in_entryRuleRestrictionList738);
            iv_ruleRestrictionList=ruleRestrictionList();
            _fsp--;

             current =iv_ruleRestrictionList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestrictionList748); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleRestrictionList


    // $ANTLR start ruleRestrictionList
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:476:1: ruleRestrictionList returns [EObject current=null] : ( '[' ( (lv_restrictions_1_0= ruleTypeRestriction ) ) ( ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )* ']' ) ;
    public final EObject ruleRestrictionList() throws RecognitionException {
        EObject current = null;

        EObject lv_restrictions_1_0 = null;

        EObject lv_restrictions_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:481:6: ( ( '[' ( (lv_restrictions_1_0= ruleTypeRestriction ) ) ( ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )* ']' ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:482:1: ( '[' ( (lv_restrictions_1_0= ruleTypeRestriction ) ) ( ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )* ']' )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:482:1: ( '[' ( (lv_restrictions_1_0= ruleTypeRestriction ) ) ( ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )* ']' )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:482:3: '[' ( (lv_restrictions_1_0= ruleTypeRestriction ) ) ( ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )* ']'
            {
            match(input,15,FOLLOW_15_in_ruleRestrictionList783); 

                    createLeafNode(grammarAccess.getRestrictionListAccess().getLeftSquareBracketKeyword_0(), null); 
                
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:486:1: ( (lv_restrictions_1_0= ruleTypeRestriction ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:487:1: (lv_restrictions_1_0= ruleTypeRestriction )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:487:1: (lv_restrictions_1_0= ruleTypeRestriction )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:488:3: lv_restrictions_1_0= ruleTypeRestriction
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleTypeRestriction_in_ruleRestrictionList804);
            lv_restrictions_1_0=ruleTypeRestriction();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getRestrictionListRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		add(
            	       			current, 
            	       			"restrictions",
            	        		lv_restrictions_1_0, 
            	        		"TypeRestriction", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:510:2: ( ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:510:4: ',' ( (lv_restrictions_3_0= ruleTypeRestriction ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleRestrictionList815); 

            	            createLeafNode(grammarAccess.getRestrictionListAccess().getCommaKeyword_2_0(), null); 
            	        
            	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:514:1: ( (lv_restrictions_3_0= ruleTypeRestriction ) )
            	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:515:1: (lv_restrictions_3_0= ruleTypeRestriction )
            	    {
            	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:515:1: (lv_restrictions_3_0= ruleTypeRestriction )
            	    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:516:3: lv_restrictions_3_0= ruleTypeRestriction
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getRestrictionListAccess().getRestrictionsTypeRestrictionParserRuleCall_2_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeRestriction_in_ruleRestrictionList836);
            	    lv_restrictions_3_0=ruleTypeRestriction();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getRestrictionListRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"restrictions",
            	    	        		lv_restrictions_3_0, 
            	    	        		"TypeRestriction", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_ruleRestrictionList848); 

                    createLeafNode(grammarAccess.getRestrictionListAccess().getRightSquareBracketKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRestrictionList


    // $ANTLR start entryRuleImplicitPathDescription
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:550:1: entryRuleImplicitPathDescription returns [EObject current=null] : iv_ruleImplicitPathDescription= ruleImplicitPathDescription EOF ;
    public final EObject entryRuleImplicitPathDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitPathDescription = null;


        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:551:2: (iv_ruleImplicitPathDescription= ruleImplicitPathDescription EOF )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:552:2: iv_ruleImplicitPathDescription= ruleImplicitPathDescription EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImplicitPathDescriptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleImplicitPathDescription_in_entryRuleImplicitPathDescription884);
            iv_ruleImplicitPathDescription=ruleImplicitPathDescription();
            _fsp--;

             current =iv_ruleImplicitPathDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitPathDescription894); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleImplicitPathDescription


    // $ANTLR start ruleImplicitPathDescription
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:559:1: ruleImplicitPathDescription returns [EObject current=null] : ( (lv_kind_0_0= ruleImplicitPathKind ) ) ;
    public final EObject ruleImplicitPathDescription() throws RecognitionException {
        EObject current = null;

        Enumerator lv_kind_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:564:6: ( ( (lv_kind_0_0= ruleImplicitPathKind ) ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:565:1: ( (lv_kind_0_0= ruleImplicitPathKind ) )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:565:1: ( (lv_kind_0_0= ruleImplicitPathKind ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:566:1: (lv_kind_0_0= ruleImplicitPathKind )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:566:1: (lv_kind_0_0= ruleImplicitPathKind )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:567:3: lv_kind_0_0= ruleImplicitPathKind
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImplicitPathDescriptionAccess().getKindImplicitPathKindEnumRuleCall_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleImplicitPathKind_in_ruleImplicitPathDescription939);
            lv_kind_0_0=ruleImplicitPathKind();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImplicitPathDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"kind",
            	        		lv_kind_0_0, 
            	        		"ImplicitPathKind", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImplicitPathDescription


    // $ANTLR start entryRuleExplicitPathDescription
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:597:1: entryRuleExplicitPathDescription returns [EObject current=null] : iv_ruleExplicitPathDescription= ruleExplicitPathDescription EOF ;
    public final EObject entryRuleExplicitPathDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitPathDescription = null;


        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:598:2: (iv_ruleExplicitPathDescription= ruleExplicitPathDescription EOF )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:599:2: iv_ruleExplicitPathDescription= ruleExplicitPathDescription EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExplicitPathDescriptionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExplicitPathDescription_in_entryRuleExplicitPathDescription974);
            iv_ruleExplicitPathDescription=ruleExplicitPathDescription();
            _fsp--;

             current =iv_ruleExplicitPathDescription; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitPathDescription984); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleExplicitPathDescription


    // $ANTLR start ruleExplicitPathDescription
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:606:1: ruleExplicitPathDescription returns [EObject current=null] : ( (lv_associationName_0_0= RULE_ID ) ) ;
    public final EObject ruleExplicitPathDescription() throws RecognitionException {
        EObject current = null;

        Token lv_associationName_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:611:6: ( ( (lv_associationName_0_0= RULE_ID ) ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:612:1: ( (lv_associationName_0_0= RULE_ID ) )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:612:1: ( (lv_associationName_0_0= RULE_ID ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:613:1: (lv_associationName_0_0= RULE_ID )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:613:1: (lv_associationName_0_0= RULE_ID )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:614:3: lv_associationName_0_0= RULE_ID
            {
            lv_associationName_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExplicitPathDescription1025); 

            			createLeafNode(grammarAccess.getExplicitPathDescriptionAccess().getAssociationNameIDTerminalRuleCall_0(), "associationName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getExplicitPathDescriptionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"associationName",
            	        		lv_associationName_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleExplicitPathDescription


    // $ANTLR start entryRuleTypeRestriction
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:644:1: entryRuleTypeRestriction returns [EObject current=null] : iv_ruleTypeRestriction= ruleTypeRestriction EOF ;
    public final EObject entryRuleTypeRestriction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRestriction = null;


        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:645:2: (iv_ruleTypeRestriction= ruleTypeRestriction EOF )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:646:2: iv_ruleTypeRestriction= ruleTypeRestriction EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRestrictionRule(), currentNode); 
            pushFollow(FOLLOW_ruleTypeRestriction_in_entryRuleTypeRestriction1065);
            iv_ruleTypeRestriction=ruleTypeRestriction();
            _fsp--;

             current =iv_ruleTypeRestriction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeRestriction1075); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end entryRuleTypeRestriction


    // $ANTLR start ruleTypeRestriction
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:653:1: ruleTypeRestriction returns [EObject current=null] : ( ( (lv_forbidden_0_0= '!' ) )? ( (lv_typeName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTypeRestriction() throws RecognitionException {
        EObject current = null;

        Token lv_forbidden_0_0=null;
        Token lv_typeName_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:658:6: ( ( ( (lv_forbidden_0_0= '!' ) )? ( (lv_typeName_1_0= RULE_ID ) ) ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:659:1: ( ( (lv_forbidden_0_0= '!' ) )? ( (lv_typeName_1_0= RULE_ID ) ) )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:659:1: ( ( (lv_forbidden_0_0= '!' ) )? ( (lv_typeName_1_0= RULE_ID ) ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:659:2: ( (lv_forbidden_0_0= '!' ) )? ( (lv_typeName_1_0= RULE_ID ) )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:659:2: ( (lv_forbidden_0_0= '!' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:660:1: (lv_forbidden_0_0= '!' )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:660:1: (lv_forbidden_0_0= '!' )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:661:3: lv_forbidden_0_0= '!'
                    {
                    lv_forbidden_0_0=(Token)input.LT(1);
                    match(input,18,FOLLOW_18_in_ruleTypeRestriction1118); 

                            createLeafNode(grammarAccess.getTypeRestrictionAccess().getForbiddenExclamationMarkKeyword_0_0(), "forbidden"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getTypeRestrictionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "forbidden", true, "!", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:680:3: ( (lv_typeName_1_0= RULE_ID ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:681:1: (lv_typeName_1_0= RULE_ID )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:681:1: (lv_typeName_1_0= RULE_ID )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:682:3: lv_typeName_1_0= RULE_ID
            {
            lv_typeName_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeRestriction1149); 

            			createLeafNode(grammarAccess.getTypeRestrictionAccess().getTypeNameIDTerminalRuleCall_1_0(), "typeName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getTypeRestrictionRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"typeName",
            	        		lv_typeName_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleTypeRestriction


    // $ANTLR start ruleRepeatOperator
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:712:1: ruleRepeatOperator returns [Enumerator current=null] : ( ( 'NO_REPEAT' ) | ( '+' ) | ( '*' ) ) ;
    public final Enumerator ruleRepeatOperator() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:716:6: ( ( ( 'NO_REPEAT' ) | ( '+' ) | ( '*' ) ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:717:1: ( ( 'NO_REPEAT' ) | ( '+' ) | ( '*' ) )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:717:1: ( ( 'NO_REPEAT' ) | ( '+' ) | ( '*' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("717:1: ( ( 'NO_REPEAT' ) | ( '+' ) | ( '*' ) )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:717:2: ( 'NO_REPEAT' )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:717:2: ( 'NO_REPEAT' )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:717:4: 'NO_REPEAT'
                    {
                    match(input,19,FOLLOW_19_in_ruleRepeatOperator1202); 

                            current = grammarAccess.getRepeatOperatorAccess().getNO_REPEATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRepeatOperatorAccess().getNO_REPEATEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:723:6: ( '+' )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:723:6: ( '+' )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:723:8: '+'
                    {
                    match(input,20,FOLLOW_20_in_ruleRepeatOperator1217); 

                            current = grammarAccess.getRepeatOperatorAccess().getAT_LEAST_ONCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRepeatOperatorAccess().getAT_LEAST_ONCEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:729:6: ( '*' )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:729:6: ( '*' )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:729:8: '*'
                    {
                    match(input,21,FOLLOW_21_in_ruleRepeatOperator1232); 

                            current = grammarAccess.getRepeatOperatorAccess().getARBITRARYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getRepeatOperatorAccess().getARBITRARYEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleRepeatOperator


    // $ANTLR start ruleImplicitPathKind
    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:739:1: ruleImplicitPathKind returns [Enumerator current=null] : ( ( '-->' ) | ( '<>-->' ) | ( '--><>' ) ) ;
    public final Enumerator ruleImplicitPathKind() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:743:6: ( ( ( '-->' ) | ( '<>-->' ) | ( '--><>' ) ) )
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:744:1: ( ( '-->' ) | ( '<>-->' ) | ( '--><>' ) )
            {
            // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:744:1: ( ( '-->' ) | ( '<>-->' ) | ( '--><>' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("744:1: ( ( '-->' ) | ( '<>-->' ) | ( '--><>' ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:744:2: ( '-->' )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:744:2: ( '-->' )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:744:4: '-->'
                    {
                    match(input,22,FOLLOW_22_in_ruleImplicitPathKind1275); 

                            current = grammarAccess.getImplicitPathKindAccess().getANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getImplicitPathKindAccess().getANYEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:750:6: ( '<>-->' )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:750:6: ( '<>-->' )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:750:8: '<>-->'
                    {
                    match(input,23,FOLLOW_23_in_ruleImplicitPathKind1290); 

                            current = grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_SOURCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_SOURCEEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:756:6: ( '--><>' )
                    {
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:756:6: ( '--><>' )
                    // ../org.storydriven.modeling.expressions/src-gen/org/storydriven/modeling/expressions/parser/antlr/internal/InternalPathExpressions.g:756:8: '--><>'
                    {
                    match(input,24,FOLLOW_24_in_ruleImplicitPathKind1305); 

                            current = grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_TARGETEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getImplicitPathKindAccess().getCONTAINMENT_TARGETEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleImplicitPathKind


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\17\uffff";
    static final String DFA2_eofS =
        "\17\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\1\4\4\14\1\uffff\2\4\1\20\1\4\1\14\1\4\1\20";
    static final String DFA2_maxS =
        "\1\30\1\uffff\1\30\4\25\1\uffff\1\22\1\4\1\21\1\22\1\25\1\4\1\21";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\7\uffff";
    static final String DFA2_specialS =
        "\17\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\6\uffff\1\2\12\uffff\3\1",
            "",
            "\1\6\6\uffff\1\7\12\uffff\1\3\1\4\1\5",
            "\1\7\1\1\1\7\1\10\3\uffff\3\7",
            "\1\7\1\1\1\7\1\10\3\uffff\3\7",
            "\1\7\1\1\1\7\1\10\3\uffff\3\7",
            "\1\7\1\1\1\7\1\10\3\uffff\3\7",
            "",
            "\1\12\15\uffff\1\11",
            "\1\12",
            "\1\13\1\14",
            "\1\16\15\uffff\1\15",
            "\1\7\1\1\1\7\4\uffff\3\7",
            "\1\16",
            "\1\13\1\14"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "93:1: ( ( (lv_pathAlternatives_0_0= rulePath ) ) | ( '(' ( (lv_pathAlternatives_2_0= rulePath ) ) ')' ( '|' '(' ( (lv_pathAlternatives_6_0= rulePath ) ) ')' )+ ) )";
        }
    }
 

    public static final BitSet FOLLOW_rulePathExpression_in_entryRulePathExpression75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpression85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rulePathExpression131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePathExpression148 = new BitSet(new long[]{0x0000000001C00810L});
    public static final BitSet FOLLOW_rulePath_in_rulePathExpression169 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePathExpression179 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePathExpression190 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePathExpression200 = new BitSet(new long[]{0x0000000001C00810L});
    public static final BitSet FOLLOW_rulePath_in_rulePathExpression221 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePathExpression231 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_rulePath326 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_rulePath337 = new BitSet(new long[]{0x0000000001C00810L});
    public static final BitSet FOLLOW_rulePathSegment_in_rulePath358 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rulePathSegment_in_entryRulePathSegment396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathSegment406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegmentDescription_in_rulePathSegment453 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_11_in_rulePathSegment470 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_rulePathSegmentDescription_in_rulePathSegment491 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePathSegment502 = new BitSet(new long[]{0x0000000001C00010L});
    public static final BitSet FOLLOW_rulePathSegmentDescription_in_rulePathSegment523 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_rulePathSegment535 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_ruleRepeatOperator_in_rulePathSegment558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegmentDescription_in_entryRulePathSegmentDescription595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathSegmentDescription605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitPathDescription_in_rulePathSegmentDescription653 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleExplicitPathDescription_in_rulePathSegmentDescription680 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleRestrictionList_in_rulePathSegmentDescription701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestrictionList_in_entryRuleRestrictionList738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionList748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRestrictionList783 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleTypeRestriction_in_ruleRestrictionList804 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleRestrictionList815 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_ruleTypeRestriction_in_ruleRestrictionList836 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleRestrictionList848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitPathDescription_in_entryRuleImplicitPathDescription884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitPathDescription894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitPathKind_in_ruleImplicitPathDescription939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitPathDescription_in_entryRuleExplicitPathDescription974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitPathDescription984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExplicitPathDescription1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeRestriction_in_entryRuleTypeRestriction1065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeRestriction1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTypeRestriction1118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeRestriction1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRepeatOperator1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRepeatOperator1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRepeatOperator1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleImplicitPathKind1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleImplicitPathKind1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleImplicitPathKind1305 = new BitSet(new long[]{0x0000000000000002L});

}