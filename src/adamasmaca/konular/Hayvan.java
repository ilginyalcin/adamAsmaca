package adamasmaca.konular;

import adamasmaca.Konu;

public class Hayvan extends Konu {

    private final String[] hayvanArr = {"LEOPAR", "AĞAÇKAKAN", "PELİKAN", "DENİZ ANASI", "KERTENKELE", "SU SAMURU", "KOBRA", "PAPAĞAN", "KÖPEK"};

    public String hayvanSeç() {

        int ind = (int) (Math.random() * hayvanArr.length);
        return hayvanArr[ind];

    }
}
