package BaiTapKeThua.Bai12;

import BaiTapKeThua.Bai4.QuanLyCanBo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyCBGV quanLyCBGV = new QuanLyCBGV();

        int chon = -1;
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            
            quanLyCBGV.Menu();
            chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon)
            {
                case 1: quanLyCBGV.nhap(); break;
                case 2: quanLyCBGV.xuat(); break;
                case 3: quanLyCBGV.ghiFile();break;
                case 4: quanLyCBGV.docFile(); break;
                case 0: return;

                default:
                    System.out.println("Chọn sai");
            }
        }
    }
}
