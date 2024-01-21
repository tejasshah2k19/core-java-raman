import  java.util.Scanner;
import java.lang.*;

public class Calc {


    void add(){
        int a =10;
        int b = 20; 
        int ans = a+b; 
        
        Scanner scr = new Scanner(System.in); 
        System.out.println("Enter two numbers");
        a = scr.nextInt();
        b = scr.nextInt(); 
        ans = a+b; 
        System.out.println("Addition => "+ans);


    }
    public static void main(String[] args) {
        Calc c = new Calc();
        c.add();
    }
}
