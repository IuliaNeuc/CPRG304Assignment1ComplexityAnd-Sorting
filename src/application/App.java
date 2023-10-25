package application;

import java.io.File;
import shape.*;

public class App {
    public static void main(String[] args) {

        // variables for command line arguments
        String filePath = ""; // file name
        String compareType = ""; // compare type
        String sortingAlgorithm = ""; // sorting algorithm
        
        try {
            for (int i = 0; i < args.length; i++) { // parse command line arguments
                switch (args[i].toLowerCase()) { // convert to lowercase to make args case insensitive
                    case "-f":
                        filePath = args[i + 1]; // set path to file
                        break;
                    case "-t":
                        compareType = args[i + 1]; // select compare type
                        break;
                    case "-s":
                        sortingAlgorithm = args[i + 1]; // select sorting algorithm
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
            case "h":
                compareDimension = "h"; // Height
                break;
            case "v": 
                compareDimension = "v"; // Volume
                break;
            case "a":
                compareDimension = "a"; // Base area
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
        File file = new File("src/resources/test1.txt"); // TESTING FILE PATH
        //File file = new File(filePath); // file path from command line argument -f
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

        for (int i = 0; i < shapeArray.length; i++) { // print unsorted array
            System.out.println(shapeArray[i].toString());
        }
    }
}

// proto1 test