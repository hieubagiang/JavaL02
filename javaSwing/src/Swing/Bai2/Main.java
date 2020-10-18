/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Bai2;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PhamDoanHieu
 */
/*public class Main {
    public static void main(String[] args) {
//        ArrayList<String> listName = new ArrayList<>();
//        listName.add("a");
//        listName.add("b");
//        listName.add("c");
//        listName.add("d");
//        listName.add("e");
//        listName.add("f");
//        listName.add("g");
//        
//        int index = Collections.binarySearch(listName, "d");
////        System.out.println("index = " + index);
//        ArrayList<Nguoi> listnguoi= new ArrayList<>();
//        listnguoi.add(new Nguoi("a", 1));
//        listnguoi.add(new Nguoi("b", 2));
//        listnguoi.add(new Nguoi("c", 3));
//        listnguoi.add(new Nguoi("d", 4));
//        listnguoi.add(new Nguoi("e", 5));
//        listnguoi.add(new Nguoi("f", 6));
//        listnguoi.add(new Nguoi("g", 7));
//        listnguoi.add(new Nguoi("h", 8));
//        Nguoi tmp  = new Nguoi("h", 5);
//        int index = Collections.binarySearch(listnguoi,tmp);
//        System.out.println(index);
        

Msg m1 = new Msg();
Msg m2 = new TestMsg();
m1.sayGoodbye();
m2.sayGoodbye();

    }
}
 */

interface Draw { 
void print();  
}
interface Action{
void tinhChuVi();
void tinhDienTich();
}
class HinhVuong implements Draw,Action {
    private double a;
    @Override
    public void print() {
        System.out.println("Hình vuông có độ dài 1 cạnh là: " + a);
    }
    @Override
    public void tinhChuVi() {
        System.out.println("Chu vi hình vuông là: " + a*4);
    }
    @Override
    public void tinhDienTich() {
        System.out.println("Diện tích hình vuông là: " + a*a);
    }
}

