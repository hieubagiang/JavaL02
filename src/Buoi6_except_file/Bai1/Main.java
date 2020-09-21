package Buoi6_except_file.Bai1;


import Buoi6_except_file.DocGhiFile;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang();
        quanLyKhachHang.nhap();
        quanLyKhachHang.xuat();

        quanLyKhachHang.ghiFile();
        List<KhachHang> test = quanLyKhachHang.docFile("D:\\file.txt");
        test.toString();
    }
}
