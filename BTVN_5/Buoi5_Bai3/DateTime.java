
package Buoi5_Bai3;

import java.util.Scanner;

public class DateTime {
    private int day;
    private int month;
    private int year;
    
    public void InputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ngay : ");
        day = sc.nextInt();
        System.out.print("Thang : ");
        month = sc.nextInt();
        System.out.print("Nam : ");
        year = sc.nextInt();
    }
    public void OutputDate(){
        System.out.println("DateTime : "+day+" - "+month+" - "+year);
    }
    
    public DateTime(){
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
