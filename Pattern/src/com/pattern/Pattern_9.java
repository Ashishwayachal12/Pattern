package com.pattern;

import java.util.Scanner;

public class Pattern_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				System.out.print(c == 1 || r == n || r == c ? "* " : "  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
