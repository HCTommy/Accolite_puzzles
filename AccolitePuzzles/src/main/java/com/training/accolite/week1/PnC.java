package com.training.accolite.week1;

import java.util.Scanner;

public class PnC {
	private static final int mod = 1000000007;
	private static final int max_n = 400040;
	private static int[] f = new int[max_n];
	private static int[] df = new int[max_n];
    private final Scanner sc;
	
	public PnC() {
		this(new Scanner(System.in));
	}

	public PnC(Scanner sc) {
		this.sc  = sc;
	}
	
    public static void main(String[] args) {        
        new PnC().run();
    }
    
    public int run() {
    	prep();
        int n = sc.nextInt();
        int ans = 0 ;
        for(int i=0;i<=n;++i){
            int a = sc.nextInt();
            if(a==0) break;
            ans = 1;// complete the formula...
        }
        System.out.println(ans);
        return ans;
    }
    
    static int C(int n,int k){
        // complete the formula...
        return 1;
    }
    static void prep(){
        f[0] = df[0] = 1;
        for(int i=1;i<max_n;++i){
            f[i] = (int)((1l*f[i-1]*i)%mod);
            df[i] = power(f[i],mod-2);
        }
    }
    static int power(int n,int k){
    	// complete the formula...
        return 1;
    }
}