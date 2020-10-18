package BaiTapKeThua.Bai12;

import BaiTapKeThua.Bai10.ThiSinh;
import BaiTapThucHanh1File.Bai1.DocGhiSerializable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCBGV {
    List<CBGV> cbgvList = new ArrayList<>();

    public void nhap()
    {
        System.out.println("Nhập số CBGV muốn nhập: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i <n ; i++) {
            CBGV tmp = new CBGV();
            tmp.nhap();
            cbgvList.add(tmp);
        }
    }
    public void xuat()
    {
        System.out.println("\t\tDANH SACH CBGV");
        cbgvList.forEach(CBGV::xuat);
    }

    public void ghiFile() {
        boolean kq = DocGhiSerializable.ghiSerial(cbgvList, "Bai12.dat");
        if (kq) {
            System.out.println("Ghi Thanh cong");
        } else {
            System.out.println("Ghi that bai");
        }
    }

    public void docFile() {

            ArrayList<CBGV> list = new ArrayList<>();
            list = (ArrayList<CBGV>) DocGhiSerializable.DocSerializable("Bai12.dat");
            System.out.println("Dữ liệu từ File");
            list.forEach(CBGV::xuat);

    }

    public void Menu()
    {
        System.out.println("\t\tQUAN LI CAN BO GIAO VIEN");
        System.out.println("Enter 1: Thêm CBGV");
        System.out.println("Enter 2: Xuat danh sach ");
        System.out.println("Enter 3: Lưu vào file");
        System.out.println("Enter 4: Đọc file");
        System.out.println("Enter 0: Exit");
        System.out.println("Vui lòng chọn: ");
    }
}
