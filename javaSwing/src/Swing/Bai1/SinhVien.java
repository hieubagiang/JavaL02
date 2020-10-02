/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Bai1;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class SinhVien implements Serializable,Test{
    private String maSV;
    private String hoTen;
    private Date ngaySinh;
    private String gioiTinh;
    private float diem;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, Date ngaySinh, String gioiTinh, float diem) {
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
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

    public void nhap()
    {
        
    }
    @Override
    public String toString() {
        return "maSV=" + maSV + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diem=" + diem;
    }

    void setLuong(int parseInt) {
        
    }

    void setDonVi(String text) {
        
    }
    void setHocPhi(float hocPhi){
        
    }
    
}
