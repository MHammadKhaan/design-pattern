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
public abstract class Computer implements Strategy{
    public Computer nextComputer;    
    public abstract int computeInRange(int num1, int num2);
}
