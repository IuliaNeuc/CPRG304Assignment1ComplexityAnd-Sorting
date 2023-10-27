package algorithms;


import java.util.Comparator;

import shape.*;
public class BubbleSort
{
    /**
     * This code provides two implementations of the bubble sort algorithm: 
     * one that works with objects that implement the Comparable interface
     *  (for natural order sorting) and another that accepts a custom comparator 
     * for more flexible sorting. The code also measures and prints the time 
     * complexity of the sorting process for performance analysis.
     */

    /**
     * The <? super T> is a bounded wildcard in Java used in the context of generics.
     *  It's a way to specify that a generic type parameter (T in this case) can represent 
     * any type that is a superclass of T or T itself. This construct allows for greater
     * flexibility when working with generics, particularly when you need to handle types
     * that are related by inheritance.
     */
    
    // Implementation of bubble sort for objects that implement the Comparable interface
    public static <T extends Shape > void bubbleSort(T[] array, String compareType)
    {
        int arraySize = array.length;
        

        // outer loop that wil iterate through the array from the beginning to the second to last element
        for(int i = arraySize; i > 0; i--)
        {
            //Inner loop that will iterate through the array from the beginning to the unsorted portion
            for(int j = 0; j < i - 1; j++) {
                if (compareType == "h") {;
                    int res = (array[j]).compareTo(array[j + 1]); //compare adjacent elements in the array
                    if (res > 0) { // if the current element is greater than the next one, swap them
                        T temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                } else if (compareType == "v") {
                    CompareVolume cv = new CompareVolume();
                    int res = cv.compare(array[j], array[j + 1]);
                    if (res > 0) {
                        T temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                } else if (compareType == "a") {
                    
                    CompareArea ca = new CompareArea();
                    int res = ca.compare(array[j], array[j + 1]);
                    if (res > 0) {
                        T temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                } else {
                    System.out.println("Invalid compare type");
                }
            }
        }
    }
    
    //Implementation of the bubble sort with a custom comparator 
    public static <T> void  bubbleSort(T[] array, Comparator<? super T> c) {
        int arraySize = array.length;

        // outer loop that wil iterate through the array from the beginning to the second to last element
        for(int i = 0; i < arraySize - 1; i++)
        {
            //Inner loop that will iterate through the array from the beginning to the unsorted portion
            for (int j = 0; j < arraySize - 1 - i; j++)
            {
                //compare adjacent elements using the provided comparator
                int res = c.compare(array[j], array[j + 1]);
                //If current element greater than the next one, swap them.
                if (res < 0 )
                {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}