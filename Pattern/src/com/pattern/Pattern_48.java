package com.pattern;

import java.util.Scanner;

public class Pattern_48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int r = 1; r <= n * 2 - 1; r++) {
			for (int c = 1; c <= n * 2 - 1; c++) {
				System.out.print(r == c || c == 1 || r + c == n * 2 || c == n * 2 - 1 ? "* " : "  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
