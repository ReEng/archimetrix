package org.storydriven.modeling.expressions.common.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.storydriven.modeling.expressions.common.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'equiv'", "'imply'", "'or'", "'xor'", "'and'", "'not'", "'('", "')'", "'<='", "'<'", "'>='", "'>'", "'='", "'!='", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=7;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=4;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalExpressionsParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[69+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public InternalExpressionsParser(TokenStream input, IAstFactory factory, ExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LExpression";	
       	}
       	
       	@Override
       	protected ExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleLExpression
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:83:1: entryRuleLExpression returns [EObject current=null] : iv_ruleLExpression= ruleLExpression EOF ;
    public final EObject entryRuleLExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpression = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:84:2: (iv_ruleLExpression= ruleLExpression EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:85:2: iv_ruleLExpression= ruleLExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLExpression_in_entryRuleLExpression81);
            iv_ruleLExpression=ruleLExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpression91); if (failed) return current;

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
    // $ANTLR end entryRuleLExpression


    // $ANTLR start ruleLExpression
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:92:1: ruleLExpression returns [EObject current=null] : this_Equivalent_0= ruleEquivalent ;
    public final EObject ruleLExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Equivalent_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:97:6: (this_Equivalent_0= ruleEquivalent )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:99:2: this_Equivalent_0= ruleEquivalent
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleEquivalent_in_ruleLExpression140);
            this_Equivalent_0=ruleEquivalent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Equivalent_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleLExpression


    // $ANTLR start entryRuleEquivalent
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:118:1: entryRuleEquivalent returns [EObject current=null] : iv_ruleEquivalent= ruleEquivalent EOF ;
    public final EObject entryRuleEquivalent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalent = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:119:2: (iv_ruleEquivalent= ruleEquivalent EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:120:2: iv_ruleEquivalent= ruleEquivalent EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEquivalentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEquivalent_in_entryRuleEquivalent174);
            iv_ruleEquivalent=ruleEquivalent();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEquivalent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquivalent184); if (failed) return current;

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
    // $ANTLR end entryRuleEquivalent


    // $ANTLR start ruleEquivalent
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:127:1: ruleEquivalent returns [EObject current=null] : (this_Implication_0= ruleImplication ( () 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? ) ;
    public final EObject ruleEquivalent() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:132:6: ( (this_Implication_0= ruleImplication ( () 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:133:1: (this_Implication_0= ruleImplication ( () 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:133:1: (this_Implication_0= ruleImplication ( () 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:134:2: this_Implication_0= ruleImplication ( () 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleEquivalent234);
            this_Implication_0=ruleImplication();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Implication_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:145:1: ( () 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:145:2: () 'equiv' ( (lv_right_3_0= ruleEquivalent ) )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:145:2: ()
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:146:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,12,FOLLOW_12_in_ruleEquivalent256); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getEquivalentAccess().getEquivKeyword_1_1(), null); 
                          
                    }
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:168:1: ( (lv_right_3_0= ruleEquivalent ) )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:169:1: (lv_right_3_0= ruleEquivalent )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:169:1: (lv_right_3_0= ruleEquivalent )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:170:3: lv_right_3_0= ruleEquivalent
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEquivalentAccess().getRightEquivalentParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEquivalent_in_ruleEquivalent277);
                    lv_right_3_0=ruleEquivalent();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEquivalentRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_3_0, 
                      	        		"Equivalent", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleEquivalent


    // $ANTLR start entryRuleImplication
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:200:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:201:2: (iv_ruleImplication= ruleImplication EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:202:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getImplicationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication315);
            iv_ruleImplication=ruleImplication();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication325); if (failed) return current;

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
    // $ANTLR end entryRuleImplication


    // $ANTLR start ruleImplication
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:209:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () 'imply' ( (lv_right_3_0= ruleImplication ) ) )? ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:214:6: ( (this_Disjunction_0= ruleDisjunction ( () 'imply' ( (lv_right_3_0= ruleImplication ) ) )? ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:215:1: (this_Disjunction_0= ruleDisjunction ( () 'imply' ( (lv_right_3_0= ruleImplication ) ) )? )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:215:1: (this_Disjunction_0= ruleDisjunction ( () 'imply' ( (lv_right_3_0= ruleImplication ) ) )? )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:216:2: this_Disjunction_0= ruleDisjunction ( () 'imply' ( (lv_right_3_0= ruleImplication ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication375);
            this_Disjunction_0=ruleDisjunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:227:1: ( () 'imply' ( (lv_right_3_0= ruleImplication ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:227:2: () 'imply' ( (lv_right_3_0= ruleImplication ) )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:227:2: ()
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:228:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getImplicationAccess().getImplyLeftAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getImplicationAccess().getImplyLeftAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,13,FOLLOW_13_in_ruleImplication397); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getImplicationAccess().getImplyKeyword_1_1(), null); 
                          
                    }
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:250:1: ( (lv_right_3_0= ruleImplication ) )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:251:1: (lv_right_3_0= ruleImplication )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:251:1: (lv_right_3_0= ruleImplication )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:252:3: lv_right_3_0= ruleImplication
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplication_in_ruleImplication418);
                    lv_right_3_0=ruleImplication();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getImplicationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_3_0, 
                      	        		"Implication", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleImplication


    // $ANTLR start entryRuleDisjunction
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:282:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:283:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:284:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDisjunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction456);
            iv_ruleDisjunction=ruleDisjunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction466); if (failed) return current;

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
    // $ANTLR end entryRuleDisjunction


    // $ANTLR start ruleDisjunction
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:291:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( ( ( () 'or' ) | ( () 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:296:6: ( (this_Conjunction_0= ruleConjunction ( ( ( () 'or' ) | ( () 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:297:1: (this_Conjunction_0= ruleConjunction ( ( ( () 'or' ) | ( () 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:297:1: (this_Conjunction_0= ruleConjunction ( ( ( () 'or' ) | ( () 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:298:2: this_Conjunction_0= ruleConjunction ( ( ( () 'or' ) | ( () 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction516);
            this_Conjunction_0=ruleConjunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:309:1: ( ( ( () 'or' ) | ( () 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=14 && LA4_0<=15)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:309:2: ( ( () 'or' ) | ( () 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:309:2: ( ( () 'or' ) | ( () 'xor' ) )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==14) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==15) ) {
                        alt3=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("309:2: ( ( () 'or' ) | ( () 'xor' ) )", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:309:3: ( () 'or' )
                            {
                            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:309:3: ( () 'or' )
                            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:309:4: () 'or'
                            {
                            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:309:4: ()
                            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:310:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,14,FOLLOW_14_in_ruleDisjunction540); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:333:6: ( () 'xor' )
                            {
                            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:333:6: ( () 'xor' )
                            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:333:7: () 'xor'
                            {
                            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:333:7: ()
                            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:334:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,15,FOLLOW_15_in_ruleDisjunction570); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1(), null); 
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:356:3: ( (lv_right_5_0= ruleDisjunction ) )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:357:1: (lv_right_5_0= ruleDisjunction )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:357:1: (lv_right_5_0= ruleDisjunction )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:358:3: lv_right_5_0= ruleDisjunction
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDisjunction_in_ruleDisjunction593);
                    lv_right_5_0=ruleDisjunction();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDisjunctionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_5_0, 
                      	        		"Disjunction", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleDisjunction


    // $ANTLR start entryRuleConjunction
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:388:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:389:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:390:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConjunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction631);
            iv_ruleConjunction=ruleConjunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction641); if (failed) return current;

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
    // $ANTLR end entryRuleConjunction


    // $ANTLR start ruleConjunction
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:397:1: ruleConjunction returns [EObject current=null] : (this_Negation_0= ruleNegation ( () 'and' ( (lv_right_3_0= ruleConjunction ) ) )? ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:402:6: ( (this_Negation_0= ruleNegation ( () 'and' ( (lv_right_3_0= ruleConjunction ) ) )? ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:403:1: (this_Negation_0= ruleNegation ( () 'and' ( (lv_right_3_0= ruleConjunction ) ) )? )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:403:1: (this_Negation_0= ruleNegation ( () 'and' ( (lv_right_3_0= ruleConjunction ) ) )? )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:404:2: this_Negation_0= ruleNegation ( () 'and' ( (lv_right_3_0= ruleConjunction ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleNegation_in_ruleConjunction691);
            this_Negation_0=ruleNegation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Negation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:415:1: ( () 'and' ( (lv_right_3_0= ruleConjunction ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:415:2: () 'and' ( (lv_right_3_0= ruleConjunction ) )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:415:2: ()
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:416:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getConjunctionAccess().getAndLeftAction_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getConjunctionAccess().getAndLeftAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,16,FOLLOW_16_in_ruleConjunction713); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConjunctionAccess().getAndKeyword_1_1(), null); 
                          
                    }
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:438:1: ( (lv_right_3_0= ruleConjunction ) )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:439:1: (lv_right_3_0= ruleConjunction )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:439:1: (lv_right_3_0= ruleConjunction )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:440:3: lv_right_3_0= ruleConjunction
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConjunction_in_ruleConjunction734);
                    lv_right_3_0=ruleConjunction();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConjunctionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_3_0, 
                      	        		"Conjunction", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleConjunction


    // $ANTLR start entryRuleNegation
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:470:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:471:2: (iv_ruleNegation= ruleNegation EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:472:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNegationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation772);
            iv_ruleNegation=ruleNegation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation782); if (failed) return current;

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
    // $ANTLR end entryRuleNegation


    // $ANTLR start ruleNegation
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:479:1: ruleNegation returns [EObject current=null] : ( ( 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject this_Negated_1 = null;

        EObject this_CExpression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:484:6: ( ( ( 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:485:1: ( ( 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:485:1: ( ( 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_ID)||LA6_0==18) ) {
                alt6=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("485:1: ( ( 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:485:2: ( 'not' this_Negated_1= ruleNegated )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:485:2: ( 'not' this_Negated_1= ruleNegated )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:485:4: 'not' this_Negated_1= ruleNegated
                    {
                    match(input,17,FOLLOW_17_in_ruleNegation818); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getNegationAccess().getNotKeyword_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegated_in_ruleNegation843);
                    this_Negated_1=ruleNegated();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Negated_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:503:2: this_CExpression_2= ruleCExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCExpression_in_ruleNegation874);
                    this_CExpression_2=ruleCExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_CExpression_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNegation


    // $ANTLR start entryRuleNegated
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:522:1: entryRuleNegated returns [EObject current=null] : iv_ruleNegated= ruleNegated EOF ;
    public final EObject entryRuleNegated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegated = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:523:2: (iv_ruleNegated= ruleNegated EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:524:2: iv_ruleNegated= ruleNegated EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNegatedRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNegated_in_entryRuleNegated909);
            iv_ruleNegated=ruleNegated();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNegated; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegated919); if (failed) return current;

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
    // $ANTLR end entryRuleNegated


    // $ANTLR start ruleNegated
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:531:1: ruleNegated returns [EObject current=null] : ( () ( (lv_not_1_0= ruleCExpression ) ) ) ;
    public final EObject ruleNegated() throws RecognitionException {
        EObject current = null;

        EObject lv_not_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:536:6: ( ( () ( (lv_not_1_0= ruleCExpression ) ) ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:537:1: ( () ( (lv_not_1_0= ruleCExpression ) ) )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:537:1: ( () ( (lv_not_1_0= ruleCExpression ) ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:537:2: () ( (lv_not_1_0= ruleCExpression ) )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:537:2: ()
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:538:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getNegatedAccess().getNotAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getNegatedAccess().getNotAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:551:2: ( (lv_not_1_0= ruleCExpression ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:552:1: (lv_not_1_0= ruleCExpression )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:552:1: (lv_not_1_0= ruleCExpression )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:553:3: lv_not_1_0= ruleCExpression
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleCExpression_in_ruleNegated977);
            lv_not_1_0=ruleCExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNegatedRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"not",
              	        		lv_not_1_0, 
              	        		"CExpression", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNegated


    // $ANTLR start entryRuleCExpression
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:583:1: entryRuleCExpression returns [EObject current=null] : iv_ruleCExpression= ruleCExpression EOF ;
    public final EObject entryRuleCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCExpression = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:584:2: (iv_ruleCExpression= ruleCExpression EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:585:2: iv_ruleCExpression= ruleCExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCExpression_in_entryRuleCExpression1013);
            iv_ruleCExpression=ruleCExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCExpression1023); if (failed) return current;

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
    // $ANTLR end entryRuleCExpression


    // $ANTLR start ruleCExpression
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:592:1: ruleCExpression returns [EObject current=null] : ( ( '(' this_LExpression_1= ruleLExpression ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable ) ;
    public final EObject ruleCExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LExpression_1 = null;

        EObject this_Compare_3 = null;

        EObject this_BooleanValue_4 = null;

        EObject this_Variable_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:597:6: ( ( ( '(' this_LExpression_1= ruleLExpression ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:598:1: ( ( '(' this_LExpression_1= ruleLExpression ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:598:1: ( ( '(' this_LExpression_1= ruleLExpression ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA7_1 = input.LA(2);

                if ( (synpred7()) ) {
                    alt7=1;
                }
                else if ( (synpred8()) ) {
                    alt7=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("598:1: ( ( '(' this_LExpression_1= ruleLExpression ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable )", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA7_3 = input.LA(2);

                if ( (synpred8()) ) {
                    alt7=2;
                }
                else if ( (synpred9()) ) {
                    alt7=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("598:1: ( ( '(' this_LExpression_1= ruleLExpression ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable )", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA7_5 = input.LA(2);

                if ( (synpred8()) ) {
                    alt7=2;
                }
                else if ( (true) ) {
                    alt7=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("598:1: ( ( '(' this_LExpression_1= ruleLExpression ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable )", 7, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("598:1: ( ( '(' this_LExpression_1= ruleLExpression ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:598:2: ( '(' this_LExpression_1= ruleLExpression ')' )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:598:2: ( '(' this_LExpression_1= ruleLExpression ')' )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:598:4: '(' this_LExpression_1= ruleLExpression ')'
                    {
                    match(input,18,FOLLOW_18_in_ruleCExpression1059); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleLExpression_in_ruleCExpression1084);
                    this_LExpression_1=ruleLExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_LExpression_1; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,19,FOLLOW_19_in_ruleCExpression1093); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:620:2: this_Compare_3= ruleCompare
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompare_in_ruleCExpression1125);
                    this_Compare_3=ruleCompare();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Compare_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:633:2: this_BooleanValue_4= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleCExpression1155);
                    this_BooleanValue_4=ruleBooleanValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanValue_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:646:2: this_Variable_5= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCExpressionAccess().getVariableParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleCExpression1185);
                    this_Variable_5=ruleVariable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Variable_5; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCExpression


    // $ANTLR start entryRuleCompare
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:665:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:666:2: (iv_ruleCompare= ruleCompare EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:667:2: iv_ruleCompare= ruleCompare EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCompareRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare1220);
            iv_ruleCompare=ruleCompare();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCompare; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare1230); if (failed) return current;

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
    // $ANTLR end entryRuleCompare


    // $ANTLR start ruleCompare
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:674:1: ruleCompare returns [EObject current=null] : (this_SomeValue_0= ruleSomeValue ( ( () '<=' ) | ( () '<' ) | ( () '>=' ) | ( () '>' ) | ( () '=' ) | ( () '!=' ) | ( () '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        EObject this_SomeValue_0 = null;

        EObject lv_right_15_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:679:6: ( (this_SomeValue_0= ruleSomeValue ( ( () '<=' ) | ( () '<' ) | ( () '>=' ) | ( () '>' ) | ( () '=' ) | ( () '!=' ) | ( () '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:680:1: (this_SomeValue_0= ruleSomeValue ( ( () '<=' ) | ( () '<' ) | ( () '>=' ) | ( () '>' ) | ( () '=' ) | ( () '!=' ) | ( () '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:680:1: (this_SomeValue_0= ruleSomeValue ( ( () '<=' ) | ( () '<' ) | ( () '>=' ) | ( () '>' ) | ( () '=' ) | ( () '!=' ) | ( () '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:681:2: this_SomeValue_0= ruleSomeValue ( ( () '<=' ) | ( () '<' ) | ( () '>=' ) | ( () '>' ) | ( () '=' ) | ( () '!=' ) | ( () '~' ) ) ( (lv_right_15_0= ruleSomeValue ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getCompareAccess().getSomeValueParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleSomeValue_in_ruleCompare1280);
            this_SomeValue_0=ruleSomeValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_SomeValue_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:692:1: ( ( () '<=' ) | ( () '<' ) | ( () '>=' ) | ( () '>' ) | ( () '=' ) | ( () '!=' ) | ( () '~' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            case 25:
                {
                alt8=6;
                }
                break;
            case 26:
                {
                alt8=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("692:1: ( ( () '<=' ) | ( () '<' ) | ( () '>=' ) | ( () '>' ) | ( () '=' ) | ( () '!=' ) | ( () '~' ) )", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:692:2: ( () '<=' )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:692:2: ( () '<=' )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:692:3: () '<='
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:692:3: ()
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:693:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,20,FOLLOW_20_in_ruleCompare1303); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:716:6: ( () '<' )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:716:6: ( () '<' )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:716:7: () '<'
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:716:7: ()
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:717:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCompareAccess().getLessLeftAction_1_1_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCompareAccess().getLessLeftAction_1_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,21,FOLLOW_21_in_ruleCompare1333); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:740:6: ( () '>=' )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:740:6: ( () '>=' )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:740:7: () '>='
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:740:7: ()
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:741:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,22,FOLLOW_22_in_ruleCompare1363); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:764:6: ( () '>' )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:764:6: ( () '>' )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:764:7: () '>'
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:764:7: ()
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:765:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,23,FOLLOW_23_in_ruleCompare1393); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:788:6: ( () '=' )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:788:6: ( () '=' )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:788:7: () '='
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:788:7: ()
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:789:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,24,FOLLOW_24_in_ruleCompare1423); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:812:6: ( () '!=' )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:812:6: ( () '!=' )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:812:7: () '!='
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:812:7: ()
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:813:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,25,FOLLOW_25_in_ruleCompare1453); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:836:6: ( () '~' )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:836:6: ( () '~' )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:836:7: () '~'
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:836:7: ()
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:837:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0().getType().getClassifier());
                              try {
                              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                              } catch(ValueConverterException vce) {
                              	handleValueConverterException(vce);
                              }
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,26,FOLLOW_26_in_ruleCompare1483); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCompareAccess().getTildeKeyword_1_6_1(), null); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:859:3: ( (lv_right_15_0= ruleSomeValue ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:860:1: (lv_right_15_0= ruleSomeValue )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:860:1: (lv_right_15_0= ruleSomeValue )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:861:3: lv_right_15_0= ruleSomeValue
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleSomeValue_in_ruleCompare1506);
            lv_right_15_0=ruleSomeValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getCompareRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"right",
              	        		lv_right_15_0, 
              	        		"SomeValue", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCompare


    // $ANTLR start entryRuleSomeValue
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:893:1: entryRuleSomeValue returns [EObject current=null] : iv_ruleSomeValue= ruleSomeValue EOF ;
    public final EObject entryRuleSomeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeValue = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:894:2: (iv_ruleSomeValue= ruleSomeValue EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:895:2: iv_ruleSomeValue= ruleSomeValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getSomeValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleSomeValue_in_entryRuleSomeValue1544);
            iv_ruleSomeValue=ruleSomeValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleSomeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeValue1554); if (failed) return current;

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
    // $ANTLR end entryRuleSomeValue


    // $ANTLR start ruleSomeValue
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:902:1: ruleSomeValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression ) ;
    public final EObject ruleSomeValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_BooleanValue_1 = null;

        EObject this_AExpression_2 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:907:6: ( (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:908:1: (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:908:1: (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case 18:
                {
                alt9=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("908:1: (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:909:2: this_StringValue_0= ruleStringValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSomeValueAccess().getStringValueParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleSomeValue1604);
                    this_StringValue_0=ruleStringValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_StringValue_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:922:2: this_BooleanValue_1= ruleBooleanValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSomeValueAccess().getBooleanValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleSomeValue1634);
                    this_BooleanValue_1=ruleBooleanValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_BooleanValue_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:935:2: this_AExpression_2= ruleAExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getSomeValueAccess().getAExpressionParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAExpression_in_ruleSomeValue1664);
                    this_AExpression_2=ruleAExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AExpression_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleSomeValue


    // $ANTLR start entryRuleAExpression
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:954:1: entryRuleAExpression returns [EObject current=null] : iv_ruleAExpression= ruleAExpression EOF ;
    public final EObject entryRuleAExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAExpression = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:955:2: (iv_ruleAExpression= ruleAExpression EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:956:2: iv_ruleAExpression= ruleAExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAExpression_in_entryRuleAExpression1699);
            iv_ruleAExpression=ruleAExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAExpression1709); if (failed) return current;

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
    // $ANTLR end entryRuleAExpression


    // $ANTLR start ruleAExpression
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:963:1: ruleAExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleAExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:968:6: (this_Addition_0= ruleAddition )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:970:2: this_Addition_0= ruleAddition
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleAExpression1758);
            this_Addition_0=ruleAddition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Addition_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAExpression


    // $ANTLR start entryRuleAddition
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:989:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:990:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:991:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1792);
            iv_ruleAddition=ruleAddition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1802); if (failed) return current;

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
    // $ANTLR end entryRuleAddition


    // $ANTLR start ruleAddition
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:998:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1003:6: ( (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1004:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1004:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1005:2: this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition1852);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1016:1: ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=27 && LA11_0<=28)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1016:2: ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1016:2: ( ( () '+' ) | ( () '-' ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==27) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==28) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1016:2: ( ( () '+' ) | ( () '-' ) )", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1016:3: ( () '+' )
            	            {
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1016:3: ( () '+' )
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1016:4: () '+'
            	            {
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1016:4: ()
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1017:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,27,FOLLOW_27_in_ruleAddition1876); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1040:6: ( () '-' )
            	            {
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1040:6: ( () '-' )
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1040:7: () '-'
            	            {
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1040:7: ()
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1041:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,28,FOLLOW_28_in_ruleAddition1906); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1063:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1064:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1064:1: (lv_right_5_0= ruleMultiplication )
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1065:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition1929);
            	    lv_right_5_0=ruleMultiplication();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAdditionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_5_0, 
            	      	        		"Multiplication", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMultiplication
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1095:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1096:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1097:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1967);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1977); if (failed) return current;

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
    // $ANTLR end entryRuleMultiplication


    // $ANTLR start ruleMultiplication
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1104:1: ruleMultiplication returns [EObject current=null] : (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) ( (lv_right_7_0= rulePower ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_Power_0 = null;

        EObject lv_right_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1109:6: ( (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) ( (lv_right_7_0= rulePower ) ) )* ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1110:1: (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) ( (lv_right_7_0= rulePower ) ) )* )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1110:1: (this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) ( (lv_right_7_0= rulePower ) ) )* )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1111:2: this_Power_0= rulePower ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) ( (lv_right_7_0= rulePower ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePower_in_ruleMultiplication2027);
            this_Power_0=rulePower();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Power_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1122:1: ( ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) ( (lv_right_7_0= rulePower ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=29 && LA13_0<=31)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1122:2: ( ( () '*' ) | ( () '/' ) | ( () '%' ) ) ( (lv_right_7_0= rulePower ) )
            	    {
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1122:2: ( ( () '*' ) | ( () '/' ) | ( () '%' ) )
            	    int alt12=3;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1122:2: ( ( () '*' ) | ( () '/' ) | ( () '%' ) )", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1122:3: ( () '*' )
            	            {
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1122:3: ( () '*' )
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1122:4: () '*'
            	            {
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1122:4: ()
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1123:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,29,FOLLOW_29_in_ruleMultiplication2051); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1146:6: ( () '/' )
            	            {
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1146:6: ( () '/' )
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1146:7: () '/'
            	            {
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1146:7: ()
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1147:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,30,FOLLOW_30_in_ruleMultiplication2081); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1170:6: ( () '%' )
            	            {
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1170:6: ( () '%' )
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1170:7: () '%'
            	            {
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1170:7: ()
            	            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1171:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,31,FOLLOW_31_in_ruleMultiplication2111); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1193:3: ( (lv_right_7_0= rulePower ) )
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1194:1: (lv_right_7_0= rulePower )
            	    {
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1194:1: (lv_right_7_0= rulePower )
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1195:3: lv_right_7_0= rulePower
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePower_in_ruleMultiplication2134);
            	    lv_right_7_0=rulePower();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultiplicationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_7_0, 
            	      	        		"Power", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMultiplication


    // $ANTLR start entryRulePower
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1225:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1226:2: (iv_rulePower= rulePower EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1227:2: iv_rulePower= rulePower EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPowerRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePower_in_entryRulePower2172);
            iv_rulePower=rulePower();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePower; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePower2182); if (failed) return current;

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
    // $ANTLR end entryRulePower


    // $ANTLR start rulePower
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1234:1: rulePower returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1239:6: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1240:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1240:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1241:2: this_PrimaryExpression_0= rulePrimaryExpression ( ( () '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rulePower2232);
            this_PrimaryExpression_0=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1252:1: ( ( () '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1252:2: ( () '^' ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1252:2: ( () '^' )
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1252:3: () '^'
            	    {
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1252:3: ()
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1253:2: 
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              temp=factory.create(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0().getType().getClassifier());
            	              try {
            	              	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	              } catch(ValueConverterException vce) {
            	              	handleValueConverterException(vce);
            	              }
            	              current = temp; 
            	              temp = null;
            	              CompositeNode newNode = createCompositeNode(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0(), currentNode.getParent());
            	          newNode.getChildren().add(currentNode);
            	          moveLookaheadInfo(currentNode, newNode);
            	          currentNode = newNode; 
            	              associateNodeWithAstElement(currentNode, current); 
            	          
            	    }

            	    }

            	    match(input,32,FOLLOW_32_in_rulePower2255); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1(), null); 
            	          
            	    }

            	    }

            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1275:2: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1276:1: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1276:1: (lv_right_3_0= rulePrimaryExpression )
            	    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1277:3: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_rulePower2277);
            	    lv_right_3_0=rulePrimaryExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPowerRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_3_0, 
            	      	        		"PrimaryExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePower


    // $ANTLR start entryRulePrimaryExpression
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1307:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1308:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1309:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimaryExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2315);
            iv_rulePrimaryExpression=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2325); if (failed) return current;

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
    // $ANTLR end entryRulePrimaryExpression


    // $ANTLR start rulePrimaryExpression
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1316:1: rulePrimaryExpression returns [EObject current=null] : ( ( '(' this_AExpression_1= ruleAExpression ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AExpression_1 = null;

        EObject this_NumberValue_3 = null;

        EObject this_Variable_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1321:6: ( ( ( '(' this_AExpression_1= ruleAExpression ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1322:1: ( ( '(' this_AExpression_1= ruleAExpression ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1322:1: ( ( '(' this_AExpression_1= ruleAExpression ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt15=1;
                }
                break;
            case RULE_INT:
                {
                alt15=2;
                }
                break;
            case RULE_ID:
                {
                alt15=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1322:1: ( ( '(' this_AExpression_1= ruleAExpression ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1322:2: ( '(' this_AExpression_1= ruleAExpression ')' )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1322:2: ( '(' this_AExpression_1= ruleAExpression ')' )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1322:4: '(' this_AExpression_1= ruleAExpression ')'
                    {
                    match(input,18,FOLLOW_18_in_rulePrimaryExpression2361); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleAExpression_in_rulePrimaryExpression2386);
                    this_AExpression_1=ruleAExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_AExpression_1; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,19,FOLLOW_19_in_rulePrimaryExpression2395); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1344:2: this_NumberValue_3= ruleNumberValue
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberValue_in_rulePrimaryExpression2427);
                    this_NumberValue_3=ruleNumberValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_NumberValue_3; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1357:2: this_Variable_4= ruleVariable
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableParserRuleCall_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_rulePrimaryExpression2457);
                    this_Variable_4=ruleVariable();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Variable_4; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePrimaryExpression


    // $ANTLR start entryRuleNumberValue
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1376:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1377:2: (iv_ruleNumberValue= ruleNumberValue EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1378:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumberValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue2492);
            iv_ruleNumberValue=ruleNumberValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumberValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue2502); if (failed) return current;

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
    // $ANTLR end entryRuleNumberValue


    // $ANTLR start ruleNumberValue
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1385:1: ruleNumberValue returns [EObject current=null] : ( (lv_numValue_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numValue_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1390:6: ( ( (lv_numValue_0_0= ruleNUMBER ) ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1391:1: ( (lv_numValue_0_0= ruleNUMBER ) )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1391:1: ( (lv_numValue_0_0= ruleNUMBER ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1392:1: (lv_numValue_0_0= ruleNUMBER )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1392:1: (lv_numValue_0_0= ruleNUMBER )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1393:3: lv_numValue_0_0= ruleNUMBER
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleNUMBER_in_ruleNumberValue2547);
            lv_numValue_0_0=ruleNUMBER();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getNumberValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"numValue",
              	        		lv_numValue_0_0, 
              	        		"NUMBER", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNumberValue


    // $ANTLR start entryRuleNUMBER
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1423:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1424:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1425:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNUMBERRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER2583);
            iv_ruleNUMBER=ruleNUMBER();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER2594); if (failed) return current;

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
    // $ANTLR end entryRuleNUMBER


    // $ANTLR start ruleNUMBER
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1432:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1437:6: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1438:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1438:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1438:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER2634); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0(), null); 
                  
            }
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1445:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1446:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleNUMBER2653); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0(), null); 
                          
                    }
                    this_INT_2=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER2668); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1(), null); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleNUMBER


    // $ANTLR start entryRuleBooleanValue
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1466:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1467:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1468:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBooleanValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2715);
            iv_ruleBooleanValue=ruleBooleanValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue2725); if (failed) return current;

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
    // $ANTLR end entryRuleBooleanValue


    // $ANTLR start ruleBooleanValue
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1475:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1480:6: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1481:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1481:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1482:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1482:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1483:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)input.LT(1);
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue2766); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0(), "value"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getBooleanValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"value",
              	        		lv_value_0_0, 
              	        		"BOOLEAN", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleBooleanValue


    // $ANTLR start entryRuleStringValue
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1513:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1514:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1515:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStringValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue2806);
            iv_ruleStringValue=ruleStringValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue2816); if (failed) return current;

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
    // $ANTLR end entryRuleStringValue


    // $ANTLR start ruleStringValue
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1522:1: ruleStringValue returns [EObject current=null] : ( (lv_strValue_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_strValue_0_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1527:6: ( ( (lv_strValue_0_0= RULE_STRING ) ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1528:1: ( (lv_strValue_0_0= RULE_STRING ) )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1528:1: ( (lv_strValue_0_0= RULE_STRING ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1529:1: (lv_strValue_0_0= RULE_STRING )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1529:1: (lv_strValue_0_0= RULE_STRING )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1530:3: lv_strValue_0_0= RULE_STRING
            {
            lv_strValue_0_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue2857); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getStringValueAccess().getStrValueSTRINGTerminalRuleCall_0(), "strValue"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getStringValueRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"strValue",
              	        		lv_strValue_0_0, 
              	        		"STRING", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleStringValue


    // $ANTLR start entryRuleVariable
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1560:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1561:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1562:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable2897);
            iv_ruleVariable=ruleVariable();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable2907); if (failed) return current;

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
    // $ANTLR end entryRuleVariable


    // $ANTLR start ruleVariable
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1569:1: ruleVariable returns [EObject current=null] : ( (lv_varName_0_0= ruleVARIABLE_VALUE ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_varName_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1574:6: ( ( (lv_varName_0_0= ruleVARIABLE_VALUE ) ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1575:1: ( (lv_varName_0_0= ruleVARIABLE_VALUE ) )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1575:1: ( (lv_varName_0_0= ruleVARIABLE_VALUE ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1576:1: (lv_varName_0_0= ruleVARIABLE_VALUE )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1576:1: (lv_varName_0_0= ruleVARIABLE_VALUE )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1577:3: lv_varName_0_0= ruleVARIABLE_VALUE
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableAccess().getVarNameVARIABLE_VALUEParserRuleCall_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleVARIABLE_VALUE_in_ruleVariable2952);
            lv_varName_0_0=ruleVARIABLE_VALUE();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"varName",
              	        		lv_varName_0_0, 
              	        		"VARIABLE_VALUE", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleVariable


    // $ANTLR start entryRuleVARIABLE_VALUE
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1607:1: entryRuleVARIABLE_VALUE returns [String current=null] : iv_ruleVARIABLE_VALUE= ruleVARIABLE_VALUE EOF ;
    public final String entryRuleVARIABLE_VALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVARIABLE_VALUE = null;


        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1608:2: (iv_ruleVARIABLE_VALUE= ruleVARIABLE_VALUE EOF )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1609:2: iv_ruleVARIABLE_VALUE= ruleVARIABLE_VALUE EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVARIABLE_VALUERule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVARIABLE_VALUE_in_entryRuleVARIABLE_VALUE2988);
            iv_ruleVARIABLE_VALUE=ruleVARIABLE_VALUE();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVARIABLE_VALUE.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_VALUE2999); if (failed) return current;

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
    // $ANTLR end entryRuleVARIABLE_VALUE


    // $ANTLR start ruleVARIABLE_VALUE
    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1616:1: ruleVARIABLE_VALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleVARIABLE_VALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1621:6: ( (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) ) )
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1622:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) )
            {
            // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1622:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==33) ) {
                    alt17=2;
                }
                else if ( (LA17_1==EOF||(LA17_1>=12 && LA17_1<=16)||(LA17_1>=19 && LA17_1<=32)) ) {
                    alt17=1;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1622:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) )", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1622:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) )", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1622:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3039); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1630:6: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    {
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1630:6: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:1630:11: this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID
                    {
                    this_ID_1=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3066); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0(), null); 
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,33,FOLLOW_33_in_ruleVARIABLE_VALUE3084); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1(), null); 
                          
                    }
                    this_ID_3=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3099); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleVARIABLE_VALUE

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:598:2: ( ( '(' ruleLExpression ')' ) )
        // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:598:2: ( '(' ruleLExpression ')' )
        {
        // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:598:2: ( '(' ruleLExpression ')' )
        // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:598:4: '(' ruleLExpression ')'
        {
        match(input,18,FOLLOW_18_in_synpred71059); if (failed) return ;
        pushFollow(FOLLOW_ruleLExpression_in_synpred71084);
        ruleLExpression();
        _fsp--;
        if (failed) return ;
        match(input,19,FOLLOW_19_in_synpred71093); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:620:2: ( ruleCompare )
        // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:620:2: ruleCompare
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCompare_in_synpred81125);
        ruleCompare();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:633:2: ( ruleBooleanValue )
        // ../org.storydriven.modeling.expressions.common/src-gen/org/storydriven/modeling/expressions/common/parser/antlr/internal/InternalExpressions.g:633:2: ruleBooleanValue
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBooleanValue_in_synpred91155);
        ruleBooleanValue();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred9

    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleLExpression_in_entryRuleLExpression81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpression91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_ruleLExpression140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_entryRuleEquivalent174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquivalent184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleEquivalent234 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleEquivalent256 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleEquivalent_in_ruleEquivalent277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication375 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleImplication397 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleImplication418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction516 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleDisjunction540 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_15_in_ruleDisjunction570 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleDisjunction593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleConjunction691 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleConjunction713 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleConjunction734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleNegation818 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleNegated_in_ruleNegation843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_ruleNegation874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegated_in_entryRuleNegated909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegated919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_ruleNegated977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_entryRuleCExpression1013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCExpression1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCExpression1059 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleLExpression_in_ruleCExpression1084 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCExpression1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleCExpression1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleCExpression1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCExpression1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeValue_in_ruleCompare1280 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_20_in_ruleCompare1303 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_21_in_ruleCompare1333 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_22_in_ruleCompare1363 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_23_in_ruleCompare1393 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_24_in_ruleCompare1423 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_25_in_ruleCompare1453 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_26_in_ruleCompare1483 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleSomeValue_in_ruleCompare1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeValue_in_entryRuleSomeValue1544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeValue1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleSomeValue1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleSomeValue1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_ruleSomeValue1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_entryRuleAExpression1699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAExpression1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAExpression1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition1852 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_27_in_ruleAddition1876 = new BitSet(new long[]{0x0000000000040090L});
    public static final BitSet FOLLOW_28_in_ruleAddition1906 = new BitSet(new long[]{0x0000000000040090L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition1929 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication2027 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_29_in_ruleMultiplication2051 = new BitSet(new long[]{0x0000000000040090L});
    public static final BitSet FOLLOW_30_in_ruleMultiplication2081 = new BitSet(new long[]{0x0000000000040090L});
    public static final BitSet FOLLOW_31_in_ruleMultiplication2111 = new BitSet(new long[]{0x0000000000040090L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication2134 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower2172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePower2232 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_rulePower2255 = new BitSet(new long[]{0x0000000000040090L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePower2277 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePrimaryExpression2361 = new BitSet(new long[]{0x0000000000040090L});
    public static final BitSet FOLLOW_ruleAExpression_in_rulePrimaryExpression2386 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrimaryExpression2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_rulePrimaryExpression2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rulePrimaryExpression2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue2492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleNumberValue2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER2583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER2634 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleNUMBER2653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue2806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable2897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_VALUE_in_ruleVariable2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_VALUE_in_entryRuleVARIABLE_VALUE2988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_VALUE2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3066 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVARIABLE_VALUE3084 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred71059 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleLExpression_in_synpred71084 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_synpred71093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_synpred81125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_synpred91155 = new BitSet(new long[]{0x0000000000000002L});

}