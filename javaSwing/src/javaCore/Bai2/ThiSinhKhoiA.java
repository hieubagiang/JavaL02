/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCore.Bai2;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class ThiSinhKhoiA extends ThiSinh implements Serializable{
    private  String monToan = "Toan";
    private  String monLy = "Ly";
    private  String monHoa = "Hoa";


    @Override
    public String toString() {
        return "ThiSinhKhoiA{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", uuTien='" + uuTien + '\'' +
                ", Môn thi: " + monToan + " - " + monLy + " - " + monHoa +
                '}';
    }
}
