
package BTVN_Buoi7.B1;

public abstract class Person {
    private String name;
    private String add;

    public Person(){
        
    }
            
    public Person(String name, String add) {
        this.name = name;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
    
    abstract void display();
    
}
