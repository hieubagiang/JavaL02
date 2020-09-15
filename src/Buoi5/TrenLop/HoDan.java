package Buoi5.TrenLop;


import java.util.ArrayList;
import java.util.Scanner;

public class HoDan {
    private int soThanhVien;
    private String diaChi;
    private ArrayList<Nguoi> dshd = new ArrayList<>();

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nhà của hộ dân: ");
        diaChi = sc.nextLine();
        System.out.println("Nhập số người trong hộ dân "+ diaChi);
        soThanhVien = sc.nextInt();
        for(int i = 0;i<soThanhVien; i++ )
        {
            System.out.println("Nhap nguoi thu "+ (i+1));
            Nguoi tmp = new Nguoi();
            tmp.nhap();
            dshd.add(tmp);
        }
    }

    public void xuat()
    {
        System.out.println("Hộ dân: " + diaChi
        + "\t có số thành viên: " + soThanhVien );
        for(int i=0; i<dshd.size(); i++)
        {
            dshd.get(i).xuat();
        }

    }
    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public ArrayList<Nguoi> getDshd() {
        return dshd;
    }

    public void setDshd(ArrayList<Nguoi> dshd) {
        this.dshd = dshd;
    }
}