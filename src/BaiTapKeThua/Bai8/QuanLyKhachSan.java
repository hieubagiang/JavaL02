package BaiTapKeThua.Bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyKhachSan {

    List<KhachSan> listCustomer = new ArrayList<>();
    int n;
    private Scanner sc = new Scanner(System.in);
    public void nhap()
    {
        System.out.print("Nhap so luong khach hang: ");
        n=sc.nextInt();
        sc.nextLine();
        for(int i =0; i<n; i++)
        {
            KhachSan ks = new KhachSan();
            ks.nhapThongTin();
            listCustomer.add(ks);
        }
    }
    public void xuat()
    {
        System.out.println("\t\tDANH SACH");
        for (int i=0; i<listCustomer.size(); i++)
        {
            listCustomer.get(i).hienThongTin();
        }
    }
}
