/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

/**
 *
 * @author nguye
 */
import java.math.BigInteger;
import java.util.*;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while(s.length() > 1){
            String nuaDau = s.substring(0,s.length()/2);
            String nuaSau = s.substring(s.length()/2);
            BigInteger x = new BigInteger(nuaDau);
            BigInteger y = new BigInteger(nuaSau);
            BigInteger sum = x.add(y);
            System.out.println(sum);
            s = sum.toString();
        }
    }
}
