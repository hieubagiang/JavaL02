package Buoi5.TrenLop.Bai1;

import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected int namSinh;

    public Nguoi(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public Nguoi() {
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hoTen");
        hoTen = sc.nextLine();
        System.out.println("Nhap namSinh");
        namSinh = sc.nextInt();
    }

    @Override
    public String toString() {
        return
                "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh
                ;
    }
}
