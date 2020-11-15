
package BTVN_Buoi7.B2;

public class Circle extends IShape{
    private double radius;
    
    public Circle(){
        
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14*radius*radius;
    }

    @Override
    double primeter() {
        return 2*3.14*radius;
    }
    
            
    
}
