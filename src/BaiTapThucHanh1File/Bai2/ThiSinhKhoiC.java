package BaiTapThucHanh1File.Bai2;

import java.io.Serializable;

public class ThiSinhKhoiC extends ThiSinh implements Serializable {
    private String monVan = "Van";
    private String monSu = "Su";
    private String monDia = "Dia";

    @Override
    public String toString() {
        return "ThiSinhKhoiC{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", uuTien='" + uuTien + '\'' +
                ", Môn thi: " + monVan + " - " + monSu + " - " + monDia +
                '}';
    }
}
