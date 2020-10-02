package BaiTapKeThua.Bai9;

import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap tuSo");
        tuSo = sc.nextInt();
        System.out.println("nhap mauSo");
        mauSo = sc.nextInt();
    }
    void xuat()
    {
        System.out.println(tuSo + "/" + mauSo);
    }

    int UCLN() {
        int ucln=0;
        int min = tuSo<mauSo ? tuSo : mauSo;
        min = abs(min);
        for(int i= min ;i>=0; i--)
        {
            if(tuSo%i == 0 && mauSo %i ==0)
            {
                ucln = i;
                break;
            }
        }
        return ucln;
    }
    void rutGon()
    {
        int ucln = UCLN();
        tuSo = tuSo/ucln;
        mauSo = mauSo/ucln;
    }



    public void congPhanSo(PhanSo ps)
    {
        PhanSo cong = new PhanSo();
        cong.tuSo = this.tuSo* ps.mauSo + ps.tuSo*this.mauSo;
        cong.mauSo = this.mauSo*ps.mauSo;
        cong.rutGon();
        System.out.printf("%d/%d + %d/%d = ",this.tuSo,this.mauSo,ps.tuSo,ps.mauSo);
        cong.xuat();
    }
    public void truPhanSo(PhanSo ps)
    {
        PhanSo cong = new PhanSo();
        cong.tuSo = this.tuSo* ps.mauSo - ps.tuSo*this.mauSo;
        cong.mauSo = this.mauSo*ps.mauSo;
        cong.rutGon();
        System.out.printf("%d/%d - %d/%d = ",this.tuSo,this.mauSo,ps.tuSo,ps.mauSo);
        cong.xuat();
    }
    public void nhanPhanSo(PhanSo ps)
    {
        PhanSo nhan = new PhanSo();
        nhan.tuSo = this.tuSo*ps.tuSo;
        nhan.mauSo = this.mauSo*ps.mauSo;
        nhan.rutGon();
        System.out.printf("%d/%d x %d/%d = ",this.tuSo,this.mauSo,ps.tuSo,ps.mauSo);
        nhan.xuat();
    }
    public void chiaPhanSo(PhanSo ps)
    {
        PhanSo chia = new PhanSo();
        chia.tuSo = this.tuSo*ps.mauSo;
        chia.mauSo = this.mauSo*ps.tuSo;
        chia.rutGon();
        System.out.printf("%d/%d : %d/%d = ",this.tuSo,this.mauSo,ps.tuSo,ps.mauSo);
        chia.xuat();
    }
    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
}
