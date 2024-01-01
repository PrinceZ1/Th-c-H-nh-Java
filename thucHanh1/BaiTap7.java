/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanh1;

/**
 *
 * @author nguye
 */
import java.io.*;
import java.util.*;

public class BaiTap7 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum=0;
        while(sc.hasNext()){
            String s= sc.next();
            try{
                int x = Integer.parseInt(s);
            } catch (NumberFormatException ex){
                try{
                    long y = Long.parseLong(s);
                    sum+=y;
                } catch(NumberFormatException ex2){
                    
                }
            }
        }
        System.out.println(sum);
    }
}
