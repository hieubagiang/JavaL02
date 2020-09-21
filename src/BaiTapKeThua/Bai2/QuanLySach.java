package BaiTapKeThua.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    List<TaiLieu> listTaiLieu= new ArrayList<>();


    public void nhap()
    {
        //Nhập thông tin về các tài liệu
        System.out.println("nhap so tai lieu muon nhap");
        int n= new Scanner(System.in).nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Tai lieu thứ "+ (i+1));
            System.out.println("Enter a: để nhập Báo");
            System.out.println("Enter b: để nhập Sách");
            System.out.println("Enter c: để nhập Tạp chí");
            String loai = new Scanner(System.in).nextLine();
            TaiLieu taiLieu=null;
            switch (loai)
            {
                case "a" : taiLieu = new Bao();  break;
                case "b" : taiLieu = new Sach();  break;
                case "c" : taiLieu = new TapChi(); break;
            }
            taiLieu.nhapInfo();
            listTaiLieu.add(taiLieu);
        }
    }
    public void xuat()
    {
        System.out.println("DANH SACH TAI LIEU");
        for (TaiLieu obj : listTaiLieu)
        {
            obj.xuatInfo();
        }
    }
    //- Tìm kiếm tài liệu theo loại
    public void timKiemTaiLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai tai lieu can tim (Sach,Bao,TapChi): ");
        String loai = sc.nextLine();
        loai = loai.toLowerCase();
        if(loai.equals("sach")){
            for(TaiLieu tl : listTaiLieu){
                if(tl instanceof Sach){
                    tl.xuatInfo();
                }
            }
        }else if(loai.equals("bao")){
            for(TaiLieu tl : listTaiLieu){
                if(tl instanceof Bao){
                    tl.xuatInfo();
                }
            }
        }else if(loai.equals("tapchi")){
            for(TaiLieu tl : listTaiLieu){
                if(tl instanceof TapChi){
                    tl.xuatInfo();
                }
            }
        }
    }
    public void timKiemTaiLieuTheoID(){
        System.out.println("nhap ma tai lieu");
        String key = new Scanner(System.in).nextLine();
        boolean found = false;
        for(TaiLieu tl : listTaiLieu){
            if(key.equals(tl.maTaiLieu)){
                tl.xuatInfo();
                found = true;
            }
        }
        if(!found) System.out.println("Khong tim thay tai lieu co ID = " + key);
    }
}
