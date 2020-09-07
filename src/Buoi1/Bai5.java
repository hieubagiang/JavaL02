package Buoi1;

import java.util.Arrays;
import java.util.Scanner;

import static Buoi1.Bai2.laSNT;

public class Bai5 {
    static Scanner sc = new Scanner(System.in);

    public static void Menu()
    {
        System.out.println("1. Tìm phần tử lớn nhất của ma trận cùng chỉ số của số đó");
        System.out.println("2. Tìm và in ra các phần tử là số nguyên tố của ma trận");
        System.out.println("3. Sắp xếp tất cả các cột của ma trận theo thứ tự tăng dần");
        System.out.println("0. Thoat");
    }
    public static void TimMaxMaTrix(int[][] a, int m,int n)
    {
        int max_dong=0;
        int max_cot=0;
        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                if(a[max_dong][max_cot] < a[i][j])
                {
                    max_dong = i;
                    max_cot = j;
                }
            }
        }
        System.out.printf("Max of Matrix : a[%d][%d] = %d\n", max_dong,max_cot, a[max_dong][max_cot]);
    }
    public static void Sort_Theo_Cot(int[][] a, int m, int n) {
        // chuyển sang mảng thường
        int[] tmp_arr = new int[m*n];
        int k=0;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n;j++)
            {
                tmp_arr[k++] = a[i][j];
            }
        }
        // sort mảng
        Arrays.sort(tmp_arr);
        // chuyển mảng 1 chuyền thành mảng 2 chiều
        k=0;
        int col=0, row=0;;

        while (k<=m*n && col<n)
        {
            if(k>m*n ||col>=n) break;
            for(int i = row; i<m; i++)
            {
                System.out.printf("a[%d][%d] = tmp_arr[%d]\n", i,col,k);
                a[i][col]= tmp_arr[k++];
            }
            col++;
        }
    }
    public static void NhapMaTran( int[][] a, int m, int n)
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.printf("a[%d][%d]= ",i,j);
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void InMaTran( int[][] a, int m, int n)
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.printf("%4d",a[i][j]);
            }
            System.out.println();
        }
    }

    public static void InSNT(int[][] a, int m , int n)
    {
        for(int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = laSNT(a[i][j]) ? a[i][j] : 0;
                System.out.printf("%4d",tmp);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap m: ");
        int m = sc.nextInt();
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        NhapMaTran(a,m,n);
        int chon =0;

        while (true)
        {
            Menu();
            chon= sc.nextInt();
            switch (chon)
            {
                case 1: TimMaxMaTrix(a,m,n); break;
                case 2: InSNT(a,m,n); break;
                case 3: Sort_Theo_Cot(a,m,n); break;
                case 0: return;
                default:
                    System.out.println("VUi long chon  tu 0 -> 3");
            }
        }



    }
}
