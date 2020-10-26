
package Buoi5_Bai2;

public class RunMain {
    public static void main(String[] args) {
        SoPhuc a = new SoPhuc();
        SoPhuc b = new SoPhuc();
        System.out.println("_________Nhap 2 so phuc________");
        System.out.println("So thu nhat : ");
        a.Nhap();
        System.out.println("So thu 2 : ");
        b.Nhap();
        System.out.println("");
        System.out.print("a + b = ");
        a.Cong(b).Xuat();
        System.out.print("\na - b = ");
        a.Tru(b).Xuat();
    }
}
