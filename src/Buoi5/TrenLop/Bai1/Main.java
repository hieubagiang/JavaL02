package Buoi5.TrenLop.Bai1;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
        quanLySinhVien.nhap();
        quanLySinhVien.xuat();

        quanLySinhVien.xepLoaiSinhVien();
        System.out.println("sap xep giam theo diem");
        quanLySinhVien.sapXepTheoDiemGiamDan();


    }
}
