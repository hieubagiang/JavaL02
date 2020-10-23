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
public class Teacher extends Person{
    private String rank;

    public Teacher(String rank, String name, String address, String department) {
        super(name, address, department);
        this.rank = rank;
    }

    @Override
    public void input()
    {
        System.out.println("Nhập thông tin giáo viên: ");
        super.input();
        System.out.println("Nhập rank (TS, ThS, CN): ");
        rank = new Scanner(System.in).nextLine();
    }
    public Teacher() {
    }
    
    
    
    @Override
    public void print() {
        
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Teacher{"+super.toString() + "rank=" + rank + '}';
    }
    
}
