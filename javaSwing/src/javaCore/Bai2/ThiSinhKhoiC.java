/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaCore.Bai2;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
    public class ThiSinhKhoiC extends ThiSinh implements Serializable{
        private String monVan = "Van";
        private String monSu = "Su";
        private String monDia = "Dia";

        @Override
        public String toString() {
            return "ThiSinhKhoiC{" +
                    "soBaoDanh='" + soBaoDanh + '\'' +
                    ", hoTen='" + hoTen + '\'' +
                    ", diaChi='" + diaChi + '\'' +
                    ", uuTien='" + uuTien + '\'' +
                    ", Môn thi: " + monVan + " - " + monSu + " - " + monDia +
                    '}';
        }
    }
