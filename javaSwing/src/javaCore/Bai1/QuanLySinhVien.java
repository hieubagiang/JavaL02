/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCore.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javaCore.Bai2.DocGhiSerializable;

/**
 *
 * @author Admin
 */
public class QuanLySinhVien {
    public List<SinhVien> listSV;

    public QuanLySinhVien() {
    listSV = new ArrayList<>();
    }
    
    public void xuat() {
        System.out.println("DANH SACH THI SINH");
        for (int i = 0; i < listSV.size(); i++) {
            System.out.println(listSV.get(i).toString());
        }
    }
    
     public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số thì sinh muốn nhập: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            
            SinhVien sv = new SinhVien();
           sv.nhap();
            listSV.add(sv);
        }

    }

    public void ghiFile() {
        String location = "D:\\DataC\\CT030419\\OneDrive - actvn.edu.vn\\Documents\\Kit\\NetBeansProjects\\JavaSwingTrain\\fileSave";
        boolean kq = DocGhiSerializable.ghiSerial(this, location+"\\KeThuaBai1.dat");
        if (kq) {
            System.out.println("Thanh cong");
        } else {
            System.out.println("that bai");
        }

    }
    public SinhVien docFile()
    {
        String location = "D:\\DataC\\CT030419\\OneDrive - actvn.edu.vn\\Documents\\Kit\\NetBeansProjects\\JavaSwingTrain\\fileSave";
        SinhVien data = new SinhVien();
        data = (SinhVien) DocGhiSerializable.DocSerializable(location+"\\KeThuaBai1.dat");
        return data;
    }
}
