package BaiTapKeThua.Bai3;

import java.util.Scanner;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc() {
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phanThuc");
        phanThuc = sc.nextDouble();
        System.out.println("nhap phanAo");
        phanAo = sc.nextDouble();
    }
    public void xuat()
    {
        System.out.println(phanThuc + " + " + phanAo + "i");
    }
    public void congSoPhuc(SoPhuc soPhuc)
    {
        SoPhuc tmp = new SoPhuc();
        tmp.phanThuc = this.phanThuc + soPhuc.phanThuc;
        tmp.phanAo = this.phanAo + soPhuc.phanAo;
        tmp.xuat();
    }
    public void nhanSoPhuc(SoPhuc soPhuc)
    {
        SoPhuc tmp = new SoPhuc();
        tmp.phanThuc = this.phanThuc*soPhuc.phanThuc - this.phanAo*soPhuc.phanAo;
        tmp.phanAo = this.phanThuc*soPhuc.phanAo+this.phanAo*soPhuc.phanThuc;
        tmp.xuat();
    }
}
