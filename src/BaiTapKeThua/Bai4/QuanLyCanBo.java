package BaiTapKeThua.Bai4;

import BaiTapKeThua.Bai2.Bao;
import BaiTapKeThua.Bai2.Sach;
import BaiTapKeThua.Bai2.TaiLieu;
import BaiTapKeThua.Bai2.TapChi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyCanBo {
    List<CanBo> canBoList;
    int n;
    Scanner sc = new Scanner(System.in);

    public QuanLyCanBo() {
        canBoList = new ArrayList<>();
    }
    public void nhap()
    {
        //Nhập thông tin về các tài liệu
        System.out.println("nhap so người muon nhap");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Người thứ "+ (i+1));
            System.out.println("Enter a: để nhập NhanVien");
            System.out.println("Enter b: để nhập CongNhan");
            System.out.println("Enter c: để nhập KySu");
            String loai = new Scanner(System.in).nextLine();
            CanBo tmp = new CanBo();
            switch (loai)
            {
                case "a" : tmp = new NhanVien();  break;
                case "b" : tmp = new CongNhan();  break;
                case "c" : tmp = new KySu(); break;
            }
            tmp.nhap();
            canBoList.add(tmp);
        }
    }
    public void xuat()
    {
        System.out.println("DANH SACH NHAN VIEN");
        for (CanBo obj : canBoList)
        {
            obj.xuat();
        }
    }
    public void timKiemTheoHoTen(){
        System.out.println("nhap hoTen");
        String key = new Scanner(System.in).nextLine();
        boolean found = false;
        for(CanBo canBo : canBoList){
            if(key.equals(canBo.hoTen)){
                canBo.xuat();
                found = true;
            }
        }
        if(!found) System.out.println("Khong tim thay tai lieu co ID = " + key);
    }
}
