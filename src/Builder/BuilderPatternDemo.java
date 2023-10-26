/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import java.util.Scanner;

/**
 *
 * @author fa20-bse-031
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
      MealBuilder mealBuilder = new MealBuilder();
      Scanner scanner = new Scanner(System.in);

      System.out.println("Welcome to the Meal Builder!");

      // Interactive menu
      System.out.println("Select your meal type:");
      System.out.println("1. Veg Meal");
      System.out.println("2. Non-Veg Meal");
      System.out.println("3. Custom Tea");

      int choice = scanner.nextInt();

      Meal meal;

      switch (choice) {
         case 1:
            System.out.println("Do you want Diet beverages? (true/false)");
            boolean includeDiet = scanner.nextBoolean();
            meal = mealBuilder.prepareVegMeal(includeDiet);
            break;

         case 2:
            System.out.println("Do you want Diet beverages? (true/false)");
            includeDiet = scanner.nextBoolean();
            meal = mealBuilder.prepareNonVegMeal(includeDiet);
            break;
            case 3:
            System.out.println("Select sweetness type \n 1:Regular\n 2:Extra Sweet):");
            int sweetnessType = scanner.nextInt();
            System.out.println("Add cream? \n1:true\n2:false)");
            int cream = scanner.nextInt();
            System.out.println("Enter sweetness spoons:");
            int sweetnessSpoons = scanner.nextInt();
            meal = mealBuilder.prepareCustomTea(sweetnessType, cream, sweetnessSpoons);
            break;
         default:
            System.out.println("Invalid choice. Exiting.");
            scanner.close();
            return;
      }

      System.out.println("Your selected meal:");
      meal.showItems();
      System.out.println("Total Cost: " + meal.getCost());

      scanner.close();
   }

}



