
package Buoi5_Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("n = ");
        n = sc.nextInt();
        ArrayList <DieuHoa> list = new ArrayList<>();
        sc.nextLine();
        for(int i =0;i<n;i++){
            DieuHoa dh = new DieuHoa();
            dh.In();
            list.add(dh);
        }
        System.out.println("");
        int min = list.get(0).getGia();
        for(DieuHoa x :list){
            if(min>x.getGia()) min=x.getGia();
        }
        for(DieuHoa x :list){
            if(x.getGia()==min){
                x.Out();
            }
        }
        for(int i =0;i<n;i++){
            if("Elextrolux".equals(list.get(i).getTenH())){
                list.get(i).Out();
            }
            else {
                System.out.println("\nKhong ton tai sp co ma hang Elextrolux");
                break;
            }
        }
        
    }
}
