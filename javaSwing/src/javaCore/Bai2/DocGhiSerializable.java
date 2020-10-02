/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCore.Bai2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Admin
 */
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
            e = (TuyenSinh)in.readObject();
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