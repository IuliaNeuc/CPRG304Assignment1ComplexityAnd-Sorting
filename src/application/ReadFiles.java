package application;

import java.io.BufferedReader;
import java.io.File;

import shape.*;

public class ReadFiles {
    public static Object ReadFile(File fileToRead) {

        String[] shapeElementArray = null; // all shapes
        int elementCount = 0;
        
        // read file
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fileToRead))) {
            
            // read first line (only works if there is one line in the file)
            String line = reader.readLine(); // read line
            shapeElementArray = line.split(" "); // split line into elements and add to shapeArray
            elementCount = (Integer.parseInt(shapeElementArray[0]) * 3) + 1 ; // convert first element of shapeArray to int and multiply by 3 to get number of elements in shapeArray
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
            switch (shapeElementArray[i]) {
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
        int totalCount = coneCount + cylinderCount + pyramidCount + triangularPrismCount + squarePrismCount + pentagonalPrismCount + octagonalPrismCount;

        // create arrays for each shape
        Shape[] shapeArray = new Shape[totalCount]; // all shapes
        Cone[] coneArray = new Cone[coneCount];
        Cylinder[] cylinderArray = new Cylinder[cylinderCount];
        Pyramid[] pyramidArray = new Pyramid[pyramidCount];
        TriangularPrism[] triangularPrismArray = new TriangularPrism[triangularPrismCount];
        SquarePrism[] squarePrismArray = new SquarePrism[squarePrismCount];
        PentagonalPrism[] pentagonalPrismArray = new PentagonalPrism[pentagonalPrismCount];
        OctagonalPrism[] octagonalPrismArray = new OctagonalPrism[octagonalPrismCount];

        // create variables to count number of each shape in shapeArray
        int totalCount2 = 0;
        int coneCount2 = 0;
        int cylinderCount2 = 0;
        int pyramidCount2 = 0;
        int triangularPrismCount2 = 0;
        int squarePrismCount2 = 0;
        int pentagonalPrismCount2 = 0;
        int octagonalPrismCount2 = 0;

        // sort shapes into respective arrays after creating new shape objects
        for (int i = 0; i < (elementCount); i++) { 

            switch (shapeElementArray[i]) {
                case "Cone":
                    coneArray[coneCount2] = new Cone(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArray[totalCount2] = coneArray[coneCount2];
                    coneCount2++;
                    totalCount2++;
                    break;
                case "Cylinder":
                    cylinderArray[cylinderCount2] = new Cylinder(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArray[totalCount2] = cylinderArray[cylinderCount2];
                    cylinderCount2++;
                    totalCount2++;
                    break;
                case "Pyramid":
                    pyramidArray[pyramidCount2] = new Pyramid(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArray[totalCount2] = pyramidArray[pyramidCount2];
                    pyramidCount2++;
                    totalCount2++;
                    break;
                case "TriangularPrism":
                    triangularPrismArray[triangularPrismCount2] = new TriangularPrism(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArray[totalCount2] = triangularPrismArray[triangularPrismCount2];
                    triangularPrismCount2++;
                    totalCount2++;
                    break;
                case "SquarePrism":
                    squarePrismArray[squarePrismCount2] = new SquarePrism(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArray[totalCount2] = squarePrismArray[squarePrismCount2];
                    squarePrismCount2++;
                    totalCount2++;
                    break;
                case "PentagonalPrism":
                    pentagonalPrismArray[pentagonalPrismCount2] = new PentagonalPrism(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArray[totalCount2] = pentagonalPrismArray[pentagonalPrismCount2];
                    pentagonalPrismCount2++;
                    totalCount2++;
                    break;
                case "OctagonalPrism":
                    octagonalPrismArray[octagonalPrismCount2] = new OctagonalPrism(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArray[totalCount2] = octagonalPrismArray[octagonalPrismCount2];
                    octagonalPrismCount2++;
                    totalCount2++;
                    break;
                default:
                    break;
            }
        }

        // cast arrays to objects and return object array
        return new Object[] {shapeArray, coneArray, cylinderArray, pyramidArray, triangularPrismArray, squarePrismArray, pentagonalPrismArray, octagonalPrismArray};
    }   
}
