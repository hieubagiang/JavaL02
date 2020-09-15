package Buoi5.TrenLop.Bai1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class QuanLySinhVien {
    private int soSinhVien;
    ArrayList<SinhVien> listSV = new ArrayList<>();

    public QuanLySinhVien() {
    }

    public QuanLySinhVien(int soSinhVien, ArrayList<SinhVien> listSV) {
        this.soSinhVien = soSinhVien;
        this.listSV = listSV;
    }
    public void xepLoaiSinhVien()
    {
        System.out.println("XEP LOAI SINH VIEN");
        System.out.printf("|%5s|%-25s|%10s|\n","maSV","HoTen","XepLoai");

        for(SinhVien sv : listSV)
        {
            System.out.printf("|%5s|%-25s|%10s|\n",sv.getMaSV(),sv.hoTen,sv.xepLoai());
        }
    }

    public void sapXepTheoDiemGiamDan()
    {
        System.out.println("sap xep giam theo diem");
        Collections.sort(listSV);
        this.xuat();
    }
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số sv muốn nhập: ");
        soSinhVien = sc.nextInt();
        for(int i=0;i<soSinhVien; i++)
        {
            SinhVien sv = new SinhVien();
            sv.nhap();
            listSV.add(sv);
        }
    }
    public void xuat()
    {
        System.out.println("\t\tDANH SACH SINH VIEN");
        System.out.printf("|%5s|%-25s|%10s|%10s|\n","maSV","hoTen","namSinh","diemTB");
        for(int i =0; i<listSV.size();i++)
        {
            listSV.get(i).xuat();
        }
    }
}
