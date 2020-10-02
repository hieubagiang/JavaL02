package BaiTapKeThua.Bai13;

import java.util.Scanner;

public class PTGT {
    protected String hangSX;
    protected String namSX;
    protected int giaBan;
    protected String mau;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hangSX");
        hangSX= scanner.nextLine();
        System.out.println("Nhap namSX");
        namSX= scanner.nextLine();
        System.out.println("Nhap giaBan");
        giaBan= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap mau");
        mau= scanner.nextLine();

    }
    @Override
    public String toString() {
        return "" +
                "hangSX='" + hangSX + '\'' +
                ", namSX='" + namSX + '\'' +
                ", giaBan=" + giaBan +
                ", mau='" + mau + '\''
                ;
    }

    public PTGT() {
    }

    public PTGT(String hangSX, String namSX, int giaBan, String mau) {
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.giaBan = giaBan;
        this.mau = mau;
    }


    public void xuat() {
        System.out.println(toString());
    }
}
