package Buoi6_except_file.Bai1;

import Buoi6_except_file.Bai3.DocGhiFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyKhachHang {
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
        ArrayList<String> test = new ArrayList<>();
        for(KhachHang tmp : khachHangList)
        {
            test.add(tmp.getMa());
            test.add(tmp.getTen());
            test.add(tmp.getNamSinh());
            //test.add("_separator_");
        }

        boolean kq = DocGhiFile.ghiFile(test, "d:\\file.txt");

        if (kq == true)
            System.out.println("Thanh cong");
        else
            System.out.println("that bai");


    }

    public List<KhachHang> docFilekieuText(String path)
    {
        List<KhachHang> test = new ArrayList<>();
        ArrayList<String> ds = DocGhiFile.docFile("D:\\file.txt");
        for(int i=0; i<=ds.size()-3; i=i+3)
        {
//                if(ds.get(i).equals("_separator_")) // nếu tìm thấy phân cách i++
//                    i++;
                KhachHang tmp = new KhachHang(ds.get(i),ds.get(i+1),ds.get(i+2));
                test.add(tmp);
        }
        return test;
    }
}
