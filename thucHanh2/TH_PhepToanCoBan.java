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
import java.math.BigInteger;

public class TH_PhepToanCoBan {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new File("DAYSO.in"));
            int n = sc.nextInt();
            BigInteger max = new BigInteger("1");
            BigInteger min = new BigInteger("1");
            BigInteger sum = new BigInteger("0");
            for(int i=0; i<n; i++){
                String s =sc.next();
                BigInteger a = new BigInteger(s);
                if(i==0){
                    max = a;
                    min = a;
                }
                else{
                    max = max.max(a);
                    min = min.min(a);
                }
                sum = sum.add(a);
            }
            System.out.println(min.toString());
            System.out.println(max.toString());
            System.out.println(sum.toString());
        }catch(Exception e){
            
        }
    }
}
