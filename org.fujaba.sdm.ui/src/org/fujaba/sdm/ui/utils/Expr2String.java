package org.fujaba.sdm.ui.utils;

import org.storydriven.modeling.calls.expressions.ParameterExpression;
import org.storydriven.modeling.expressions.ArithmeticExpression;
import org.storydriven.modeling.expressions.ArithmeticOperator;
import org.storydriven.modeling.expressions.BinaryExpression;
import org.storydriven.modeling.expressions.BinaryLogicExpression;
import org.storydriven.modeling.expressions.ComparingOperator;
import org.storydriven.modeling.expressions.ComparisonExpression;
import org.storydriven.modeling.expressions.Expression;
import org.storydriven.modeling.expressions.LiteralExpression;
import org.storydriven.modeling.expressions.LogicOperator;
import org.storydriven.modeling.expressions.NotExpression;
import org.storydriven.modeling.expressions.TextualExpression;
import org.storydriven.modeling.patterns.expressions.AttributeValueExpression;
import org.storydriven.modeling.patterns.expressions.ObjectSetSizeExpression;
import org.storydriven.modeling.patterns.expressions.ObjectVariableExpression;

public abstract class Expr2String
{
   public static String toString(Expression e)
   {
      if(e instanceof AttributeValueExpression)
      {
         return attrValueExpr((AttributeValueExpression)e);
      }
      else if(e instanceof BinaryExpression)
      {
         return binExpr((BinaryExpression)e);
      }
      else if(e instanceof LiteralExpression)
      {
         return litExpr((LiteralExpression)e);
      }
      else if(e instanceof NotExpression)
      {
         return notExpr((NotExpression)e);
      }
      else if(e instanceof ObjectSetSizeExpression)
      {
         return objSetExpr((ObjectSetSizeExpression)e);
      }
      else if(e instanceof ObjectVariableExpression)
      {
         return objExpr((ObjectVariableExpression)e);
      }
      else if(e instanceof ParameterExpression)
      {
         return paramExpr((ParameterExpression)e);
      }
      else if(e instanceof TextualExpression)
      {
         return textExpr((TextualExpression)e);
      }
      return "some Expression";
   }

   private static String textExpr(TextualExpression e)
   {
      return e.getExpressionText();
   }

   private static String paramExpr(ParameterExpression e)
   {
      return e.getParameter().getParameter().getName();
   }

   private static String objExpr(ObjectVariableExpression e)
   {
      return e.getObject().getName();
   }

   private static String objSetExpr(ObjectSetSizeExpression e)
   {
      return e.getSet().getName();
   }

   private static String notExpr(NotExpression e)
   {
      return "NOT(" + toString(e.getNegatedExpression()) + ")";
   }

   private static String litExpr(LiteralExpression e)
   {
      return e.getValue();
   }

   private static String binExpr(BinaryExpression e)
   {
      if(e instanceof ArithmeticExpression)
      {
         return arithExpr((ArithmeticExpression)e);
      }
      else if(e instanceof BinaryLogicExpression)
      {
         return binLogExpr((BinaryLogicExpression)e);
      }
      else if(e instanceof ComparisonExpression)
      {
         return compExpr((ComparisonExpression)e);
      }
      return null;
   }

   private static String compExpr(ComparisonExpression e)
   {
      String operator = null;
      if(e.getOperator().equals(ComparingOperator.EQUAL))
      {
         operator = "==";
      }
      else if(e.getOperator().equals(ComparingOperator.GREATER))
      {
         operator = ">";
      }
      else if(e.getOperator().equals(ComparingOperator.GREATER_OR_EQUAL))
      {
         operator = ">=";
      } 
      else if(e.getOperator().equals(ComparingOperator.LESS))
      {
         operator = "<";
      } 
      else if(e.getOperator().equals(ComparingOperator.LESS_OR_EQUAL))
      {
         operator = "<=";
      }
      else if(e.getOperator().equals(ComparingOperator.UNEQUAL))
      {
         operator = "!=";
      }
      else if(e.getOperator().equals(ComparingOperator.REGULAR_EXPRESSION))
      {
         operator = " ->regex-> ";
      }
      return toString(e.getLeftExpression()) + operator + toString(e.getRightExpression());
   }

   private static String binLogExpr(BinaryLogicExpression e)
   {
      String operator = null;
      if(e.getOperator().equals(LogicOperator.AND))
      {
         operator = "AND";
      }
      else if(e.getOperator().equals(LogicOperator.EQUIVALENT))
      {
         operator = "EQUALS";
      }
      else if(e.getOperator().equals(LogicOperator.IMPLY))
      {
         operator = "IMPLY";
      }
      else if(e.getOperator().equals(LogicOperator.OR))
      {
         operator = "OR";
      } 
      else if(e.getOperator().equals(LogicOperator.XOR))
      {
         operator = "XOR";
      } 
      return toString(e.getLeftExpression()) + operator + toString(e.getRightExpression());
   }

   private static String arithExpr(ArithmeticExpression e)
   {
      String operator = null;
      if(e.getOperator().equals(ArithmeticOperator.DIVIDE))
      {
         operator = "/";
      }
      else if(e.getOperator().equals(ArithmeticOperator.EXP))
      {
         operator = "^";
      }
      else if(e.getOperator().equals(ArithmeticOperator.MINUS))
      {
         operator = "-";
      }
      else if(e.getOperator().equals(ArithmeticOperator.MODULO))
      {
         operator = "%";
      } 
      else if(e.getOperator().equals(ArithmeticOperator.PLUS))
      {
         operator = "+";
      }
      else if(e.getOperator().equals(ArithmeticOperator.TIMES))
      {
         operator = "*";
      }
      return toString(e.getLeftExpression()) + operator + toString(e.getRightExpression());
   }

   private static String attrValueExpr(AttributeValueExpression e)
   {
      return e.getObject().getName() + "." + e.getAttribute().getName();
   }
}
