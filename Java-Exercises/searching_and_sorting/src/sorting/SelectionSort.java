package sorting;

import java.util.Arrays;

public class SelectionSort {
    private static void selectSort(int arr[],int n){
        int max = 0;
       // int s= n-1;
        int i =0;

        while(i<=n) {
            max=i;

            for (int j = 0; j <= n ; j++) {
                if (arr[j] > arr[max]){
                    max = j;
                }
            }
            if(arr[max]>arr[n]) {
                int temp = arr[n];
                arr[n] = arr[max];
                arr[max] = temp;
            }
            n--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {56,98,3,25,45,72};
        System.out.println( Arrays.toString(nums));
        int len = nums.length;
        selectSort(nums,len-1);
        System.out.println( Arrays.toString(nums));
    }
}
