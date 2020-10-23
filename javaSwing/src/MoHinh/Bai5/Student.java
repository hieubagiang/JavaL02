/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoHinh.Bai5;

import java.util.Scanner;

/**
 *
 * @author PhamDoanHieu
 */
public class Student extends Person{

    private String lop;
    
    public Student(String lop, String name, String address, String department) {
        super(name, address, department);
        this.lop = lop;
    }

    public Student() {
    }

    public void input()
    {
        super.input();
        System.out.println("Nhập lớp: ");
        lop = new Scanner(System.in).nextLine();
    }
    @Override
    public void print() {
        
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +", lop=" + lop + '}';
    }
    
    
}
