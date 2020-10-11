
package Bai5;

public class RunMain {
    public static void main(String[] args) {
        Guns g1 = new Guns("AKM",100);
        Guns g2 = new Guns("M4A1",100);
        
        do{
            g1.Shoot(40);
            g2.Shoot(35);
            System.out.println("AKM còn : "+g1.getAmmoNumber()+" viên");
            System.out.println("M4A1 còn : "+g2.getAmmoNumber()+" viên");
            System.out.println("");
        if (g1.getAmmoNumber() <= 0){
                System.out.println(" AKM thắng.");
                break;
            }
        if (g2.getAmmoNumber() <= 0) {
                System.out.println(" M4A1 thắng.");
                break;
            }
        
            g1.Load(20);
            g2.Load(25);
        }while(g1.getAmmoNumber()!=0 &&g2.getAmmoNumber()!=0);
    }
}
