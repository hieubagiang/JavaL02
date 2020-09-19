package BaiTapKeThua.Bai8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    protected Date ngaySinh;
    protected String CMND;

    public Nguoi() {
        ngaySinh = new Date();
    }

    public void nhapThongTin()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap hoTen");
        hoTen= scan.nextLine();
        System.out.print("Nhap ngay sinh (dd-mm-yyyy): ");
        String ns=scan.nextLine();
        this.ngaySinh=chuyenStringDate(ns);
        System.out.println("Nhap tuoi");
        CMND = scan.nextLine();
    }

    public Date chuyenStringDate(String str)
    {
        Date ns=null;
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        try
        {
            ns=sdf.parse(str);
        }catch(Exception e)
        {
            System.out.println("Loi dinh dang ngay thang.!");
        }
        return ns;
    }

    public void hienThongTin()
    {
        System.out.println("Ho va ten: "+this.hoTen);
        System.out.println("Ngay Sinh: "+this.ngaySinh);
        System.out.println("Chung Minh Nhan Dan: "+this.CMND);
    }
}
