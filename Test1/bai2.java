/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;

/**
 *
 * @author nguye
 */
import java.util.*;
import java.io.*;

public class bai2 {
    public static int soDep(int n){
        String s = n + "";
        if(s.length() < 2)
            return 0;
        for(int i=0; i<s.length()-1; i++){
            if((s.charAt(i+1)-'0') > (s.charAt(i)-'0'))
                return 0;
        }
        return 1;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream file1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>)file1.readObject();
        ObjectInputStream file2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>)file2.readObject();
        int[] cnt1 = new int[10001];
        int[] cnt2 = new int[10001];
        for(int x : a1){
            if(soDep(x)==1){
                cnt1[x]++;
            }
        }
        for(int x : a2){
            if(soDep(x)==1){
                cnt2[x]++;
            }
        }
        for(int i=10; i<= 9999; i++){
            if(cnt1[i] != 0 && cnt2[i] != 0){
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
            }
        }
    }
}
