public class Main {
    public static void main(String[] args) {
        TAMGIAC tg = new TAMGIAC((0), 0);
        tg.NHAPTG();
        tg.KIEMTRA();
        System.out.println(tg.ChuVi());
        System.out.println(tg.DienTich());

        DUONGTRON dt = new DUONGTRON(0, 0, 0);
        dt.NhapDT();
        dt.ChuViDT();
        dt.DientichDT();
    }
}
