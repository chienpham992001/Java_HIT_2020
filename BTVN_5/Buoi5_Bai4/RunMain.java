
package Buoi5_Bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        int s;
        System.out.println("/****************************************/");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort students by gpa.");
        System.out.println("5. Sort students by name.");
        System.out.println("6. Show students.");
        System.out.println("0. Exit.");
        System.out.println("/****************************************/");
        System.out.print("Your choice : ");
        
        do{
            s = sc.nextInt();
            switch(s){
                case 1:
                    AddStudent(list);
                    break;
            }
        }while(true);
    }
    public static void AddStudent(ArrayList<SinhVien> list){
        boolean check;
        int id=0;
        do {
            check = true;
            System.out.print("Nhập id : ");
            id = sc.nextInt();
            for (int i = 0; i < list.size(); i++) {
                if (id == list.get(i).getId()) {
                       check = false;
                       break;
                }
            }
            if(!check) System.out.println("ID đã tồn tại.");
        }while(!check);
        sc.nextLine();
        System.out.print("Nhập tên : ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập địa chỉ : ");
        String add = sc.nextLine();
        System.out.print("Nhập điểm trung bình : ");
        float gpa = sc.nextFloat();
        SinhVien x = new SinhVien(id, name, age, add, gpa);
        list.add(x);
        System.out.println("Đã nhập xong");
    }
    
}
