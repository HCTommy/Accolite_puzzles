package com.training.accolite.week1;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;

import com.training.accolite.AccoliteApplication;
 
public class Backtracking {
	boolean[] ones;
	private boolean[][] s;
	private int[] c;
	private final Scanner sc;
	
	public Backtracking() {
		this(new Scanner(System.in));
	}

	public Backtracking(Scanner sc) {
		this.sc  = sc;
	}
	
	int solve() {
		int n = sc.nextInt();
		int m = sc.nextInt();
		s = new boolean[m][n];
		c = new int[m];
		for (int i = 0; i < m; i++) {
			String str = sc.next();
			for (int j = 0; j < n; j++)
				s[i][j] = str.charAt(j) == '1';
			c[i] = sc.nextInt();
		}
		sc.close();
		ones = new boolean[n];
		return go(0, c[0], s[0]);
	}
 
	private int go(int step, int errors, boolean[] example) {
		// Write your code here...

		return 1;
	}
 
	public int run() {
		int result = solve();
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		new Backtracking().run();
	}	
}
