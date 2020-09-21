package Buoi6_except_file.Bai2;

import java.io.Serializable;
import java.util.Scanner;

public class KhachHang implements Serializable {
    private String ma;
    private String ten;
    private String namSinh;



    public KhachHang() {
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma");
        ma = sc.nextLine();
        System.out.println("Nhap ten");
        ten = sc.nextLine();
        System.out.println("Nhap namSinh");
        namSinh = sc.nextLine();
    }
    public KhachHang(String ma, String ten, String namSinh) {
        this.ma = ma;
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getNamSinh() {
        return namSinh;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", namSinh='" + namSinh + '\'' +
                '}';
    }

    public void xuat() {
        System.out.println(toString());
    }
}
