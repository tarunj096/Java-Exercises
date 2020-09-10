package sorting;

import java.util.Arrays;

public class ArrayMergeSort {
    public static void merge(int arr[], int low, int mid, int high) {
       /* int nL = mid - low + 1;
        int nR = high - mid;
        int n = arr.length;
        int k = 0;
        int left[] = new int[nL];
        int right[] = new int[nR];
        for (int i = 0; i < nL; i++) {
            left[i] = arr[low + i];
        }
        for (int j = 0; j < nR; j++) {
            right[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;
        k = 1;
        while (i < nL && j < nR) {
            if (left[i] < right[j]) {
                arr[k] = left[i];

                i++;
            } else {
                arr[k] = right[j];

                j++;
            }
            k++;
        }
        while (i < nL) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < nR) {
            arr[k] = right[j];
            k++;
            j++;
        }*/
        int n1 = mid - low + 1;
        int n2 = high - mid;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[low + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int low, int high) {
        int n = arr.length;

        if (low < high){
            int mid = (low + high) / 2;
            mergeSort( arr, low, mid );
            mergeSort( arr, mid + 1, high );
            merge( arr, low, mid, high );
        }

        }

    public static void main(String[] args) {
        int nums[] ={25,9,3,89,67,45};
        int high = nums.length-1;
        System.out.println( Arrays.toString( nums ));
        mergeSort(nums,0,high);
        System.out.println( Arrays.toString( nums ));
    }
}
