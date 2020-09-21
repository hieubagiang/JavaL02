package Buoi6_except_file.Bai2;

import java.io.*;
import java.util.List;

public class DocGhiSerializable {
    public static Boolean ghiSerial(QuanLyKhachHang quanLyKhachHang, String path)
    {
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(quanLyKhachHang);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + path);
            return true;
        } catch (IOException i) {
            i.printStackTrace();
            return false;
        }


    }
    public static QuanLyKhachHang DocSerializable (String path){
        QuanLyKhachHang e = null;
        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (QuanLyKhachHang) in.readObject();
            in.close();
            fileIn.close();
            return e;
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("class not found");
            c.printStackTrace();
            return null;
        }


    }
}
