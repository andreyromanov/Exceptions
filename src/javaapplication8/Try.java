package javaapplication8;

import java.util.Scanner;

public class Try {

    public static int a;
    public static int b;

    public static void Plus() {
             
        int[] m = {-1,0,1}; 
        Scanner sc = new Scanner(System.in); 
        try { 
            int a = sc.nextInt();     
            m[a] = 4/a; 
            System.out.println(m[a]); 
        } catch (ArithmeticException e) { 
            System.out.println("Произошла недопустимая арифметическая операция"); 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Обращение по недопустимому индексу массива"); 
        }
    }

    public static void Div() {
        Scanner in = new Scanner(System.in);
        System.out.println("A= ");
        a = in.nextInt();
        System.out.println("B= ");
        b = in.nextInt();
        try {
            int Delenie = a / b;
            System.out.println("Мы получили" + Delenie);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
       
    }

    public static void main(String[] args) {
        Plus();
       
    }

}
