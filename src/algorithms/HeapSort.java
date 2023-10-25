package algorithms;

import java.util.Comparator;


public class HeapSort
{
    /**This code provides two implementations of the heap sort algorithm,
     *  one for objects that implement Comparable and another for custom 
     * comparators. The code builds a max heap and then sorts the elements
     *  in ascending order. */

    
    //Implementation of Heap sort for objects that implement the Comparable interface
    public static <T extends Comparable<? super T>> void heapSort(T[] arr)
    {
        int n = arr.length;


        //Build a max hea from the input array
        for(int i = n / 2 - 1; i >=0; i--)
        {
            heapify(arr, n, i);
        }
        
        //Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--)
        {
            //Swap the maximum element(root) with the last element
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            //Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    //Helper function to maintain the max heap property
    static<T extends Comparable<? super T>> void heapify(T[] arr, int n, int i)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        //Compare the left child with the largest element
        if(left < n && arr[left].compareTo(arr[largest]) > 0)
        {
            largest = left;
        }

        //Compare the right child with the largest element
        if(right < n && arr[right].compareTo(arr[largest]) > 0)
        {
            largest = right;
        }

        // If the largest element is not the current element swap them and recursively hepify the affected subtree
        if(largest != i)
        {
            T tempVal = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tempVal;

            heapify(arr, n, largest);
        }
    }



    //Implementation of the heap sort with a custom comparator
    public static <T> void heapSort(T[] arr, Comparator<? super T> c)
    {
        int n = arr.length;

        //Build the max heap from the input array using the custom comparator.
        for(int i = n/2 - 1; i >= 0; i--)
        {
            heapify(arr, n, i, c);
        }

        //Extract elements from the heap one by one
        for(int i = n - 1; i > 0; i--)
        {
            //swap the maximum element with the last element 
            T temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            //Call max heapify on the reduced heap using the custom comparator
            heapify(arr, i, 0, c);
        }
    }

    //Helper function to maintain max heap property using the custom comparator
    static <T> void heapify(T[] arr, int n, int i, Comparator< ? super T> c)
    {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        //compare the left child with the largest element using a custom comparator
        if (left < n && c.compare(arr[left], arr[largest]) > 0)
        {
            largest = left;
        }

        //Compare the right child to the largest element using a custom comparator
        if(right < n && c.compare(arr[right], arr[largest]) > 0)
        {
            largest = right;
        }

        //If the largest element is not the current element , swap them
        //and recursively heapify the affected subtree
        if(largest != i)
        {
            T tempVal = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tempVal;

            heapify(arr, n, largest, c);
        }
    }
}
