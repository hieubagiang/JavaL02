package BaiTapKeThua.Bai12;

import java.util.Scanner;

public class CBGV extends Nguoi {
    private int luongCung;
    private int thuong;
    private int phat;
    private int luongThucLinh;

    public void nhap()
    {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap luongCung: ");
        luongCung = scanner.nextInt();
        System.out.println("Nhap thuong: ");
        thuong = scanner.nextInt();
        System.out.println("Nhap phat: ");
        phat = scanner.nextInt();
        luongThucLinh = luongCung + thuong - phat;
    }

    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CBGV{" + super.toString()+
                ", luongCung=" + luongCung +
                ", thuong=" + thuong +
                ", phat=" + phat +
                ", luongThucLinh=" + luongThucLinh +
                '}';
    }
}
