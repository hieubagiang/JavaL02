package Buoi2.Bai6;

public class Main {
    public static void main(String[] args) {
        DaThuc daThuc1 = new DaThuc();
        DaThuc daThuc2 = new DaThuc();
        daThuc1.nhapDaThuc();
        daThuc2.nhapDaThuc();


        System.out.println("Cộng 2 đa thức: ");
        DaThuc cong = new DaThuc(daThuc1.congDaThuc(daThuc2));
        cong.xuatDaThuc();
        System.out.println("Trừ 2 đa thức: ");
        DaThuc tru = new DaThuc(daThuc1.truDaThuc(daThuc2));
        tru.xuatDaThuc();
    }
}
