
package Bai2;

import Bai3.HANG;
import java.util.Scanner;

public class NHANSU {
    private String maNS;
    private String ht;
    private DATE NS;
    
    public NHANSU(){
    }
    
    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma nhan su : ");
        maNS = sc.nextLine();
        System.out.print("Ho ten : ");
        ht = sc.nextLine();
        NS = new DATE();
        NS.NHAP();
        System.out.println("");
    }
    public void XUAT(){
        System.out.print("\nMa nhan su : "+maNS);
        System.out.print("\tHo ten : "+ht);
        NS.XUAT();
    }

    public NHANSU(String maNS, String ht, DATE NS) {
        this.maNS = maNS;
        this.ht = ht;
        this.NS = NS;
    }

    public String getMaNS() {
        return maNS;
    }

    public void setMaNS(String maNS) {
        this.maNS = maNS;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public DATE getNS() {
        return NS;
    }

    public void setNS(DATE NS) {
        this.NS = NS;
    }
    
}
