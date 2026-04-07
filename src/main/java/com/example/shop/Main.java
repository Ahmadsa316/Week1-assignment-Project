package com.example.shop;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Locale locale = chooseLocale(scanner);
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", locale);

        System.out.print(messages.getString("enter.number.of.items") + " ");
        int numberOfItems = Integer.parseInt(scanner.nextLine());

        List<Item> items = new ArrayList<>();
        CartCalculator calculator = new CartCalculator();

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print(MessageFormat.format(messages.getString("enter.price.for.item"), i) + " ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print(MessageFormat.format(messages.getString("enter.quantity.for.item"), i) + " ");
            int quantity = Integer.parseInt(scanner.nextLine());

            items.add(new Item(price, quantity));
        }

        double totalCost = calculator.calculateCartTotal(items);
        System.out.println(messages.getString("total.cost") + " " + totalCost);

        scanner.close();
    }

    private static Locale chooseLocale(Scanner scanner) {
        System.out.println("Select language / Valitse kieli / Välj språk / 言語を選択してください:");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Swedish");
        System.out.println("4. Japanese");
        System.out.print("Choice: ");

        String choice = scanner.nextLine();

        return switch (choice) {
            case "2" -> new Locale("fi", "FI");
            case "3" -> new Locale("sv", "SE");
            case "4" -> new Locale("ja", "JP");
            default -> new Locale("en", "US");
        };
    }
}