
package Bai4;

import java.util.Scanner;

public class Array {
    private int n;
    private int []arr;
    
    Scanner sc = new Scanner(System.in);
    
    public void InputData(){
        System.out.println("So phan tu : ");
        n = sc.nextInt();
        System.out.println("Nhap mang : ");
        arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
    public void Show(){
        System.out.println("Hien thi mang : ");
        for(int i = 0 ;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public int Sum(){
        int T=0;
        for(int i =0;i<n;i++){
            T += arr[i];
        }
        return T;
    }

    public Array(){
    }

    public Array(int n, int[] arr) {
        this.n = n;
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
}
