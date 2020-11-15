
package BTVN_Buoi7.B1;

public class Employee extends Person{
    private int sala;

    public Employee(){
        
    }
    public Employee(int sala) {
        this.sala = sala;
    }

    public Employee(int sala, String name, String add) {
        super(name, add);
        this.sala = sala;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    @Override
    public void display() {
        System.out.println("Employee's Name : "+super.getName());
        System.out.println("Employee's Address : "+super.getAdd());
        System.out.println("Employee's Salary : "+sala);
    }
    
    
}
