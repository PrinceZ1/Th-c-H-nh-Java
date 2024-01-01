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

public class BaiTap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Set<String> s1 = new TreeSet<>();
        while(n-->0){
            String s = sc.nextLine();
            String t[] = s.trim().toLowerCase().split("\\s+");
            s1.addAll(Arrays.asList(t));
        }
        int m = Integer.parseInt(sc.nextLine());
        Set<String> s2 = new TreeSet<>();
        while(m-->0){
            String s = sc.nextLine();
            String t[] = s.trim().toLowerCase().split("\\s+");
            s2.addAll(Arrays.asList(t));
        }
        Set<String> giao = new TreeSet<>();
        for(String i : s1){
            if(s2.contains(i)){
                giao.add(i);
            }
        }
        for(String i : giao){
            s1.remove(i);
            s2.remove(i);
        }
        for(String i : s1){
            System.out.print(i+ " ");
        }
        System.out.println();
        for(String i : s2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
