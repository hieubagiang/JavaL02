package BaiTapKeThua.Bai15;

import Buoi2.Bai7.MaTranVuong;

import java.util.Scanner;

public class HinhTron{
    Diem i;
    float banKinh;

    public HinhTron(Diem i, float banKinh) {
        i = new Diem();
        this.i = i;
        this.banKinh = banKinh;
    }

    public HinhTron() {
        i = new Diem();
    }
    public void dienTich()
    {
        double dienT = Math.PI*banKinh*banKinh;
        System.out.println("Dien tich hinh tron la: "+dienT);
    }
    public void chuVi()
    {
        double chuV = 2* Math.PI * banKinh;
        System.out.println("Chu vi hinh tron la: "+chuV);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tâm hình tròn (x,y)");
        System.out.println("x: ");
        float x = sc.nextFloat();
        i.setX(x);
        System.out.println("y: ");
        float y = sc.nextFloat();
        i.setY(y);

        System.out.println("Nhập độ dài bán kính: ");
        banKinh = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "i=" + i.toString() +
                ", banKinh=" + banKinh +
                '}';
    }


    public void xuat() {
        System.out.println(toString());
    }
}
