package Buoi2.Bai2;

import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private float diemLT, diemTH;
    public SinhVien()
    {

    }
    public SinhVien(String maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }


    public void nhapSV()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập maSV");
        maSV= sc.nextLine();
        System.out.println("Nhập hoTen");
        hoTen= sc.nextLine();
        System.out.println("Nhập điểm lý thuyết");
        diemLT= sc.nextFloat();
        System.out.println("Nhập điểm thực hành");
        diemTH= sc.nextFloat();

    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                '}';
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
}
