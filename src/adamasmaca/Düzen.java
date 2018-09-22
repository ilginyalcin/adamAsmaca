package adamasmaca;

import java.util.ArrayList;

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

    public void harfAç(String seçilenKelime, char girilenHarf, int hak) {

       
        ArrayList<Integer> bulunanIndex = new ArrayList<Integer>();
        int a = 0;
        for (int k = 0; k < seçilenKelime.length(); k++) {
            if (seçilenKelime.charAt(k) == girilenHarf) {
                bulunanIndex.add(a, k);
                a++;

            }
        }
        for (int p = 0; p < bulunanIndex.size(); p++) {
            System.out.println(bulunanIndex.get(p));
        }
        hak = hak - 1;
        if (bulunanIndex.isEmpty()) {
            System.out.println("Çıkmadı.Yeniden deneyin..\n" + "Kalan hakkınız : " + hak);
        } else {
            //BU HARF KELİMENİN İÇİNDE VAR

            System.out.println("Bu harf var");
            char[] göster = new char[seçilenKelime.length()];
            for(int m=0;m<göster.length;m++)
            {
                for (int s = 0; s < bulunanIndex.size(); s++) {
                    int b = bulunanIndex.get(s);
                    göster[b] = girilenHarf;
                }
                if (seçilenKelime.charAt(m) == ' ') {
                    göster[m]='/';
                    
                } else {
                    göster[m]='_';
                    
                }
                
            }
            for(int y=0;y<göster.length;y++)
            {
                System.out.print(göster[y]+" ");
            }
            
        }
    }
}
