
package BTVN_Buoi7.B2;

public class RunMain {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[2];
        shapes[0] = new Retangle(5.6,8);
        shapes[1] = new Circle(5.5);
        for(int i =0;i<2;i++){
            System.out.println("Area of shapes[" + i + "]: " +shapes[i].area());
            System.out.println("Perimeter of shapes[" + i + "]: " +shapes[i].primeter());
        }

    }
}
