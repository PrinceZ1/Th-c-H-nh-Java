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

public class baiTap5 {
    public static long calc (long x, long y, String s){
        if(s.equals("+")) return x + y;
        else if(s.equals("-")) return x - y;
        else if(s.equals("*")) return x * y;
        else return x / y;
    }
    public static boolean check(String s){
        if(s.equals("+") || s.equals("-") || s.equals("*") ||s.equals("/"))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n = Integer.parseInt(sc.nextLine());
            String[] a = sc.nextLine().trim().split("\\s+");
            Stack<Long> st = new Stack<>();
            for(int i= a.length - 1; i>=0; i--){
                if(!check(a[i])){
                    st.push(Long.parseLong(a[i]));
                }
                else {
                    long x= st.pop();
                    long y = st.pop();
                    long z = calc(x, y, a[i]);
                    st.push(z);
                }
            }
            System.out.println(st.peek());
        }
    }
}
//3
//7
//- + 2 * 3 1 9
//7
//- + 8 * 7 5 9
//3
//+ -10 -4