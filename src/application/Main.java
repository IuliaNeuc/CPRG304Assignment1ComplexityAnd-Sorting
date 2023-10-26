// package application; 

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.lang.reflect.Array;
// import java.util.Scanner;

// import shape.CompareArea;
// import shape.Shape;
// import shape.CompareVolume;
// import shape.Cone;
// import shape.Cylinder;
// import shape.OctagonalPrism;
// import shape.PentagonalPrism;
// import shape.Pyramid;
// import shape.SquarePrism;
// import shape.TriangularPrism;

// import algorithms.BubbleSort;
// import algorithms.InsertionSort;
// import algorithms.MergeSort;
// import algorithms.HeapSort;
// import algorithms.QuickSort;
// import algorithms.SelectionSort;


// public class Main{	
	  
// 	Shape shapes[];
	
// 	CompareArea a= new CompareArea();
// 	CompareVolume v= new CompareVolume();
	
 
// public Main() {
	
		
// 	}

// public Main(String [] args) {
// 	super();
// 	readFromFile(args);
// }


// //pass the args
// public void readFromFile(String [] args) {
	
// 	String fileName = "";
// 	String compareType = "";
// 	String sortType = "";
	
// 	String string1 = "";
// 	String string2 = "";
// 	String string3 = ""; 

// 	if(args.length != 3) {
// 		System.out.println("Pass in the correct number of arguments");
// 		return;
// 	}
// 	else {
// 		string1 = args[0].toLowerCase();
// 		string2 = args[1].toLowerCase();
// 		string3 = args[2].toLowerCase();
// 	}

// 	//check the category for string1
// 	if (string1.startsWith("-f")) {
// 		fileName = string1.substring(2);
// 	}
// 	else if (string1.startsWith("-t")) {
// 		compareType = string1.substring(2);
// 	}
// 	else if (string1.startsWith("-s")) {
// 		sortType = string1.substring(2);
// 	}
// 	else {
		
// 		System.out.println("Pass in the correct argument types1");
// 	}
	

// //check the category for string2
// 	if (string2.startsWith("-f")) {
// 		fileName = string2.substring(2);
// 	}
// 	else if (string2.startsWith("-t")) {
// 		compareType = string2.substring(2);
// 	}
// 	else if (string2.startsWith("-s")) {
// 		sortType = string2.substring(2);
// 	}
// 	else {
		
// 		System.out.println("Pass in the correct argument types2");
// 	}
	
		
// 	//check the category for string3
// 	if (string3.startsWith("-f")) {
// 		fileName = string3.substring(2);
// 	}
// 	else if (string3.startsWith("-t")) {
// 		compareType = string3.substring(2);
// 	}
// 	else if (string3.startsWith("-s")) {
// 		sortType = string3.substring(2);
// 	}
// 	else {
		
// 		System.out.println("Pass in the correct argument types3");
// 	}
	

	
// 	//call readfile method to populate arrays
// 	try {
// 		readFile(fileName);
// //		for (Shape s :shapes)
// //			System.out.println(s);
// 		sortArr(shapes, sortType, compareType);
// 	} catch (FileNotFoundException e) {
// 		// TODO Auto-generated catch block
// 		e.printStackTrace();
// 	}
	
// 	//call sort algorithm
// 	//if(compareType.equalsIgnoreCase("h")){
// //		System.out.println("bubbleHeigh");
// 	//	sortArr(shapes, sortType, compareType);
// 	//}
// 	//sortArr(shapes, sortType, compareType);

// }




// private void readFile(String fileName) throws FileNotFoundException  {
// 	//declare variables
	
// 	int numOfShapes = 0;
// 	String[] allFile = null;

// 	//remove quotation from filenames
// 	if (fileName.contains("\"")){
// 		fileName = fileName.replace("\"", "");
// 	}
	
// 	//read from text file
// 	try {
// 			File file = new File(fileName);
// 		    Scanner myReader = new Scanner(file);

// 	      while (myReader.hasNextLine()) {
// 	        String line = myReader.nextLine();
// 			allFile = line.split(" ");
// 			numOfShapes = Integer.parseInt(allFile[0]); 
// 	      }
// 	      myReader.close();
// 	    } 
// 	catch (FileNotFoundException e) {
// 	      System.out.println("An error occurred.");
// 	      e.printStackTrace();
// 	    }
	
