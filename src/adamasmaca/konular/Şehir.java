package adamasmaca.konular;

import adamasmaca.Konu;

public class Şehir extends Konu {

    private final String[] şehirArr = {"MUŞ", "ADIYAMAN", "KOCAELİ", "TRABZON", "İSTANBUL", "GAZİANTEP", "BURDUR", "MARDİN", "GİRESUN"};

    public String şehirSeç() {

        int ind = (int) (Math.random() * şehirArr.length);
        return şehirArr[ind];

    }
}
