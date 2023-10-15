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
class civic extends car {
    void start(){
        status = true;
        System.out.println("in early strat civic move vary smothly");
    }

    @Override
    void stop() {
        status = false;
        System.out.println("the stop smothly as well");
    }
    
}
