package Buoi1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    public static String getNextDate(String  curDate) throws ParseException {
        final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        final Date date = format.parse(curDate);
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        return format.format(calendar.getTime());
    }

    public static void main(String[] args) throws ParseException {
        String curr_date;
        System.out.println("Nhập ngày hiện tại");
        curr_date = sc.nextLine();
        System.out.println(getNextDate(curr_date));
    }
}
