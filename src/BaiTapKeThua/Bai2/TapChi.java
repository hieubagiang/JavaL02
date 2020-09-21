package BaiTapKeThua.Bai2;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private String soPhatHanh;
    private int thangPhatHanh;

    public void nhapInfo()
    {
        super.nhapInfo();
        System.out.println("Nhập soPhatHanh: ");
        soPhatHanh = new Scanner(System.in).nextLine();
        System.out.println("Nhập thangPhatHanh: ");
        thangPhatHanh = new Scanner(System.in).nextInt();

    }
    public TapChi() {
    }
    public void xuatInfo()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "TapChi{" + super.toString() +
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
