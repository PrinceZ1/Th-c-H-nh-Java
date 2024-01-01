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

public class TH_XuLyVanBan2 {
    public static boolean check1(String s){
        return s.chars().anyMatch(Character::isDigit);
    }
    public static boolean check2(String s){
        return s.matches(".*[.,!?:].*");
    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> se = new TreeSet<>();
        while(sc.hasNext()){
            String tmp = sc.next();
            if(check1(tmp) && !check2(tmp)) se.add(tmp);
        }
        for(String x : se){
            System.out.println(x);
        }
    }
}
