
package main;

public class Gyakorlas_0601 {

    public static void main(String[] args) {
        feladatok();
    }

    private static final String SEP = System.lineSeparator();
    private static int[] sorozat = {32, 11, 0, 12, 1, -5, 8};
    
    private static void feladatok() {
        kiir("A sorozat elemei: ");
        kiir("[ " + sorozatElemei() + "]" + SEP);
        progTetelekFelhasznalasa();
    }
    
    private static void progTetelekFelhasznalasa() {
        osszegzesBemutatasa();
        megszamlalasBemutatasa();
        szelsoertekekBemutatas();
        kivalasztasBemutatasa();
        eldontesekBemutatasa();
        linKerBemutatasa();
    }
        
    private static void osszegzesBemutatasa() {
        kiir("[Összegzés] A sorozat elemeit összeadjuk és eredményül kapunk: " + osszegzes() + SEP);
    }
    
    private static void megszamlalasBemutatasa() {
        kiir("[Megszámlálás] Megnézzük, hogy a sorozat hány elemből áll: " + megszamlalas() + SEP);
    }
    
    private static void szelsoertekekBemutatas() {
        kiir("[Minimum] Megnézzük a sorozat legkisebb elemének értékét: " + minimumKivalasztas() + SEP);
        kiir("[Maximum] Megnézzük a sorozat legnagyobb elemének értékét: " + maximumKivalasztas() + SEP);
    }
    
    private static void kivalasztasBemutatasa() {
        kiir("[Kiválasztás] Megnézzük a sorozatban az első olyan elemet amely kisebb egy meghatározott értéknél (3): érték: " + sorozat[kivalasztas()] + " index: " + kivalasztas() + SEP);
    }
    
    private static void eldontesekBemutatasa() {
        kiir("[Eldöntés: Egy] Megnézzük a sorozatban, hogy van-e legalább egy olyan elem, amely nagyobb egy meghatározott értéknél (20): " + eldontesEgy() + SEP);
        kiir("[Eldöntés: Mind] Megnézzük a sorozatban, hogy minden elem nagyobb-e, egy meghatározott értéknél (5): " + eldontesMind() + SEP);
    }
    
    private static void linKerBemutatasa() {
        kiir("[Lineáris keresés] Megnézzük a sorozatban, hogy van-e olyan elem, amely nagyobb egy meghatározott értéknél (3): " + linearisKereses() + SEP);
    }
    
    
    
    
    public static int osszegzes() {
        int osszead = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszead += sorozat[i];
        }
        return osszead;
    }

    // az összes elemet végig kell nézni
    private static int megszamlalas() {
        int db = 0;
        for (int i = 0; i < sorozat.length; i++) {
            if (sorozat[i] > 0) {
                db++;
            }
        }
        return db;
    }

    private static int maximumKivalasztas() {
        int maxIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] > sorozat[maxIndex]){
                maxIndex = i;
            }
        }
        return sorozat[maxIndex];
    }
    
    private static int minimumKivalasztas() {
       int minIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] < sorozat[minIndex]){
                minIndex = i;
            }
        }
        return sorozat[minIndex];
    }
    
    // csak addig, amíg nincs meg az eredmény
    private static int kivalasztas() {
        int ker = 3;
        int i = 0;
        while(!(sorozat[i] < ker)){
            i++;
        }
        return i;  
    }
    
    private static boolean eldontesEgy() {
        int ker = 20;
        int i = 0;
        while(i < sorozat.length && !(sorozat[i] > ker)){
            i++;
        }
        return i < sorozat.length;  
    }
    
    private static boolean eldontesMind() {
        int ker = 5;
        int i = 0;
        while(i < sorozat.length && (sorozat[i] > ker)){
            i++;
        }
        return i >= sorozat.length;
    }
    
    private static boolean linearisKereses() {
        int ker = 3;
        int i = 0;
        while(i < sorozat.length && !(sorozat[i] > ker)){
            i++;
        }
        return i < sorozat.length;
    }
    
    private static String sorozatElemei() {
        String szoveg = "";
        for (int i = 0; i < sorozat.length; i++) {
            szoveg = szoveg + sorozat[i] + " ";
        }
        return szoveg;
    }
    
    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
    
}
