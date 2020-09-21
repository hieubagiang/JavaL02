package Buoi6_except_file.Bai2;

public class Main {
    public static void main(String[] args) {
        QuanLyKhachHang quanLyKhachHang = new QuanLyKhachHang();
        quanLyKhachHang.nhap();
        quanLyKhachHang.xuat();
        String path = "D://obj.dat";
        System.out.println(DocGhiSerializable.ghiSerial(quanLyKhachHang,path));
        QuanLyKhachHang test = DocGhiSerializable.DocSerializable(path);
        test.xuat();
    }
}
