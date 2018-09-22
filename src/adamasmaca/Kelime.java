package adamasmaca;

import adamasmaca.konular.Eşya;
import adamasmaca.konular.Hayvan;
import adamasmaca.konular.Yemek;
import adamasmaca.konular.Ünlü;
import adamasmaca.konular.Şehir;

public class Kelime {

    String sorulanKelime;

    public String kelimeSeç(String sorulanKonu) {
        if (null != sorulanKonu) {
            switch (sorulanKonu) {
                case "Eşya":
                    Eşya myEşya = new Eşya();
                    sorulanKelime = myEşya.eşyaSeç();
                    break;

                case "Hayvan":
                    Hayvan myHayvan = new Hayvan();
                    sorulanKelime = myHayvan.hayvanSeç();
                    break;
                case "Yemek":
                    Yemek myYemek = new Yemek();
                    sorulanKelime = myYemek.yemekSeç();
                    break;
                case "Ünlü":
                    Ünlü myÜnlü = new Ünlü();
                    sorulanKelime = myÜnlü.ünlüSeç();
                    break;
                case "Şehir":
                    Şehir myŞehir = new Şehir();
                    sorulanKelime = myŞehir.şehirSeç();
                    break;
                default:
                    break;
            }
        }
        return sorulanKelime;
    }
}
