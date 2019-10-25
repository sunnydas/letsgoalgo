package com.letsgoalgo.problems.arrays;

import java.util.Arrays;

public class ArrayRotationAlt {

    /*
    Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.
Example :

Input :  arr[] = [1, 2, 3, 4, 5, 6, 7]
         d = 2
Output : arr[] = [3, 4, 5, 6, 7, 1, 2]
     */

    public static int[] rotate(int[] input,int k){
        int[] rotated = new int[input.length];
        for(int i = 0 ; i < input.length ; i++){
            // Java's % will not work here
            int nextIndex = Math.floorMod((i-k),input.length);
            rotated[nextIndex] = input[i];
        }
        System.out.println();
        return rotated;
    }

    public static void printArray(int[] input){
        for(int i = 0 ; i < input.length ; i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] rotated = rotate(input,2);
        printArray(rotated);
    }

}
