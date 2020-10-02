package BaiTapKeThua.Bai9;

public class Main {

    public static void main(String[] args) {

        PhanSo phanSo1 = new PhanSo();
        PhanSo phanSo2 = new PhanSo();

        phanSo1.nhap();
        phanSo2.nhap();

        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);

    }
}
