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
public class MealBuilder {

   public Meal prepareVegMeal (boolean includeDiet){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
       if (includeDiet) {
      meal.addItem(new DietCoke());
   } else {
      meal.addItem(new Coke());
   }
   return meal;
}   

   public Meal prepareNonVegMeal (boolean includeDiet){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
       if (includeDiet) {
      meal.addItem(new DietPepsi());
   } else {
      meal.addItem(new Pepsi());
   }
   return meal;
}
}