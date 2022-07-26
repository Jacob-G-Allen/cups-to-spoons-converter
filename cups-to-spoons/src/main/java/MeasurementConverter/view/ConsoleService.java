package MeasurementConverter.view;

import java.util.Scanner;

public class ConsoleService {

    private static final Scanner scanner = new Scanner(System.in);

    public void displayWelcome() {
        System.out.println("-----------------");
        System.out.println("WELCOME TO CUPS-TO-SPOONS");
        System.out.println("A Cooking Measurement Converter");
        System.out.println("-----------------");

    }

    public int printMenu() {
        System.out.println();
        System.out.println("We can currently convert between the following measurement units:");
        System.out.println("1: Cups");
        System.out.println("2: Tablespoons/Teaspoons");
        System.out.println("3: Fluid Ounces");
        System.out.println("4: Milliliters");
        System.out.println("0: Exit");
        System.out.println("Please enter the number of your starting measurement unit:");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }
    }

    public int requestQuantity() {
        System.out.println("Please enter the quantity of your starting measurement unit:");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }
    }

    public int requestEndingUnit() {
        System.out.println("Please enter the number of your ending measurement unit:");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }
    }
}

