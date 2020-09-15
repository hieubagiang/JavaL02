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

    public XepLoaiClass xepLoai()
    {
        XepLoaiClass loai;
        if(diemTB() >=8)
        {
            loai = XepLoaiClass.Gioi;
        }
        else if(diemTB() >=6)
        {
            loai = XepLoaiClass.Kha;
        }
        else if(diemTB()>=4)
        {
            loai = XepLoaiClass.TrungBinh;
        }
        else if(diemTB()>=2)
        {
            loai = XepLoaiClass.Kem;
        }
        else
            loai = XepLoaiClass.DiBoDoi;
        return loai;
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

    public void xuatSV()
    {
        System.out.printf("|%10s|%-30s|%10.2f|%10.2f|\n",maSV,hoTen,diemLT,diemTH);
    }
    public void tinhDiemTB()
    {
        System.out.println("DiemTB= "+ (diemTH+diemLT)/2);
    }
    public float diemTB()
    {
        return (float)(diemTH+diemLT)/2;
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
