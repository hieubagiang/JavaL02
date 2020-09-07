package Buoi1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    static Scanner sc = new Scanner(System.in);
    public static void NhapMang(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.println("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }
    public static void InMang(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void YeuCau1(int[] a)
    {
        NhapMang(a);
        System.out.println("Mảng vừa nhập là: ");
        InMang(a);
    }
    public static void YeuCau2(int[] a)
    {
        Arrays.sort(a);
        System.out.println("Mảng đã sắp xếp theo thứ tự tăng dần");
        InMang(a);
    }
    public static void YeuCau3(int[] a)
    {
        /*int max = 0;
        for(int i=0; i<a.length; i++)
        {
            max = (a[max] > a[i]) ? max : i;
        }*/
        int viTriSoLonNhat = a.length-1;
        int viTriSoLonNhi=a.length-2;
        for(int i = a.length-2; i>=0; i--)
        {
            if(a[i] != a[viTriSoLonNhat])
            {
                viTriSoLonNhi = i;
                break;
            }
        }
        System.out.println("Số lớn nhất có vị trí " + viTriSoLonNhat + " và giá trị= " + a[viTriSoLonNhat]);
        System.out.println("Số lớn thứ 2 có vị trí " + viTriSoLonNhi + " và giá trị= " + a[viTriSoLonNhi]);
    }
    public static void YeuCau4(int a[])
    {
        //Nhập một số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính sắp xếp tăng dần
        System.out.println("Nhập x: ");
        int x = sc.nextInt();

        int tmp=0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>= x)
            {
                tmp = i;
                break;
            }
        }
        int[] a2 = new int[6];
        int j =0;
        for(int i= 0; i <tmp; i++)
        {
            a2[j++] = a[i];
        }
        a2[tmp] = x;
        j++;
        for(int i= tmp; i <a.length; i++)
        {
            a2[j++] = a[i];
        }
        System.out.println("Mảng sau khi chèn: ");
        InMang(a2);
    }
    public static void Menu()
    {
        System.out.println("1. Nhap mang");
        System.out.println("2. Sap xep mang");
        System.out.println("3. Tim ptu lớn nhất, lớn nhì cùng chỉ số");
        System.out.println("4. Chèn x cho mảng tăng dần");
    }

    public static void main(String[] args) {
        System.out.println("Nhập n");
        int n = sc.nextInt();
        int[] a = new int[n];

        int chon =0;

        while (true)
        {
            Menu();
            chon= sc.nextInt();
            switch (chon)
            {
                case 1: NhapMang(a); break;
                case 2: YeuCau2(a); break;
                case 3: YeuCau3(a); break;
                case 4: YeuCau4(a); break;
                case 0: return;
                default:
                    System.out.println("VUi long chon  tu 0 -> 6");
            }
        }

    }
}
