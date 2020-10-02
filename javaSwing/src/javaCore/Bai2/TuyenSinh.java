/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCore.Bai2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TuyenSinh implements Serializable{

    public List<ThiSinh> listThiSinh;

    public TuyenSinh() {
        this.listThiSinh = new ArrayList<>();
    }

    public void xuat() {
        System.out.println("DANH SACH THI SINH");
        for (int i = 0; i < listThiSinh.size(); i++) {
            System.out.println(listThiSinh.get(i).toString());
        }
    }

    public void tim_Theo_SBD() {
        System.out.println("Bạn muốn tìm thí sinh có SBD nào?");
        String sBD_Key = new Scanner(System.in).nextLine();
        for (int i = 0; i < listThiSinh.size(); i++) {
            if (sBD_Key.equals(listThiSinh.get(i).hoTen)) {
                System.out.println(listThiSinh.get(i).toString());
            }
        }
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số thì sinh muốn nhập: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập a: để nhập thí sinh khối A");
            System.out.println("Nhập b: để nhập thí sinh khối B");
            System.out.println("Nhập c: để nhập thí sinh khối C");
            String loai = scanner.nextLine();
            ThiSinh thiSinh = null;
            switch (loai.toLowerCase()) {
                case "a": {
                    thiSinh = new ThiSinhKhoiA();
                    thiSinh.nhap();
                    break;
                }
                case "b": {
                    thiSinh = new ThiSinhKhoiB();
                    thiSinh.nhap();
                    break;
                }
                case "c": {
                    thiSinh = new ThiSinhKhoiC();
                    thiSinh.nhap();
                    break;
                }
                default:
                    System.out.println("Invalid");
                    break;
            }
            listThiSinh.add(thiSinh);
        }

    }

    public void ghiFile() {
        String location = "D:\\DataC\\CT030419\\OneDrive - actvn.edu.vn\\Documents\\Kit\\NetBeansProjects\\JavaSwingTrain\\fileSave";
        boolean kq = DocGhiSerializable.ghiSerial(this, location+"\\kethuabai1.dat");
        if (kq) {
            System.out.println("Thanh cong");
        } else {
            System.out.println("that bai");
        }

    }
    public TuyenSinh docFile()
    {
        String location = "D:\\DataC\\CT030419\\OneDrive - actvn.edu.vn\\Documents\\Kit\\NetBeansProjects\\JavaSwingTrain\\fileSave";
        TuyenSinh data = new TuyenSinh();
        data = (TuyenSinh) DocGhiSerializable.DocSerializable(location+"\\kethuabai1.dat");
        return data;
    }
}