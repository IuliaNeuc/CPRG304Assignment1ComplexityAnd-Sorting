package algorithms;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import shape.CompareArea;

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
    public static <T extends Comparable<? super T>> void bubbleSort(T[] array)
    {
        int x = array.length;
        if(x == 0) return; // if the array is empty, then no need to sort it

        long start, stop;

        start = System.currentTimeMillis();// Record time for measuring time complexity
        
        // outer loop that wil iterate through the array from the beginning to the second to last element
        for(int i =0; i < x-1; i++)
        {
            //Inner loop that will iterate through the array from the beginning to the unsorted portion
            for(int j = 0; j < x-1-i; j++)
            {
                //compare adjacent elements in the array
                int res = array[j].compareTo(array[i+1]);
                // if the current element is greater than the next one, swap them
                if(res<0)
                {
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        stop = System.currentTimeMillis(); // record the stop time
        System.out.println("Time complexity of: " + (stop - start));

    }
    
    //Implementation of the bubble sort with a custom comparator 
    public static <T> void  bubbleSort(T[] array, Comparator<? super T> c)
    {
        int x = array.length;
        long start, stop;

        start = System.currentTimeMillis(); //  record the start time for measuring time complexity

        // outer loop that wil iterate through the array from the beginning to the second to last element
        for(int i = 0; i < x-1; i++)
        {
            //Inner loop that will iterate through the array from the beginning to the unsorted portion
            for (int j = 0; j < x-1-i; j++)
            {
                //compare adjacent elements using the provided comparator
                int res = c.compare(array[j], array[j+1]);
                //If current element greater than the next one, swap them.
                if (res < 0 )
                {
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        stop = System.currentTimeMillis();//Record the stop time
        System.out.println("Time complexity of: " + (stop - start));
    }
}