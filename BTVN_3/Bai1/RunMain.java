
package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person("Doan Vũ","20/10/2000","Nam","Thích màu hồng");
        Person DiepBueDe   = new Person("Đức Điệp","8/3/2000","Khác","Thích màu hồng nhưng là cánh sen");
        
        System.out.println("Doan Xinh Gái:");
        System.out.println("Tên : "+DoanXinhGai.getName());
        System.out.println("Sinh nhật : "+DoanXinhGai.getDateOfBirth());
        System.out.println("Giới tính : "+DoanXinhGai.getGender());
        System.out.println("Sở thích : "+DoanXinhGai.getHooby());
        
        System.out.println("\nĐiệp Không Bê Đê:");
        System.out.println("Tên : "+DiepBueDe.getName());
        System.out.println("Sinh nhật : "+DiepBueDe.getDateOfBirth());
        System.out.println("Giới tính : "+DiepBueDe.getGender());
        System.out.println("Sở thích : "+DiepBueDe.getHooby());
    }
}
