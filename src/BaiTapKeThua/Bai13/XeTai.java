package BaiTapKeThua.Bai13;

import java.util.Scanner;

public class XeTai extends PTGT{
    private int trongTai;

    public void xuat()
    {
        System.out.println(toString());
    }
    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap trongTai");
        trongTai = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "XeTai{" +super.toString() +
                ", trongTai=" + trongTai +
                '}';
    }
}
