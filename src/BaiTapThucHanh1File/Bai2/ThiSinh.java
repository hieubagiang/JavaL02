package BaiTapThucHanh1File.Bai2;

import java.io.Serializable;
import java.util.Scanner;

public class ThiSinh implements Serializable {
    protected String soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected String uuTien;

    public ThiSinh() {
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập soBaoDanh: ");
        soBaoDanh = sc.nextLine();
        System.out.println("Nhập hoTen: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập diaChi: ");
        diaChi = sc.nextLine();
        System.out.println("Nhập uuTien: ");
        uuTien = sc.nextLine();
    }
}
