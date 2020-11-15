
package BTVN_Buoi7.B1;

public class RunMain {
    public static void main(String[] args) {
        Person per1 = new Employee(5000,"Chiến","BG");
        Person per2 = new Customer(1000,"Hoàng","HN");
        per1.display();
        System.out.println();
        per2.display();
    }
}
