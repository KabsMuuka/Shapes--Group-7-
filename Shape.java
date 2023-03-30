package org.example;

import java.util.Scanner;

public class Shape {
    Shapes triangle = new Triangle();
    Shapes rectangle = new Rectangle();
    Scanner input = new Scanner(System.in);
    void welcome() {
        System.out.println("Welcome to Shapes project!\n");
        System.out.println("********************************");
        System.out.println("Please choose a shape\n 1. Triangle \n 2. Circle \n 3. Rectangle");
        boolean num = true;

            try{
                while (num){
                    if(input.hasNextInt()){
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1 -> triangle.print();
                            case 2 -> System.out.println("Circle");
                            case 3 -> rectangle.print();
                            default -> System.out.println("Invalid choice!!");
                        }
                        num = false;
                    }
                    else{
                        throw new Exception();
                    }
                }
            }catch (Exception e){
                System.out.println("Not a number");
            }

    }
}
