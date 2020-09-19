package BaiTapKeThua.Bai2;

import java.util.Scanner;

public class TaiLieu {
    protected String maTaiLieu;
    protected String nhaXB;
    protected String soBanPhatHanh;

    public TaiLieu() {
    }

    public void nhapInfo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập maTaiLieu");
        maTaiLieu= scanner.nextLine();
        System.out.println("Nhập nhaXB");
        nhaXB= scanner.nextLine();
        System.out.println("Nhập soBanPhatHanh");
        soBanPhatHanh= scanner.nextLine();
    }
    public void xuatInfo()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return  "maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXB='" + nhaXB + '\'' +
                ", soBanPhatHanh='" + soBanPhatHanh + '\''
                ;
    }
}
