
package Bai4;

public class RunMain {
    public static void main(String[] args) {
        
        Array arr1 = new Array();
        Array arr2 = new Array();
    
        System.out.println("Nhap mang 1 : ");
        arr1.InputData();
        
        System.out.println("Nhap mang 2 : ");
        arr2.InputData();
        
        if((float)(arr1.Sum()/arr1.getN())>(float)(arr2.Sum()/arr2.getN())){
            System.out.println("Mang arr1 co TBC lon hon . ");
            arr1.Show();
        }
            
            
        else if((float)(arr2.Sum()/arr2.getN())>(float)(arr1.Sum()/arr1.getN())){
            System.out.println("Mang arr2 co TBC lon hon . ");
            arr2.Show();
        }
        else 
            System.out.println("\nHi");
        
    }
}
