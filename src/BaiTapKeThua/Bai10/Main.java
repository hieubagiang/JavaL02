package BaiTapKeThua.Bai10;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static void Menu()
    {
        System.out.println("\t\tManager Candidate");
        System.out.println("Enter 1: Thêm thí sinh");
        System.out.println("Enter 2: Xuat danh sach thí sinh");
        System.out.println("Enter 3: Hiển thị thông tin về thí sinh: ");
        System.out.println("Enter 4: Tìm thí sinh theo ID");
        System.out.println("Enter 5: Lưu vào file");
        System.out.println("Enter 6: Đọc file");
        System.out.println("Enter 0: Exit");
        System.out.println("Vui lòng chọn: ");
    }
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();

        int chon= 0;
        while (true)
        {
            Menu();
            chon = scanner.nextInt();
            scanner.nextLine();
            switch (chon)
            {
                case 1: tuyenSinh.nhap(); break;
                case 2: tuyenSinh.xuat(); break;
                case 3: tuyenSinh.hienThiThongTin1ThiSinh();break;
                case 4: tuyenSinh.tim_Theo_SBD(); break;
                case 5: tuyenSinh.ghiFile();break;
                case 6: tuyenSinh.docFileXuatManHinh();break;
                case 0: return;

                default:
                    System.out.println("Chọn sai");
            }
        }

    }

}