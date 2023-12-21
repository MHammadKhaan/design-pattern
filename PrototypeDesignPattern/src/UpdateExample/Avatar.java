/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdateExample;

/**
 *
 * @author fa20-bse-031
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

class Avatar extends Shape {

   public Avatar(String type) {
      this.type = type;
   }

   @Override
   public void draw() {
      System.out.println("Inside Avatar::draw() method.");
   }
}