// 	//set the size of shapes objects
//     shapes = new Shape[numOfShapes];
    
//      //populate the shapes object and respective arrays based on the 3 types
// 	int j = 0;
// 	for (int i = 1 ; i < numOfShapes*3; i = i+3) {
		
// 		String className = allFile[i];
// 		double firstP =Double.parseDouble( allFile[i+1]); 
// 		double secondP = Double.parseDouble(allFile[i+2]); 

		
// 		if (className.equals("Cylinder")) {
// 			Cylinder cylinder = new Cylinder(firstP,secondP);
// 			shapes[j] = (Shape) cylinder;
			
// 			//[1 2, 3 4]
//  		}
		
// 		else if (className.equals("Cone")) {
// 			Cone cone = new Cone(firstP,secondP);
// 			shapes[j] = (Shape) cone;
// 		}
		
// 		else if (className.equals("Pyramid")) {
// 			Pyramid  pyramid = new Pyramid(firstP,secondP);
// 			shapes[j] = (Shape) pyramid;
// 		}
		
// 		else if (className.equals("TriangularPrism")) {
// 			TriangularPrism triangularPrism  = new TriangularPrism (firstP,secondP);
// 			shapes[j] = (Shape) triangularPrism;
// 		}
		
// 		else if (className.equals("PentagonalPrism")) {
// 			PentagonalPrism pentagonalPrism = new PentagonalPrism (firstP,secondP);
// 			shapes[j] = (Shape) pentagonalPrism;
// 		}
		
// 		else if (className.equals("SquarePrism")) {
// 			SquarePrism squarePrism = new SquarePrism (firstP,secondP);
// 			shapes[j] = (Shape) squarePrism;
// 		}
		
// 		else if (className.equals("OctagonalPrism")) {
// 			OctagonalPrism octagonalPrism  = new OctagonalPrism (firstP,secondP);
// 			shapes[j] = (Shape) octagonalPrism;
// 		}
		
// 		else {
// 			System.out.println("This is not a valid object."); 
// 		}
// 		j = j+1;
// 	}
			
		
// }		


// public void sortArr(Shape[] arr, String sortType, String compareType) {
// //height pass the array
// 	// volume and array pass array and object
// 	int lastIndex =  arr.length-1;
// 	long start = 0;
// 	long stop = 0;
	
// 	if(compareType.equalsIgnoreCase("h")) {
	
	
// 		if(sortType.equalsIgnoreCase("b")) {
// 			System.out.println(sortType);

// 			start = System.currentTimeMillis();
// 			BubbleSort.bubbleSort(arr);
// 			stop = System.currentTimeMillis();


			
// 		}
		
// 		else if(sortType.equalsIgnoreCase("s")) {
// 			start = System.currentTimeMillis();
// 			SelectionSort.selectionSort(arr);
// 			stop = System.currentTimeMillis();
// 		}
// 		else if(sortType.equalsIgnoreCase("i")) {
// 			start = System.currentTimeMillis();
// 			InsertionSort.insertionSort(arr);
// 			stop = System.currentTimeMillis();
				
// 		}
// 		else if(sortType.equalsIgnoreCase("m")) {
// 			start = System.currentTimeMillis();
// 			MergeSort.mergSort(arr, 0, lastIndex);
// 			stop = System.currentTimeMillis();
// 			}

// 		else if(sortType.equalsIgnoreCase("z")) {
// 			start = System.currentTimeMillis();
// 			HeapSort.heapSort(arr);
// 			stop = System.currentTimeMillis();
// 		}
// 		else {
// 			System.out.println("Invalid compare type1");
// 		}
// 	}
// 	else if(compareType.equalsIgnoreCase("v")) {
		
		
// 		if(sortType.equalsIgnoreCase("b")) {
// 			start = System.currentTimeMillis();
// 			BubbleSort.bubbleSort(arr, v);
// 			stop = System.currentTimeMillis();
// 		}
// 		else if(sortType.equalsIgnoreCase("s")) {
// 			start = System.currentTimeMillis();
// 			SelectionSort.selectionSort(arr, v);
// 			stop = System.currentTimeMillis();
// 		}
// 		else if(sortType.equalsIgnoreCase("i")) {
// 			start = System.currentTimeMillis();
// 			InsertionSort.insertionSort(arr, v);
// 			stop = System.currentTimeMillis();
// 		}
// 		else if(sortType.equalsIgnoreCase("m")) {
		
