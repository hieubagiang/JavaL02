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
public abstract class Person {
    protected String name;
    protected String address;
    protected String department;

    public Person() {
    }

    
    
    public Person(String name, String address, String department) {
        this.name = name;
        this.address = address;
        this.department = department;
    }

    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập name");
        name = sc.nextLine();
        System.out.println("Nhập address");
        address = sc.nextLine();
        System.out.println("Nhập department");
        department = sc.nextLine();
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    
    public abstract void print();
    

    @Override
    public String toString() {
        return "" + "name=" + name + ", address=" + address + ", department=" + department ;
    }
    
}
