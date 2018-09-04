package src.com.searching;

/**
 * Binary Search works only on sorted list/array or anything which is already sorted
 */
public class BinarySearch {

    public static void main(String[] args) {

        //sorted array
        int a[] = {4,5,7,9,11,56,444,522,566,999,7545,9999};
        int numberToSearch = 9999;
        boolean isPresent = search(a,numberToSearch);
        System.out.println(" is "+numberToSearch +" present in array ?? : " + isPresent);
    }

    private static boolean search(int a[],int number) {
        int left = 0;
        int right= a.length-1;

        while (left<=right) {
            int mid = left + ((right - left) / 2);
            if (a[mid] == number){
                return true;
            }else if (number<a[mid]){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return false;
    }
}
