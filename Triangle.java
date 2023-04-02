package org.example;

import java.util.Scanner;

public class Triangle extends Shapes{
    @Override
    double calculateArea() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base: ");
        int length = input.nextInt();
        System.out.println("Enter height: ");
        int width = input.nextInt();
        area = (int)(.5*(length*width));
        return area;
    }

    @Override
    void print() {
        System.out.println(calculateArea()+"m");
        props();
    }

    @Override
    void props() {
        String[] properties ={"* Has three sides and three angles.",
                "* The sum of the angles is always 180 degrees.",
                "* The area can be calculated using the formula 1/2 X base X height."};
        System.out.println("\n**Properties**");
        for(String property: properties){
            System.out.println(property);
        }
    }

    @Override
    void draw() {
        System.out.println();
        System.out.println("Triangle drawn below");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // move to the next line after printing each row
        }
    }
}
