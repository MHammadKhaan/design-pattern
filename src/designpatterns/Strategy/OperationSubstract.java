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
public class OperationSubstract extends Computer{

    public OperationSubstract()
    {
        
    }
    
    OperationSubstract(Computer operationMultiply) {
        this.nextComputer = operationMultiply;
    }
    
   @Override
   public int doOperation(int num1, int num2) {
      return num1 - num2;
   }

    @Override
    public int computeInRange(int num1, int num2) {
        if(num1 >= 100 && num1 <= 500 && num2 >= 100 && num2 <= 500 )
            return num1 - num2;
        if(nextComputer != null)
            return nextComputer.computeInRange(num1, num2);
        System.out.print("Support not available violating range.");
        return 0;
    }
}