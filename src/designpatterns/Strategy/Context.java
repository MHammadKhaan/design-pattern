/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Strategy;

/**
 *
 * @author fa20-bse-031
 */
public class Context {
   private Computer strategy;

   public Context(Computer strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
   
   public int executeInRangeStrategy(int num1, int num2){
       Computer chainOfStrategies = new OperationAdd(new OperationSubstract(new OperationMultiply()));
      return chainOfStrategies.computeInRange(num1, num2);
   }
}