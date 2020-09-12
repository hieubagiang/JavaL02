package Buoi2.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static  Scanner sc = new Scanner(System.in);

    public static void xuatListSV(ArrayList<SinhVien> sinhVienArrayList, int n)
    {
        {
            System.out.printf("|%10s|%-30s|%10s|%10s|\n","maSV","hoTen","diemLT","diemTH");
        }
        for(int i=0; i<n; i++)
        {
            sinhVienArrayList.get(i).xuatSV();
        }
    }
    public static void nhapListSV(ArrayList<SinhVien> sinhVienArrayList, int n)
    {
        for(int i=0; i<n; i++)
        {
            SinhVien tmp = new SinhVien();
            tmp.nhapSV();
            sinhVienArrayList.add(tmp);
        }
    }

    public static void main(String[] args) {
        ArrayList<SinhVien> sinhVienArrayList = new ArrayList<>();
        System.out.println("Nhap so luong sv muốn nhập: ");
        int n  = sc.nextInt();

        nhapListSV(sinhVienArrayList,n);
        xuatListSV(sinhVienArrayList,n);

    }
}
