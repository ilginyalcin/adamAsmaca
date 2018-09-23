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

    public void harfAç(String seçilenKelime, char girilenHarf, int hak,char[] göster) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> bulunanIndex = new ArrayList<Integer>();
        int a = 0;
        for (int k = 0; k < seçilenKelime.length(); k++) {
            if (seçilenKelime.charAt(k) == girilenHarf) {
                bulunanIndex.add(a, k);
                a++;

            }
        }

        hak = hak - 1;
        if (bulunanIndex.isEmpty()) {
            System.out.println("Çıkmadı.Yeniden deneyin..\n" + "Kalan hakkınız : " + hak);
        } else {
            //BU HARF KELİMENİN İÇİNDE VAR

            System.out.println("Bu harf var");
            
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
            for (int y = 0; y < göster.length; y++) {
                if (göster[y] != '_') {
                    break;
                } else {
                    char yeniHarf;
                    System.out.println("Daha bitmedi");
                    System.out.println("Tebrikler.Kalan hakkınız : " + (hak + 1));

                    System.out.println("Yeni bir harf girin : ");

                    yeniHarf = input.next().toUpperCase().charAt(0);
                    harfAç(seçilenKelime, yeniHarf, hak + 1,göster);
                }

            }
        }
    }
}
