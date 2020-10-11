/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiThucHanh1.Bai9;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Number implements Serializable{
    private int max;
    private int min;
    private int value;

    public Number() {
    }

    public Number(int max, int min, int value) {
        this.max = max;
        this.min = min;
        this.value = value;
    }
    
    public boolean la_SNT()
    {
        if(value < 2)
            return false;
        if(value ==2)
            return true;
        for(int i= 2 ; i<=Math.sqrt(value); i++)
        {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Number{" + "max=" + max + ", min=" + min + ", value=" + value + '}';
    }
    
    
}
