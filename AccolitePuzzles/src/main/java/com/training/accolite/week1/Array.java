package com.training.accolite.week1;

import java.util.*;
import java.io.*;
import java.math.*;
 
public class Array {
	static long INF = (long)1e18;
    static int maxn = (int)1e6+5;
    static int mod= 1000000321 ;
    private final Scanner sc;

	
	public Array() {
		this(new Scanner(System.in));
	}

	public Array(Scanner sc) {
		this.sc  = sc;
	}
    public static void main(String[] args) {
        new Array().run();
    }
    
    public int run() {
		int result = solve();
		System.out.println(result);
		return result;
	}
 
    
    
    
    int solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[2*n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            a[i+n] = a[i];
        }
        
        int[] b = new int[maxn];
        for (int i = 1; i <= m; i++) {
            b[sc.nextInt()] = i;
        }
        
        int ans = 0;
        // Write the logic here
        for (int i = 1; i <a.length; i++) {
            if (b[a[i]]==0){
                continue;
            }
            int temp=1;
            int lastPosition=b[a[i]];
            int max = b[a[i]]+m-1;
            for (int j = i+1; j < a.length; j++) {
                if (b[a[j]]==0){
                    break;
                }
                if (b[a[j]]>lastPosition){
                    temp++;
                    lastPosition=b[a[j]];
                } else if (b[a[j]]+m>lastPosition&&b[a[j]]+m<=max) {
                    temp++;
                    lastPosition=b[a[j]]+m;
                }
            }
            ans=Math.max(temp,ans);

        }

        
        return ans;
    }

}