package Buoi6_except_file.Bai3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> ds = new ArrayList();
//        ds.add("hạnh");
//        ds.add("phúc");
//        ds.add("vô");
//        ds.add("thường");
//        ds.add("bất");
//        ds.add("diệt");
//        boolean kq = DocGhiFile.ghiFile(ds, "d:\\file.txt");
//
//        if (kq == true)
//            System.out.println("Thanh cong");
//        else
//            System.out.println("that bai");
//

        ArrayList<String> ds = DocGhiFile.docFile("D:\\file.txt");
        for (String chuoi : ds)
        {
            System.out.println(chuoi);
        }

    }

}
