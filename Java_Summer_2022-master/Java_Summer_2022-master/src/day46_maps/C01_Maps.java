package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer,String> sinifList= new HashMap<>();

        sinifList.put(101,"Ali, Can, JDev");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, JDev");
        sinifList.put(104,"Derya, Deniz, Tester");


        System.out.println(sinifList);
        // {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}


        System.out.println(sinifList.keySet());// [101, 102, 103, 104]

        System.out.println(sinifList.values());
        // [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]

        System.out.println(sinifList.values().size());// 4

        // ***** tum ogrencileri isim ve soyisimlerini alt alta yazdirin *******

        Collection<String> tumValueColl=sinifList.values(); // alttaki satır gibi de olur
      //List<String> tumValueColl=new ArrayList<>(sinifList.values());

        String[] eachArr;
        int sira=1;

        for (String each:tumValueColl) {
            // buradaki each bize her bir ogrenciye ait
            // ayni yapidaki isim, soyisim, brans bilgilerini iceren Stringler getiriyor
            eachArr=each.split(", ");
            System.out.println(sira+"- "+eachArr[0]+" "+eachArr[1]);
            sira++;
                        /*
                1- Ali Can
                2- Enes Cem
                3- Taha Emre
                4- Derya Deniz
             */
        }

        // Map'de bulunan ogrencilerin isim ve soy isimlerini birlestirerek
        // bir sinif listesi olusturun

        List<String> sinifIsimSoyisimList= new ArrayList<>();

        for (String each : tumValueColl) {
            eachArr=each.split(", ");
            sinifIsimSoyisimList.add(eachArr[0]+" "+eachArr[1]);

        }

        System.out.println(sinifIsimSoyisimList); // [Ali Can, Enes Cem, Taha Emre, Derya Deniz]





    }
}
