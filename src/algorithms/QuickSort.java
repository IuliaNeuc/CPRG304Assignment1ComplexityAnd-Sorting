package algorithms;

import java.util.Comparator;

public class QuickSort
{
    //Quick sort using the natural ordering of elements (Comparable)
    public static <T extends Comparable<? super T>> void quickSort(T[] arr)
    {
        quickSort(arr, 0, arr.length - 1);
    }

    //Recursive quick sort method
    public static <T extends Comparable<? super T>> void quickSort(T[] arr, int low, int high)
    {
        if(low < high)
        {
            //Partition the array and get the pivot index
            int index = partition(arr, low, high);

            //Recursively sort the left and right subarrays
            quickSort(arr, low, index -1);
            quickSort(arr,index + 2, high);
        }
    }

    //Partitioning the array
    public static < T extends Comparable<? super T>> int partition(T[] arr, int low, int high)
    {
        //Choose the pivot as the last element
        T pivot = arr[high];

        //Initialize the index of the smaller element
        int i = low;

        for(int j = low; j < high; j++)
        {
            //If the current element is greater than the pivot, swap elements
            if(arr[j].compareTo(pivot) > 0)
            {
                T tempVal = arr[j];
                arr[j] = arr[i]
                arr[i] = tempVal;
                i++; //Move the index of the smaller element
            }
        }

        //Swap the pivot element with the element at the correct position
        T tempVal = arr[i];
        arr[i] = arr[high];
        arr[high] = tempVal;

        return i; // return the index of the pivot element
    }


    //Quick sort with a custom Comparator
    public static <T extends Comparable<? super T>> void quicksort(T[] arr, Comparator<? super T> c) 
    {
		quicksort(arr, 0, arr.length - 1, c);
	}

    //Recursive Quick sort method with a custom Comparator
    public static <T extends Comparable<? super T>> void quicksort(T[] arr, int low, int high, Comparator<? super T> c)
    {
		if(low < high) {
			int index = partition(arr, low, high, c);
			quicksort(arr, low, index - 1, c);
			quicksort(arr, index + 1, high, c);
		}
	}

    //Partitioning the array with a custom comparator
    public static <T extends Comparable<? super T>> int partition(T[] arr, int low, int high, Comparator<? super T> c) {
		T pivot = arr[high];
		int i = low;
		for(int j = low; j < high; j++) {
			if(c.compare(arr[j], pivot) > 0) {
				T tempValue = arr[j];
				arr[j] = arr[i];
				arr[i] = tempValue;
				i++;
			}
		}
		T tempValue = arr[i];
		arr[i] = arr[high];
		arr[high] = tempValue;
		return i;
	}


}