/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa20-bse-011
 */
public class MainMethodOverload1 {

    public static void main(Integer args) {
        System.out.println("Overloaded main() method invoked that parses an integer argument");
    }

    public static void main(char args) {
        System.out.println("Overloaded main() method invoked that parses a char argument");
    }

    public static void main(String[] args) {
        System.out.println("Original main() method invoked");
    }
}
