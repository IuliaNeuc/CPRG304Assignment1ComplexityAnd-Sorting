package application;

import java.io.File;
import shape.*;

public class App {
    public static void main(String[] args) {
        
        // variables for command line arguments
        String filePath = "";
        String compareType = "";
        String sortingAlgorithm = "";
        String printDimension = "";
        String printAlg = "";

        try {
            for (int i = 0; i < 3; i++) {
                switch (args[i].substring(0, 2)) { // check for -f, -t, -s
                    case "-f":
                        filePath = args[i].substring(2, args[i].length());
                        break;
                    case "-t":
                        compareType = args[i].substring(2, args[i].length());
                        break;
                    case "-s":
                        sortingAlgorithm = args[i].substring(2, args[i].length());
                        break;
                    default:
                        break;
                }
            }
            if (filePath == " " || compareType == " " || sortingAlgorithm == " ") { // check if all arguments are populated
                System.out.println("\nError: Invalid argument.\nFormat: -f<file location> -t<compare type> -s<algorithm>.\nThe order of the arguments does not matter.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        String compareDimension = ""; // compare dimension
        switch (compareType) { // check user input for errors and set shape dimension to compare if no errors
            case "h":
                compareDimension = "h"; // Height
                printDimension = "Height";
                break;
            case "v": 
                compareDimension = "v"; // Volume
                printDimension = "Volume";
                break;
            case "a":
                compareDimension = "a"; // Base area
                printDimension = "Base area";
                break;
            default: // check for invalid input
                System.out.println("\nError: Invalid compare type.\nPlease use one of the following for -t: h, v, a.");
                break;
        }

        String selectedAlgorithm = ""; // selected algorithm
        switch (sortingAlgorithm) { // check user input for errors and select the algorithm if no errors
            case "b":
                selectedAlgorithm = "b"; // Bubble sort
                printAlg = "Bubble sort";
                break;
            case "s":
                selectedAlgorithm = "s"; // Selection sort
                printAlg = "Selection sort";
                break;
            case "i":
                selectedAlgorithm = "i"; // Insertion sort
                printAlg = "Insertion sort";
                break;
            case "m":
                selectedAlgorithm = "m"; // Merge sort
                printAlg = "Merge sort";
                break;
            case "q":
                selectedAlgorithm = "q"; // Quick sort
                printAlg = "Quick sort";
                break;
            case "z":
                selectedAlgorithm = "z"; // custom sort
                printAlg = "Custom sort";
                break;
            default: // check for invalid input
                System.out.println("\nError: Invalid sorting algorithm.\nPlease use one of the following for -s: b, s, i, m, q, z.");
                break;
        }

        // welcome message
        System.out.println("\nComplexity and Sorting Program\nFile path: " + filePath + "\nCompare type: " + compareDimension + "\nSorting algorithm: " + selectedAlgorithm);

        // FILE READ
        File file = new File(filePath); // file path from command line argument -f
        Shape[] shapeArray = ReadFileClass.ReadFile(file);; // read file and store shape arrays as objects in object array
        
        // get last index of array
        int lastIndex = shapeArray.length - 1;

        // initialize execution time variables
        long endTime = 0;
        long startTime = 0;
        
        // sort by height
        if(compareDimension.equalsIgnoreCase("h"))
        {
            if (selectedAlgorithm.equalsIgnoreCase("b")) {                
                startTime = System.currentTimeMillis();
                Utility.bubbleSort(shapeArray, compareDimension);
                endTime = System.currentTimeMillis();

            } else if (selectedAlgorithm.equalsIgnoreCase("s")) {
                startTime = System.currentTimeMillis();
                Utility.selectionSort(shapeArray, compareType);
                endTime = System.currentTimeMillis();                
            } else if (selectedAlgorithm.equalsIgnoreCase("i")) {
                startTime = System.currentTimeMillis();
                Utility.insertionSort(shapeArray, compareType);
                endTime = System.currentTimeMillis();                
            } else if (selectedAlgorithm.equalsIgnoreCase("m")) {
                startTime = System.currentTimeMillis();
                Utility.mergeSort(shapeArray, 0, lastIndex, compareType);
                endTime = System.currentTimeMillis();                
            } else if (selectedAlgorithm.equalsIgnoreCase("q")) {
                startTime = System.currentTimeMillis();
                Utility.quickSort(shapeArray, compareType);
                endTime = System.currentTimeMillis();                
            } else if (selectedAlgorithm.equalsIgnoreCase("z")) {
                startTime = System.currentTimeMillis();
                Utility.heapSort(shapeArray, compareDimension);
                endTime = System.currentTimeMillis();                
            }
        }

        // sort by base area
        if(compareDimension.equalsIgnoreCase("a")) {
            if(selectedAlgorithm.equalsIgnoreCase("b")) {                
                startTime = System.currentTimeMillis();
                Utility.bubbleSort(shapeArray, compareDimension);
                endTime = System.currentTimeMillis();
            }
            else if(selectedAlgorithm.equalsIgnoreCase("s")) {
                startTime = System.currentTimeMillis();
                Utility.selectionSort(shapeArray, compareType);
                endTime = System.currentTimeMillis();                
            }
            else if(selectedAlgorithm.equalsIgnoreCase("i")) {
                startTime = System.currentTimeMillis();
                Utility.insertionSort(shapeArray, compareType);
                endTime = System.currentTimeMillis();                
            }
            else if(selectedAlgorithm.equalsIgnoreCase("m"))
            {
                startTime = System.currentTimeMillis();
                Utility.mergeSort(shapeArray, 0, lastIndex, compareType);
                endTime = System.currentTimeMillis();                
            }
            else if(selectedAlgorithm.equalsIgnoreCase("q"))
            {
                startTime = System.currentTimeMillis();
                Utility.quickSort(shapeArray, compareType);
                endTime = System.currentTimeMillis();                
            }
            else if(selectedAlgorithm.equalsIgnoreCase("z"))
            {
                startTime = System.currentTimeMillis();
                Utility.heapSort(shapeArray, compareDimension);
                endTime = System.currentTimeMillis();                
            }
        }

        // sort by volume
        if(compareDimension.equalsIgnoreCase("v"))
        {
            if(selectedAlgorithm.equalsIgnoreCase("b"))
            {                
                startTime = System.currentTimeMillis();
                Utility.bubbleSort(shapeArray, compareDimension);
                endTime = System.currentTimeMillis();
            }
            else if(selectedAlgorithm.equalsIgnoreCase("s"))
            {
                startTime = System.currentTimeMillis();
                Utility.selectionSort(shapeArray, compareType);
                endTime = System.currentTimeMillis();                
            }
            else if(selectedAlgorithm.equalsIgnoreCase("i"))
            {
                startTime = System.currentTimeMillis();
                Utility.insertionSort(shapeArray, compareType);
                endTime = System.currentTimeMillis();                
            }
            else if(selectedAlgorithm.equalsIgnoreCase("m"))
            {
                startTime = System.currentTimeMillis();
                Utility.mergeSort(shapeArray, 0, lastIndex, compareType);
                endTime = System.currentTimeMillis();                
            }
            else if(selectedAlgorithm.equalsIgnoreCase("q"))
            {
                startTime = System.currentTimeMillis();
                Utility.quickSort(shapeArray, compareType);
                endTime = System.currentTimeMillis();                
            }
            else if(selectedAlgorithm.equalsIgnoreCase("z"))
            {
                startTime = System.currentTimeMillis();
                Utility.heapSort(shapeArray, compareDimension);
                endTime = System.currentTimeMillis();                
            }
        } else {
            System.out.println("Please enter valid comparing type");

        }

        // shape array length
        int shapeArrayLength = shapeArray.length;
         
        // print sorted array
        if (compareDimension == "h") {
            for (int i = 0; i < shapeArrayLength; i += 1000) {
                System.out.println(String.format("Sorted by %s at index %d using %s: %.2f", printDimension, i, printAlg, shapeArray[i].getHeight()));
            }
            System.out.println(String.format("Sorted by %s at index %d using %s: %.2f", printDimension, shapeArrayLength, printAlg,shapeArray[lastIndex].getHeight()));
        } else if (compareDimension == "v") {
            for (int i = 0; i < shapeArrayLength; i += 1000) {
                System.out.println(String.format("Sorted by %s at index %d using %s: %.2f", printDimension, i, printAlg, shapeArray[i].calcVolume()));
            }
            System.out.println(String.format("Sorted by %s at index %d using %s: %.2f", printDimension, shapeArrayLength, printAlg,shapeArray[lastIndex].calcVolume()));
        } else if (compareDimension == "a") {
            for (int i = 0; i < shapeArrayLength; i += 1000) {
                System.out.println(String.format("Sorted by %s at index %d using %s: %.2f", printDimension, i, printAlg, shapeArray[i].calcBaseArea()));
            }
            System.out.println(String.format("Sorted by %s at index %d using %s: %.2f", printDimension, shapeArrayLength, printAlg,shapeArray[lastIndex].calcBaseArea()));
        } else {
            System.out.println("Please enter valid comparing type");
        }
        
        // print execution time
        long elapsedTime = endTime - startTime;
        System.out.println("\nEXECUTION TIME: " + elapsedTime + " milliseconds\n"); // print algotithm execution time
    }
}
