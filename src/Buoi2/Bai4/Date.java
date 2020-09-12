package Buoi2.Bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Date {
    private String ngay;
    private String thang;
    private String  nam;

    public Date() {
    }

    public Date(String ngay, String thang, String nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }
    public void xuatDate()
    {
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(chuanHoa());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formatter.format(calendar.getTime()));
    }
    public void nhapDate()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập ngày");
        ngay = sc.nextLine();
        System.out.println("Nhập tháng");
        thang = sc.nextLine();
        System.out.println("Nhập năm");
        nam = sc.nextLine();

    }
    public java.util.Date chuanHoa()
    {
        String dateString = ngay + "/" + thang + "/" + nam;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = null;
        try {
            date= formatter.parse(dateString);
            formatter.setLenient(false);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    public String getNextDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = chuanHoa();
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        return formatter.format(calendar.getTime());
    }
}
