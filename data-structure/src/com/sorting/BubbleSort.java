package src.com.sorting;

import java.util.Arrays;

/**
 * Created by sumit .
 *
 * implementation of bubble sort
 * in ascending and descending orders
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] a = {23,12,1,2,3,24,54,126,76};
        System.out.println("in ascending Order");
        sortInAscending(a);
        System.out.println(Arrays.toString(a));
        sortInDescending(a);
        System.out.println("in descending Order");
        System.out.println(Arrays.toString(a));
    }

    private static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

     private static void sortInAscending(int arr[]){

         boolean isSorted = false;
         int lastSortedIndex = arr.length-1;

         while (!isSorted){
             isSorted = true;
             for (int i = 0; i<lastSortedIndex; i ++){
                 if (arr[i]> arr[i+1]){
                     isSorted = false;
                     swap(arr, i, i + 1);
                 }
             }
             lastSortedIndex--;
         }
     }

    private static void sortInDescending(int arr[]){

        boolean isSorted = false;
        int lastSortedIndex = arr.length-1;

        while (!isSorted){
            isSorted = true;
            for (int i = 0; i<lastSortedIndex; i ++){
                if (arr[i]<arr[i+1]){
                    isSorted = false;
                    swap(arr, i, i + 1);
                }
            }
            lastSortedIndex--;
        }
    }
}
