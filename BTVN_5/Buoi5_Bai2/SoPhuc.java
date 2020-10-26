
package Buoi5_Bai2;

import java.util.Scanner;

public class SoPhuc {
    private double thuc;
    private double ao;
    
    public SoPhuc(){
    }

    public double getThuc() {
        return thuc;
    }

    public void setThuc(double thuc) {
        this.thuc = thuc;
    }

    public double getAo() {
        return ao;
    }

    public void setAo(double ao) {
        this.ao = ao;
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap phan thuc : ");
        thuc = sc.nextDouble();
        System.out.print("Nhap phan ao : ");
        ao = sc.nextDouble();
    }
    public void Xuat(){
        System.out.print(thuc+" + "+ao+"i");
    }
    public SoPhuc Cong(SoPhuc sp){
        SoPhuc x = new SoPhuc();
        x.thuc = sp.thuc + this.thuc;
        x.ao = sp.ao + this.ao;
        return x;
    }
    public SoPhuc Tru(SoPhuc sp){
        SoPhuc x = new SoPhuc();
        x.thuc = this.thuc - sp.thuc;
        x.ao = this.ao - sp.ao;
        return x;
    }
}
