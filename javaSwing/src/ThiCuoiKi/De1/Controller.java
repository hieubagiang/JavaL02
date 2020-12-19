/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiCuoiKi.De1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PhamDoanHieu
 */
public class Controller {
    HomeFrm homeFrm;
    ArrayList<DienThoai> dsDienThoai;
    public Controller(HomeFrm homeFrm) {
        this.homeFrm = homeFrm;
        dsDienThoai = new ArrayList<>();
    }
    public void themDienThoai(DienThoai dienThoai)
    {
        dienThoai.xuat();
        dsDienThoai.add(dienThoai);       
    }
    public void luu()
    {
        boolean isWrite = false;
        try {
            FileOutputStream fos = new FileOutputStream("dienthoai.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dsDienThoai);
            oos.close();
            fos.close();
            isWrite = true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        JOptionPane.showMessageDialog(homeFrm, "write " + isWrite);
    }
}
