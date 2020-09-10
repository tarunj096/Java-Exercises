package sorting;

import java.util.Arrays;

public class ArraySortBubble {
    public static void main(String[] args) {
        int[] arraySim = {23,45,76,2,12,4};
        System.out.println(Arrays.toString(arraySim));
        bubbleSort(arraySim);
        System.out.println(Arrays.toString(arraySim));
    }
    private static void bubbleSort(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j] > arr[j+1])
                    swap( arr, j, j + 1 );
            }
        }
        /*for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/
    }
    private static void swap( int[] arr, int i,int j ){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}
