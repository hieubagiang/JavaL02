package BaiTapKeThua.Bai15;

import java.util.Scanner;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Diem {
    private float x;
    private float y;

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void khoangCach2Diem(Diem b)
    {
        double result  = sqrt(pow(b.x-this.x,2) + pow(b.y - this.y,2));

        System.out.print("Khoang cach 2 diem " + this.toString() + " va " + b.toString() + "la ");
        System.out.printf("%.2f\n",result);

    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tung do");
        x = sc.nextFloat();
        System.out.println("Nhap hoanh do");
        y = sc.nextFloat();
    }
    public void xuat()
    {
        System.out.printf("(%d,%d)",x,y);
        System.out.println();
    }
    public Diem() {
    }

    public Diem(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
