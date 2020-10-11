/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThucHanh1.Bai2;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Person implements Serializable{
    protected String hoTen;
    protected Date ngaySinh;
    protected String diaChi;
    protected String gioiTinh;

    public Person() {
    }

    public Person(String hoTen, Date ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String ngaySinhToString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //Date date = new java.sql.Date(Long.valueOf(sdf.format(ngaySinh)));
        return sdf.format(ngaySinh);
    }
    @Override
    public String toString() {
        return "hoTen=" + hoTen + ", ngaySinh=" + ngaySinhToString() + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh;
    }
    public String savedString()
    {
        return hoTen + "$" + ngaySinhToString() + "$" + diaChi+ "$" +gioiTinh;
    }
    
    
}
