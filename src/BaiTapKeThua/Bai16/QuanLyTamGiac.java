package BaiTapKeThua.Bai16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyTamGiac {
    List<TamGiac> tamGiacList;

    public QuanLyTamGiac() {
        tamGiacList = new ArrayList<>();
    }

    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tam giac muon nhap: ");
        int n = scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhap tam giac thu " + (i+1));
            TamGiac tmp  = new TamGiac();
            tmp.nhap();
            tamGiacList.add(tmp);
        }
    }
    public void timTamGiacCoDienTichLonNhat()
    {
        int max = 0;
        for (int i = 0; i <tamGiacList.size() ; i++) {
            max = tamGiacList.get(max).tinhDienTich() > tamGiacList.get(i).tinhDienTich() ? max : i;
        }
        System.out.println("Tam giac co dien tich lon nhat la: ");
        tamGiacList.get(max).xuat();
    }
    public void xuat()
    {
        System.out.println("\t\tDANH SACH TAM GIAC");
        tamGiacList.forEach(o-> o.xuat());
    }
}
