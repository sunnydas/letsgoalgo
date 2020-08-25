package com.letsgoalgo.algorithms;

import java.util.Arrays;

/**
 * 
 * Finding All prime numbers up to a given limit n.
 *
 */
public class SieveOfEratosthenes {
	private boolean[] sieve;
	
	SieveOfEratosthenes(int n) {
		sieve = new boolean[n + 1];
		constructSieve();
	}
	
	private void constructSieve() {
		Arrays.fill(sieve, true);
		sieve[0] = false;
		sieve[1] = false;
		
		for (int i = 2; i * i < sieve.length; i++) {
			if (sieve[i] == true) {
				for(int j = i * i; j < sieve.length; j += i) {
					sieve[j] = false;
				}
			}
		}
	}
	
	private boolean isPrime(int num) {
		if (num >= sieve.length) {
			throw new IllegalArgumentException("Sieve Range: " + (sieve.length - 1));
		}
		return sieve[num];
	}
	
	private void printAllPrime() {
		for(int i = 0; i < sieve.length; i++) {
			if (sieve[i]) {
				System.out.printf("%d ", i);
			}
		}
	}
	
	public static void main(String[] args) { 
		SieveOfEratosthenes sieve = new SieveOfEratosthenes(1000);
		
		System.out.println(sieve.isPrime(10));
		System.out.println(sieve.isPrime(17));
		System.out.println(sieve.isPrime(13));
		System.out.println(sieve.isPrime(39));
		System.out.println(sieve.isPrime(431));
		sieve.printAllPrime();
	}
}
