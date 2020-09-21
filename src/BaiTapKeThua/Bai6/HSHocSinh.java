package BaiTapKeThua.Bai6;

import java.util.Scanner;

public class HSHocSinh extends Nguoi {
    private String lop;
    private String khoaHoc;
    private String kyHoc;


    public HSHocSinh() {
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhập lop: ");
        lop = sc.nextLine();
        System.out.println("Nhập khoaHoc: ");
        khoaHoc = sc.nextLine();
        System.out.println("Nhập kyHoc: ");
        kyHoc = sc.nextLine();

    }

    @Override
    public String toString() {
        return "HSHocSinh{" +super.toString() +
                "lop='" + lop + '\'' +
                ", khoaHoc='" + khoaHoc + '\'' +
                ", kyHoc='" + kyHoc + '\'' +

                '}';
    }
}