// 			int firstIndex = 0; 
// 			start = System.currentTimeMillis();
// 				MergeSort.mergSort(arr, firstIndex, lastIndex,v);
// 				stop = System.currentTimeMillis();
// 			}
// 		else if(sortType.equalsIgnoreCase("q")) {
// 			start = System.currentTimeMillis();
// 			QuickSort.quicksort(arr, v);
// 			stop = System.currentTimeMillis();
// 		}
// 		else if(sortType.equalsIgnoreCase("z")) {
// 			start = System.currentTimeMillis();
// 			HeapSort.heapSort(arr, v);
// 			stop = System.currentTimeMillis();

// 		}
// 		else {
// 			System.out.println("Invalid compare type2");
// 		}
// 	}
// 	else if(compareType.equalsIgnoreCase("a")) {
		
		
// 		if(sortType.equalsIgnoreCase("b")) {
// 			start = System.currentTimeMillis();

// 			BubbleSort.bubbleSort(arr, a);
// 			stop = System.currentTimeMillis();

// 		}
// 		else if(sortType.equalsIgnoreCase("s")) {
// 			start = System.currentTimeMillis();

// 			SelectionSort.selectionSort(arr, a);
// 			stop = System.currentTimeMillis();

// 		}
// 		else if(sortType.equalsIgnoreCase("i")) {
// 			start = System.currentTimeMillis();

// 			InsertionSort.insertionSort(arr, a);
// 			stop = System.currentTimeMillis();

// 		}
// 		else if(sortType.equalsIgnoreCase("m")) {
// 			start = System.currentTimeMillis();

// 			MergeSort.mergSort(arr, 0, lastIndex, a);
// 			stop = System.currentTimeMillis();

// 			}
// 		else if(sortType.equalsIgnoreCase("q")) {
// 			start = System.currentTimeMillis();
// 			QuickSort.quicksort(arr, a);
// 			stop = System.currentTimeMillis();
// 		}
// 		else if(sortType.equalsIgnoreCase("z")) {
// 			HeapSort.heapSort(arr, a);
// 		}
// 		else {
// 			System.out.println("Invalid compare type3");
// 		}
// 	}
// 	else {
// 		System.out.println("Invalid compare type4");
// 	}
// 	for(int i= 0 ; i <=1000 ; i++ ) {
// 		System.out.println(arr[i]);
// 	}
// 	System.out.println("Time complexity of: " + (stop-start));

	
// }
// }

package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import shape.CompareArea;
import shape.Shape;
import shape.CompareVolume;
import shape.Cone;
import shape.Cylinder;
import shape.OctagonalPrism;
import shape.PentagonalPrism;
import shape.Pyramid;
import shape.SquarePrism;
import shape.TriangularPrism;
<<<<<<< HEAD
=======
import shape.*;

>>>>>>> 7dd947fb4887fcf683dfb7de3eeff1dd2ac7d680
import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.HeapSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
<<<<<<< HEAD

public class Main {
	
	Shape shapes[];
	CompareArea a = new CompareArea();
	CompareVolume v = new CompareVolume();
=======
import algorithms.*;

public class Main{	
	  
	Shape shapes[]; // declare array of shapes
	
	CompareArea a = new CompareArea(); 
	CompareVolume v = new CompareVolume();
	
 
	// public Main() {
	
		
	// }

