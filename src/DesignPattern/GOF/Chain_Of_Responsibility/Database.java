/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern.GOF.Chain_Of_Responsibility;

/**
 *
 * @author fa20-bse-031
 */
public class Database extends AbstractLogger {
    public Database(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Database Logger ::"+message);
    }
    
}
