/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiCuoiKi.De3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PhamDoanHieu
 */
public class NhanVien extends Person{

    private String phongBan;    
    private double heSoLuong;    
    private double thamNien;    
    private int luongCoBan;    

    public NhanVien() {
    }

    public NhanVien(String phongBan, double heSoLuong, double thamNien, int luongCoBan, String hoTen, Date ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public double getLuongThucLinh()
    {
        return luongCoBan * heSoLuong * (1 + thamNien/100);
    }
    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getThamNien() {
        return thamNien;
    }

    public void setThamNien(double thamNien) {
        this.thamNien = thamNien;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }
    public String getDateString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(ngaySinh);
    }
    
    @Override
    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "NhanVien{" + "phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + ", luongCoBan=" + luongCoBan +", luongThucLinh="+getLuongThucLinh() +'}';
    }
    String toObjectStrings()
    {
        return hoTen + "$" 
                + getDateString() +"$"
                + diaChi +"$" 
                + gioiTinh + "$" 
                + phongBan + "$"
                + heSoLuong + "$"
                + thamNien +"$"
                + luongCoBan +"$";
    }

}
