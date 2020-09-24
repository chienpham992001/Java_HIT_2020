
        
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Bai1 {
    public static void main(String[] args) {
        int m,n;
        Scanner input = new Scanner(System.in);
        System.out.print("m , n = ");
        m = input.nextInt();
        n = input.nextInt();
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i == 0 || j == 0 || i == n-1 || j == m-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
