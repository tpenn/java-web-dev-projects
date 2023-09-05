package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius;

        do {
            System.out.print("Enter the radius (must be a positive number): ");
        } while ((radius = input.nextDouble()) <= 0);

        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
    }
}