	public Main(String [] args) {
		super();
		readFromFile(args);
	}



//pass the args
public void readFromFile(String [] args) {
	
	String fileName = "";
	String compareType = "";
	String sortType = "";
	
	String string1 = "";
	String string2 = "";
	String string3 = ""; 

	if(args.length != 3) {
		System.out.println("Pass in the correct number of arguments");
		return;
	}
	else {
		string1 = args[0].toLowerCase();
		string2 = args[1].toLowerCase();
		string3 = args[2].toLowerCase();
	}

	//check the category for string1
	if (string1.startsWith("-f")) {
		fileName = string1.substring(2);
	}
	else if (string1.startsWith("-t")) {
		compareType = string1.substring(2);
	}
	else if (string1.startsWith("-s")) {
		sortType = string1.substring(2);
	}
	else {
		
		System.out.println("Pass in the correct argument types1");
	}
	

//check the category for string2
	if (string2.startsWith("-f")) {
		fileName = string2.substring(2);
	}
	else if (string2.startsWith("-t")) {
		compareType = string2.substring(2);
	}
	else if (string2.startsWith("-s")) {
		sortType = string2.substring(2);
	}
	else {
		
		System.out.println("Pass in the correct argument types2");
	}
	
		
	//check the category for string3
	if (string3.startsWith("-f")) {
		fileName = string3.substring(2);
	}
	else if (string3.startsWith("-t")) {
		compareType = string3.substring(2);
	}
	else if (string3.startsWith("-s")) {
		sortType = string3.substring(2);
	}
	else {
		
		System.out.println("Pass in the correct argument types3");
	}
	

	
	//call readfile method to populate arrays
	try {
		readFile(fileName);
//		for (Shape s :shapes)
//			System.out.println(s);
		sortArr(shapes, sortType, compareType);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//call sort algorithm
	//if(compareType.equalsIgnoreCase("h")){
//		System.out.println("bubbleHeigh");
	//	sortArr(shapes, sortType, compareType);
	//}
	//sortArr(shapes, sortType, compareType);

}




private void readFile(String fileName) throws FileNotFoundException  {
	//declare variables
	
	int numOfShapes = 0;
	String[] allFile = null;

	//remove quotation from filenames
	if (fileName.contains("\"")){
		fileName = fileName.replace("\"", "");
	}
	
	//read from text file
	try {
			File file = new File(fileName);
		    Scanner myReader = new Scanner(file);

	      while (myReader.hasNextLine()) {
	        String line = myReader.nextLine();
			allFile = line.split(" ");
			numOfShapes = Integer.parseInt(allFile[0]); 
	      }
	      myReader.close();
	    } 
	catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	
	//set the size of shapes objects
    shapes = new Shape[numOfShapes];
>>>>>>> 7dd947fb4887fcf683dfb7de3eeff1dd2ac7d680
    
	
	public Main(String[] args) {
		super();
		readFromFile(args);
	}

	// pass the args
	public void readFromFile(String[] args) {

		String fileName = "";
		String compareType = "";
		String sortType = "";

		String string1 = "";
		String string2 = "";
		String string3 = "";

		if (args.length != 3) {
			System.out.println("Pass in the correct number of arguments");
			return;
		} else {
			string1 = args[0].toLowerCase();
			string2 = args[1].toLowerCase();
			string3 = args[2].toLowerCase();
		}

		// check the category for string1
		if (string1.startsWith("-f")) {
			fileName = string1.substring(2);
		} else if (string1.startsWith("-t")) {
			compareType = string1.substring(2);
		} else if (string1.startsWith("-s")) {
			sortType = string1.substring(2);
		} else {

			System.out.println("Pass in the correct argument types1");
		}

		// check the category for string2
		if (string2.startsWith("-f")) {
			fileName = string2.substring(2);
		} else if (string2.startsWith("-t")) {
			compareType = string2.substring(2);
		} else if (string2.startsWith("-s")) {
			sortType = string2.substring(2);
		} else {

			System.out.println("Pass in the correct argument types2");
		}

		// check the category for string3
		if (string3.startsWith("-f")) {
			fileName = string3.substring(2);
		} else if (string3.startsWith("-t")) {
			compareType = string3.substring(2);
		} else if (string3.startsWith("-s")) {
			sortType = string3.substring(2);
		} else {

			System.out.println("Pass in the correct argument types3");
		}

		// call readfile method to populate arrays
		try {
			readFile(fileName);
			sortArr(shapes, sortType, compareType);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	private void readFile(String fileName) throws FileNotFoundException {
		int numOfShapes = 0;
		String[] allFile = null;

		// remove quotation from filenames
		if (fileName.contains("\"")) {
			fileName = fileName.replace("\"", "");
		}

		try {
			File file = new File(fileName);
			Scanner myReader = new Scanner(file);

			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				allFile = line.split(" ");
				numOfShapes = Integer.parseInt(allFile[0]);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		shapes = new Shape[numOfShapes];

		int j = 0;
		for (int i = 1; i < numOfShapes * 3; i = i + 3) {

			String className = allFile[i];
			double firstP = Double.parseDouble(allFile[i + 1]);
			double secondP = Double.parseDouble(allFile[i + 2]);

			if (className.equals("Cylinder")) {
				Cylinder cylinder = new Cylinder(firstP, secondP);
				shapes[j] = (Shape) cylinder;
			} else if (className.equals("Cone")) {
				Cone cone = new Cone(firstP, secondP);
				shapes[j] = (Shape) cone;
			} else if (className.equals("Pyramid")) {
				Pyramid pyramid = new Pyramid(firstP, secondP);
				shapes[j] = (Shape) pyramid;
			} else if (className.equals("TriangularPrism")) {
				TriangularPrism triangularPrism = new TriangularPrism(firstP, secondP);
				shapes[j] = (Shape) triangularPrism;
			} else if (className.equals("PentagonalPrism")) {
				PentagonalPrism pentagonalPrism = new PentagonalPrism(firstP, secondP);
				shapes[j] = (Shape) pentagonalPrism;
			} else if (className.equals("SquarePrism")) {
				SquarePrism squarePrism = new SquarePrism(firstP, secondP);
				shapes[j] = (Shape) squarePrism;
			} else if (className.equals("OctagonalPrism")) {
				OctagonalPrism octagonalPrism = new OctagonalPrism(firstP, secondP);
				shapes[j] = (Shape) octagonalPrism;
			} else {
				System.out.println("This is not a valid object.");
			}
			j = j + 1;
		}
	}

	public void sortArr(Shape[] arr, String sortType, String compareType) {
		int lastIndex = arr.length - 1;
		long start = 0;
		long stop = 0;

		if (compareType.equalsIgnoreCase("h")) {
			if (sortType.equalsIgnoreCase("b")) {
				start = System.currentTimeMillis();
				BubbleSort.bubbleSort(arr);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("s")) {
				start = System.currentTimeMillis();
				SelectionSort.selectionSort(arr);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("i")) {
				start = System.currentTimeMillis();
				InsertionSort.insertionSort(arr);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("m")) {
				start = System.currentTimeMillis();
				MergeSort.mergSort(arr, 0, lastIndex);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("z")) {
				start = System.currentTimeMillis();
				HeapSort.heapSort(arr);
				stop = System.currentTimeMillis();
			} else {
				System.out.println("Invalid compare type1");
			}
		} else if (compareType.equalsIgnoreCase("v")) {
			if (sortType.equalsIgnoreCase("b")) {
				start = System.currentTimeMillis();
				BubbleSort.bubbleSort(arr, v);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("s")) {
				start = System.currentTimeMillis();
				SelectionSort.selectionSort(arr, v);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("i")) {
				start = System.currentTimeMillis();
				InsertionSort.insertionSort(arr, v);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("m")) {
				int firstIndex = 0;
				start = System.currentTimeMillis();
				MergeSort.mergSort(arr, firstIndex, lastIndex, v);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("q")) {
				start = System.currentTimeMillis();
				QuickSort.quicksort(arr, v);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("z")) {
				start = System.currentTimeMillis();
				HeapSort.heapSort(arr, v);
				stop = System.currentTimeMillis();
			} else {
				System.out.println("Invalid compare type2");
			}
		} else if (compareType.equalsIgnoreCase("a")) {
			if (sortType.equalsIgnoreCase("b")) {
				start = System.currentTimeMillis();
				BubbleSort.bubbleSort(arr, a);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("s")) {
				start = System.currentTimeMillis();
				SelectionSort.selectionSort(arr, a);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("i")) {
				start = System.currentTimeMillis();
				InsertionSort.insertionSort(arr, a);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("m")) {
				start = System.currentTimeMillis();
				MergeSort.mergSort(arr, 0, lastIndex, a);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("q")) {
				start = System.currentTimeMillis();
				QuickSort.quicksort(arr, a);
				stop = System.currentTimeMillis();
			} else if (sortType.equalsIgnoreCase("z")) {
				HeapSort.heapSort(arr, a);
			} else {
				System.out.println("Invalid compare type3");
			}
		} else {
			System.out.println("Invalid compare type4");
		}
		for (int i = 0; i <= 1000; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Time complexity of: " + (stop - start));
	}
}
<<<<<<< HEAD
=======
}		


public void sortArr(Shape[] arr, String sortType, String compareType) {
//height pass the array
	// volume and array pass array and object
	int lastIndex =  arr.length-1;
	long start = 0;
	long stop = 0;
	
	if(compareType.equalsIgnoreCase("h")) {
	
	
		if(sortType.equalsIgnoreCase("b")) {
			System.out.println(sortType);

			start = System.currentTimeMillis();
			BubbleSort.bubbleSort(arr);
			stop = System.currentTimeMillis();


			
		}
		
		else if(sortType.equalsIgnoreCase("s")) {
			start = System.currentTimeMillis();
			SelectionSort.selectionSort(arr);
			stop = System.currentTimeMillis();
		}
		else if(sortType.equalsIgnoreCase("i")) {
			start = System.currentTimeMillis();
			InsertionSort.insertionSort(arr);
			stop = System.currentTimeMillis();
				
		}
		else if(sortType.equalsIgnoreCase("m")) {
			start = System.currentTimeMillis();
			MergeSort.mergSort(arr, 0, lastIndex);
			stop = System.currentTimeMillis();
			}

		else if(sortType.equalsIgnoreCase("z")) {
			start = System.currentTimeMillis();
			HeapSort.heapSort(arr);
			stop = System.currentTimeMillis();
		}
		else {
			System.out.println("Invalid compare type1");
		}
	}
	else if(compareType.equalsIgnoreCase("v")) {
		
		
		if(sortType.equalsIgnoreCase("b")) {
			start = System.currentTimeMillis();
			BubbleSort.bubbleSort(arr, v);
			stop = System.currentTimeMillis();
		}
		else if(sortType.equalsIgnoreCase("s")) {
			start = System.currentTimeMillis();
			SelectionSort.selectionSort(arr, v);
			stop = System.currentTimeMillis();
		}
		else if(sortType.equalsIgnoreCase("i")) {
			start = System.currentTimeMillis();
			InsertionSort.insertionSort(arr, v);
			stop = System.currentTimeMillis();
		}
		else if(sortType.equalsIgnoreCase("m")) {
		
			int firstIndex = 0; 
			start = System.currentTimeMillis();
				MergeSort.mergSort(arr, firstIndex, lastIndex,v);
				stop = System.currentTimeMillis();
			}
		else if(sortType.equalsIgnoreCase("q")) {
			start = System.currentTimeMillis();
			QuickSort.quicksort(arr, v);
			stop = System.currentTimeMillis();
		}
		else if(sortType.equalsIgnoreCase("z")) {
			start = System.currentTimeMillis();
			HeapSort.heapSort(arr, v);
			stop = System.currentTimeMillis();

		}
		else {
			System.out.println("Invalid compare type2");
		}
	}
	else if(compareType.equalsIgnoreCase("a")) {
		
		
		if(sortType.equalsIgnoreCase("b")) {
			start = System.currentTimeMillis();

			BubbleSort.bubbleSort(arr, a);
			stop = System.currentTimeMillis();

		}
		else if(sortType.equalsIgnoreCase("s")) {
			start = System.currentTimeMillis();

			SelectionSort.selectionSort(arr, a);
			stop = System.currentTimeMillis();

		}
		else if(sortType.equalsIgnoreCase("i")) {
			start = System.currentTimeMillis();

			InsertionSort.insertionSort(arr, a);
			stop = System.currentTimeMillis();

		}
		else if(sortType.equalsIgnoreCase("m")) {
			start = System.currentTimeMillis();

			MergeSort.mergSort(arr, 0, lastIndex, a);
			stop = System.currentTimeMillis();

			}
		else if(sortType.equalsIgnoreCase("q")) {
			start = System.currentTimeMillis();
			QuickSort.quicksort(arr, a);
			stop = System.currentTimeMillis();
		}
		else if(sortType.equalsIgnoreCase("z")) {
			HeapSort.heapSort(arr, a);
		}
		else {
			System.out.println("Invalid compare type3");
		}
	}
	else {
		System.out.println("Invalid compare type4");
	}
	for(int i= 0 ; i <=1000 ; i++ ) {
		System.out.println(arr[i]);
	}
	System.out.println("Time complexity of: " + (stop-start));

	
}
}
>>>>>>> 7dd947fb4887fcf683dfb7de3eeff1dd2ac7d680
