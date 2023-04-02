package org.example;

import java.lang.Math;
public class Hexagon extends Shapes{
    final int sides = 6;
 
    //Method calculating area of an hexagon
    @Override
    void print(){
        System.out.println("\t\tAn Hexagon has six sides");
        System.out.println("\t\tCalculating the are of an Hexagon");
        
        double area = (3 * Math.sqrt(3) * sides) / 2;

        System.out.println("\t\tThe calculated area is "+ Math.floor(area));

        hexagon_like_shape();
    }


    //printing hexagon like shape 
    public void hexagon_like_shape(){
        int size = 5; // the size of the hexagon
        int spaces = size - 1; // the number of spaces needed at the beginning of each line
        int stars = size; // the number of stars needed on each line

        // loop through each row of the hexagon
        for (int i = 0; i < size * 2 - 1; i++) {
            // print out the necessary number of spaces at the beginning of the line
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // print out the necessary number of stars for the line
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }

            // move to the next line and adjust the number of spaces and stars
            System.out.println();
            if (i < size - 1) {
                spaces--;
                stars++;
            } else {
                spaces++;
                stars--;
            }
        }
    }

}
  
