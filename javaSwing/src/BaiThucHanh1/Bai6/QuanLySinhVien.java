package BaiThucHanh1.Bai6;


import HieuCustomizeLibrary.DocGhiSerializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        
        boolean kq = DocGhiSerializable.ghiSerial(this, "bai6.dat");
        if (kq) {
            System.out.println("Thanh cong");
        } else {
            System.out.println("that bai");
        }

    }

    public SinhVien docFile()
    {
        String location = "";
        SinhVien data = new SinhVien();
        data = (SinhVien) DocGhiSerializable.DocSerializable(location+"bai6.dat");
        return data;
    }
}