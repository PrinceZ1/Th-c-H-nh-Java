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

class UserInfo{
    private String userName, userPass;

    public UserInfo(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    public String getUserName(){
        return this.userName;
    }
    public String getUserPass(){
        return this.userPass;
    }
}

public class TH_LopUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, UserInfo> mp1 = new HashMap<>();
        Map<String, Integer> mp2 = new HashMap<>();
        List<String> a = new ArrayList<>();
        sc.nextLine();
        while(n-->0){
            String[] info = sc.nextLine().split(" ");
            UserInfo tmp = new UserInfo(info[0], info[1]);
            mp1.put(tmp.getUserName(), tmp);
            mp2.put(info[0],0);
            a.add(info[0]);
        }
        int m = sc.nextInt();
        sc.nextLine();
        while(m-->0){
            String[] info = sc.nextLine().split(" ");
            if(mp1.containsKey(info[0])){
                if(mp1.get(info[0]).getUserPass().equals(info[1])){
                    int tmp = mp2.get(info[0])+1;
                    mp2.put(info[0], tmp);
                }
            }
        }
        for(String x : a){
            System.out.println(mp2.get(x)+" ");
        }
    }
}
