/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author fa20-bse-031
 */
public class DietPepsi extends ColdDrink {

   @Override
   public float price() {
      return 40.0f; // Adjust the price accordingly
   }

   @Override
   public String name() {
      return "Diet Pepsi";
   }
}