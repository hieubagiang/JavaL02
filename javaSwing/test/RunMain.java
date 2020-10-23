/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PhamDoanHieu
 */
import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LopHoc lopHoc = new LopHoc(); // đặt tên biến tường minh, đọc là biết ngay biến này là gì
    // chỗ này gọi là nhập data cho lopHoc 
        
        lopHoc.nhap();
        
        lopHoc.xuat();

    }
}
