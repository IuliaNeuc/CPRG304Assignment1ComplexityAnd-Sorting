package filereading;

import java.io.BufferedReader;
import java.io.File;

public class ReadFiles {
    public static void ReadFile(File fileToRead) {

        String[] shapeArray = null; // all shapes
        int elementCount = 0;
        
        // read file
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fileToRead))) {
            
            // read first line (only works if there is one line in the file)
            String line = reader.readLine(); // read line
            shapeArray = line.split(" "); // split line into elements and add to shapeArray
            elementCount = (Integer.parseInt(shapeArray[0]) * 3) + 1 ; // convert first element of shapeArray to int and multiply by 3 to get number of elements in shapeArray

            // test print statements
            System.out.println("\nelementCount 1: " + elementCount);
            // for (int i = 0; i < elementCount; i++) {
            //     System.out.println("shapeArray: " + shapeArray[i]);
            // }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // create variables to count number of each shape in shapeArray
        int coneCount = 0;
        int cylinderCount = 0;
        int pyramidCount = 0;
        int triangularPrismCount = 0;
        int squarePrismCount = 0;
        int pentagonalPrismCount = 0;
        int octagonalPrismCount = 0;

        // count number of each shape
        for (int i = 0; i < elementCount; i++) { 
            switch (shapeArray[i]) {
                case "Cone":
                    coneCount++;
                    break;
                case "Cylinder":
                    cylinderCount++;
                    break;
                case "Pyramid":
                    pyramidCount++;
                    break;
                case "TriangularPrism":
                    triangularPrismCount++;
                    break;
                case "SquarePrism":
                    squarePrismCount++;
                    break;
                case "PentagonalPrism":
                    pentagonalPrismCount++;
                    break;
                case "OctagonalPrism":
                    octagonalPrismCount++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("cone count: " + coneCount);
        System.out.println("cylinder count: " + cylinderCount);
        System.out.println("pyramid count: " + pyramidCount);
        System.out.println("triangularPrism count: " + triangularPrismCount);
        System.out.println("squarePrism count: " + squarePrismCount);
        System.out.println("pentagonalPrism count: " + pentagonalPrismCount);
        System.out.println("octagonalPrism count: " + octagonalPrismCount);
        int totalCount = coneCount + cylinderCount + pyramidCount + triangularPrismCount + squarePrismCount + pentagonalPrismCount + octagonalPrismCount;
        System.out.println("total count: " + totalCount);

        // create shape arrays with correct size - REMOVE * 3 WHEN CLASSES IMPLEMENTED
        String[] coneArray = new String[coneCount * 3];
        String[] cylinderArray = new String[cylinderCount * 3];
        String[] pyramidArray = new String[pyramidCount * 3];
        String[] triangularPrismArray = new String[triangularPrismCount * 3];
        String[] squarePrismArray = new String[squarePrismCount * 3];
        String[] pentagonalPrismArray = new String[pentagonalPrismCount * 3];
        String[] octagonalPrismArray = new String[octagonalPrismCount * 3];

        int coneCount2 = 0;
        int cylinderCount2 = 0;
        int pyramidCount2 = 0;
        int triangularPrismCount2 = 0;
        int squarePrismCount2 = 0;
        int pentagonalPrismCount2 = 0;
        int octagonalPrismCount2 = 0;

        // sort shapes into respective arrays
        for (int i = 0; i < (elementCount); i++) { 

            switch (shapeArray[i]) {
                case "Cone":
                    coneArray[coneCount2] = shapeArray[i];
                    coneArray[coneCount2 + 1] = shapeArray[i + 1];
                    coneArray[coneCount2 + 2] = shapeArray[i + 2];
                    coneCount2 += 3; // REMOVE * 3 WHEN CLASSES IMPLEMENTED
                    break;
                case "Cylinder":
                    cylinderArray[cylinderCount2] = shapeArray[i];
                    cylinderArray[cylinderCount2 + 1] = shapeArray[i + 1];
                    cylinderArray[cylinderCount2 + 2] = shapeArray[i + 2];
                    cylinderCount2 += 3; // REMOVE * 3 WHEN CLASSES IMPLEMENTED
                    break;
                case "Pyramid":
                    pyramidArray[pyramidCount2] = shapeArray[i];
                    pyramidArray[pyramidCount2 + 1] = shapeArray[i + 1];
                    pyramidArray[pyramidCount2 + 2] = shapeArray[i + 2];   
                    pyramidCount2 += 3; // REMOVE * 3 WHEN CLASSES IMPLEMENTED          
                    break;
                case "TriangularPrism":
                    triangularPrismArray[triangularPrismCount2] = shapeArray[i];
                    triangularPrismArray[triangularPrismCount2 + 1] = shapeArray[i + 1];
                    triangularPrismArray[triangularPrismCount2 + 2] = shapeArray[i + 2];
                    triangularPrismCount2 += 3; // REMOVE * 3 WHEN CLASSES IMPLEMENTED
                    break;
                case "SquarePrism":
                    squarePrismArray[squarePrismCount2] = shapeArray[i];
                    squarePrismArray[squarePrismCount2 + 1] = shapeArray[i + 1];
                    squarePrismArray[squarePrismCount2 + 2] = shapeArray[i + 2];
                    squarePrismCount2 += 3; // REMOVE * 3 WHEN CLASSES IMPLEMENTED
                    break;
                case "PentagonalPrism":
                    pentagonalPrismArray[pentagonalPrismCount2] = shapeArray[i];
                    pentagonalPrismArray[pentagonalPrismCount2 + 1] = shapeArray[i + 1];
                    pentagonalPrismArray[pentagonalPrismCount2 + 2] = shapeArray[i + 2];
                    pentagonalPrismCount2 += 3; // REMOVE * 3 WHEN CLASSES IMPLEMENTED
                    break;
                case "OctagonalPrism":
                    octagonalPrismArray[octagonalPrismCount2] = shapeArray[i];
                    octagonalPrismArray[octagonalPrismCount2 + 1] = shapeArray[i + 1];
                    octagonalPrismArray[octagonalPrismCount2 + 2] = shapeArray[i + 2];
                    octagonalPrismCount2 += 3; // REMOVE * 3 WHEN CLASSES IMPLEMENTED
                    break;
                default:
                    break;
            }
        }

        // test print statements
        int totalSize = coneArray.length + cylinderArray.length + pyramidArray.length + triangularPrismArray.length + squarePrismArray.length + pentagonalPrismArray.length + octagonalPrismArray.length;
        System.out.println("\nSorted Arrays size: " + totalSize / 3);
        System.out.println("shapeArray size: " + shapeArray.length / 3 + "\n");
        
    }   
}
