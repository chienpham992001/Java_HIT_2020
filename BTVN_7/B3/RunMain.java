
package BTVN_Buoi7.B3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<News> List = new ArrayList<>();
        int choose;
        do{
            System.out.println("*****************************************");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.println("*****************************************");
            choose = sc.nextInt();
            switch(choose){
                case 1:
                    News s1 = new News();
                    System.out.print("ID : ");
                    s1.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Title :");
                    s1.setTitle(sc.nextLine());
                    System.out.print("Publish date :");
                    s1.setPublishDate(sc.nextLine());
                    System.out.print("Author :");
                    s1.setAuthor(sc.nextLine());
                    System.out.print("Content :");
                    s1.setContent(sc.nextLine());
                    System.out.print("Rate : ");
                    s1.InputRateList();
                    List.add(s1);
                    break;
                case 2:
                    System.out.println("2. View list news");
                    System.out.printf("%15s %15s %15s %15s %15s %15s ","Id","Title","PublishDate","Author","Content","AverageRate");
                    System.out.println("");
                    for(News s:List){
                        s.Display();
                    }
                    break;
                case 3:
                    System.out.println("3. Average rate");
                    for(int i =0;i<List.size();i++){
                        List.get(i).Calculate();
                        List.get(i).Display();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }while(true);
    }
}
