/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiCuoiKi.De1;

/**
 *
 * @author PhamDoanHieu
 */
public class DienThoai extends HangHoa{
    protected String nhaXS;
    protected double dungLuong;
    protected String mauSac;

    public DienThoai() {
    }

    public DienThoai(String nhaXS, double dungLuong, String mauSac, String maHang, String ten, String giaBan) {
        super(maHang, ten, giaBan);
        this.nhaXS = nhaXS;
        this.dungLuong = dungLuong;
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "DienThoai{" + super.toString() + ", nhaXS=" + nhaXS + ", dungLuong=" + dungLuong + ", mauSac=" + mauSac + '}';
    }

    @Override
     public void xuat()
    {
        System.out.println(toString());
    }
    
}
