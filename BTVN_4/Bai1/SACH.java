
package Bai1;

import java.util.Scanner;

public class SACH {
    private String maSach;
    private String tenSach;
    private String nxb;
    private int soTrang;
    private int giaTien;
    
    public void NHAP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma sach : ");
        maSach = sc.nextLine();
        System.out.print("nhap ten sach : ");
        tenSach = sc.nextLine();
        System.out.print("nhap nxb : ");
        nxb = sc.nextLine();
        System.out.print("so trang : ");
        soTrang = sc.nextInt();
        System.out.print("gia tien : ");
        giaTien = sc.nextInt();
        System.out.println("");
    }
    public void XUAT(){
        System.out.print("\nMa sach : "+maSach);
        System.out.print("\tTen sach : "+tenSach);
        System.out.print("\tNXB : "+nxb);
        System.out.print("\tSo trang : "+soTrang);
        System.out.println("\tGia tien : "+giaTien);
        
    }
    
}
