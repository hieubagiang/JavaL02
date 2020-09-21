package BaiTapKeThua.Bai4;

import java.util.Scanner;

public class CongNhan extends  CanBo{
    private String bac;
    public void nhap()
    {
        super.nhap();
        System.out.println("Nhap bậc: ");
        bac= new Scanner(System.in).nextLine();
    }
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "CongNhan{" + super.toString()+
                "bac='" + bac + '\'' +
                '}';
    }
}
