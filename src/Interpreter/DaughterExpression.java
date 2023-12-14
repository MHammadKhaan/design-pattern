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
public class DaughterExpression implements Expression {

   private Expression motherExpression = null;
   private Expression daughterExpression = null;

   public DaughterExpression(Expression motherExpression, Expression daughterExpression) {
      this.motherExpression = motherExpression;
      this.daughterExpression = daughterExpression;
   }

   @Override
   public boolean interpret(String context) {
      // Assuming the context is in the form "Samantha is a daughter of Julie"
      String[] parts = context.split(" is a daughter of ");
      if (parts.length == 2) {
         String motherName = parts[1];
         String daughterName = parts[0];

         return motherExpression.interpret(motherName) && daughterExpression.interpret(daughterName);
      }

      return false;
   }
}
