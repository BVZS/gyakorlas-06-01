
package main;

public class Gyakorlas_0601 {

    public static void main(String[] args) {
        feladatok();
    }

    private static void feladatok() {
        int[] sorozat = {0, 1, 2, 3};
        
        osszegzes(sorozat);
        megszamlalas(sorozat);
        maximumKivalasztas(sorozat);
        minimumKivalasztas(sorozat);
        kivalasztas(sorozat);
    }
    
    public static int osszegzes(int[] tomb) {
        int osszead = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszead += tomb[i];
        }
        return osszead;
    }

    // az összes elemet végig kell nézni
    private static void megszamlalas(int[] sorozat) {
        
    }

    private static void minimumKivalasztas(int[] sorozat) {
        
    }
    
    private static void maximumKivalasztas(int[] sorozat) {
       
    }
    
    // csak addig, amíg nincs meg az eredmény
    private static int kivalasztas(int[] sorozat) {
        return 0;
    }
    
    private static boolean eldontesEgy(int[] sorozat) {
        return false;
    }
    
    private static boolean eldontesMind(int[] sorozat) {
        return false;
    }
    
    private static int linearisKereses(int[] sorozat) {
        return -1;
    }
    
    
    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
    
}
