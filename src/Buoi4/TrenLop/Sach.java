package Buoi4.TrenLop;

public class Sach extends  TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach() {
    }

    @Override
    public String toString() {
        return "Sach{" + super.toString() +
                "tenTacGia='" + tenTacGia   + '\'' +
                ", soTrang=" + soTrang +
                '}';
    }
}
