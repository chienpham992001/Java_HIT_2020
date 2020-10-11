
package Bai3;

public class RunMain {
    public static void main(String[] args) {
    HangHoa sp1 = new HangHoa("SP1","Ti vi",500000,5);
    System.out.println("Sản phẩm 1 : ");
    sp1.Xuat();
    
    HangHoa sp2 = new HangHoa();
    sp2.setMaHang("SP2");
    sp2.setTenHang("Tủ lạnh");
    sp2.setGia(200000);
    sp2.setSl(3);
    System.out.println("\nSản phẩm 2 : ");
    sp2.Xuat();
    }
}
