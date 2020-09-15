package Buoi2.Bai2;

public enum XepLoaiClass {
    XuatSac ("Xuất sắc"),
    Gioi ("Giỏi"),
    Kha ("Khá"),
    TrungBinh ("Trung Bình"),
    Yeu ("Yếu"),
    Kem ("Kém"),
    DiBoDoi("Đi bộ đội");

    String msg;

    private XepLoaiClass(String msg) {
        this.msg=msg;
    }


    public String getDescription()
    {
        return this.msg;
    }

}
