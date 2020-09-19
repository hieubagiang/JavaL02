package BaiTapKeThua.Bai7;

import java.util.Scanner;

public class Nguoi {
    public String hoTen;
    public int tuoi;

    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap hoTen");
        hoTen = scanner.nextLine();
        System.out.println("Nhap tuoi");
        tuoi = scanner.nextInt();

    }
    public void xuat()
    {
        System.out.println("ho ten: " + hoTen + ", tuoi: " + tuoi);
    }
    public Nguoi() {

    }

    public Nguoi(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
