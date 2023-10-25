package application;

import java.util.ArrayList; // cannot use ArrayList
import java.util.Collections;
import java.util.Comparator;
import java.io.File;

import shape.*;
import filereading.ReadFiles;

// import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {

        // variables for command line arguments
        String filePath = ""; // file name
        String compareType = ""; // compare type
        String sortingAlgorithm = ""; // sorting algorithm
        
        try {
            for (int i = 0; i < args.length; i++) { // parse command line arguments
                switch (args[i].toLowerCase()) { // convert to lowercase to make args case insensitive
                    case "-f": // set path to file
                        filePath = args[i + 1];
                        break;
                    case "-t": // select compare type
                        compareType = args[i + 1];
                        break;
                    case "-s": // select sorting algorithm
                        sortingAlgorithm = args[i + 1];
                        break;
                    default:
                        break;
                }
            }
            if (filePath == "" || compareType == "" || sortingAlgorithm == "") { // check if all arguments are populated
                System.out.println("\nError: Invalid argument.\nFormat: -f <file location> -t <compare type> -s <algorithm>.\nTry adding a space after each argument.\nAll arguments must be populated.\nThe order of the arguments does not matter.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        String compareDimension = ""; // compare dimension
        switch (compareType) { // check user input for errors and set shape dimension to compare if no errors
            case "h": // Height
                compareDimension = "h";
                break;
            case "v":
                compareDimension = "v"; // Volume
                break;
            case "a": // Base area
                compareDimension = "a";
                break;
            default: // check for invalid input
                System.out.println("\nError: Invalid compare type.\nPlease use one of the following for -t: h, v, a.");
                break;
        }

        String selectedAlgorithm = ""; // selected algorithm
        switch (sortingAlgorithm) { // check user input for errors and select the algorithm if no errors
            case "b":
                selectedAlgorithm = "b"; // Bubble sort
                break;
            case "s":
                selectedAlgorithm = "s"; // Selection sort
                break;
            case "i":
                selectedAlgorithm = "i"; // Insertion sort
                break;
            case "m":
                selectedAlgorithm = "m"; // Merge sort
                break;
            case "q":
                selectedAlgorithm = "q"; // Quick sort
                break;
            case "z":
                selectedAlgorithm = "z"; // custom sort
                break;
            default: // check for invalid input
                System.out.println("\nError: Invalid sorting algorithm.\nPlease use one of the following for -s: b, s, i, m, q, z.");
                break;
        }

        // welcome message
        System.out.println("\nComplexity and Sorting Program\nFile path: " + filePath + "\nCompare type: " + compareDimension + "\nSorting algorithm: " + selectedAlgorithm);

        // FILE READ
        File file = new File(filePath); // file path from command line argument -f
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

        // test code for sorting
        Cone cone = new Cone(674.2435, 652.1534);
        Cylinder cylinder = new Cylinder(9431.453, 4450.123);

        // cannot use ArrayList
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
    }
}
