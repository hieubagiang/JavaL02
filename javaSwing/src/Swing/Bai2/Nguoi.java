/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Bai2;

import java.util.Date;

/**
 *
 * @author PhamDoanHieu
 */
public class Nguoi implements Comparable<Nguoi>{
    protected String hoTen;
    protected float diem;

    public Nguoi(String hoTen, float diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public int compareTo(Nguoi nguoi) {
        //return hoTen.compareTo(nguoi.hoTen);
        if(diem<nguoi.diem)
        {
            return -1;
        }
        else if(diem== nguoi.diem)
        {
            return 0;
        }
        else 
        {
            return 1;
        }
        
    }
    
    
}
