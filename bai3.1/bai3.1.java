import java.util.Scanner;

public class Sach {
    private String tenSach;
    private String tacGia;
    private int maSach;
    private String loaiSach;
    private int soTap;
    private int gia;
    private String nhaXuatBan;
    private int soTrang;

    public Sach(String tenSach, String tacGia, String nhaXuatBan, int soTrang, int maSach, String loaiSach, int soTap,
            int gia) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.soTrang = soTrang;
        this.maSach = maSach;
        this.loaiSach = loaiSach;
        this.soTap = soTap;
        this.gia = gia;
    }

    public static Sach nhapsach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten sach: ");
        String tenSach = scanner.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        String nhaXuatBan = scanner.nextLine();
        System.out.print("Nhap so trang: ");
        int soTrang = scanner.nextInt();
        System.out.print("Nhap ma sach :");
        int maSach = scanner.nextInt();
        System.out.print("Nhap so tap :");
        int soTap = scanner.nextInt();
        System.out.print("Nhap gia sach :");
        int gia = scanner.nextInt();
        System.out.print("Nhap loai sach :");
        String loaiSach = scanner.nextLine();
        scanner.nextLine();

        Sach sach = new Sach(tenSach, tacGia, nhaXuatBan, soTrang, maSach, loaiSach, soTap, gia);
        return sach;
    }

    public void inSach() {
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
        System.out.println("Số trang: " + soTrang);
        System.out.println("Ma sach: " + maSach);
        System.out.println("Loai sach: " + loaiSach);
        System.out.println("So tap: " + soTap);
        System.out.println("Gia : " + gia);
    }

    public static void main(String[] args) {
        Sach sach = Sach.nhapsach();
        System.out.println("Thong tin sach :");
        sach.inSach();
    }

}