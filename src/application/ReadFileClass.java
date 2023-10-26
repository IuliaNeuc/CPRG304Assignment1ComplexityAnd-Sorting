package application;

import java.io.BufferedReader;
import java.io.File;

import shape.*;

public class ReadFileClass {
    public static Shape[] ReadFile1(File fileToRead) {

        String[] shapeElementArray = null; // store elements from text file
        int shapeCount = 0; // number of shapes in text file
        int elementCount = 0; // number of elements in text file
        
        // read file
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fileToRead))) {
            
            // read first line (only works if there is one line in the file)
            String line = reader.readLine(); // read line
            shapeElementArray = line.split(" "); // split line into elements and add to shapeArray
            shapeCount = (Integer.parseInt(shapeElementArray[0])); // convert first element of shapeElementArray to int
            elementCount = shapeCount * 3 + 1; // calculate number of elements in text file
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // create and add shape objects to shapeArray
        Shape[] shapeArray = new Shape[shapeCount]; // create shapeArray
        int shapeArrayIndex = 0; // index for adding shapes to shapeArray
        for (int i = 0; i < (elementCount); i++) { // create shapes and add to shapeArray
            switch (shapeElementArray[i]) {
                case "Cone":
                    shapeArray[shapeArrayIndex] = new Cone(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArrayIndex++;
                    break;
                case "Cylinder":
                    shapeArray[shapeArrayIndex] = new Cylinder(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArrayIndex++;
                    break;
                case "Pyramid":
                    shapeArray[shapeArrayIndex] = new Pyramid(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArrayIndex++;
                    break;
                case "TriangularPrism":
                    shapeArray[shapeArrayIndex] = new TriangularPrism(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArrayIndex++;
                    break;
                case "SquarePrism":
                    shapeArray[shapeArrayIndex] = new SquarePrism(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArrayIndex++;
                    break;
                case "PentagonalPrism":
                    shapeArray[shapeArrayIndex] = new PentagonalPrism(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArrayIndex++;
                    break;
                case "OctagonalPrism":
                    shapeArray[shapeArrayIndex] = new OctagonalPrism(Double.parseDouble(shapeElementArray[i + 1]), Double.parseDouble(shapeElementArray[i + 2]));
                    shapeArrayIndex++;
                    break;
                default:
                    break;
            }
        }
        return shapeArray;
    }   
}
