package Buoi2.Bai6;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DaThuc {
    private int bac;
    private ArrayList<Double> arr_heSo = new ArrayList<>();

    public DaThuc() {
    }

    public DaThuc(int bac, ArrayList<Double> arr_heSo) {
        this.bac = bac;
        this.arr_heSo = arr_heSo;
    }

    public DaThuc(DaThuc daThuc) {
        this.bac = daThuc.bac;
        this.arr_heSo = daThuc.arr_heSo;
    }

    public void nhapDaThuc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bậc của đa thức: ");
        bac = sc.nextInt();
        System.out.println("Nhập các hệ số từ bậc 0 đến " + bac);
        for(int i=0; i<=bac; i++)
        {
            arr_heSo.add(sc.nextDouble());
        }
    }
    public void xuatDaThuc()
    {
        System.out.print("Đa thức: ");
        for(Double i : arr_heSo)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public DaThuc congDaThuc(DaThuc daThuc)
    {
        DaThuc cong = new DaThuc();
        int max  = Math.max(this.bac, daThuc.bac);
        int min  = Math.min(this.bac, daThuc.bac);
        for(int i=0; i<=min; i++)
        {
            cong.arr_heSo.add(this.arr_heSo.get(i) + daThuc.arr_heSo.get(i));
        }
        for(int i = min+1; i<= max; i++)
        {
            if(max == this.bac)
            {
                cong.arr_heSo.add(this.arr_heSo.get(i));
            }
            else
            {
                cong.arr_heSo.add(daThuc.arr_heSo.get(i));
            }
        }


        return cong;
    }
    public DaThuc truDaThuc(DaThuc daThuc)
    {
        DaThuc tru = new DaThuc();
        int max  = Math.max(this.bac, daThuc.bac);
        int min  = Math.min(this.bac, daThuc.bac);
        for(int i=0; i<=min; i++)
        {
            tru.arr_heSo.add(this.arr_heSo.get(i) - daThuc.arr_heSo.get(i));
        }
        for(int i = min+1; i<= max; i++)
        {
            if(max == this.bac)
            {
                tru.arr_heSo.add(this.arr_heSo.get(i));
            }
            else
            {
                tru.arr_heSo.add(0-daThuc.arr_heSo.get(i));
            }
        }


        return tru;
    }
}
