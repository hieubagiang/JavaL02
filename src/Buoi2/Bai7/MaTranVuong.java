package Buoi2.Bai7;

import java.util.ArrayList;
import java.util.Scanner;

public class MaTranVuong {
    private int capMaTran;
    int[][] maTran;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cấp ma trận: ");
        capMaTran = sc.nextInt();
        maTran = new int[capMaTran][capMaTran];
        for (int i = 0; i < capMaTran; i++) {
            for (int j = 0; j < capMaTran; j++) {
                System.out.printf("matran[%d][%d]=",i,j);
                maTran[i][j] = sc.nextInt();
            }
        }
    }
    public void xuat()
    {
        for (int i = 0; i < capMaTran; i++) {
            for (int j = 0; j < capMaTran; j++) {
                System.out.printf("%5d",maTran[i][j]);
            }
            System.out.println();
        }
    }
    public void tinhTong()
    {
        int tong_CheoChinh = 0;
        int tong_CheoPhu = 0;
        for (int i = 0; i < capMaTran; i++) {
            for (int j = 0; j < capMaTran; j++) {
                if(i==j)
                {
                    tong_CheoChinh+= maTran[i][j];
                }
                if(i+j==capMaTran-1)
                {
                    tong_CheoPhu+=maTran[i][j];
                }
            }
        }
        System.out.println("Tổng chéo chính = " + tong_CheoChinh);
        System.out.println("Tổng chéo phụ = " + tong_CheoPhu);
    }
    public MaTranVuong() {
    }

    public MaTranVuong(int capMaTran, int[][] maTran) {
        this.capMaTran = capMaTran;
        this.maTran = maTran;
    }
}
