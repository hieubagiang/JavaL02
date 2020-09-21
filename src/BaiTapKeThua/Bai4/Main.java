package BaiTapKeThua.Bai4;

public class Main {
    public static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        quanLyCanBo.nhap();
        quanLyCanBo.xuat();
        System.out.println("Tìm theo họ tên");
        quanLyCanBo.timKiemTheoHoTen();
    }
}
