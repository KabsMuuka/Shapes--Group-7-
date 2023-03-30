package org.example;

import java.util.Scanner;

public class Shapes {


    int area;

    //calculate the area of a shape
    int calculateArea(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int length = input.nextInt();
        System.out.println("Enter Width: ");
        int width = input.nextInt();
        area = length*width;
        return area;
    }

    //prints the methods in the shapes class
    void print(){
        System.out.println(calculateArea()+"m");
        props();
        draw();
    }


    //prints the properties of the shape
    void props(){
        String[] properties = {"" +
                "*closed two-dimensional figure",
                "*has a specific form",
                "*has a fixed size",
                "and has orientation"};
        System.out.println("\n**Properties**");
        for(String property: properties){
            System.out.println(property);
        }
    }

    //draws the shape
    void draw(){
        System.out.println();
        System.out.println("Shape drawn below");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();  // move to the next line after printing each row
        }
    }

}
