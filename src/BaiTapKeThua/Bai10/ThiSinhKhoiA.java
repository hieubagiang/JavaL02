package BaiTapKeThua.Bai10;

import java.io.Serializable;

public class ThiSinhKhoiA extends ThiSinh implements Serializable {
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
