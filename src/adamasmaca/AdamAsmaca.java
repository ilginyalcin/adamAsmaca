package adamasmaca;

import java.util.Scanner;

public class AdamAsmaca {

    public static void main(String[] args) {
        
        String seçilenKelime;
        char girilenHarf;
        Scanner input = new Scanner(System.in);

        Konu myKonu = new Konu();
        Kelime myKelime = new Kelime();
        Düzen firstLook = new Düzen();

        String sorulanKonu = myKonu.konuSeç();
        System.out.println("Kelimenin konusu : " + sorulanKonu);

        seçilenKelime = myKelime.kelimeSeç(sorulanKonu);
        System.out.println(seçilenKelime);
        firstLook.ilkDüzen(seçilenKelime);
        firstLook.harfAç(seçilenKelime);

    }

}
