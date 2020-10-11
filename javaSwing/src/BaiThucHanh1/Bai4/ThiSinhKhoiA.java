/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThucHanh1.Bai4;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class ThiSinhKhoiA extends ThiSinh implements Serializable {
    private  String monToan = "Toan";
    private  String monLy = "Ly";
    private  String monHoa = "Hoa";

    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, String uuTien) {
        super(soBaoDanh, hoTen, diaChi, uuTien);
    }
    
    

    

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
