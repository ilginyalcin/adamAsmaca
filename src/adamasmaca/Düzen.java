package adamasmaca;

import java.util.ArrayList;
import java.util.Scanner;

public class Düzen {

    public void ilkDüzen(String kelime) {

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i) == ' ') {
                System.out.print("/ ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();

    }

    public void harfAç(String seçilenKelime) {
        int kalanHak = 10;
        Scanner input = new Scanner(System.in);
        char girilenHarf;
        char[] göster = new char[seçilenKelime.length()];

        finish:
        while (kalanHak > 0) {

            System.out.print("Bir harf girin :");
            girilenHarf = input.next().toUpperCase().charAt(0);
            ArrayList<Integer> bulunanIndex = new ArrayList<Integer>();
            int a = 0;

            for (int k = 0; k < seçilenKelime.length(); k++) {
                if (seçilenKelime.charAt(k) == girilenHarf) {
                    bulunanIndex.add(a, k);
                    a++;

                }
            }

            if (bulunanIndex.isEmpty()) {
                kalanHak = kalanHak - 1;
                System.out.println("Çıkmadı.Yeniden deneyin..\n" + "Kalan hakkınız : " + kalanHak);
                hakkımBittimi(seçilenKelime, kalanHak);
                kelimeyiGöster(bulunanIndex, göster, girilenHarf, seçilenKelime);
            } else {
                //BU HARF KELİMENİN İÇİNDE VAR

                kelimeyiGöster(bulunanIndex, göster, girilenHarf, seçilenKelime);

                for (int y = 0; y < göster.length; y++) {
                    if (göster[y] != '_') {
                        break;
                    }

                }
                System.out.println("Tebrikler.Kalan hakkınız : " + (kalanHak));
            }

        }

    }

    public void kelimeyiGöster(ArrayList<Integer> bulunanIndex, char[] göster, char girilenHarf, String seçilenKelime) {

        for (int m = 0; m < göster.length; m++) {
            for (int s = 0; s < bulunanIndex.size(); s++) {
                int b = bulunanIndex.get(s);
                göster[b] = girilenHarf;
            }
            if (seçilenKelime.charAt(m) == ' ') {
                göster[m] = '/';

            } else {
                göster[m] = '_';

            }

        }
        for (int y = 0; y < göster.length; y++) {
            System.out.print(göster[y] + " ");

        }
        System.out.println();

    }

    public void hakkımBittimi(String seçilenKelime, int hak) {
        if (hak <= 0) {
            System.out.println("Üzgünüm bulamadınız.. \n Aradığınız kelime şuydu : " + seçilenKelime);
        }
    }
}
