package BaiTapKeThua.Bai4;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String congViec;

    public void nhap()
    {
        super.nhap();
        System.out.println("nhập công việc");
        congViec = new Scanner(System.in).nextLine();
    }

    public NhanVien() {

    }
    public void xuat()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "NhanVien{" + super.toString() +
                "congViec='" + congViec + '\'' +
                '}';
    }
}
