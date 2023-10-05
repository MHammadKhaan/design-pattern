/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.Strategy;

/**
 *
 * @author Hafiz laptop
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa20-bse-031
 */
public class OperationDevide extends Computer{
    OperationDevide() {
    }

    OperationDevide(Computer operationPower) {
        this.nextComputer = operationPower;
    }
   @Override
   public int doOperation(int num1, int num2) {
      return num1 * num2;
   }

    @Override
    public int computeInRange(int num1, int num2) {
        if(num1 >= 1000 && num1 <= 5000 && num2 >= 1000 && num2 <= 5000 )
            return num1 * num2;
        if(nextComputer != null)
            return nextComputer.computeInRange(num1, num2);
        System.out.print("Support not available violating range.");
        return 0;
    }
}
