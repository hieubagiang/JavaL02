package BaiTapKeThua.Bai10;

public class ThiSinhKhoiC extends ThiSinh {
    private String monVan = "Van";
    private String monSu = "Su";
    private String monDia = "Dia";

    @Override
    public String toString() {
        return "ThiDiaKhoiA{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", uuTien='" + uuTien + '\'' +
                ", Môn thi: " + monVan + " - " + monSu + " - " + monDia +
                '}';
    }
}
