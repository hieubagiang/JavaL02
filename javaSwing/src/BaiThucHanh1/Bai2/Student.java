/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThucHanh1.Bai2;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Student extends Person implements Serializable{
    private String maSV;
    private String email;
    private float diemTongKet;

    public Student() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(float diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    @Override
    public String toString() {
        return "Student{" + "maSV=" + maSV + super.toString() + ", email=" + email + ", diemTongKet=" + diemTongKet + '}';
    }
    
    public String savedString()
    {
        return maSV + "$" + super.toString() + "$" + email + "$" + diemTongKet;
    }
    
    
    
}
