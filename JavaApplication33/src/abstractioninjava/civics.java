/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractioninjava;

/**
 *
 * @author fa20-bse-011
 */
public class civics implements cars, sportsCars {

    @Override
    public void start() {
        System.out.println("in early strat civic move vary smothly");
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
