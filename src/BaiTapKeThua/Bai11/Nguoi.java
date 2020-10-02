package BaiTapKeThua.Bai11;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;

    public Nguoi() {
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hoTen");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngaySinh");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap queQuan");
        queQuan = sc.nextLine();

    }
    public void xuat()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", queQuan='" + queQuan + '\''
                ;
    }
}
