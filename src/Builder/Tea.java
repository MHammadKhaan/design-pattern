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
public class Tea extends HotDrink {
   private int sweetnessType;
   private int cream;
   private int sweetnessSpoons;

   public Tea(int sweetnessType, int cream, int sweetnessSpoons) {
      this.sweetnessType = sweetnessType;
      this.cream = cream;
      this.sweetnessSpoons = sweetnessSpoons;
   }

   public float price() {
      float basePrice = 20.0f; // Adjust the base price
      float totalCost = basePrice;

      // Add additional cost for customizations
      if (sweetnessType==1) {
         totalCost += 2.0f;
      } else if (sweetnessType==2) {
         totalCost += 4.0f;
      }

      if (cream==1) {
         totalCost += 3.0f;
      }

      totalCost += sweetnessSpoons * 1.0f; // Adjust the price per spoon

      return totalCost;
   }

   public String name() {
      return "Tea";
   }
}
