package sorting;

import java.util.Arrays;

public class InsertionSort {
    private static void swap(int num1,int num2){
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
    }
    private static void insertSort(int arr[]){
        int n = arr.length-1;
        if(n>0){
            for(int i=1;i<=n;i++){

                int j = i-1;
                int max=arr[i];
                int s=0;
                while(j>=0 && arr[j]>max){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = max;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,23,67,54,9};
        System.out.println( Arrays.toString(nums));
        insertSort(nums);
        System.out.println( Arrays.toString(nums));
    }
}
