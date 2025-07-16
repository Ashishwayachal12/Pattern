package com.pattern;

import java.util.Scanner;

public class Pattern_19 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int r = 1; r <= n; r++) {
			int a = r;
			for (int c = 1; c <= n; c++) {
				Thread.sleep(1000);
				System.out.print(a + " ");
				a += n;
			}
			System.out.println();
		}
		sc.close();
	}

}
