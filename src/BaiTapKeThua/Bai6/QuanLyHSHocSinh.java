package BaiTapKeThua.Bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHSHocSinh {
    List<HSHocSinh> hocSinhList;

    public QuanLyHSHocSinh() {
        hocSinhList = new ArrayList<>();
    }

    public void nhap() {
        System.out.println("Nhap so Ho So muon nhap: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            HSHocSinh hsHocSinh = new HSHocSinh();
            hsHocSinh.nhap();
            hocSinhList.add(hsHocSinh);
        }
    }

    public void xuat()
    {
        System.out.println("\t\tDANH SACH HO SO HOC SINH");
        for(HSHocSinh tmp : hocSinhList)
        {
            tmp.xuat();
        }
    }
    public List<String> buildSearchData()
    {
        List<String> keywordList  = new ArrayList<>();
        for(HSHocSinh tmp : hocSinhList)
        {
            String txt = tmp.toString();
            keywordList.add(txt);
        }
        return keywordList;
    }
    public void hienThiTheoNamvaQue(String nam, String queQuan)
    {
        List<String> keywordList = buildSearchData();
        System.out.println("DANH SACH HOC SINH SINH 1985 QUE THAI NGUYEN");
        for (int i = 0; i <keywordList.size() ; i++) {
            if(hocSinhList.get(i).queQuan.equals(queQuan) && hocSinhList.get(i).ngaySinh.equals(nam))
            {
                hocSinhList.get(i).xuat();
            }
        }
    }
    public void hienThiTheoKeyWord(String keyword)
    {
        List<String> keywordList = buildSearchData();
        System.out.println("Tìm theo keyword");
        for (int i = 0; i <keywordList.size() ; i++) {
            if(keywordList.get(i).contains(keyword))
            {
                hocSinhList.get(i).xuat();
            }
        }
    }

}
