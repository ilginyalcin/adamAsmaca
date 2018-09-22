package adamasmaca.konular;

import adamasmaca.Konu;

public class Eşya extends Konu {

    public String[] eşyaArr = {"ŞEMSİYE", "HELİKOPTER", "KOMBİ", "SANDALYE", "DİŞ FIRÇASI"};

    public String eşyaSeç() {
        
        int ind = (int) (Math.random() * eşyaArr.length);
        return eşyaArr[ind];
    }
}
