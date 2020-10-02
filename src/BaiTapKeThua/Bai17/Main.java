package BaiTapKeThua.Bai17;

public class Main {
    public static void main(String[] args) {
        MaTran a = new MaTran();
        MaTran b = new MaTran();

        a.nhap();
        b.nhap();
        a.xuat();
        b.xuat();
        MaTran c = new MaTran();
        c = a.congMaTran(b);
        c.xuat();
    }
}
