package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;

import shape.*;
import filereading.ReadFiles;

// import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {

        Scanner consoleScanner = new Scanner(System.in); // open scanner 

        String fileName = ""; // file name
        boolean isDescending = false;
        boolean isVerbose = false;
        String sortAlgorithm = "";

        // Parse command line arguments
        for (int i = 0; i < args.length; i++) {
            String arg = args[i].toLowerCase();
    
            if (arg.equals("-f")) {

                fileName = args[i + 1];

            } else if (arg.equals("-t")) {



                String type = args[i + 1].toLowerCase();
    
                if (type.equals("v")) {
                    isVerbose = true;
                } else if (type.equals("h")) {
                    // Sort by height
                    sortAlgorithm = "height";
                } else if (type.equals("a")) {
                    // Sort by base area
                    sortAlgorithm = "base area";
                }



            } else if (arg.equals("-s")) {



                String type = args[i + 1].toLowerCase();
    
                if (type.equals("b")) {
                    // Bubble sort
                    // sortAlgorithm = "bubble";
                } else if (type.equals("s")) {
                    // Selection sort
                    // sortAlgorithm = "selection";
                } else if (type.equals("i")) {
                    // Insertion sort
                    // sortAlgorithm = "insertion";
                } else if (type.equals("m")) {
                    // Merge sort
                    // sortAlgorithm = "merge";
                } else if (type.equals("q")) {
                    // Quick sort
                    // sortAlgorithm = "quick";
                } else if (type.equals("z")) {
                    // Your choice of sorting algorithm
                    // sortAlgorithm = "your choice";
                }



            }
        }
        
        // READ FILE
        File file = new File("./src/application/resources/test1.txt"); // file path of file to read 
        Object[] shapeObjectArray = (Object[]) ReadFiles.ReadFile(file); // read file and store shape arrays as objects in object array
        
        // cast object[n] in object array to shape array 
        Shape[] shapeArray = (Shape[]) shapeObjectArray[0]; 
        Cone[] coneArray = (Cone[]) shapeObjectArray[1];
        Cylinder[] cylinderArray = (Cylinder[]) shapeObjectArray[2];
        Pyramid[] pyramidArray = (Pyramid[]) shapeObjectArray[3];
        TriangularPrism[] triangularPrismArray = (TriangularPrism[]) shapeObjectArray[4];
        SquarePrism[] squarePrismArray = (SquarePrism[]) shapeObjectArray[5]; 
        PentagonalPrism[] pentagonalPrismArray = (PentagonalPrism[]) shapeObjectArray[6];
        OctagonalPrism[] octagonalPrismArray = (OctagonalPrism[]) shapeObjectArray[7];
        
        Cone cone = new Cone(674.2435, 652.1534);
        Cylinder cylinder = new Cylinder(9431.453, 4450.123);








        
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(cylinder);
        shapes.add(cone);

        Collections.sort(shapes);
        for (Shape l : shapes) {
            System.out.println(l);
        }

        Comparator<Shape> comparator = new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                double area1 = s1.calcBaseArea();
                double area2 = s2.calcBaseArea();
                if (area1 < area2) {
                    return -1;
                } else if (area1 > area2) {
                    return 1;
                } else {
                    double volume1 = s1.calcVolume();
                    double volume2 = s2.calcVolume();
                    if (volume1 < volume2) {
                        return -1;
                    } else if (volume1 > volume2) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        };
        Collections.sort(shapes, comparator);

        
        consoleScanner.close(); // close scanner
    }
}
