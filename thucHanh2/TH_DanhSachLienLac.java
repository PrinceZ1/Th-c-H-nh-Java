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

class Student implements Comparable<Student>{
    public String id, name, lop, email, phone;

    public Student(String id, String name, String lop, String email, String phone) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.email = email;
        this.phone = phone;
    }
    
    @Override
    public int compareTo(Student a){
        if(lop.equals(a.lop)){
            return id.compareTo(a.id);
        }
        else return lop.compareTo(a.lop);
    }

    @Override
    public String toString() {
        return id+" "+name+" "+lop+" "+email+" "+"0"+phone;
    }
}
public class TH_DanhSachLienLac {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Student> lt = new ArrayList<>();
        while(sc.hasNext()){
            lt.add(new Student(sc.nextLine(), sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(lt);
        for(Student i : lt){
        System.out.println(i);
    }
    }
}
