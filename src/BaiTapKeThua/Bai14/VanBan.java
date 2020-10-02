package BaiTapKeThua.Bai14;

import java.util.Scanner;

public class VanBan {
    private String text;

    public void demSoTu()
    {
        String tmp  = text.toLowerCase();
        int dem = 0;
        for (int i = 0; i <text.length() ; i++) {
            if(tmp.charAt(i) == 'h')
            {
                dem++;
            }
        }
        System.out.println("số ký tự 'h' trong xâu là: " + dem);
    }
    public void chuanHoaXau()
    {
        String tmp = text.trim().replaceAll(" +", " ");
        System.out.println(tmp);
    }
    public VanBan(String text) {
        this.text = text;
    }

    public VanBan() {
    }

    public void nhap() {
        System.out.println("Nhập chuỗi: ");
        text = new Scanner(System.in).nextLine();
    }
    public void xuat()
    {
        System.out.println(text);
    }
}
