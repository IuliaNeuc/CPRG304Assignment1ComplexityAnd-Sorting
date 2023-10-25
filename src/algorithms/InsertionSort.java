package algorithms;

import java.util.Comparator;

public class InsertionSort
{
    /**
     * InsertionSort(T[] arr) is a generic method for
     *  sorting an array of T elements. It uses the natural 
     * ordering of elements (using compareTo) to compare and sort them. 
     * */


    //Insertion sort for arrays of Comparable elements
    public static <T extends Comparable < ? super T>> void insertionSort(T[] arr)
    {
        //Outer loop for iterating through the array
        for(int i = 0; i < arr.length - 1; i++)
        {
            //Inner loop for comparing and swapping adjacent elements
            for(int j = i; j >=0; j--)
            {
                //Compare adjacent elements and swap if they are not in the order
                if(arr[j].compareTo(arr[j + 1]) < 0)
                {
                    //Swap the elements
                    T tempVal;
                    tempVal = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tempVal;
                }
                //If no swaps are needed in this pass, break out of the inner loop
                else
                {
                    break;
                }
            }
        }
    }

    /**
     * InsertionSort(T[] arr, Comparator<? super T> c) is a generic method for sorting 
     * an array of T elements using a custom Comparator c for comparisons.
     */

   
    // Insertion sort for arrays with a custom Comparator
    public static <T extends Comparable < ? super T>> void insertionSort(T[] arr, Comparator<? super T>c)
    {
        //Outer loop for iterating through the array 
        for(int i = 0 ; i < arr.length - 1; i++)
        {
            //Inner loop for comparing and swapping adjacent elements
            for(int j = i; j >= 0; j--)
            {
                //Compare adjacent elements using custom Comparator and swapping them in case they are not in the correct order
                if(c.compare(arr[j], arr[j+1]) < 0)
                {
                    T tempVal;
                    tempVal = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tempVal;
                }
                //If no swaps are needed , break out of inner loop 
                else
                {
                    break;
                }                
            }
        }
    }
}