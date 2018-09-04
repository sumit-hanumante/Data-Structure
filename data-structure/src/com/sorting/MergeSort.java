package src.com.sorting;

/**
 * Created by sumit on 9/3/2018.
 */


import java.util.Arrays;

/***
 *
 * Implementation of merge sort
 *
 * time complexity of merge sort is O(n log(n))
 * and space complexity is o(n)
 */
public class MergeSort {

    public static void main(String[] args) {
        int a[] = {12,11,7,5,4,2,9};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] arr){
        int temp[] = new int[arr.length];
        sort(arr,0,arr.length-1,temp);
    }

    private static void sort(int[] arr, int leftStart, int rightEnd, int temp[]){
        if(leftStart>=rightEnd)
            return;

        int middleIndex = (leftStart+rightEnd)/2;
        sort(arr,leftStart,middleIndex,temp);
        sort(arr,middleIndex+1,rightEnd,temp);
        mergeHalves(arr,leftStart,rightEnd,temp);
    }

    private static void mergeHalves(int[] arr, int leftStart, int rightEnd, int[] temp) {
        int leftEnd = (leftStart+rightEnd)/2;
        int rightStart = leftEnd+1;
        int size = rightEnd-leftStart+1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left<=leftEnd && right<=rightEnd){
            if(arr[left]<=arr[right]) {
                temp[index] = arr[left];
                left++;
            }else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        System.arraycopy(arr,left,temp,index,leftEnd - left + 1);
        System.arraycopy(arr,right,temp,index,rightEnd - right + 1);
        System.arraycopy(temp,leftStart,arr,leftStart,size);
    }
}
