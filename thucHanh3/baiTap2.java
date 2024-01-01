/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanh3;

/**
 *
 * @author nguye
 */
import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class thongKe implements Comparable<thongKe>{
    public static long chenhLech(String s1, String s2){
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime bd = LocalDateTime.parse(s1,d);
        LocalDateTime kt = LocalDateTime.parse(s2,d);
        return java.time.Duration.between(bd, kt).toMinutes();
    }
    private String ten, batDau, ketThuc;
    private long soPhut;

    public thongKe(String ten, String batDau, String ketThuc) {
        this.ten = ten;
        this.batDau = batDau;
        this.ketThuc = ketThuc;
        this.soPhut = chenhLech(this.batDau, this.ketThuc);
    }

    @Override
    public int compareTo(thongKe o) {
        if(this.soPhut != o.soPhut){
            if(this.soPhut > o.soPhut){
                return -1;
            }
            else return 1;
        }
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return this.ten + " " + this.soPhut;
    }
      
}
public class baiTap2 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n = sc.nextInt();
        sc.nextLine();
        thongKe[] a = new thongKe[n];
        for(int i=0; i<n; i++){
            a[i] = new thongKe(sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        Arrays.sort(a);
        for(thongKe x : a){
            System.out.println(x);
        }
    }
}
