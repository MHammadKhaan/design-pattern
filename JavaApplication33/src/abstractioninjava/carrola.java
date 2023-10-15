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
class carrola extends car{

    @Override
    void start() {
        status = true;
        System.out.println("the start of carrola is average smoothly");
    }

    @Override
    void stop() {
        status = false;
        System.out.println("the breaking system of carrola is quit better");
    }
    
}
