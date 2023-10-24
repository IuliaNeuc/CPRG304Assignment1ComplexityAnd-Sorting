package filereading;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;

public class ReadFiles {
    public static void ReadFile(File fileToRead) {

        // shape array lists - DELETE THESE
        ArrayList<String> cylinderList = new ArrayList<String>(); 
        ArrayList<String> coneList = new ArrayList<String>();
        ArrayList<String> pyramidList = new ArrayList<String>();
        ArrayList<String> triangularPrismList = new ArrayList<String>();
        ArrayList<String> squarePrismList = new ArrayList<String>();
        ArrayList<String> pentagonalPrismList = new ArrayList<String>();
        ArrayList<String> octagonalPrismList = new ArrayList<String>();

        String[] shapeArray = null; // all shapes
        ArrayList<String> cylinderArray = null;
        ArrayList<String> coneArray = null;
        ArrayList<String> pyramidArray = null;
        ArrayList<String> triangularPrismArray = null;
        ArrayList<String> squarePrismArray = null;
        ArrayList<String> pentagonalPrismArray = null;
        ArrayList<String> octagonalPrismArray = null;
        int elementCount = 0;
        
        // read file
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fileToRead))) {
            
            // read first line (only works if there is one line in the file)
            String line = reader.readLine(); // read line
            shapeArray = line.split(" "); // split line into array by spaces
            elementCount = (Integer.parseInt(shapeArray[0]) * 3) + 1; // convert first element to int and multiply by 3 to get total number of elements
            
            // test print statements
            System.out.println("Object count: " + elementCount);
            for (int i = 0; i < elementCount; i++) {
                System.out.println("shapeArray: " + shapeArray[i]);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // sort shapes into respective array lists
        for (int i = 0; i < elementCount - 2; i++) { 
            switch (shapeArray[i]) {
                case "Cone":

                    coneList.add(shapeArray[i]);
                    coneList.add(shapeArray[i + 1]);
                    coneList.add(shapeArray[i + 2]);
                    break;
                case "Cylinder":
                    cylinderList.add(shapeArray[i]);
                    cylinderList.add(shapeArray[i + 1]);
                    cylinderList.add(shapeArray[i + 2]);
                    break;
                case "Pyramid":
                    pyramidList.add(shapeArray[i]);
                    pyramidList.add(shapeArray[i + 1]);
                    pyramidList.add(shapeArray[i + 2]);
                    break;
                case "TriangularPrism":
                    triangularPrismList.add(shapeArray[i]);
                    triangularPrismList.add(shapeArray[i + 1]);
                    triangularPrismList.add(shapeArray[i + 2]);
                    break;
                case "SquarePrism":
                    squarePrismList.add(shapeArray[i]);
                    squarePrismList.add(shapeArray[i + 1]);
                    squarePrismList.add(shapeArray[i + 2]);
                    break;
                case "PentagonalPrism":
                    pentagonalPrismList.add(shapeArray[i]);
                    pentagonalPrismList.add(shapeArray[i + 1]);
                    pentagonalPrismList.add(shapeArray[i + 2]);
                    break;
                case "OctagonalPrism":
                    octagonalPrismList.add(shapeArray[i]);
                    octagonalPrismList.add(shapeArray[i + 1]);
                    octagonalPrismList.add(shapeArray[i + 2]);
                    break;
                default:
                    break;
            }
        }

        // test print statements
        int totalSize = coneList.size() + cylinderList.size() + pyramidList.size() + squarePrismList.size() + triangularPrismList.size() + pentagonalPrismList.size() + octagonalPrismList.size();
        System.out.println("Sorted List size: " + totalSize);
        System.out.println("shapeArray size: " + shapeArray.length);
        for (int i = 0; i < coneList.size(); i++) {
            System.out.println("coneList: " + coneList.get(i));
        }
        for (int i = 0; i < cylinderList.size(); i++) {
            System.out.println("cylinderList: " + cylinderList.get(i));
        }
    }   
}
