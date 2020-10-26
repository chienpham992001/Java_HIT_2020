
package Buoi5_Bai4;

import java.util.Scanner;

public class SinhVien {
    private int id;
    private String name;
    private int age;
    private String add;
    private float gpa;

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id :");
        id = sc.nextInt();
        System.out.print("Nhap ten : ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi : ");
        age = sc.nextInt();
        System.out.print("Nhap dia chi : ");
        add = sc.nextLine();
        System.out.print("Nhap diem tb : ");
        gpa = sc.nextFloat();
    }
    
    public SinhVien(){
        
    }
    
    public SinhVien(int id, String name, int age, String add, float gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.add = add;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", name=" + name + ", age=" + age + ", add=" + add + ", gpa=" + gpa + '}';
    }
    
    
}
