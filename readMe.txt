- Assignment 1 Complexity and Sorting is about reading large text files, converting the data to objects (shapes) using abstraction, then sorting the shapes by an attribute through a selected sorting algorithm using comparator and comparable.

- App.java, ReadFileClass.java, and Utility.java are located in /src/application.

- App.java
This class is the main class of the program where it processes command line args, calls the read file method, selects which algorithm to sort a selected shape dimension. It then prints the output of the sorted array and the time it took to execute.

- ReadFileClass.java
This class has the file reading logic for the project. We assume the text file only has one line. The class iterates over the text file, sorts and creates shape objects, then adds them to Shape[] shapeArray.

- Uility.java
this class holds all of the sorting algorithms. It uses comparable and comparator methods to compare between two shape object attributes.

- Shape.java, CompareArea.java, CompareVolume.java, and the child shape classes are located in /src/shape.

- Shape.java
This class is the parent class of the different shape classes. It has a constructor for shape, getter and setter methods for each dimension, overrides for compare and compareTo methods, and a toString method.

- CompareArea.java
This class implements Comparator<Shape> and compares the area of of two different base areas of shape objects using comparator.

- CompareVolume.java
This class implements Comparator<Shape> and compares the area of of two different volumes of shape objects using comparator.