package com.pattern;

import java.util.Scanner;

public class Pattern_37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int r = 1; r <= n; r++) {
			int a = 1;
			for (int c = 1; c <= n * 2 - 1; c++) {
				System.out.print((r + c >= n + 1 && c - r <= n - 1) ? (c < n ? a++ + " " : a-- + " ") : "  ");

			}
			System.out.println();
		}
		sc.close();
	}

}
