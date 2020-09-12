package Buoi2.Bai1;

import java.util.Scanner;

public class HinhChuNhat {
    private float chieuDai;
    private float chieuRong;

    public void nhapThongSo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieuDai");
        chieuDai = sc.nextFloat();
        System.out.println("Nhap chieuRong");
        chieuRong = sc.nextFloat();
    }
    public void tinhDienTich()
    {
        System.out.println("Diện tích của hình chữ nhật là: "+ chieuDai * chieuRong);
    }
    public void tinhChuVi()
    {
        System.out.println("Chu vi hình chữ nhật là: "+ (chieuRong+chieuDai)*2);
    }

    @Override
    public String
    toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }
}
