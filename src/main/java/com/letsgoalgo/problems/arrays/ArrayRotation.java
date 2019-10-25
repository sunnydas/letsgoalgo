package com.letsgoalgo.problems.arrays;

import java.util.Arrays;

public class ArrayRotation {

    /*
    Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.
Example :

Input :  arr[] = [1, 2, 3, 4, 5, 6, 7]
         d = 2
Output : arr[] = [3, 4, 5, 6, 7, 1, 2]
     */

    public static int[] rotate(int[] input, int k){
        int[] rotated = new int[input.length];
        for(int i = 0 ; i < input.length ; i++){
            // Java's % will not work here
            int nextIndex = Math.floorMod((i-k),input.length);
            rotated[nextIndex] = input[i];
        }
        System.out.println();
        return rotated;
    }

    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Time Complexity: O(n)
    public static void reversalAlgo(int[] input, int k) {
        reverse(input, 0, k - 1);
        reverse(input, k, input.length - 1);
        reverse(input, 0, input.length - 1);
    }

    public static void printArray(int[] input){
        for(int i = 0 ; i < input.length ; i++){
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] input1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] rotated = rotate(input1, 2);
        printArray(rotated);

        int[] input2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        reversalAlgo(input2, 4);
        printArray(input2);
    }

}
