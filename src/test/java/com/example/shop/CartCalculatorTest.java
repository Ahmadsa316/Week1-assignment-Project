package com.example.shop;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartCalculatorTest {

    private final CartCalculator calculator = new CartCalculator();

    @Test
    void shouldCalculateSingleItemTotal() {
        double result = calculator.calculateItemTotal(10.0, 3);
        assertEquals(30.0, result, 0.001);
    }

    @Test
    void shouldCalculateCartTotal() {
        List<Item> items = List.of(
                new Item(10.0, 2),
                new Item(5.0, 4),
                new Item(3.0, 1)
        );

        double result = calculator.calculateCartTotal(items);

        assertEquals(43.0, result, 0.001);
    }

    @Test
    void shouldReturnZeroForEmptyCart() {
        double result = calculator.calculateCartTotal(List.of());
        assertEquals(0.0, result, 0.001);
    }
}