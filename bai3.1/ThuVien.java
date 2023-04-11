import java.util.Scanner;

public class ThuVien {
    private Sach[] dsSach;
    private int soLuongSach;

    public ThuVien(int SoLuongSach) {
        dsSach = new Sach[SoLuongSach];
        soLuongSach = 0;
    }

    public void themSach(Sach sach) {
        dsSach[soLuongSach] = sach;
        soLuongSach++;
    }

    public void inDanhSachSach() {
        for (int i = 0; i < soLuongSach; i++) {
            System.out.println("Thong tin sach thu : " + (i + 1) + ":");
            dsSach[i].inSach();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sach can nhap: ");
        int soLuongSach = scanner.nextInt();
        ThuVien thuVien = new ThuVien(soLuongSach);
        scanner.nextLine();
        for (int i = 0; i < soLuongSach; i++) {
            System.out.println("Nhap thong tin cuon sach thu : " + (i + 1) + ":");
            Sach sach = Sach.nhapsach();
            thuVien.themSach(sach);
        }
        System.out.println("Danh sach cac cuon sach :");
        thuVien.inDanhSachSach();
    }
}