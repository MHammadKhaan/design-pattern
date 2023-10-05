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
public class StrategyPatternMain {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());		
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationSubstract());		
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new OperationMultiply());		
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
      
      System.out.println("Using Strategy with Chain of Responsibility ...");
      System.out.println("Computer in Range 44 , 44 = "+context.executeInRangeStrategy(44, 44));
      ;
       System.out.println("Out of range"+context.executeInRangeStrategy(44, 144));
       System.out.println("Computer in range 120 , 150 ="+ context.executeInRangeStrategy(150, 120));
       System.out.println("Out of range "+context.executeInRangeStrategy(120, 1250));
       System.out.println(" computer in range 500/1000 = "+context.executeInRangeStrategy(1000, 1500));
       System.out.println("5000 Power 2 ="+context.executeInRangeStrategy(5000, 5000));
      
      
   }
}