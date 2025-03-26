package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a set of integers, supporting common set operations such as union, intersection, 
 * difference, complement, and others. The set does not allow duplicate values.
 */

public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<Integer>();

    // Default Constructor
    public IntegerSet() {
    }

  /**
 * Constructor that initializes the set with an already given list of integers.
 * 
 * @param set A list of integers to initialize the set.
 */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

/**
 * Clears the internal representation of the set, removing all elements.
 */
    public void clear() {
        set.clear();
    }

/**
 * Returns the length (size) of the set, i.e., the number of elements in the set.
 * 
 * @return The size of the set.
 */

    public int length() {
        return set.size();
    }

/**
 * Compares this set with another object to check if they are equal. 
 * Two sets are considered equal if they contain the same elements, regardless of the order.
 * 
 * @param o The object to compare with this set.
 * @return true if the sets are equal, false otherwise.
 */


    public boolean equals(Object o) {
        if (o == null || !(o instanceof IntegerSet)) {
            return false;
        }
        IntegerSet other = (IntegerSet) o;
        return this.set.containsAll(other.set) && other.set.containsAll(this.set);
    }

/**
 * Checks if the set contains a specific value.
 * 
 * @param value The value to check for.
 * @return true if the value is in the set, false otherwise.
 */

    public boolean contains(int value) {
        return set.contains(value);
    }

/**
 * Returns the largest item in the set.
 * 
 * @return The largest integer in the set.
 * @throws IllegalStateException if the set is empty.
 */

    public int largest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty");
        }
        return set.stream().max(Integer::compareTo).orElseThrow();
    }

/**
 * Returns the smallest item in the set.
 * 
 * @return The smallest integer in the set.
 * @throws IllegalStateException if the set is empty.
 */

    public int smallest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty");
        }
        return set.stream().min(Integer::compareTo).orElseThrow();
    }

/**
 * Adds an integer to the set. If the integer is already present, it does nothing.
 * 
 * @param item The integer to add to the set.
 */

    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

/**
 * Removes an integer from the set. If the integer is not present, it does nothing.
 * 
 * @param item The integer to remove from the set.
 */

    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

 /**
 * Performs the union of this set with another set. The union of two sets contains all elements that are in either set.
 * 
 * @param intSetb The set to perform the union with.
 */

    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            this.add(item);
        }
    }


/**
 * Performs the intersection of this set with another set. The intersection contains only elements that are in both sets.
 * 
 * @param intSetb The set to perform the intersection with.
 */

    public void intersect(IntegerSet intSetb) {
        List<Integer> intersection = new ArrayList<>();
        for (int item : this.set) {
            if (intSetb.contains(item)) {
                intersection.add(item);
            }
        }
        this.set = intersection;
    }

/**
 * Performs the difference of this set with another set. The difference contains elements that are in the first set but not in the second set.
 * 
 * @param intSetb The set to perform the difference with.
 */
   
    public void diff(IntegerSet intSetb) {
        List<Integer> difference = new ArrayList<>();
        for (int item : this.set) {
            if (!intSetb.contains(item)) {
                difference.add(item);
            }
        }
        this.set = difference;
    }

/**
 * Performs the complement of this set with respect to another set. The complement contains elements that are in the second set but not in the first set.
 * 
 * @param intSetb The set to perform the complement with.
 */

    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>();
        for (int item : intSetb.set) {
            if (!this.contains(item)) {
                complement.add(item);
            }
        }
        this.set = complement;
    }

/**
 * Checks if the set is empty (contains no elements).
 * 
 * @return true if the set is empty, false otherwise.
 */

    public boolean isEmpty() {
        return set.isEmpty();
    }


/**
 * Returns a string representation of the set. The string is formatted as a list of integers enclosed in square brackets.
 * 
 * @return A string representing the set.
 */

    public String toString() {
        return "Set: " + set.toString();
    }
}
