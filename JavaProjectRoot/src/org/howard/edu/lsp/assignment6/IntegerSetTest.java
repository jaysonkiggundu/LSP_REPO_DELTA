package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class IntegerSetTest {

    IntegerSet set1;
    IntegerSet set2;

    @BeforeEach
    public void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }

    @Test
    @DisplayName("Test add and toString")
    public void testAddAndToString() {
        set1.add(1);
        set1.add(2);
        set1.add(2); // duplicate
        assertEquals("Set: [1, 2]", set1.toString());
    }

    @Test
    @DisplayName("Test length and clear")
    public void testLengthAndClear() {
        set1.add(1);
        set1.add(2);
        assertEquals(2, set1.length());
        set1.clear();
        assertEquals(0, set1.length());
        assertTrue(set1.isEmpty());
    }

    @Test
    @DisplayName("Test equals method")
    public void testEquals() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2));

        set2.add(3);
        assertFalse(set1.equals(set2));
    }

    @Test
    @DisplayName("Test contains method")
    public void testContains() {
        set1.add(10);
        assertTrue(set1.contains(10));
        assertFalse(set1.contains(5));
    }

    @Test
    @DisplayName("Test largest with elements")
    public void testLargest() {
        set1.add(5);
        set1.add(10);
        set1.add(3);
        assertEquals(10, set1.largest());
    }

    @Test
    @DisplayName("Test largest throws exception when empty")
    public void testLargestException() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            set1.largest();
        });
        assertEquals("Set is empty", exception.getMessage());
    }

    @Test
    @DisplayName("Test smallest with elements")
    public void testSmallest() {
        set1.add(5);
        set1.add(10);
        set1.add(3);
        assertEquals(3, set1.smallest());
    }

    @Test
    @DisplayName("Test smallest throws exception when empty")
    public void testSmallestException() {
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            set1.smallest();
        });
        assertEquals("Set is empty", exception.getMessage());
    }

    @Test
    @DisplayName("Test remove method")
    public void testRemove() {
        set1.add(5);
        set1.add(10);
        set1.remove(5);
        assertFalse(set1.contains(5));
        set1.remove(100); // not in set, should not throw
        assertEquals("Set: [10]", set1.toString());
    }

    @Test
    @DisplayName("Test union")
    public void testUnion() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
        assertTrue(set1.contains(3));
        assertEquals(3, set1.length());
    }

    @Test
    @DisplayName("Test intersect")
    public void testIntersect() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set1.intersect(set2);
        assertEquals("Set: [2, 3]", set1.toString());
    }

    @Test
    @DisplayName("Test diff")
    public void testDiff() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(2);
        set2.add(4);
        set1.diff(set2);
        assertEquals("Set: [1, 3]", set1.toString());
    }

    @Test
    @DisplayName("Test complement")
    public void testComplement() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set1.complement(set2);
        assertEquals("Set: [3, 4]", set1.toString());
    }

    @Test
    @DisplayName("Test isEmpty")
    public void testIsEmpty() {
        assertTrue(set1.isEmpty());
        set1.add(1);
        assertFalse(set1.isEmpty());
    }
}
