package BaiTapKeThua.Bai16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DaGiac {
    protected int soCanh;
    protected List<Float> values;

    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so canh: ");
        soCanh = scanner.nextInt();
        for (int i = 0; i <soCanh ; i++) {
            System.out.println("Gia tri canh thu " + (i+1));
            values.add(scanner.nextFloat());
        }
    }

    @Override
    public String toString() {
        return "DaGiac{" +
                "soCanh=" + soCanh +
                ", values=" + values +
                '}';
    }

    public float tinhChuVi()
    {
        float chuVi = 0;
        for (int i = 0; i <values.size() ; i++) {
            chuVi+= values.get(i);
        }
        return chuVi;
    }
    public void xuat()
    {
        System.out.println(toString());
    }
    public DaGiac() {
        values = new ArrayList<>();
    }

    public DaGiac(int soCanh, List<Float> values) {
        values = new ArrayList<>();
        this.soCanh = soCanh;
        this.values = values;
    }
}
