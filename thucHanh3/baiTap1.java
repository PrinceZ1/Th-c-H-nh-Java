/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thucHanh3;

/**
 *
 * @author nguye
 */
import java.security.CodeSigner;
import java.util.*;

public class baiTap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            ArrayList<Integer> chan = new ArrayList<>();
            ArrayList<Integer> le = new ArrayList<>();
            for(int i=0; i<n; i++){
                int x = sc.nextInt();
                if(x%2==0 && !chan.contains(x)){
                    chan.add(x);
                }
                else if(x%2==1 && !le.contains(x)){
                    le.add(x);
                }
            }
            Collections.sort(chan);
            Collections.sort(le, Collections.reverseOrder());
            for(int x : chan){
                System.out.print(x+ " ");
            }
            System.out.println();
            for(int x : le){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
