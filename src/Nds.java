import java.util.Scanner;

public class Nds {
    //Саны жана НДС’сиз баасы берилсе — 22% НДС кошулганда жалпы бааны эсепте.
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your quantity:");
        double quantity = sc.nextDouble();
        System.out.println("Insert your price without NDS:");
        double none = sc.nextDouble();
        double total = quantity * none;
        double NDS = total * 0.22;
        double price = total + NDS;

        System.out.println("Your price with NDS is:" + " " + price);




    }

}
