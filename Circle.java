package org.example;

import java.lang.Math;
import java.util.Scanner;

public class Circle extends Shapes{
    private double radius; // the radius of the circle

    public Circle() {
    }

    // constructor that takes in a radius value
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // getter method for the radius property
    public double getRadius() {
        return radius;
    }
    
    // setter method for the radius property
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // method that calculates the area of the circle
    public double calculateArea() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        setRadius(input.nextDouble());
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    void print() {
        System.out.printf("Area is %f \n",calculateArea());
        System.out.println(toString());
    }

    // method that calculates the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    
    // method that returns a string representation of the circle object
    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}
