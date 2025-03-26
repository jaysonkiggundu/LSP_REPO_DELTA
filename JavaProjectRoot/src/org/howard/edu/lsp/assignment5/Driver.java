package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;

/**
 * Driver class to test the IntegerSet class and its methods.
 * This class demonstrates the usage of various methods like 
 * add(), union(), intersect(), diff(), complement(), smallest(), and largest().
 */
public class Driver {

    /**
     * Helper method to format and improve readability of the set string by removing "Set: " prefix.
     * @param setString The string representation of the set.
     * @return The formatted string without the "Set: " prefix.
     */
    public static String formatSet(String setString) {
        return setString.replace("Set: ", "");
    }

    /**
     * Main method that creates IntegerSets, performs set operations,
     * and prints results to demonstrate the functionality of IntegerSet methods.
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create and test Set1
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Value of Set1 is: " + formatSet(set1.toString()));

        // Test smallest and largest in Set1
        System.out.println("Smallest value in Set1: " + set1.smallest());
        System.out.println("Largest value in Set1: " + set1.largest());
        System.out.println("");

        // Create and test Set2
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Value of Set2 is: " + formatSet(set2.toString()));

        // Test smallest and largest in Set2
        System.out.println("Smallest value in Set2: " + set2.smallest());
        System.out.println("Largest value in Set2: " + set2.largest());
        System.out.println("");

        // Test Union of Set1 and Set2
        set1.union(set2);  
        System.out.println("Union: " + formatSet(set1.toString()));

        // Test Intersection of Set1 and Set2
        set1.intersect(set2);  
        System.out.println("Intersection: " + formatSet(set1.toString()));

        // Test Difference of Set1 and Set2
        set1.diff(set2);  
        System.out.println("Difference: " + formatSet(set1.toString()));

        // Test complement of Set1 and Set2
        set1.complement(set2); 
        System.out.println("Complement: " + formatSet(set1.toString()));
    }
}