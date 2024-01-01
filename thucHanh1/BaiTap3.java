/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanh1;

/**
 *
 * @author nguye
 */
import java.io.*;
import java.util.*;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int[][] dp = new int[105][105];

            for(int i=1; i<=n; i++){
                for(int j=0; j<=n; j++){
                    dp[i][j]=0;
                }
            }
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(s.charAt(i-1) == s.charAt(j-1) && i!=j){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }
                    else{
                        dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
                    }
                }
            }
            System.out.println(dp[n][n]);
        }
    }
}

