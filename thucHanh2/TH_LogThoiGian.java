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

public class TH_LogThoiGian {
    public static boolean check(String s){
        if(s.length() != 8) return false;
        if(s.charAt(2) != ':' || s.charAt(5)!= ':') return false;
        for(int i=0; i<8; i++){
            if(i != 2 && i!= 5 && !Character.isDigit(s.charAt(i))) return false;
        }
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));
        int S = Integer.parseInt(s.substring(6, 8));
        return h<24 && m<60 && S<60;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> se = new TreeSet<String>();
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] a = s.split("\\s|\\.|\\,");
            for(String i : a){
                if(check(i)){
                    se.add(i);
                }
            }
        }
        for(String i : se){
            System.out.println(i);
        }
    }
}
