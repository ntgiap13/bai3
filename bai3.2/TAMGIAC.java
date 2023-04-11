import java.lang.Math;

public class TAMGIAC extends Diem {
    public TAMGIAC(int x, int y) {
        super(x, y);
    }

    Diem A = new Diem(0, 0);
    Diem B = new Diem(0, 0);
    Diem C = new Diem(0, 0);
    double AB, AC, BC;
    int i = 0;

    public void NHAPTG() {
        System.out.println("Nhap toa do diem A");
        A.NhapDiem();
        System.out.println("Nhap toa do diem B");
        B.NhapDiem();
        System.out.println("Nhap toa do diem C");
        C.NhapDiem();
    }

    public void inTG() {
        System.out.print("Toa do diem A :");
        A.InDiem();
        System.out.print("Toa do diem B :");
        B.InDiem();
        System.out.print("Toa do diem C :");
        C.InDiem();
    }

    public void KIEMTRA() {
        AB = (Math.sqrt((Math.pow((B.getX() - A.getX()), 2)) + (Math.pow((B.getY() - A.getY()), 2))));
        BC = (Math.sqrt((Math.pow((C.getX() - B.getX()), 2)) + (Math.pow((C.getY() - B.getY()), 2))));
        AC = (Math.sqrt((Math.pow((C.getX() - A.getX()), 2)) + (Math.pow((C.getY() - A.getY()), 2))));
        if (AB + BC < AC && BC + AC < AB && AC + AB < BC) {
            System.out.println("LOI !");
        } else {
            System.out.println("Thoa man tam giac ABC");
            i++;
        }
    }

    public String ChuVi() {
        if (i != 0) {
            return "Chu vi tam giac ABC=" + (AB + BC + AC);
        }
        return null;
    }

    public String DienTich() {
        double p = (AB + AC + BC);
        if (i != 0) {
            return "Dien tich tam giac ABC " + (Math.sqrt(p * (p - AB) * (p - BC) * (p - AC)));
        }
        return null;
    }
}
