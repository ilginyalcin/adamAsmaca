package adamasmaca.konular;

import adamasmaca.Konu;

public class Yemek extends Konu {

    private final String[] yemekArr = {"İMAMBAYILDI", "KARNIYARIK", "KÜNEFE", "BARBUNYA", "MAKARNA", "PİZZA"};

    public String yemekSeç() {

        int ind = (int) (Math.random() * yemekArr.length);
        return yemekArr[ind];

    }
}
