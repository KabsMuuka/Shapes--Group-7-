# Shapes--Group-7- THE JAVAPARSER OUT:

The java Token numbers and the identifers, keywords,ETC are as follows: 

Class name: Main
No class AST found for Main
Total number of tokens: 270
CLASS: 1
ASSIGN: 1
RBRACKET: 1
RPAREN: 8
SPACE: 78
LBRACKET: 1
NEW: 3
VOID: 1
LBRACE: 2
SEMICOLON: 5
DOT: 4
STATIC: 1
RBRACE: 2
IDENTIFIER: 15
PUBLIC: 2
SINGLE_LINE_COMMENT: 60
LPAREN: 8
EOF: 1
UNIX_EOL: 76




The java Abstract Syntax Tree is as follows: 

Class name: Main
Class AST:
ClassOrInterfaceDeclaration: public class Main {

    public static void main(String[] args) {
        //Sepecifically for the Hexagon shape
        Hexagon hexagon = new Hexagon();
        hexagon.Area_of_the_hexagon();
        hexagon.hexagon_like_shape();
        //Sepecifically for the Hexagon shape
        new Shape().welcome();
        new Shape().welcome();
        //Instances of the specific shapes
        //    Shapes circle = new Circle("Circle","Triangle","Rectangle");
        //    Shapes triangle = new Triangle("Circle","Triangle","Rectangle");
        //    Shapes rectangle = new Rectangle("Circle","Triangle","Rectangle");
    }
    //        //This Calls the Circle Class
    //        System.out.println(circle.getCircle());
    //        //Area of the Circle
    //        circle.Area();
    //        circle.WhichShape();
    //
    //        //This Calls the Triangle Class
    //        System.out.println("*****************************************************************");
    //        System.out.println(triangle.getTriangle());
    //        //Area of the Triangle
    //        triangle.Area();
    //        triangle.WhichShape();
    //
    //
    //        //This Calls the Rectangle class
    //        System.out.println("*****************************************************************");
    //        System.out.println(rectangle.getRectangle());
    //        //Area of Rectangle
    //        rectangle.Area();
    //        rectangle.WhichShape();
    //
    //
    //}
    //
    //}
    ////Shapes Class => Parent Class
    //abstract class Shapes {
    //    private String Circle;
    //    private String Triangle;
    //    private String Rectangle;
    //
    //    //constructor of the Shape
    //    Shapes(String Circle,String Triangle,String Rectangle){
    //        this.Circle = Circle;
    //        this.Triangle = Triangle;
    //        this.Rectangle = Rectangle;
    //    }
    //    //Area of the Shape
    //    void Area(){
    //
    //    }
    //    //Should print out the name of the shape! and other
    //    void WhichShape(){
    //
    //    }
    //    String getCircle(){
    //        return Circle;
    //    }
    //    String getTriangle(){
    //        return Triangle;
    //    }
    //    String getRectangle(){
    //        return Rectangle;
    //    }
}
  Modifier: public 
  SimpleName: Main
  MethodDeclaration: public static void main(String[] args) {
    //Sepecifically for the Hexagon shape
    Hexagon hexagon = new Hexagon();
    hexagon.Area_of_the_hexagon();
    hexagon.hexagon_like_shape();
    //Sepecifically for the Hexagon shape
    new Shape().welcome();
    new Shape().welcome();
    //Instances of the specific shapes
    //    Shapes circle = new Circle("Circle","Triangle","Rectangle");
    //    Shapes triangle = new Triangle("Circle","Triangle","Rectangle");
    //    Shapes rectangle = new Rectangle("Circle","Triangle","Rectangle");
}
    Modifier: public 
    Modifier: static 
    SimpleName: main
    Parameter: String[] args
      ArrayType: String[]
        ClassOrInterfaceType: String
          SimpleName: String
      SimpleName: args
    VoidType: void
    BlockStmt: {
    //Sepecifically for the Hexagon shape
    Hexagon hexagon = new Hexagon();
    hexagon.Area_of_the_hexagon();
    hexagon.hexagon_like_shape();
    //Sepecifically for the Hexagon shape
    new Shape().welcome();
    new Shape().welcome();
    //Instances of the specific shapes
    //    Shapes circle = new Circle("Circle","Triangle","Rectangle");
    //    Shapes triangle = new Triangle("Circle","Triangle","Rectangle");
    //    Shapes rectangle = new Rectangle("Circle","Triangle","Rectangle");
}
      ExpressionStmt: //Sepecifically for the Hexagon shape
