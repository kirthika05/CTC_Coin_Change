package com.kirthika;

import java.util.*;

public class Main {

    public static long coinChange(int[] coins, int totalMoney) {
        long[] changeCoins = new long[totalMoney + 1];
        changeCoins[0] =(long) 1;
        for(int i = 0 ; i < coins.length; i++) {
            int changeCoin = coins[i];
            for(int j = changeCoin; j < changeCoins.length; j++) {
                changeCoins[j] += changeCoins[j - changeCoin];
            }
        }
        return changeCoins[totalMoney];
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(coinChange(coins,n));
    }
}
