package com.pattern;

import java.util.Scanner;

public class Pattern_46 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int r = 1; r <= n * 2 - 1; r++) {
			for (int c = 1; c <= n; c++) {
				Thread.sleep(10);
				System.out.print(r + c <= n + 1 || r - c >= n - 1 ? "* " : "  ");
			}
			System.out.println();

		}
		sc.close();
	}

}
