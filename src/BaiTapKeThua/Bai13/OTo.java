package BaiTapKeThua.Bai13;

import java.util.Scanner;

/*Một công ty được giao nhiệm vụ quản lý các phương tiện giao thông
        gồm các loại: ô tô, xe máy, xe tải.

        + mỗi loại phương tiện giao thông cần quản lý: Hãng sản xuất,
        năm sản xuất, giá bán và màu.
        + Các ô tô cần quản lý: số chỗ ngồi, kiểu động cơ
        + Xe máy cần quản lý: công suất
        + Xe tải cần quản lý: trọng tải.
        2. Xây dựng các lớp XeTai, XeMay, OTo kế thừa từ lớp PTGT.
        3. Xây dựng các hàm để truy nhập, hiển thị và kiểm tra các thuộc
        tính của các lớp.
        4. Xây dựng lớp QLPTGT cài đặt các phương thức thực hiện các chức
        năng
        sau:
        - Nhập đăng ký phương tiện
        - Tìm phương tiện theo màu
        - Kết thúc.*/
public class OTo extends PTGT{
    private int soChoNgoi;
    private String congSuat;


    public OTo() {
    }
    public void xuat()
    {
        System.out.println(toString());
    }
    public void nhap()
    {
        Scanner scanner = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap soChoNgoi");
        soChoNgoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap congSuat");
        congSuat = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "OTo{" + super.toString() +
                ", soChoNgoi=" + soChoNgoi +
                ", congSuat='" + congSuat + '\'' +
                '}';
    }
}
