package Buoi6_except_file;

import java.io.*;
import java.util.ArrayList;

public class DocGhiFile {
    public static Boolean ghiFile(ArrayList<String> ds, String path) {
        try {

            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);

            for (String string : ds) {
                bw.write(string);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
        public static ArrayList<String> docFile (String path)
        {   ArrayList<String> ds = new ArrayList<>();
            try {

                FileInputStream fis = new FileInputStream(path);
                InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);
                String line = br.readLine();//doc tung dong

                while (line != null) {
                    if (line.length() > 0)
                        ds.add(line);
                        line = br.readLine();

                }

                br.close();
                isr.close();
                fis.close();
                return ds;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;

            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
