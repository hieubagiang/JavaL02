package Buoi6_except_file.Bai2;

import Buoi6_except_file.DocGhiFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyKhachHang implements Serializable {
    List<KhachHang> khachHangList;

    public QuanLyKhachHang() {
        khachHangList = new ArrayList<>();
    }
    public void nhap()
    {
        System.out.println("Nhập số kh muốn nhập");
        int n = new Scanner(System.in).nextInt();
        for(int i =0; i<n; i++)
        {
            KhachHang tmp = new KhachHang();
            tmp.nhap();
            khachHangList.add(tmp);
        }
    }
    public void xuat()
    {
        System.out.println("\t\tDANH SACH KHACH HANG");
        for(KhachHang kh  : khachHangList)
        {
            kh.xuat();
        }
    }
    public void ghiFilekieuText()
    {

        boolean kq = DocGhiSerializable.ghiSerial(this, "d:\\fileobj.dat");

        if (kq)
            System.out.println("Thanh cong");
        else
            System.out.println("that bai");


    }


}
