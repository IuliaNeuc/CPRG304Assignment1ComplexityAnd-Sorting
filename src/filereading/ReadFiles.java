package filereading;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;

public class ReadFiles {
    public static void ReadFile(File file1) {

        // shape array lists
        ArrayList<String> shapeList = new ArrayList<String>(); // all shapes
        ArrayList<String> cylinderList = new ArrayList<String>(); 
        ArrayList<String> coneList = new ArrayList<String>();
        ArrayList<String> pyramidList = new ArrayList<String>();
        ArrayList<String> triangularPrismList = new ArrayList<String>();
        ArrayList<String> squarePrismList = new ArrayList<String>();
        ArrayList<String> pentagonalPrismList = new ArrayList<String>();
        ArrayList<String> octagonalPrismList = new ArrayList<String>();

        // read file
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(file1))) {
            String line;
            while ((line = reader.readLine()) != null) {   
                String[] elements = line.split(" ");
                for (String element1 : elements) {
                    shapeList.add(element1);
                }
            }
            shapeList.remove(0); // removes shape count integer from beginning of file  -- NEED THIS CODE
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // sort shapes into respective array lists
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

        // test print statements
        int totalSize = coneList.size() + cylinderList.size() + pyramidList.size() + squarePrismList.size() + triangularPrismList.size() + pentagonalPrismList.size() + octagonalPrismList.size();
        System.out.println("Total size: " + totalSize);
        System.out.println("shape list size: " + shapeList.size());
    }   
}
