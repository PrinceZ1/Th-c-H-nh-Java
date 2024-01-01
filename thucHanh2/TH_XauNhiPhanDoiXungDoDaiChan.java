/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanh2;

/**
 *
 * @author nguye
 */
import java.util.*;
import java.io.*;

public class TH_XauNhiPhanDoiXungDoDaiChan {
    public static void Try(int[] a, int i, int n){
        if(i==n){
            for(int j=0; j<n; j++){
                System.out.print(a[j]);
            }
            for(int j=n-1; j>=0; j--){
                System.out.print(a[j]);
            }
            System.out.print(" ");
        }
        else{
            for(int j=0; j<=1; j++){
                a[i]=j;
                Try(a,i+1,n);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int tmp = sc.nextInt();
            int n = tmp/2;
            int[] a = new int[n];
            for(int i=1; i<=n; i++){
                Try(a,0,i);
            }
            System.out.println();
        }
    }
}
