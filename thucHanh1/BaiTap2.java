/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanh1;

/**
 *
 * @author nguye
 */
import java.util.*;
import java.io.*;

public class BaiTap2{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Long> a = new ArrayList<>();
            for(int i=0; i<n; i++){
                a.add(sc.nextLong());
            }
            Collections.sort(a);
            long s1=0, s2=0;
            int i=0;
            for(long x : a){
                if(i==n){
                    break;
                }
                if(i%2==0){
                    s1=s1*10+x;
                }
                else{
                    s2=s2*10+x;
                }
                i++;
            }
            System.out.println(s1+s2);
        }
    }
}
