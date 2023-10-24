package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import shape.*;

import java.util.Scanner;
import java.io.File;
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
        
        System.out.println("File name: " + fileName);






        // file read
        try {
            
            File file1 = new File("/home/sam137/Sait/Y2S3/OOP3/asn1files/asn1datafiles/polyfor1.txt"); // proj file
            // File file1 = new File("./src/application/resources/test1.txt"); // file1
            Scanner file1Scanner = new Scanner(file1); // scan file1
            ArrayList<String> file1Data = new ArrayList<String>(); // file1 lines
            
            // read file1
            while (file1Scanner.hasNextLine()) {
                String line = file1Scanner.nextLine();
                String[] tokens = line.split(" ");
                
                for (String token : tokens) {
                    file1Data.add(token);
                }
        
                
            }
            file1Scanner.close(); // close file1 scanner

            // print file1 data
            for (String data : file1Data) {
                System.out.println(data);
            }



        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }




        // string float float

        







        // Cone cone = new Cone(674.2435, 652.1534);
        // Cylinder cylinder = new Cylinder(9431.453, 4450.123);

        // ArrayList<Shape> shapes = new ArrayList<Shape>();
        // shapes.add(cylinder);
        // shapes.add(cone);

        // Collections.sort(shapes);
        // for (Shape l : shapes) {
        //     System.out.println(l);
        // }

        // Comparator<Shape> comparator = new Comparator<Shape>() {
        //     @Override
        //     public int compare(Shape s1, Shape s2) {
        //         double area1 = s1.calcBaseArea();
        //         double area2 = s2.calcBaseArea();
        //         if (area1 < area2) {
        //             return -1;
        //         } else if (area1 > area2) {
        //             return 1;
        //         } else {
        //             double volume1 = s1.calcVolume();
        //             double volume2 = s2.calcVolume();
        //             if (volume1 < volume2) {
        //                 return -1;
        //             } else if (volume1 > volume2) {
        //                 return 1;
        //             } else {
        //                 return 0;
        //             }
        //         }
        //     }
        // };
        // Collections.sort(shapes, comparator);

        // close scanner
        consoleScanner.close();
        
        
    }
}
