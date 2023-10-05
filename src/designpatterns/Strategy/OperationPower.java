/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.Strategy;
import java.lang.Math;
/**
 *
 * @author Hafiz laptop
 */
public class OperationPower extends Computer{
    OperationPower() {
    }
   @Override
   public int doOperation(int num1, int num2) {
      return (int)calculatePower(num1,num2);
   }
    @Override
    public int computeInRange(int num1, int num2) {
        if(num1 >= 5000 && num1 <= 8000 && num2 >= 5000 && num2 <= 8000 )
            return num1 * num2;
        if(nextComputer != null)
            return nextComputer.computeInRange(num1, num2);
        System.out.print("Support not available violating range.");
        return 0;
    }
    public double calculatePower(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}