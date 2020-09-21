package BaiTapKeThua.Bai2;

import java.util.Scanner;

public class Sach extends  TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }
    public void nhapInfo()
    {
        super.nhapInfo();
        System.out.println("Nhập tenTacGia: ");
        tenTacGia = new Scanner(System.in).nextLine();
        System.out.println("Nhập soTrang: ");
        soTrang = new Scanner(System.in).nextInt();

    }
    public void xuatInfo()
    {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Sach{" + super.toString() +
                "tenTacGia='" + tenTacGia   + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
