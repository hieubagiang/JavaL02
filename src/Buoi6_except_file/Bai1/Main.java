package Buoi6_except_file.Bai1;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang();
        quanLyKhachHang.nhap();
        quanLyKhachHang.xuat();

        quanLyKhachHang.ghiFilekieuText();
        List<KhachHang> test = quanLyKhachHang.docFilekieuText("D:\\file.txt");
        for(KhachHang t : test)
        {
            t.xuat();
        }
    }
}
