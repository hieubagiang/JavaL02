package Buoi2.Bai4;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        date.nhapDate();
        date.xuatDate();






        System.out.println("Tim ngay ke tiep: ");
        String nextDate= date.getNextDate();
        System.out.println(nextDate);
    }
}
