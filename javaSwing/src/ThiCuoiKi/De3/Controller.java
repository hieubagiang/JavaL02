/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiCuoiKi.De3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PhamDoanHieu
 */
public class Controller {

    ArrayList<NhanVien> dsNhanVien;

    NhanVienFrm nhanVienFrm;

    public Controller(NhanVienFrm nhanVienFrm) {
        this.nhanVienFrm = nhanVienFrm;
        dsNhanVien = new ArrayList<>();

        dsNhanVien.add(new NhanVien("tai chinh", 2.3, 5, 3000000, "pham doan hieu", convert("25/04/2000"), "ha tinh", "nam"));
        dsNhanVien.add(new NhanVien("nhan su", 4.3, 7, 4000000, "le van minh", convert("22/02/2000"), "ha noi", "nam"));
        dsNhanVien.add(new NhanVien("game", 1.3, 2, 2000000, "pham doan le", convert("29/2/2000"), "ha tinh", "nu"));
        saveData();
    }

    Date convert(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = new Date();
            date = sdf.parse(dateString);
            return date;
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void saveData() {
        try {
            FileOutputStream fos = new FileOutputStream("nhanvien.dat");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            String text = "";
            for (int i = 0; i < dsNhanVien.size(); i++) {
                NhanVien get = dsNhanVien.get(i);
                text += get.toObjectStrings() + "\n";
            }
            bw.write(text);
            bw.close();
            osw.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void readData() {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("nhanvien.dat");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String text = br.readLine();
            while (text != null) {                
                String[] element = text.split("\\$");
                nhanVienFrm.defaultTableModel.addRow(element);
                text= br.readLine();
            }
            
            fis.close();
            isr.close();
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
