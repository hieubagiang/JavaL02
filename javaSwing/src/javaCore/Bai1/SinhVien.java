/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCore.Bai1;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien implements Serializable{
    private String maSV;
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private float diem;

    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap maSV: ");
        maSV= scanner.nextLine();
        System.out.println("Nhap hoTen: ");
        hoTen= scanner.nextLine();
        System.out.println("Nhap ngaySinh: ");
        ngaySinh= scanner.nextLine();
        System.out.println("Nhap gioiTinh: ");
        gioiTinh= scanner.nextLine();
        System.out.println("Nhap diem: ");
        diem= scanner.nextFloat();
        
    }
    
    public void xuat()
    {
        System.out.println(this.toString());
    }
    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String ngaySinh, String gioiTinh, float diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
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

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diem=" + diem;
    }

    

   
    
}
