/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1.ui;

/**
 *
 * @author PhamDoanHieu
 */
public class PhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;

    public String giaiPTBac2() {
        int soNghiem = -1;
        double x1 = 0, x2 = 0;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    soNghiem = -1;
                } else {
                    soNghiem = 0;
                }
            } else {
                soNghiem = 1;
                x1 = -c / b;
                x2 = -c / b;
            }
        } else {
            double delta;
            delta = b * b - 4 * a * c;
            if (delta < 0) {
                soNghiem = 0;
            }
            if (delta == 0) {
                soNghiem = 1;
                x1 = -b / (2 * a);
            }
            if (delta > 0) {
                soNghiem = 2;
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
            }

        }
        if (soNghiem == 0) {
            return "Phương trình vô nghiệm";
        } else if (soNghiem == 0) {
            return "Phương trình vô nghiệm";
        } else if (soNghiem == 1) {
            return "x = " + x1;
        } else if (soNghiem == 2) {
            return "x1 = " + x1 + ", x2 = " + x2;
        } else {
            return "Phương trình có vô số nghiệm";
        }
    }
    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PhuongTrinhBac2() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "PhuongTrinhBac2{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
}
