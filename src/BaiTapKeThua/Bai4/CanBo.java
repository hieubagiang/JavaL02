package BaiTapKeThua.Bai4;

import java.util.Scanner;

public class CanBo {
    protected String hoTen;
    protected String namSinh;
    protected String gioiTinh;
    protected String diaChi;

    public CanBo() {
    }
    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hoTen");
        hoTen= scanner.nextLine();
        System.out.println("Nhap namSinh");
        namSinh= scanner.nextLine();
        System.out.println("Nhap gioiTinh");
        gioiTinh= scanner.nextLine();
        System.out.println("Nhap diaChi");
        diaChi= scanner.nextLine();

    }
    public void xuat()
    {

    }
    @Override
    public String toString() {
        return
                "hoTen='" + hoTen + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\''
                ;
    }
}
