package Buoi2.Bai3;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TamGiac {
    private double a;
    private double b;
    private double c;

    public TamGiac() {

    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài 3 cạnh tam giác: ");
        a= sc.nextDouble();
        b= sc.nextDouble();
        c= sc.nextDouble();

    }
    public void xuatThongTin(){
            System.out.println("độ dài 3 cạnh tam giác lần lượt là: " + a + " " + b + " " + c);
    }
    public void kiemTraLoaiTamGiac()
    {
        if((a + b > c) && (a + c > b) && (c + b > a))
        {
            System.out.print("Đây là tam giác ");
            if(a==b && b==c)
            {
                System.out.print("đều");
            }
            else
            {
                if((a*a + b*b == (int)pow(c,2)) || (a*a + c*c == (int)pow(b,2)) || (c*c + b*b == (int)pow(a,2)))
                {
                    System.out.print("vuông ");
                }
                if(a==b || b==c || c==a)
                {
                    System.out.print("cân");
                }

            }
            System.out.println();
        }
        else
        {
            System.out.println("Đây không phải là tam giác");
        }
    }
    public void tinhChuVi()
    {
        double chuVi = a+b+c;
        System.out.println("Chu vi tam giác là: " + chuVi);
    }

    public void tinhDienTich()
    {
        double p = (a+b+c) / 2;
        double dienTich= sqrt(p*(p - a)*(p - b)*(p - c));
        System.out.println("Diện tích tam giác là: " + dienTich);
    }
    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
