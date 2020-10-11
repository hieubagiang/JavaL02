/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThucHanh1.Bai3;

import BaiThucHanh1.Bai2.Person;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class NhanVien extends  Person{
    private String phongBan;
    private float heSoLuong;
    private int thamNien;
    private int luongCoBan;

    public NhanVien() {
    }

    public NhanVien(String phongBan, float heSoLuong, int thamNien, int luongCoBan, String hoTen, Date ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    
    public float luongThucLinh()
    {
        return (float)luongCoBan*heSoLuong*(1+thamNien/100);
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString() +", phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + ", luongCoBan=" + luongCoBan +", luongThucLinh= "+ luongThucLinh() +'}';
    }
    
    public String[] toStringArray()
    {
        String[] strArray = {hoTen, gioiTinh,ngaySinhToString(),diaChi,phongBan,""+heSoLuong,""+thamNien,""+luongCoBan,""+luongThucLinh()};
         return strArray;
    }
    
            
}
