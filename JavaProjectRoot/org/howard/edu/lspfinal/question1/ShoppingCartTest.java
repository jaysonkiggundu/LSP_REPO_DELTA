package org.howard.edu.lspfinal.question1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    @DisplayName("Test for adding valid item")
    public void testAddValidItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Book", 12.99);
        assertEquals(12.99, cart.getTotalCost(), 0.01);
    }

    @Test
    @DisplayName("Test for adding item with 0 price (expect exception)")
    public void testAddItemWithZeroPrice() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("Pen", 0.0));
    }

    @Test
    @DisplayName("Test for adding item with negative price (expect exception)")
    public void testAddItemWithNegativePrice() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.addItem("Notebook", -5.0));
    }

    @Test
    @DisplayName("Test for applying SAVE10 discount code")
    public void testApplyDiscountSAVE10() {
        ShoppingCart cart = new ShoppingCart();
        cart.applyDiscountCode("SAVE10");
        assertEquals(10.0, cart.getDiscountPercentage(), 0.01);
    }

    @Test
    @DisplayName("Test for applying SAVE20 discount code")
    public void testApplyDiscountSAVE20() {
        ShoppingCart cart = new ShoppingCart();
        cart.applyDiscountCode("SAVE20");
        assertEquals(20.0, cart.getDiscountPercentage(), 0.01);
    }

    @Test
    @DisplayName("Test for applying invalid discount code (expect exception)")
    public void testApplyInvalidDiscountCode() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class, () -> cart.applyDiscountCode("SAVE50"));
    }

    @Test
    @DisplayName("Test total cost without discount")
    public void testTotalCostWithoutDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Shoes", 50.0);
        cart.addItem("Hat", 20.0);
        assertEquals(70.0, cart.getTotalCost(), 0.01);
    }

    @Test
    @DisplayName("Test total cost with discount")
    public void testTotalCostWithDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Phone Case", 30.0);
        cart.addItem("Charger", 20.0);
        cart.applyDiscountCode("SAVE10"); // 10% discount
        assertEquals(45.0, cart.getTotalCost(), 0.01); // 50 - 5
    }

    @Test
    @DisplayName("Test total cost with empty cart")
    public void testTotalCostWithEmptyCart() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.getTotalCost(), 0.01);
    }
}
