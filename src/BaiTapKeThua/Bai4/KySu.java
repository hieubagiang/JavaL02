package BaiTapKeThua.Bai4;

import java.util.Scanner;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
    }

    @Override
    public void nhap() {

        super.nhap();
        System.out.println("nhập ngành đào tạo");
        nganhDaoTao = new Scanner(System.in).nextLine();
    }
    public void xuat()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "KySu{" + super.toString() +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}
