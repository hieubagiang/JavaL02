package Buoi2.Bai8;

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public void taoPhanSo()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tử số: ");
        tuSo = scanner.nextInt();
        System.out.println("Nhập mẫu số: ");
        mauSo = scanner.nextInt();
    }
    public  static int UCLN(int a, int b)
    {
        return (b==0) ? a : UCLN(b,a%b);
    }
    public void cong(PhanSo phanSo)
    {
        int tu= this.tuSo*phanSo.mauSo + phanSo.tuSo*this.mauSo;
        int mau = this.mauSo*phanSo.mauSo;

        System.out.println( this.tuSo + "/"+ this.mauSo
                + " + "
                + phanSo.tuSo + "/" + phanSo.mauSo
                + "  = "+ tu/UCLN(tu,mau) + "/" + mau/UCLN(tu,mau));
    }
    public void tru(PhanSo phanSo)
    {
        int tu= this.tuSo*phanSo.mauSo - phanSo.tuSo*this.mauSo;
        int mau = this.mauSo*phanSo.mauSo;

        System.out.println( this.tuSo + "/"+ this.mauSo
                + " - "
                + phanSo.tuSo + "/" + phanSo.mauSo
                + "  = "+ tu/UCLN(tu,mau) + "/" + mau/UCLN(tu,mau));
    }
    public void nhan(PhanSo phanSo)
    {
        int tu= this.tuSo*phanSo.tuSo;
        int mau = this.mauSo*phanSo.mauSo;
        System.out.println( this.tuSo + "/"+ this.mauSo + " X " + phanSo.tuSo + "/" + phanSo.mauSo + "  = "+ tu/UCLN(tu,mau) + "/" + mau/UCLN(tu,mau));
    }
    public void chia(PhanSo phanSo)
    {
        int tu= this.tuSo*phanSo.mauSo;
        int mau = this.mauSo*phanSo.tuSo;
        System.out.println( this.tuSo + "/"+ this.mauSo + " : " + phanSo.tuSo + "/" + phanSo.mauSo + "  = "+ tu/UCLN(tu,mau) + "/" + mau/UCLN(tu,mau));
    }
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
}
