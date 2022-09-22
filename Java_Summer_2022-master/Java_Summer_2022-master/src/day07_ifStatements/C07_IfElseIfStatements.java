package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        bir önceki soruda kullanici negatif sonuc girerse uyaralim

        NOT: birden fazla if-else if birbirine baglanmissa son durum onemlidir
        eger else ile bitiyorsa butun ihtimaller kapsaniyor demektir
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas= scan.nextInt();

        if (yas < 0) {
            System.out.println("Lutfen gecerli bir yas giriniz");
        }else if (yas < 65) {
            System.out.println("Emekli olamazsin "+(65-yas)+" yil daha calismalisin");
        }else {
            System.out.println("Emekli olabilirsin");
            }




    }
}
