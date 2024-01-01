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

class GV{
    private String id, subject;
    private double time;

    public GV(String s) {
        String[] a = s.trim().split("\\s+");
        this.id = a[0];
        this.subject = a[1];
        this.time = Double.parseDouble(a[2]);
    }

    public String getId() {
        return id;
    }

    public double getTime() {
        return time;
    }
    
}
public class bai3 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String s = sc.nextLine();
        }
        sc = new Scanner(new File("GIANGVIEN.in"));
        HashMap<String, String> mp1 = new HashMap<>();
        HashMap<String, Double> mp2 = new HashMap<>();
        
        int m = sc.nextInt();
        sc.nextLine();
        
        while(m-- > 0){
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            String tmp = "";
            for(int i=1; i<a.length; i++){
                tmp += a[i] + " ";
            }
            mp1.put(a[0], tmp.trim());
        }
        sc = new Scanner(new File("GIOCHUAN.in"));
        int k = sc.nextInt();
        sc.nextLine();
        GV[] a = new GV[k];
        for(int i=0; i<k; i++){
            a[i] = new GV(sc.nextLine());
        }
        ArrayList<String> tmp = new ArrayList<>();
        for(GV x : a){
            String s = x.getId();
            if(mp2.containsKey(s)) mp2.put(s,mp2.get(s) + x.getTime());
            else{
                tmp.add(s);
                mp2.put(s, x.getTime());
            }
        }
        for(String x : tmp){
            System.out.print(mp1.get(x) + " ");
            System.out.printf("%.2f", mp2.get(x));
            System.out.println();
        }
    }
}
