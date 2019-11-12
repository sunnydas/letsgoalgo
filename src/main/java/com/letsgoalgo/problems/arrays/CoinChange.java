package com.letsgoalgo.problems.arrays;

public class CoinChange {
    /*
    Complexity O(2.pow(n))
     */
    public static int getSmallestSubArray(int[] arr, int curr, int n, int length) {
        if(n == 0) return length;

        if((n < 0) || (curr == arr.length && n >= 1)) return -1;

        int excluded = getSmallestSubArray(arr, curr + 1, n, length);
        int included = getSmallestSubArray(arr, curr, n - arr[curr], length + 1);

        if(included == -1) {
            return excluded;
        } else if(excluded == -1) {
            return included;
        }
        return excluded > included ? included : excluded;
    }
    
    public static int check(int[] arr, int curr, int n) {
        if(n == 0) return 1;

        if((n < 0) || (curr == arr.length && n >= 1)) return 0;

        return check(arr, curr + 1, n) + check(arr, curr, n - arr[curr]);
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 8};

        System.out.println(CoinChange.check(input, 0, 7));
        System.out.println(CoinChange.getSmallestSubArray(input, 0, 8, 0));
    }
}
