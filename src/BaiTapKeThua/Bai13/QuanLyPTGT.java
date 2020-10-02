package BaiTapKeThua.Bai13;


import BaiTapKeThua.Bai12.CBGV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyPTGT {
    List<PTGT> ptgtList = new ArrayList<>();

    public void nhap()
    {
        System.out.println("Nhập số PTGT muốn nhập: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhập loại phương tiện bạn đăng ký (oto,xemay,xetai): ");
            String loai = new Scanner(System.in).nextLine();
            PTGT tmp = null;
            if(loai.equals("oto"))
            {
                tmp = new OTo();
            }
            else if(loai.equals("xemay"))
            {
                tmp  = new XeMay();
            }
            else if(loai.equals("xetai"))
            {
                tmp = new XeTai();
            }
            tmp.nhap();
            ptgtList.add(tmp);
        }
    }
    public void xuat()
    {
        System.out.println("\t\tDANH SACH CBGV");
        ptgtList.forEach(PTGT::xuat);
    }
    public void timTheoMau()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập màu xe muốn tìm: ");
        String mau  = scanner.nextLine();
        System.out.println("\t\tDANH SACH XE MAU "+ mau.toUpperCase());
        for (PTGT ptgt : ptgtList) {
            if (ptgt.mau.equals(mau)) {
                ptgt.xuat();
            }
        }
    }
}
