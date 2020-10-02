package BaiTapKeThua.Bai10;

public class ThiSinhKhoiB extends ThiSinh {
    private String monToan = "Toan";
    private String monHoa = "Hoa";
    private String monSinh = "Sinh";

    @Override
    public String toString() {
        return "ThiSinhKhoiA{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", uuTien='" + uuTien + '\'' +
                ", Môn thi: " + monToan + " - " + monHoa + " - " + monSinh +
                '}';
    }
}
