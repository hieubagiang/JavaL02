package Buoi5.TrenLop;

import javax.net.ssl.HostnameVerifier;
import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private  String tenKhuPho;
    private int soHoDan;
    private ArrayList<HoDan> dskp = new ArrayList<>();

    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten khu pho");
        tenKhuPho = sc.nextLine();
        System.out.println("Nhap so ho dan: ");
        soHoDan = sc.nextInt();
        for(int i=0; i<soHoDan; i++)
        {
            System.out.println("Nhap ho dan thu " + (i+1));
            HoDan hd = new HoDan();
            hd.nhap();
            dskp.add(hd);
        }

    }
    public void xuat()
    {
        System.out.println(" khu pho: " + tenKhuPho
                        + "\t co so ho dan" + soHoDan
        );
        for (HoDan hoDan : dskp) {
            hoDan.xuat();
        }
    }
    public String getTenKhuPho() {
        return tenKhuPho;
    }

    public void setTenKhuPho(String tenKhuPho) {
        this.tenKhuPho = tenKhuPho;
    }

    public int getSoHoDan() {
        return soHoDan;
    }

    public void setSoHoDan(int soHoDan) {
        this.soHoDan = soHoDan;
    }

    public ArrayList<HoDan> getHoDanArrayList() {
        return dskp;
    }

    public void setHoDanArrayList(ArrayList<HoDan> dskp) {
        this.dskp = dskp;
    }
}
