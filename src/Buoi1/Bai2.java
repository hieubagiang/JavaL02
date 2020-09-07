package Buoi1;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Bai2 {
    //    Nhập vào 1 số nguyên dương n (n &gt; 0).Viết hàm kiểm tra n có phải là
//    nguyên tố không? (số nguyên tố là số tự nhiên khác 0 chỉ có hai ước số dương
//    phân biệt là 1 và chính nó, số 1 không là số nguyên tố)
    static Scanner sc = new Scanner(System.in);

    public static boolean laSNT(int n) {
        if (n < 2) return false;
        else if (n == 2) return true;
        else {
            for (int i = 2; i <= sqrt(n); i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }
    public static boolean laSoHoanHao(int n)
    {
        int sum=0;
        for(int i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }
        return sum==n;
    }
    public static int UCLN(int a,int b)
    {
        if(b==0) return a;
        return UCLN(b,a%b);
    }
    public static void yeuCau1()
    {
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        System.out.println(n+ " co phai la so nguyen to khong: "+laSNT(n));
    }
    public static void yeuCau2()
    {
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        System.out.println("cac so nguyen to < " + n);
        for(int i=0; i<n;i++)
        {
            if(laSNT(i)) System.out.print(i + " ");
        }
    }
    public static void yeuCau3()
    {
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        System.out.println(n+ " co phai la so hoan hao khong: "+laSoHoanHao(n));
    }
    public static void yeuCau4()
    {
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        System.out.print("cac so hoan hao < " + n + "la: ");
        for(int i=2; i<n;i++)
        {
            if(laSoHoanHao(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void yeuCau5()
    {
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("UCLN cua " + a + " va " + b +" la " +UCLN(a,b));
    }
    public static void yeuCau6()
    {
        System.out.println("Nhập tử số: ");
        int a = sc.nextInt();
        System.out.println("Nhập mẫu số: ");
        int b = sc.nextInt();
        System.out.println("Rút gọn cua  phân số " + a +"/" + b +" la " + a/UCLN(a,b) + "/" + b/UCLN(a,b));
    }
    public static void Menu()
    {
        System.out.println("1. kiểm tra n có phải là số nguyên tố không?");
        System.out.println("2. In ra các số nguyên tố < n");
        System.out.println("3. kiểm tra n có là số hoàn hảo không?");
        System.out.println("4. In ra các số hoàn hảo < n");
        System.out.println("5. tìm USCLN của hai số nguyên a, b.");
        System.out.println("6. phân số tối giản.");
        System.out.println("0. Thoat");
    }
    public static void main(String[] args) {
        int chon =0;

        while (true)
        {
            Menu();
            chon= sc.nextInt();
            switch (chon)
            {
                case 1: yeuCau1(); break;
                case 2: yeuCau2(); break;
                case 3: yeuCau3(); break;
                case 4: yeuCau4(); break;
                case 5: yeuCau5(); break;
                case 6: yeuCau6(); break;
                case 0: return;
                default:
                    System.out.println("VUi long chon  tu 0 -> 6");
            }
        }
    }
}
