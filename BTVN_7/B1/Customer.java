
package BTVN_Buoi7.B1;

public class Customer extends Person{
    private int bala;

    public Customer(){
        
    }
    public Customer(int bala) {
        this.bala = bala;
    }

    public Customer(int bala, String name, String add) {
        super(name, add);
        this.bala = bala;
    }

    public int getBala() {
        return bala;
    }

    public void setBala(int bala) {
        this.bala = bala;
    }

    @Override
    public void display() {
        System.out.println("Customer's Name : "+super.getName());
        System.out.println("Customer's Address : "+super.getAdd());
        System.out.println("Customer's Balance "+bala);
    }
    
}
