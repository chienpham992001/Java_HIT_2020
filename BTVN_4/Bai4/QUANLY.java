
package Bai4;

import java.util.Scanner;

public class QUANLY {
    private String maQl;
    private String hoTen;
    
    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma quan li : ");
        maQl=sc.nextLine();
        System.out.print("Ho ten : ");
        hoTen = sc.nextLine();
    }
    public void XUAT(){
        System.out.print("\nMa quan li : " +maQl);
        System.out.println("\tHo ten : "+hoTen);
    }

    public QUANLY(){
    }
    
    public QUANLY(String maQl, String hoTen) {
        this.maQl = maQl;
        this.hoTen = hoTen;
    }

    public String getMaQl() {
        return maQl;
    }

    public void setMaQl(String maQl) {
        this.maQl = maQl;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
}
