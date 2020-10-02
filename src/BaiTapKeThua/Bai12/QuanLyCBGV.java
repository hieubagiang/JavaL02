package BaiTapKeThua.Bai12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCBGV {
    List<CBGV> cbgvList = new ArrayList<>();

    public void nhap()
    {
        System.out.println("Nhập số CBGV muốn nhập: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i <n ; i++) {
            CBGV tmp = new CBGV();
            tmp.nhap();
            cbgvList.add(tmp);
        }
    }
    public void xuat()
    {
        System.out.println("\t\tDANH SACH CBGV");
        cbgvList.forEach(o-> o.xuat());
    }
}
