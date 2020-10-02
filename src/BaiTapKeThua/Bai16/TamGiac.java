package BaiTapKeThua.Bai16;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class TamGiac extends DaGiac{

    public void nhap()
    {
        Scanner scanner =new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            System.out.println("Gia tri canh thu " + (i+1));
            values.add(scanner.nextFloat());
        }
    }
    public void xuat()
    {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "TamGiac{"+
                values +"}";
    }

    public double tinhDienTich()
    {
        float  p  = super.tinhChuVi()/2;
        return sqrt(p*(p-values.get(0))*(p-values.get(1))*(p-values.get(2)));
    }

}
