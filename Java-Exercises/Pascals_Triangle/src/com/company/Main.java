package com.company;

import java.util.Scanner;
// Program for pascal's triangle- Java-Exercises @tarunj096
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter the size of tringle:");
        int size = sc.nextInt();
        int pascal[][]= new int[size][size];
        int r,c;
        pascal[0][0]=1;
        pascal[1][0]=1;
        pascal[1][1]=1;
        for(r = 0;r<size;r++){
            pascal[r][0]= 1;
            for (c=1;c<=r;c++){
                pascal[r][c]= pascal[r-1][c-1] + pascal[r-1][c];
            }
        }
        for (r=0;r<size;r++){
            for (c=0;c<=r;c++){
                System.out.print(pascal[r][c]);
            }
            System.out.println("");
        }
    }
}
