package adamasmaca;

import java.util.ArrayList;
import java.util.Scanner;

public class Düzen {
static char[] göster ;
char[] harfler = {'A', 'B', 'C', 'Ç', 'D', 'E', 'F', 'G', 'Ğ', 'H', 'I', 'İ', 'J', 'K', 'L', 'M', 'N', 'O', 'Ö', 'P', 'R', 'S', 'Ş', 'T', 'U', 'Ü', 'V', 'Y', 'Z'};


    public void ilkDüzen(String kelime) {

        for (int i = 0; i <kelime.length(); i++) {
            if (kelime.charAt(i) == ' ') {
                System.out.print("/ ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();

    }

     public void harfAç(String seçilenKelime) {
    int kalanHak = 10;
    Scanner input = new Scanner(System.in);
    char girilenHarf;
    göster=new char[seçilenKelime.length()];
    for(int p=0;p<göster.length;p++){
        göster[p]='_';
    }
    finish:
    while (kalanHak > 0) {
    
    System.out.print("Bir harf girin :");
    girilenHarf = input.next().toUpperCase().charAt(0);
    ArrayList<Integer> bulunanIndex = new ArrayList<Integer>();
    int a = 0;
    
    for (int t=0; t < seçilenKelime.length(); t++) {
    if (seçilenKelime.charAt(t) == girilenHarf) {
    bulunanIndex.add(a,t);
    a++;
    //girdiğin harfin kelimenin kaçıncı indisinde  tutan bir dizi
    }
    }
    
    if (bulunanIndex.isEmpty()) {
    kalanHak = kalanHak - 1;
    System.out.println("Çıkmadı.Yeniden deneyin..\n" + "Kalan hakkınız : " + kalanHak);
    hakkımBittimi(seçilenKelime, kalanHak);
    
    göster=kelimeyiGöster(bulunanIndex, göster, girilenHarf, seçilenKelime);
    } else {
    //BU HARF KELİMENİN İÇİNDE VAR
    
    göster=kelimeyiGöster(bulunanIndex, göster, girilenHarf, seçilenKelime);
    
    for (int y = 0; y < göster.length; y++) {
        System.out.print(göster[y]+" ");
    
    }
    if(oyunBittiMi(göster))
    {
        System.out.println("\nKelimeyi bildiniz!!!\n"+seçilenKelime);
    }
    else
    System.out.println("Tebrikler.Kalan hakkınız : " + (kalanHak));
    }
    
    }
    
    }
    public boolean oyunBittiMi(char[] göster){
        for(int l=0;l<göster.length;l++)
        {
            if(göster[l]=='_')
                return false;
            
        }
        return true;
    }
    public char[] kelimeyiGöster(ArrayList<Integer> bulunanIndex, char[] göster, char girilenHarf, String seçilenKelime) {
   
       for(int b=0;b<bulunanIndex.size();b++){
        int index=bulunanIndex.get(b);
        
        
        for(int j=0;j<göster.length;j++)
    {
        if(j==index)
        {
           göster[index]=girilenHarf;
        }
        else if(seçilenKelime.charAt(j)==' ')
            göster[j]='/';
        else if(göster[j]!='_')
            continue;
        else
            göster[j]='_';
    }
    }
        
    return göster;
    }
    
    public void hakkımBittimi(String seçilenKelime, int hak) {
    if (hak <= 0) {
    System.out.println("Üzgünüm bulamadınız.. \n Aradığınız kelime şuydu : " + seçilenKelime);
    }
    }
    
    }
