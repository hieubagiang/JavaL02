package BaiTapKeThua.Bai17;

import java.util.List;
import java.util.Scanner;

public class MaTran {
    private int m;
    private int n;
    private int[][] matrix;

    public MaTran() {
    }

    public MaTran(int m, int n) {
        this.m = m;
        this.n = n;
        this.matrix = new int[m][n];
    }
    public void  nhap()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap m: ");
        m = scanner.nextInt();
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
matrix= new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.printf("a[%d][%d] = ",i,j);
                matrix[i][j]  = scanner.nextInt();
            }
        }
    }
    public void xuat()
    {
        System.out.println("xuatMaTran");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d",matrix[i][j]);
            }
            System.out.println();
        }
    }
    public MaTran congMaTran(MaTran b)
    {
        if(this.m == b.m && this.n == b.n)
        {
            MaTran c = new MaTran(m,n);

            for (int i = 0; i <m ; i++) {
                for (int j = 0; j <n ; j++) {
                    c.matrix[i][j] = this.matrix[i][j] + b.matrix[i][j];
                }
            }
            return c;
        }
        else
        {
            System.out.println("");
            return null;
        }
    }
}
