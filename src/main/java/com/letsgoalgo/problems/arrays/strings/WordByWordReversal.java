package com.letsgoalgo.problems.arrays.strings;

public class WordByWordReversal {
    public static void reverse(char[] input, int i, int j) {
        while(i < j) {
            char temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            i++;
            j--;
        }
    }

    // Time Complexity: O(2n)
    public static void reverseWord(char[] input) {
        int i = 0;
        for(int j = 0; j < input.length; j++) {
            if(input[j] == ' ') {
                reverse(input, i, j - 1);
                i = j + 1;
            }
        }
        reverse(input, i, input.length - 1);
        reverse(input, 0, input.length - 1);
    }

    public static void main(String[] args) {
        char[] input1 = "doin you how".toCharArray();
        WordByWordReversal.reverseWord(input1);
        System.out.println(new String(input1));

        char[] input2 = "break a on were we".toCharArray();
        WordByWordReversal.reverseWord(input2);
        System.out.println(new String(input2));
    }
}
