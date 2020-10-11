/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThucHanh1.Bai4;

/**
 *
 * @author Admin
 */


import java.io.Serializable;

public class ThiSinhKhoiB extends ThiSinh implements Serializable {
    private String monToan = "Toan";
    private String monHoa = "Hoa";
    private String monSinh = "Sinh";

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", uuTien='" + uuTien + '\'' +
                ", Môn thi: " + monToan + " - " + monHoa + " - " + monSinh +
                '}';
    }
}