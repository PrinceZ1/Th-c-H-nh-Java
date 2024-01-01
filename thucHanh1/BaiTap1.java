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

public class BaiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            int sum = 0;
            List<Character> lt = new ArrayList<>();
            for(int i=0; i<s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    sum+=s.charAt(i)-'0';
                }
                else {
                    lt.add(s.charAt(i));
                }
            }
            Collections.sort(lt);
            for(Character i : lt){
                System.out.print(i);
            }
            System.out.println(sum);
        }
    }
}
