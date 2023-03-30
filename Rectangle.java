package org.example;

public class Rectangle extends Shapes{
    @Override
    void props() {
        String[] properties ={"* Has four sides with opposite sides parallel and equal in length.",
                "* The opposite sides have the same length.",
                "* The area can be calculated using the formula length * width."};
        System.out.println("\n**Properties**");
        for(String property: properties){
            System.out.println(property);
        }
    }
}
