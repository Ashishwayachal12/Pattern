package com.pattern;

import java.util.Scanner;

public class Pattern_49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int r = 1; r <= n * 2 - 1; r++) {
			char ch = (char) 97;
			for (int c = 1; c <= n * 2 - 1; c++) {
				System.out.print(c >= r && r + c <= n * 2 ? ch++ + " " : "  ");
			}
			System.out.println();
		}
		sc.close();
	}

}
