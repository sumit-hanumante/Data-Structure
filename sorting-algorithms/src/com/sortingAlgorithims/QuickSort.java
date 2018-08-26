package src.com.sortingAlgorithims;

import java.util.Arrays;

/**
 * Created by sumit .
 *
 * implementation of quick sort
 */
public class QuickSort {

    public static void main(String[] args) {

        int[] a = {3,1,2,4,5,2,11,23,43,53};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void sort(int arr[]){

        sort(arr,0,arr.length-1);
    }

    private static void sort(int arr[], int left, int right){
        if (left>= right){
            return;
        }
        int pivot = arr[(left+right)/2];
        int index = partition(arr,left,right,pivot);
        sort(arr,left, index-1);
        sort(arr, index, right);
    }

    private static int partition(int arr[] , int left, int right, int pivot) {
        while (left <= right) {

            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right){
                swap(arr,left,right);
                left++;
                right--;
            }
        }
        return left;
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

