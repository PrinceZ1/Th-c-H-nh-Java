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

public class TH_SoDep2 {
    public static boolean check(int n){
        if(n<10) return false;
        int r = n%10;
        n/=10;
        while(n>0){
            int k=n%10;
            if(r>k) return false;
            n/=10;
            r=k;
        }
        return true;
    }
    public static void main(String[] args) {
        try{
            ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
            ObjectInputStream o2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
            ArrayList<Integer> a = (ArrayList<Integer>) o1.readObject();
            ArrayList<Integer> b = (ArrayList<Integer>) o2.readObject();
            Map<Integer, Integer> mp1 = new TreeMap<>();
            Map<Integer, Integer> mp2 = new TreeMap<>();
            for(Integer x : a){
                if(check(x)){
                    if(mp1.containsKey(x)){
                        int cnt = mp1.get(x);
                        mp1.put(x, cnt+1);
                    }
                    else mp1.put(x,1);
                }
            }
            for(Integer x : b){
                if(check(x)){
                    if(mp2.containsKey(x)){
                        int cnt = mp2.get(x);
                        mp2.put(x, cnt+1);
                    }
                    else mp2.put(x,1);
                }
            }
            for(Integer x : mp1.keySet()){
                if(mp2.containsKey(x)){
                    System.out.println(x+" "+mp1.get(x)+" "+mp2.get(x));
                }
            }
        }
        catch(Exception e){
            
        }
    }
}
