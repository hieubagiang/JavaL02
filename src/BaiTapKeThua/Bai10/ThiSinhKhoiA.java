package BaiTapKeThua.Bai10;

public class ThiSinhKhoiA extends ThiSinh {
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
