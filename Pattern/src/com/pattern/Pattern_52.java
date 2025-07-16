package com.pattern;

import java.util.Scanner;

public class Pattern_52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		for (int r = 1; r <= 2 * n - 1; r++) {
			int totalCols = r <= n ? r : 2 * n - r;
			int spaces = r <= n ? n - r : r - n;

			for (int s = 1; s <= spaces; s++) {
				System.out.print("  ");
			}

			for (int c = 1; c <= totalCols; c++) {
				System.out.print(c + " ");
			}

			System.out.println();
		}

		sc.close();
	}
}
