package BaiTapThucHanh1File.Bai2;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static void Menu()
    {
        System.out.println("Manager Candidate");
        System.out.println("Enter 1: Thêm thí sinh");
        System.out.println("Enter 2: Hiển thị thông tin về thí sinh: ");
        System.out.println("Enter 3: Tìm thí sinh theo ID");
        System.out.println("Enter 4: Lưu vào file");
        System.out.println("Enter 5: Đọc file");
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
                case 3: tuyenSinh.tim_Theo_SBD(); break;
                case 4: tuyenSinh.ghiFile();break;
                case 5: tuyenSinh.docFileXuatManHinh();break;
                case 0: return;

                default:
                    System.out.println("Chọn sai");
            }
        }

    }

}