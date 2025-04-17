//Үч бурчтуктун негизги табаны менен бийиктиги берилген — аянтын эсепте.
//Колдонуучу киргизген эки санды бири-бирине алмаштыр.
//Саны жана НДС’сиз баасы берилсе — 22% НДС кошулганда жалпы бааны эсепте.

import java.util.Scanner;

public class TriUgolnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Биринчи тарабынын узундугун жазыңыз:");
        int a = sc.nextInt();
        System.out.println("Экинчи тарабынын узундугун жазыңыз:");
        int b = sc.nextInt();
        System.out.println("Үчүнчү тарабынын узундугун жазыңыз:");
        int c = sc.nextInt();
        int result = a + b + c;
        System.out.println("Үч бурчтуктун аянты: " + result);

    }

}
