package algorithms;

import java.util.Comparator;


public class MergeSort
{
    //Generic merge sort for arrays of Comparable elements
    public static <T extends Comparable<? super T>> void mergSort(T[] arr, int firstIndex, int lastIndex)
    {
        if(firstIndex < lastIndex)
        {
            //calculate the middle index of the array
            int mid = (firstIndex + lastIndex) / 2;

            //Recursively call merge sort on the left and right halves
            mergSort(arr, firstIndex, mid);
            mergSort(arr, mid + 1, lastIndex);

            //Merge the sorted halves
            merg(arr, firstIndex, mid, lastIndex);
        }
    }

    //A method to merge two halves of an array
    static <T extends Comparable<? super T>> void merg(T[] arr, int firstIndex,  int middle, int lastIndex)
    {
        //Create left and right temporary arrays
        T[] leftArray = (T[])  new Comparable[middle - firstIndex + 1];
        T[] rightArray = (T[]) new Comparable[lastIndex - middle];

        //Copy data from the original array to the left and right arrays
        for (int i = 0; i < leftArray.length; ++i)
        {
            leftArray[i] = arr[firstIndex + i];
        }

        for (int i = 0; i < rightArray.length; ++i)
        {
            rightArray[i] = arr[middle + 1 + i];            
        }

        //Initialize indexes for left and right arrays
        int leftIndex = 0;
        int rightIndex = 0;

        //Initialize current index for merging
        int currentIndex = firstIndex;

        //Merge left and right arrays back into the original array
        /**
         * It merges the left and right arrays back into the original
         * array using the natural ordering of elements (using compareTo). 
         * It compares elements from both arrays and places them in ascending 
         * order in the original array.
         */
        while(leftIndex < leftArray.length && rightIndex < rightArray.length)
        {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) >= 0)
            {
                arr[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            else
            {
                arr[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        // Copy any remaining elements from the left array
        while (leftIndex < leftArray.length)        
            arr[currentIndex++] = leftArray[leftIndex++];
        

        // Copy any remaining elements from the right array

        while(rightIndex < rightArray.length)        
            arr[currentIndex++] = rightArray[rightIndex++];
        

        while(rightIndex < rightArray.length)
        {
            arr[currentIndex++] = rightArray[rightIndex++];
        }

    }
    



    //Merge sort for arrays of elements with a custom Comparator
    public static <T> void mergSort(T[] arr, int firstIndex, int lastIndex, Comparator<? super T> c)
    {
        if (firstIndex == lastIndex)
                 return;


        if (firstIndex < lastIndex)
        {
            if (lastIndex - firstIndex < 1)
            {
                int middle = (firstIndex + lastIndex)/2;

                //Recursively call merge sort on the left and right halves
                mergSort(arr, firstIndex, middle, c);
                mergSort(arr, middle + 1, lastIndex, c);

                //Merge the sorted halves using the custom Comparator
                merg(arr, firstIndex, middle, lastIndex, c);
            }
        } 

    }

    // Merge two halves of an array using a custom Comparator
    static <T> void merg(T[] arr, int firstIndex, int middle, int lastIndex, Comparator<? super T> c)
    {
        // Create left and right temporary arrays
        T[] leftArray = (T[]) new Comparator[middle - firstIndex + 1];
        T[] rightArray = (T[]) new Comparator[lastIndex - middle];

        // Copy data from the original array to the left and right arrays
        for (int i = 0; i < leftArray.length; ++i)
        {
            leftArray[i] = arr[firstIndex + i];
        }

        for ( int i = 0; i < rightArray.length; ++i)
        {
            rightArray[i] = arr[middle + 1 + i];

            // Initialize indices for left and right arrays
            int leftIndex = 0;
            int rightIndex = 0;

            // Initialize the current index for merging
            int currentIndex = firstIndex;

            // Merge the left and right arrays back into the original array using the custom Comparator
             /**
              * It merges the left and right arrays back into the original
              * array using the natural ordering of elements (using compare()). 
              * It compares elements from both arrays and places them in ascending 
              * order in the original array.
             */
            while (leftIndex < leftArray.length && rightIndex < rightArray.length)
            {
                if(c.compare(leftArray[leftIndex], rightArray[rightIndex]) <= 0)
                {
                    arr[currentIndex] = leftArray[leftIndex];
                    leftIndex++;
                }
                else
                {
                    arr[currentIndex] = rightArray[rightIndex];
                    rightIndex++;
                }
                currentIndex++;
            }

            // Copy any remaining elements from the left array
            while(leftIndex < leftArray.length)
            {
               arr[currentIndex++] = leftArray[leftIndex++];
            }

           // Copy any remaining elements from the right array
           while(rightIndex < rightArray.length)
           {
              arr[currentIndex++] = rightArray[rightIndex++];
           }
            
        }


    }
}