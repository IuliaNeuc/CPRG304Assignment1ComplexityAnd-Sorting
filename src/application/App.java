package application;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import shape.*;

import java.util.Scanner;
import java.io.File;
// import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in); // open scanner 

        String fileName = ""; // file name

        // Parse command line arguments
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-f")) {
                fileName = args[i + 1];
            } else if (args[i].equals("-t")) {

            } else if (args[i].equals("-s")) {
                
            }
        }
        
        System.out.println("File name: " + fileName);



        try {
            File file1 = new File("./src/application/resources/test1.txt"); // file1
            Scanner file1Scanner = new Scanner(file1); // scan file1
            file1Scanner.close(); // close file1 scanner



            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }




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
        consoleScanner.close();
        
        
    }
}
