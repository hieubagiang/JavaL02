package BaiTapKeThua.Bai2;

public class Main {
    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();
        quanLySach.nhap();
        System.out.println("----------------------");
        quanLySach.xuat();
        System.out.println("----------------------");
        System.out.println("Tim kiem tai lieu theo loai:");
        quanLySach.timKiemTaiLieu();
        System.out.println("----------------------");
        System.out.println("Tim kiem tai lieu theo ID:");
        quanLySach.timKiemTaiLieuTheoID();
    }
}
