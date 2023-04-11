import java.lang.Math;
import java.util.Scanner;

public class DUONGTRON extends Diem {
    private int r;

    public DUONGTRON(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void NhapDT() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap toa do diem O(0,0) :");
        setX(sc.nextInt());
        setY(sc.nextInt());
        System.out.print("Nhap ban kinh R");
        setR(sc.nextInt());

    }

    public void inDT() {
        System.out.println("Toa do diem O(0,0) la :" + "(" + getX() + " , " + getY() + ")");
        System.out.println("Ban kinh R : " + r);
    }

    public void ChuViDT() {
        double C = (r * 2) * Math.PI;
        System.out.println("Chu vi duong tron la :" + C);
    }

    public void DientichDT() {
        double S = r * r * Math.PI;
        System.out.println("Dien tich duong tron la :" + S);
    }
}
