/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpreter;

/**
 *
 * @author fa20-bse-031
 */
public class SonExpression implements Expression {

   private Expression fatherExpression = null;
   private Expression sonExpression = null;

   public SonExpression(Expression fatherExpression, Expression sonExpression) {
      this.fatherExpression = fatherExpression;
      this.sonExpression = sonExpression;
   }

   @Override
   public boolean interpret(String context) {
      // Assuming the context is in the form "Stuart is a son of Robert"
      String[] parts = context.split(" is a son of ");
      if (parts.length == 2) {
         String fatherName = parts[1];
         String sonName = parts[0];

         return fatherExpression.interpret(fatherName) && sonExpression.interpret(sonName);
      }

      return false;
   }
}
