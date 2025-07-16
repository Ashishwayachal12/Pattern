package com.pattern;

import java.util.Scanner;

public class Pattern_51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int r = 1; r <= n; r++) {
			int num = n - r + 1;
			for (int c = 1; c <= (2 * n - 1); c++) {
				System.out.print((c >= r && c <= (2 * n - r)) ? ((c < n) ? (num-- + " ") : (num++ + " ")) : "  ");
			}
			System.out.println();
		}

		sc.close();
	}
}
