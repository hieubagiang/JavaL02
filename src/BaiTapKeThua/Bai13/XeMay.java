package BaiTapKeThua.Bai13;

import java.util.Scanner;

public class XeMay  extends PTGT{
    private String congSuat;

    public void xuat()
    {
        System.out.println(toString());
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Nhap cong suat: ");
        congSuat = new Scanner(System.in).nextLine();
    }

    @Override
    public String toString() {
        return "XeMay{" + super.toString()+
                ", congSuat='" + congSuat + '\'' +
                '}';
    }

    public XeMay() {
    }

    public XeMay(String congSuat) {
        this.congSuat = congSuat;
    }
}
