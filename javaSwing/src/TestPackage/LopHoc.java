/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

/**
 *
 * @author PhamDoanHieu
 */

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
public class LopHoc {
    private String maLop;
    private String tenLop;
    private String ngayMo;
    private SinhVien[] danhSachSinhVien;
    private int n;
    private String giaoVien;

    public void xuat()
    {
        System.out.println("THONG TIN LOP HOC");
        // in ra hết data của lớp học
         System.out.println("maLop: " + maLop);
        System.out.println("tenLop: " + tenLop);
        System.out.println("ngayMo: " + ngayMo);
        System.out.println("DANH SACH SINH VIÊN");
        for(int i =0; i<n;i++)
        {
            System.out.println("Sinh viên thứ " + (i+1));
            danhSachSinhVien[i].xuat(); // lấy từng phần tử chạy phương thức xuất
        }
    }
    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin lớp học");
        System.out.printf("Nhập mã lớp học: ");
        this.setMaLop( scanner.nextLine());
        System.out.printf("Nhập tên lớp học: ");
        this.setTenLop( scanner.nextLine());
        System.out.printf("Ngày mở: ");
        this.setNgayMo( scanner.nextLine());
        System.out.print("Nhập tên Giáo Viên: ");
        this.setGiaoVien( scanner.nextLine());
        System.out.print("Nhập số SV: ");
        this.setN( scanner.nextInt());
        scanner.nextLine(); // danhSachSinhVienóa kí tự thừa \n 
        
        // cấp phát mảng sinh viên n phần tử
        danhSachSinhVien= new SinhVien[n];
        // bây giờ nhập các sinh viên vào 
        for(int i=0; i<n;i++) // duyệt vòng for đến n (đã nhập)
        {
            System.out.println("Nhâp SV thứ " + (i+1));
            SinhVien tmp = new SinhVien(); // khởi tạo 1 phần tử
            tmp.nhap();  // nhập data cho phần tử đó
            danhSachSinhVien[i]=tmp; // thêm phần tử vừa nhập vào mảng
        }
        
    }
    
    // constructor - hàm khởi tạo
    public LopHoc() {
        n=0;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public SinhVien[] getX() {
        return danhSachSinhVien;
    }

    public void setX(SinhVien[] danhSachSinhVien) {
        this.danhSachSinhVien = danhSachSinhVien;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }
}