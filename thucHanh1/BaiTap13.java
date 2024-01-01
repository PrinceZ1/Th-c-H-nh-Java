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

class Subject implements Comparable<Subject>{
    public String id, name, exam;

    public Subject(String id, String name, String exam) {
        this.id = id;
        this.name = name;
        this.exam = exam;
    }
    
    @Override
    public int compareTo(Subject o){
        return id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + exam;
    }
    
}
public class BaiTap13 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        List<Subject> list = new ArrayList<>();
        Set<String> setID = new HashSet<>();
        
        while(sc.hasNext()){
            Subject subject = new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(!setID.contains(subject.id)){
                setID.add(subject.id);
                list.add(subject);
            }
        }
        Collections.sort(list);
        for(Subject x : list){
            System.out.println(x);
        }
    }
}

