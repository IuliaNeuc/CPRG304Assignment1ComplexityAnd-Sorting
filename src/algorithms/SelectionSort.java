package algorithms;

import java.util.Comparator;


public class SelectionSort
{
    //Selection sort using the natural ordering of elements - Comparable
    public static <T extends Comparable<? super T>> void selectionSort(T[] array)    
    {
        int x = array.length;
        
        //If the array has only one element, it is already sorted, no need to sort
        if(x == 1) return;

        for(int i = 0; i < x; i++)
        {
            T large = array[i]; // Assume the current element is the largest 

            int largeIndex = i; //Track teh index of the largest element
            

            //Iterate through the remaining unsorted elements to find the largest element
            for(int j = i; j < x; j++)
            {
                int res = large.compareTo(array[j]); // Compare element for natural order
                if(res < 0)
                {
                    large = array[j]; //Update the largest element.
                    largeIndex = j; // update the index of the largest element.
                }
            }

            // // After the inner loop, 'large' contains the largest element in the remaining unsorted portion
            int res2 = large.compareTo(array[i]);

            // If 'large' is greater than the current element at index 'i', swap them
            if(res2 > 0 )
            {
                T temp = array[i];
                array[i] = array[largeIndex];
                array[largeIndex] = temp;
            }
        }
    }

    //Selection sort with a custom Comparator
    public static <T> void selectionSort(T[] array, Comparator<? super T> c)
    {
        int x = array.length;
        if (x == 1) return; // If the array has only one element, it is already sorted.

        for(int i = 0 ; i < x; i++)
        {
            T large = array[i];
            int largeIndex = i;

            for(int j = i; j < x; j++)
            {
                // Compare elements using the custom Comparator.
                int res = c.compare(large, array[j]);

                if(res < 0)
                {
                    large = array[j];
                    largeIndex = j;
                }

            }

            int res2 = c.compare(large, array[i]);
            if(res2 > 0)
            {
                T temp =  array[i];
                array[i] = array[largeIndex];
                array[largeIndex] = temp;
            }
        }
    }
}



