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

public class BaiTap12 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String>  al1 = (ArrayList<String>) ois1.readObject();
        TreeSet<String> ts1 = new TreeSet(al1);
        
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer>  al2 = (ArrayList<Integer>) ois2.readObject();
        TreeSet<Integer> ts2 = new TreeSet(al2);
        
        for(String i : ts1){
            for(Integer j : ts2){
                System.out.println(i+j);
            }
        }
    }
}

