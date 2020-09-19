package BaiTapKeThua.Bai8;

import java.util.Scanner;

public class KhachSan extends Nguoi{
    private String soNgayTro;
    private String loaiPhongTro;
    private String giaPhongTro;

    public KhachSan() {
    }
    public void nhapThongTin()
    {
        super.nhapThongTin();
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so ngay tro: ");
        soNgayTro=sc.nextLine();
        System.out.print("Nhap loai phong tro: ");
        this.loaiPhongTro=sc.nextLine();
        System.out.print("Nhap gia phong: ");
        this.giaPhongTro=sc.nextLine();
    }
    public void hienThongTin()
    {
        super.hienThongTin();
        System.out.println("So Ngay Tro: "+this.soNgayTro);
        System.out.println("Loai Phong Tro: "+this.loaiPhongTro);
        System.out.println("Gia Phong: "+this.giaPhongTro);
    }
}
