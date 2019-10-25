package com.letsgoalgo.algorithms;

/*
* The Algorithm is used for calculating the Greatest common divisor of two numbers
* 1. Compare the two numbers and divide the smallest number from the other
* 2. When remainder 0 is reached for one of the numbers the other number represents GCD of the 2 numbers.
*/
public class EuclideanAlgorithm {
     public static int getGCD(int a, int b) {
         return a > b ? gcd(b, a) : gcd(a, b);
     }

     private static int gcd(int a, int b){
        if(a == 0) {
            return b;
        }
        return gcd(b % a, a);
     }

     public static void main(String[] args) {
         System.out.println(getGCD(10, 20));
         System.out.println(getGCD(13, 7));
         System.out.println(getGCD(36, 48));
     }
}
