package BaiTapThucHanh1File.Bai2;


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
