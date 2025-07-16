package com.pattern;

import java.util.Scanner;

public class Pattern_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				System.out.print(r == n || c == n || r + c == n + 1 ? "* " : "  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
