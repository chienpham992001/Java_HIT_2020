
package Buoi5_Bai5;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String date;
    private String dc;
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten : ");
        hoTen = sc.nextLine();
        System.out.print("Ngay sinh : ");
        date = sc.nextLine();
        System.out.print("Dia chi : ");
        dc = sc.nextLine();
    }
    public void Xuat(){
        System.out.printf("%15s %15s %15s",hoTen,date,dc);
    }
    public Nguoi(){
        
    }

    public Nguoi(String hoTen, String date, String dc) {
        this.hoTen = hoTen;
        this.date = date;
        this.dc = dc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }
    
}
