package adamasmaca.konular;

import adamasmaca.Konu;

public class Ünlü extends Konu {

    private final String[] ünlüArr = {"HALUK BİLGİNER", "SEZEN AKSU", "EDİS", "BEREN SAAT", "ENGİN ALTAN DÜZYATAN", "TARKAN", "YALIN"};

    public String ünlüSeç() {

        int ind = (int) (Math.random() * ünlüArr.length);
        return ünlüArr[ind];

    }
}
