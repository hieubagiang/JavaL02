/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiCuoiKi.De1;

import java.io.Serializable;

/**
 *
 * @author PhamDoanHieu
 */
public class HangHoa implements Serializable{
    protected String maHang;
    protected String ten;
    protected String giaBan;

    public HangHoa() {
    }

    public HangHoa(String maHang, String ten, String giaBan) {
        this.maHang = maHang;
        this.ten = ten;
        this.giaBan = giaBan;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "maHang=" + maHang + ", ten=" + ten + ", giaBan=" + giaBan ;
    }
    public void xuat()
    {
        System.out.println(toString());
    }
    
}
