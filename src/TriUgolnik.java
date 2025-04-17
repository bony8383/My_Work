//Үч бурчтуктун негизги табаны менен бийиктиги берилген — аянтын эсепте.
//Колдонуучу киргизген эки санды бири-бирине алмаштыр.
//Саны жана НДС’сиз баасы берилсе — 22% НДС кошулганда жалпы бааны эсепте.

import java.util.Scanner;

public class TriUgolnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Негизги табан жана бийиктик жөнүндө маалымат алуу
        System.out.println("Негизги табандын узундугун жазыңыз:");
        double base = sc.nextDouble();

        System.out.println("Бийиктикти жазыңыз:");
        double height = sc.nextDouble();

        // Аянтты эсептөө
        double area = 0.5 * base * height;

        // Натыйжаны чыгаруу
        System.out.println("Үч бурчтуктун аянты: " + area);

    }

}
