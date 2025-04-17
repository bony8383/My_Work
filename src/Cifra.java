import java.util.Scanner;

public class Cifra {
    //Колдонуучу киргизген эки санды бири-бирине алмаштыр.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your first number:");
        int a = sc.nextInt();
        System.out.println("Insert second  number:");
        int b = sc.nextInt();

         int c = a;
         a = b;
         b = c;
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);



       }

    }

