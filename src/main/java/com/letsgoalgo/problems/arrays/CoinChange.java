package com.letsgoalgo.problems.arrays;

public class CoinChange {
    public static int check(int[] arr, int curr, int n) {
        if(n == 0) return 1;

        if((n < 0) || (curr < 0 && n >= 1)) return 0;

        return check(arr, curr - 1, n) + check(arr, curr, n - arr[curr]);
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};

        System.out.println(CoinChange.check(input, input.length - 1, 7));
    }
}
