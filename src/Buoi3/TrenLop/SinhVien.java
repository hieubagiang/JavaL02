package Buoi3.TrenLop;

import java.util.Scanner;

public class SinhVien {

    private String maSV;
    private String hoTen;
    private float diemToan,diemLy,diemHoa;

    public SinhVien()
    {

    }
    public SinhVien(String maSV, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    public void nhapSV()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập maSV");
        maSV= sc.nextLine();
        System.out.println("Nhập hoTen");
        hoTen= sc.nextLine();

        System.out.println("Nhập điểm toán");
        diemToan= sc.nextFloat();
        System.out.println("Nhập điểm lý");
        diemLy= sc.nextFloat();
        System.out.println("Nhập điểm hoá");
        diemHoa= sc.nextFloat();
    }

    public void xuatSV()
    {
        System.out.printf("|%10s|%-30s|%10.2f|%10.2f|%10.2f|\n",maSV,hoTen,diemToan,diemLy,diemHoa);
    }
    public float tongDiem()
    {
        return diemToan + diemLy + diemHoa;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }
}