Hexagon hexagon = new Hexagon();
        VariableDeclarationExpr: Hexagon hexagon = new Hexagon()
          VariableDeclarator: hexagon = new Hexagon()
            ClassOrInterfaceType: Hexagon
              SimpleName: Hexagon
            SimpleName: hexagon
            ObjectCreationExpr: new Hexagon()
              ClassOrInterfaceType: Hexagon
                SimpleName: Hexagon
      ExpressionStmt: hexagon.Area_of_the_hexagon();
        MethodCallExpr: hexagon.Area_of_the_hexagon()
          NameExpr: hexagon
            SimpleName: hexagon
          SimpleName: Area_of_the_hexagon
      ExpressionStmt: hexagon.hexagon_like_shape();
        MethodCallExpr: hexagon.hexagon_like_shape()
          NameExpr: hexagon
            SimpleName: hexagon
          SimpleName: hexagon_like_shape
      ExpressionStmt: //Sepecifically for the Hexagon shape
new Shape().welcome();
        MethodCallExpr: new Shape().welcome()
          ObjectCreationExpr: new Shape()
            ClassOrInterfaceType: Shape
              SimpleName: Shape
          SimpleName: welcome
      ExpressionStmt: new Shape().welcome();
        MethodCallExpr: new Shape().welcome()
          ObjectCreationExpr: new Shape()
            ClassOrInterfaceType: Shape
              SimpleName: Shape
          SimpleName: welcome
      LineComment: //Sepecifically for the Hexagon shape

      LineComment: //Sepecifically for the Hexagon shape

      LineComment: //Instances of the specific shapes

      LineComment: //    Shapes circle = new Circle("Circle","Triangle","Rectangle");

      LineComment: //    Shapes triangle = new Triangle("Circle","Triangle","Rectangle");

      LineComment: //    Shapes rectangle = new Rectangle("Circle","Triangle","Rectangle");

  LineComment: //        //This Calls the Circle Class

  LineComment: //        System.out.println(circle.getCircle());

  LineComment: //        //Area of the Circle

  LineComment: //        circle.Area();

  LineComment: //        circle.WhichShape();

  LineComment: //

  LineComment: //        //This Calls the Triangle Class

  LineComment: //        System.out.println("*****************************************************************");

  LineComment: //        System.out.println(triangle.getTriangle());

  LineComment: //        //Area of the Triangle

  LineComment: //        triangle.Area();

  LineComment: //        triangle.WhichShape();

  LineComment: //

  LineComment: //

  LineComment: //        //This Calls the Rectangle class

  LineComment: //        System.out.println("*****************************************************************");

  LineComment: //        System.out.println(rectangle.getRectangle());

  LineComment: //        //Area of Rectangle

  LineComment: //        rectangle.Area();

  LineComment: //        rectangle.WhichShape();

  LineComment: //

  LineComment: //

  LineComment: //}

  LineComment: //

  LineComment: //}

  LineComment: ////Shapes Class => Parent Class

  LineComment: //abstract class Shapes {

  LineComment: //    private String Circle;

  LineComment: //    private String Triangle;

  LineComment: //    private String Rectangle;

  LineComment: //

  LineComment: //    //constructor of the Shape

  LineComment: //    Shapes(String Circle,String Triangle,String Rectangle){

  LineComment: //        this.Circle = Circle;

  LineComment: //        this.Triangle = Triangle;

  LineComment: //        this.Rectangle = Rectangle;

  LineComment: //    }

  LineComment: //    //Area of the Shape

  LineComment: //    void Area(){

  LineComment: //

  LineComment: //    }

  LineComment: //    //Should print out the name of the shape! and other

  LineComment: //    void WhichShape(){

  LineComment: //

  LineComment: //    }

  LineComment: //    String getCircle(){

  LineComment: //        return Circle;

  LineComment: //    }

  LineComment: //    String getTriangle(){

  LineComment: //        return Triangle;

  LineComment: //    }

  LineComment: //    String getRectangle(){

  LineComment: //        return Rectangle;

  LineComment: //    }