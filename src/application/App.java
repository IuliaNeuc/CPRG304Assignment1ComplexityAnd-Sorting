package application;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import shape.*;

// Sergei's imports
import java.util.Scanner;
import java.io.File;
// import 

public class App {
    public static void main(String[] args) {
        // scanner 
        Scanner consoleScanner = new Scanner(System.in);



        try {
            File file = new File("./src/application/resources/test1.txt");
            Scanner fileScanner = new Scanner(file);
            





        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // read file
        // string float float

        







        // Cone cone = new Cone(674.2435, 652.1534);
        // Cylinder cylinder = new Cylinder(9431.453, 4450.123);

        // ArrayList<Shape> shapes = new ArrayList<Shape>();
        // shapes.add(cylinder);
        // shapes.add(cone);

        // Collections.sort(shapes);
        // for (Shape l : shapes) {
        //     System.out.println(l);
        // }

        // Comparator<Shape> comparator = new Comparator<Shape>() {
        //     @Override
        //     public int compare(Shape s1, Shape s2) {
        //         double area1 = s1.calcBaseArea();
        //         double area2 = s2.calcBaseArea();
        //         if (area1 < area2) {
        //             return -1;
        //         } else if (area1 > area2) {
        //             return 1;
        //         } else {
        //             double volume1 = s1.calcVolume();
        //             double volume2 = s2.calcVolume();
        //             if (volume1 < volume2) {
        //                 return -1;
        //             } else if (volume1 > volume2) {
        //                 return 1;
        //             } else {
        //                 return 0;
        //             }
        //         }
        //     }
        // };
        // Collections.sort(shapes, comparator);

        // close scanner
        scanner.close();
    }
}
