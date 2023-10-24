package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import shape.*;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
// import java.io.FileNotFoundException;
import java.lang.reflect.Array;

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
        
        // file read
        File file1 = new File("./src/application/resources/test1.txt"); // file1

        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file1))) {
            
            // shape array lists
            ArrayList<String> shapeList = new ArrayList<String>(); // all shapes

            ArrayList<String> cylinderList = new ArrayList<String>(); 
            ArrayList<String> coneList = new ArrayList<String>();
            ArrayList<String> pyramidList = new ArrayList<String>();
            ArrayList<String> triangularPrismList = new ArrayList<String>();
            ArrayList<String> squarePrismList = new ArrayList<String>();
            ArrayList<String> pentagonalPrismList = new ArrayList<String>();
            ArrayList<String> octagonalPrismList = new ArrayList<String>();

            String line;
            while ((line = reader.readLine()) != null) {   
                String[] elements = line.split(" ");
                for (String element1 : elements) {
                    shapeList.add(element1);
                }
            }
            shapeList.remove(0); // removes shape count integer from beginning of file  -- NEED THIS CODE

            // sort file1 
            for (int i = 0; i < shapeList.size() - 2; i++) {                
                switch (shapeList.get(i)) {
                    case "Cone":
                        coneList.add(shapeList.get(i));
                        coneList.add(shapeList.get(i + 1));
                        coneList.add(shapeList.get(i + 2));
                        break;
                    case "Cylinder":
                        cylinderList.add(shapeList.get(i));
                        cylinderList.add(shapeList.get(i + 1));
                        cylinderList.add(shapeList.get(i + 2));
                        break;
                    case "Pyramid":
                        pyramidList.add(shapeList.get(i));
                        pyramidList.add(shapeList.get(i + 1));
                        pyramidList.add(shapeList.get(i + 2));
                        break;
                    case "TriangularPrism":
                        triangularPrismList.add(shapeList.get(i));
                        triangularPrismList.add(shapeList.get(i + 1));
                        triangularPrismList.add(shapeList.get(i + 2));
                        break;
                    case "SquarePrism":
                        squarePrismList.add(shapeList.get(i));
                        squarePrismList.add(shapeList.get(i + 1));
                        squarePrismList.add(shapeList.get(i + 2));
                        break;
                    case "PentagonalPrism":
                        pentagonalPrismList.add(shapeList.get(i));
                        pentagonalPrismList.add(shapeList.get(i + 1));
                        pentagonalPrismList.add(shapeList.get(i + 2));
                        break;
                    case "OctagonalPrism":
                        octagonalPrismList.add(shapeList.get(i));
                        octagonalPrismList.add(shapeList.get(i + 1));
                        octagonalPrismList.add(shapeList.get(i + 2));
                        break;
                    default:
                        break;
                }
            }

            int totalSize = coneList.size() + cylinderList.size() + pyramidList.size() + squarePrismList.size() + triangularPrismList.size() + pentagonalPrismList.size() + octagonalPrismList.size();
            System.out.println("Total size: " + totalSize);
            System.out.println("shape list size: " + shapeList.size());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


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

    private static void method1() {

    }
}
