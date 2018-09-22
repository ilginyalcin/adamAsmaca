package adamasmaca;

public class Konu extends AdamAsmaca {

    private final String[] konuArr = {"Eşya", "Hayvan", "Ünlü", "Şehir", "Yemek"};

    public String konuSeç() {

        int ind = (int) (Math.random() * konuArr.length);
        return konuArr[ind];

    }

}
