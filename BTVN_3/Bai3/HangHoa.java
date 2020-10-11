
package Bai3;

public class HangHoa {
    private String maHang;
    private String tenHang;
    private long gia;
    private int sl;
    
    public HangHoa(){
}

    public HangHoa(String maHang, String tenHang, int gia, int sl) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.gia = gia;
        this.sl = sl;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    public void Xuat(){
        System.out.println("Mã hàng : "+maHang);
        System.out.println("Tên hàng : "+tenHang);
        System.out.println("Đơn giá : "+gia);
        System.out.println("Số lượng : "+sl);
        System.out.println("Thành tiền : "+sl*gia);
    }
    
}
