package Buoi3.TrenLop;

/*
L02
Hoàng Duy Khánh
Vũ Tuấn Anh
Phạm Doãn Hiếu
Nguyễn Xuân Lộc
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void nhapListSV(ArrayList<SinhVien> sinhViens,int n)
    {
        for(int i = 0; i<n; i++)
        {
            SinhVien tmp  = new SinhVien();
            tmp.nhapSV();
            sinhViens.add(tmp);
        }
    }
        public static void sapXepTheoTen(ArrayList<SinhVien> sinhViens,int n)
    {
        for(int i = 0; i<n-1; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(sinhViens.get(i).getHoTen().compareTo(sinhViens.get(j).getHoTen())>0)
                {
                    SinhVien tmp = new SinhVien();
                    tmp = sinhViens.get(i); //tmp =a
                    sinhViens.set(i,sinhViens.get(j)); //a = b
                    sinhViens.set(j,tmp);//b=tmp
                }
            }
        }
    }
    public static void InSVcoDiemCaoNhat(ArrayList<SinhVien> sinhViens, int n)
    {
        int max=0;

        for(int i = 0; i<n; i++)
        {
            if(sinhViens.get(max).tongDiem() < sinhViens.get(i).tongDiem())
            {
                max= i;
            }
        }
        System.out.println("Sinh Viên có điểm cao nhất là");
        System.out.printf("|%10s|%-30s|%10s|%10s|%10s|\n","maSV","hoTen","diemToan","diemLy", "diemHoa");

        for(int i=0; i<n; i++)
        {
            if(sinhViens.get(i).tongDiem() == sinhViens.get(max).tongDiem())
            {
                sinhViens.get(i).xuatSV();
            }
        }
    }

    public static void xuatListSV(ArrayList<SinhVien> sinhVienArrayList, int n)
    {
        System.out.println("\t\tDANH SACH SINH VIEN");
        {
            System.out.printf("|%10s|%-30s|%10s|%10s|%10s|\n","maSV","hoTen","diemToan","diemLy", "diemHoa");
        }
        for(int i=0; i<n; i++)
        {
            sinhVienArrayList.get(i).xuatSV();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SinhVien> sinhViens = new ArrayList<>();
        int n;
        System.out.println("Nhập số sinh viên muốn nhập: ");
        n = scanner.nextInt();
        //1. nhập n sinh viên
        nhapListSV(sinhViens,n);
        System.out.println("Danh sach sinh vien vua nhap");
        xuatListSV(sinhViens,n);
        InSVcoDiemCaoNhat(sinhViens,n);

        System.out.println("Sap xep sinh vien");
        sapXepTheoTen(sinhViens,n);
        xuatListSV(sinhViens,n);
    }
}
