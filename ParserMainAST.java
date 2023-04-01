package org.example;
import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;

import java.io.FileInputStream;
import java.util.List;

public class ParserMainAST {
    public static void main(String[] args) {
        try {
            // Create a JavaParser object
            JavaParser javaParser = new JavaParser();

            // Parse the Java source file
            ParseResult<CompilationUnit> parseResult = javaParser.parse(
                    new FileInputStream("src/main/java/org/example/Main.java"));
            CompilationUnit compilationUnit = parseResult.getResult().orElse(null);

            // Get a list of all the classes in the source file
            List<ClassOrInterfaceDeclaration> classes = compilationUnit.findAll(ClassOrInterfaceDeclaration.class);

            // Print out the name and AST of each class
            for (ClassOrInterfaceDeclaration cls : classes) {
                System.out.println("Class name: " + cls.getNameAsString());
                System.out.println("Class AST:");
                printAST(cls, 0);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void printAST(Node node, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        System.out.println(node.getClass().getSimpleName().replace("Impl", "") + ": " + node);
        for (Node child : node.getChildNodes()) {
            printAST(child, level + 1);
        }
    }
}
