package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan bir array'in boyutunu
        ve tum elementlerini alarak bir array olusturup,
        bu array'i bize donduren bir method yaziniz
         */

        int [] sayilar=arrayOlustur();

        System.out.println(Arrays.toString(sayilar));

    }

    public static int[] arrayOlustur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elemanli bir array olusturulsun");
        int uzunluk= scan.nextInt();

        int[] olusturulan= new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i+". index için sayiyi giriniz");
            olusturulan[i]=scan.nextInt();
        }

        return  olusturulan;
    }
}
