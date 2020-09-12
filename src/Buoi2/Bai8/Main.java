package Buoi2.Bai8;

public class Main {
    public static void main(String[] args) {
        PhanSo phanSo1 = new PhanSo();
        PhanSo phanSo2 = new PhanSo();
        phanSo1.taoPhanSo();
        phanSo2.taoPhanSo();
        phanSo1.cong(phanSo2);
        phanSo1.tru(phanSo2);
        phanSo1.nhan(phanSo2);
        phanSo1.chia(phanSo2);
    }
}
