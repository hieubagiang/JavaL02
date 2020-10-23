
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PhamDoanHieu
 */
public class SinhVien extends Nguoi {
    private String maSV;
    private String nganh;
    private int khoaHoc;

    public void xuat()
    {
         System.out.println("maSV: " + maSV);
         super.xuat();
        System.out.println("nganh: " + nganh);
        System.out.println("khoaHoc: " + khoaHoc);
    }
    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập maSV: ");
        this.maSV =scanner.nextLine();

        super.nhap(); // gọi phương thức cha Nguoi.nhap() để nhập các thông tin như họ tên,...
        System.out.printf("Nhập nganh: ");
        this.nganh =scanner.nextLine();
        System.out.printf("Nhập khoaHoc: ");
        this.khoaHoc =scanner.nextInt();
        scanner.nextLine();
    }
    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
}