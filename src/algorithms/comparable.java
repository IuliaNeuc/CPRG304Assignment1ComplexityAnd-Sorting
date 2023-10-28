// package algorithms;
// import java.util.Arrays;

// import shape.*;




// public class comparable {
//     public static <T extends Shape> void bubbleSort(T[] array, String compareType) {
//         int arraySize = array.length;

//         for (int i = arraySize; i > 0; i--) {
//             for (int j = 0; j < i - 1; j++) {
//                 if (compare(array[j], array[j + 1], compareType) > 0) {
//                     swap(array, j, j + 1);
//                 }
//             }
//         }
//     }

//     public static <T extends Shape> void heapSort(T[] arr, String compareType) {
//         int n = arr.length;

//         for (int i = n / 2 - 1; i >= 0; i--) {
//             heapify(arr, n, i, compareType);
//         }

//         for (int i = n - 1; i > 0; i--) {
//             swap(arr, 0, i);
//             heapify(arr, i, 0, compareType);
//         }
//     }

//     private static <T extends Shape> void heapify(T[] arr, int n, int i, String compareType) {
//         int largest = i;
//         int left = 2 * i + 1;
//         int right = 2 * i + 2;

//         if (left < n && compare(arr[left], arr[largest], compareType) > 0) {
//             largest = left;
//         }

//         if (right < n && compare(arr[right], arr[largest], compareType) > 0) {
//             largest = right;
//         }

//         if (largest != i) {
//             swap(arr, i, largest);
//             heapify(arr, n, largest, compareType);
//         }
//     }

//     public static <T extends Shape> void insertionSort(T[] arr, String compareType)
//     {
//         //Outer loop for iterating through the array
//         for(int i = 0; i < arr.length - 1; i++)
//         {
//             //Inner loop for comparing and swapping adjacent elements
//             for(int j = i; j >=0; j--)
//             {
//                 //Compare adjacent elements and swap if they are not in the order
//                 if(compare(arr[j], arr[j+1], compareType) > 0)
//                 {
//                     //Swap the elements
//                     // T tempVal;
//                     // tempVal = arr[j + 1];
//                     // arr[j + 1] = arr[j];
//                     // arr[j] = tempVal;

//                     swap(arr, j, j + 1);
//                 }
//                 //If no swaps are needed in this pass, break out of the inner loop
//                 else
//                 {
//                     break;
//                 }
//             }
//         }
//     }

//     public static <T extends Shape> void mergeSort(T[] arr, int firstIndex, int lastIndex, String compareType)
//     {
//         if(firstIndex < lastIndex)
//         {
//             //calculate the middle index of the array
//             int mid = (firstIndex + lastIndex) / 2;

//             //Recursively call merge sort on the left and right halves
//             mergeSort(arr, firstIndex, mid, compareType);
//             mergeSort(arr, mid + 1, lastIndex, compareType);

//             //Merge the sorted halves
//             merg(arr, firstIndex, mid, lastIndex, compareType);
//         }
//     }

//     //A method to merge two halves of an array
//     static <T extends Shape> void merg(T[] arr, int firstIndex,  int middle, int lastIndex, String compareType)
//     {
        
//         T[] leftArray = Arrays.copyOfRange(arr, firstIndex, middle + 1);
//         T[] rightArray = Arrays.copyOfRange(arr, middle + 1, lastIndex + 1);

 

//         //Initialize indexes for left and right arrays
//         int leftIndex = 0;
//         int rightIndex = 0;

//         //Initialize current index for merging
//         int currentIndex = firstIndex;

//         //Merge left and right arrays back into the original array
//         /**
//          * It merges the left and right arrays back into the original
//          * array using the natural ordering of elements (using compareTo). 
//          * It compares elements from both arrays and places them in ascending 
//          * order in the original array.
//          */
//         while(leftIndex < leftArray.length && rightIndex < rightArray.length)
//         {
//             if (compare(leftArray[leftIndex], rightArray[rightIndex], compareType) <= 0)
//             {
//                 arr[currentIndex] = leftArray[leftIndex];
//                 leftIndex++;
//             }
//             else
//             {
//                 arr[currentIndex] = rightArray[rightIndex];
//                 rightIndex++;
//             }
//             currentIndex++;
//         }

//         // Copy any remaining elements from the left array
//         while (leftIndex < leftArray.length)        
//             arr[currentIndex++] = leftArray[leftIndex++];
        

//         // Copy any remaining elements from the right array
//         while(rightIndex < rightArray.length)        
//             arr[currentIndex++] = rightArray[rightIndex++];
        
//     }

        
//     public static <T extends Shape> void quickSort(T[] arr, String compareType)
//     {
//         quickSort(arr, 0, arr.length - 1, compareType);
//     }

//     //Recursive quick sort method
//     public static <T extends Shape> void quickSort(T[] arr, int low, int high, String compareType)
//     {
//         if(low < high)
//         {
//             //Partition the array and get the pivot index
//             int index = partition(arr, low, high, compareType);

//             //Recursively sort the left and right subarrays
//             quickSort(arr, low, index -1, compareType);
//             quickSort(arr,index + 2, high, compareType);
//         }
//     }

//     //Partitioning the array
//     public static < T extends Shape> int partition(T[] arr, int low, int high, String compareType)
//     {
//         //Choose the pivot as the last element
//         T pivot = arr[high];

//         //Initialize the index of the smaller element
//         int i = low;

//         for(int j = low; j < high; j++)
//         {
//             //If the current element is greater than the pivot, swap elements
//             if(compare(arr[j], pivot, compareType) < 0)
//             {
//                 // T tempVal = arr[j];
//                 // arr[j] = arr[i];
//                 // arr[i] = tempVal;

//                 swap(arr, i, j);
//                 i++; //Move the index of the smaller element
//             }
//         }

//         //Swap the pivot element with the element at the correct position
//         // T tempVal = arr[i];
//         // arr[i] = arr[high];
//         // arr[high] = tempVal;

//         swap(arr, high, i);

//         return i; // return the index of the pivot element
//     }

//     public static <T extends Shape> void selectionSort(T[] array, String compareType)
//     {
//         int x = array.length;
        
//         //If the array has only one element, it is already sorted, no need to sort
//         if(x == 1) return;

//         for(int i = 0; i < x; i++)
//         {
//             T large = array[i]; // Assume the current element is the largest 

//             int largeIndex = i; //Track teh index of the largest element
            

//             //Iterate through the remaining unsorted elements to find the largest element
//             for(int j = i; j < x; j++)
//             {
//                 int res = compare(large, array[j], compareType); // Compare element for natural order
//                 if(res > 0)
//                 {
//                     large = array[j]; //Update the largest element.
//                     largeIndex = j; // update the index of the largest element.
//                 }
//             }

//             // // After the inner loop, 'large' contains the largest element in the remaining unsorted portion
//             int res2 = compare(large, array[i], compareType);

//             // If 'large' is greater than the current element at index 'i', swap them
//             if(res2 < 0 )
//             {              

//                 swap(array, i, largeIndex);
//             }
//         }
//     }

//     private static <T extends Shape> int compare(T a, T b, String compareType) {
//         switch (compareType) {
//             case "h":
//                 return a.compareTo(b);
//             case "v":
//                 return new CompareVolume().compare(a, b);
//             case "a":
//                 return new CompareArea().compare(a, b);
//             default:
//                 throw new IllegalArgumentException("Invalid compare type");
//         }
//     }

//     private static <T> void swap(T[] arr, int i, int j) {
//         T temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }
// }

