/*
 * Name: Lab 1
 * Purpose: Print out total ticket prices for three customers
 * Programmer: Alex Kurcan
 * Date: 09/08/2025
 */

import java.util.Scanner;

public class Kurcan_Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // All of customer 1, age and lastname
        System.out.print("Enter last name of customer 1: ");
        String lastname1 = scanner.nextLine();

        System.out.print("Enter age of customer 1: ");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        int price1;
        if (age1 >= 0 && age1 <= 5) {
            price1 = 0;
        } else if (age1 <= 12) {
            price1 = 5;
        } else if (age1 <= 17) {
            price1 = 8;
        } else if (age1 <= 59) {
            price1 = 12;
        } else {
            price1 = 6;
        }

        // All of customer 2, age and lastname
        System.out.print("Enter last name of customer 2: ");
        String lastname2 = scanner.nextLine();

        System.out.print("Enter age of customer 2: ");
        int age2 = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        int price2;
        if (age2 >= 0 && age2 <= 5) {
            price2 = 0;
        } else if (age2 <= 12) {
            price2 = 5;
        } else if (age2 <= 17) {
            price2 = 8;
        } else if (age2 <= 59) {
            price2 = 12;
        } else {
            price2 = 6;
        }

        // All of customer 3, age and lastname
        System.out.print("Enter last name of customer 3: ");
        String lastname3 = scanner.nextLine();

        System.out.print("Enter age of customer 3: ");
        int age3 = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        System.out.println(""); // blank line for better spacing (last line touches)


        int price3;
        if (age3 >= 0 && age3 <= 5) {
            price3 = 0;
        } else if (age3 <= 12) {
            price3 = 5;
        } else if (age3 <= 17) {
            price3 = 8;
        } else if (age3 <= 59) {
            price3 = 12;
        } else {
            price3 = 6;
        }

        // Subtotal and total
        double subtotal = price1 + price2 + price3;
        double total = subtotal + (subtotal * 0.05);

        // Output for customers
        System.out.println("Customer 1 Name: " + lastname1);
        System.out.println("Customer 1 Age: " + age1);
        System.out.println("Customer 1 Ticket Price: " + price1);
        System.out.println(""); // blank line for better spacing
        System.out.println("Customer 2 Name: " + lastname2);
        System.out.println("Customer 2 Age: " + age2);
        System.out.println("Customer 2 Ticket Price: " + price2);
        System.out.println(""); // blank line for better spacing
        System.out.println("Customer 3 Name: " + lastname3);
        System.out.println("Customer 3 Age: " + age3);
        System.out.println("Customer 3 Ticket Price: " + price3);

        // Output for the calculations
        System.out.println("\n---------------------- Calculations ----------------------");
        System.out.printf("Subtotal: %.2f%n", subtotal);
        System.out.printf("Total Charge: %.2f%n", total);

        scanner.close();
    }
}