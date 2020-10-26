
package Buoi5_Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham{
    private double congSuat;
    private int   gia;
    
    public DieuHoa(){
    }

    public DieuHoa(double congSuat, int gia, String maSp, String tenSp, String tenH, String date) {
        super(maSp, tenSp, tenH, date);
        this.congSuat = congSuat;
        this.gia = gia;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void In(){
        Scanner sc = new Scanner(System.in);
        super.Input();
        System.out.print("Cong suat : ");
        congSuat = sc.nextDouble();
        System.out.print("Gia(triệu) : ");
        gia = sc.nextInt();
        
    }
    public void Out(){
        super.Output();
        System.out.print("\nCong suat : "+congSuat);
        System.out.print("\nGia : "+gia+" triệu");
    }
    
    @Override
    public String toString() {
        return "DieuHoa{"+super.toString() + "congSuat=" + congSuat + ", gia=" + gia +" triệu" + '}';
    }
    
}
