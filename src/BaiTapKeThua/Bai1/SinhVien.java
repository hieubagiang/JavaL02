package BaiTapKeThua.Bai1;

import java.util.Scanner;

public class SinhVien extends Nguoi implements Comparable<SinhVien>{
    private String maSV;
    private float diemTB;

    public SinhVien() {
    }

    public SinhVien(String hoTen, int namSinh) {
        super(hoTen, namSinh);
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã SV: ");
        maSV = sc.nextLine();
        super.nhap();
        System.out.println("nhập điểm  TB: ");
        diemTB = sc.nextFloat();
    }
    public void xuat()
    {
        System.out.printf("|%5s|%-25s|%10d|%10.2f|\n",maSV,hoTen,namSinh,diemTB);
    }
    public XepLoai xepLoai()
    {
        XepLoai loai = null;
        if(diemTB >=8)
        {
            loai = XepLoai.Gioi;
        }
        else if(diemTB >=6.5)
        {
            loai = XepLoai.Kha;
        }
        else if(diemTB>=4)
        {
            loai = XepLoai.TrungBinh;
        }
        else if(diemTB>=0)
        {
            loai = XepLoai.Yeu;
        }
        return loai;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" + super.toString() +
                "maSV='" + maSV + '\'' +
                ", diemTB=" + diemTB+
                '}';
    }

    @Override
    public int compareTo(SinhVien sv) {
        if(this.diemTB > sv.diemTB)
        {
            return 1;
        } else
        if(this.diemTB < sv.diemTB)
        {
            return -1;
        }
        else
            return 0;
    }
}
