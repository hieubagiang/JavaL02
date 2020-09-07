package Buoi1;

import java.util.Scanner;

public class Bai4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi: ");
        String chuoi = sc.nextLine();
        int soChuHoa=0;
        int soChuThuong=0;
        int soChuSo=0;
        int soKyTuDacBiet=0;
        int soKhoangTrang=0;
        for(int i=0;i<chuoi.length(); i++)
        {
            char ch = chuoi.charAt(i);
            if (!Character.isDigit(ch) && !Character.isLetter(ch) && !Character.isSpaceChar(ch)) {
                soKyTuDacBiet++;
            } else if (Character.isDigit(ch)) {
                soChuSo++;
            } else if (Character.isSpaceChar(ch)) {
                soKhoangTrang++;
            } else if(Character.isUpperCase(ch)){
                soChuHoa++;
            } else if(Character.isLowerCase(ch))
            {
                soChuThuong++;
            }

        }
        System.out.println("Số chữ hoa: " + soChuHoa);
        System.out.println("Số chữ thường: " + soChuThuong);
        System.out.println("Số chữ số: " + soChuSo);
        System.out.println("Số ký tự đạc biệt: " + soKyTuDacBiet);
        System.out.println("Số khoảng trắng: " + soKhoangTrang);
    }
}
