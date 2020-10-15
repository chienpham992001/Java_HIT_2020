
package Bai2;

import java.util.Scanner;

public class DATE {
    private int day;
    private int month;
    private int year;
    
    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ngay : ");
        day = sc.nextInt();
        System.out.print("Thang : ");
        month = sc.nextInt();
        System.out.print("Nam : ");
        year = sc.nextInt();
    }
    public void XUAT(){
        System.out.println("\tDATE : "+day+" - "+month+" - "+year);
    }
    public DATE(){
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
