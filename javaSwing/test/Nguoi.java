
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
public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("  Nhập họ và tên: ");
        this.hoTen =scanner.nextLine();
        System.out.printf("  Nhập ngày sinh: ");
        this.ngaySinh = scanner.nextLine();
        System.out.printf("  Quê quán: ");
        this.queQuan = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Quê quán: " + queQuan);
    }
}
