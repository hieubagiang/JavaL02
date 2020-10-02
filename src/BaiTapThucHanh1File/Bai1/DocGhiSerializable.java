package BaiTapThucHanh1File.Bai1;

import java.io.*;

public class DocGhiSerializable {
    public static Boolean ghiSerial(Object obj, String path)
    {
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in " + path);
            return true;
        } catch (IOException i) {
            return false;
        }


    }
    public static Object DocSerializable (String path){
        Object e = null;
        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = in.readObject();
            in.close();
            fileIn.close();
            return e;
        } catch (IOException i) {
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("class not found");
            return null;
        }


    }
}
