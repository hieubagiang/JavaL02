package Buoi2.Bai3;


import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        //TamGiac tamGiac = new TamGiac(4,4,4); // case tam giác đều
        //TamGi.,.k--ac tamGiac = new TamGiac(3,4,5); // case tam giác vuông
        //TamGiac tamGiac = new TamGiac(3,3,5); // case tam giác cân
        TamGiac tamGiac = new TamGiac(4,4,4*sqrt(2)); // case tam giác vuông cân


        //tamGiac.nhapThongTin();

        tamGiac.xuatThongTin();
        tamGiac.kiemTraLoaiTamGiac();
        tamGiac.tinhChuVi();
        tamGiac.tinhDienTich();


    }
}
