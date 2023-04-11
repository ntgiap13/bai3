import java.util.Scanner;

public class Diem {
    private int x, y;

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void NhapDiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap toa do x :");
        setX(sc.nextInt());
        System.out.print("Nhap toa do y :");
        setY(sc.nextInt());
    }

    public void InDiem() {
        System.out.print("(" + x + ", " + y + ")");
    }
}
