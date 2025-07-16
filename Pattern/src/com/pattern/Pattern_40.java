package com.pattern;

import java.util.Scanner;

public class Pattern_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n * 2 - 1; c++) {
				System.out.print((r + c >= n + 1 && c - r <= n - 1) ? ((r + c) % 2 == 0 ? 1 + " " : 0 + " ") : "  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
