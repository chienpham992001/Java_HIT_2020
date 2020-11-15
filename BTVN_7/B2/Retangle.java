
package BTVN_Buoi7.B2;

public class Retangle extends IShape{
    private double length;
    private double width;
    
    public Retangle(){
        
    }

    public Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return this.length*this.width;
    }

    @Override
    double primeter() {
        return (this.length+this.width)*2;
    }
    
}
