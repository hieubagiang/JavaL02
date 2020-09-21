package BaiTapKeThua.Bai2;

import java.util.Scanner;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao() {

    }
    public void nhapInfo()
    {
        super.nhapInfo();
        System.out.println("Nhập ngày phát hành: ");
        ngayPhatHanh = new Scanner(System.in).nextLine();
    }
    public void xuatInfo()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bao{" + super.toString() +
                "ngayPhatHanh='" + ngayPhatHanh + '\'' +
                '}';
    }
}
