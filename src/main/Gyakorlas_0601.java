
package main;

public class Gyakorlas_0601 {

    public static void main(String[] args) {
        feladatok();
    }

    private static int[] sorozat = {0, 1, 2, 3};
    
    private static void feladatok() {
        osszegzes();
        megszamlalas();
        maximumKivalasztas();
        minimumKivalasztas();
        kivalasztas();
        eldontesEgy();
        eldontesMind();
        linearisKereses();
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

    private static int minimumKivalasztas() {
        int maxIndex = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] > sorozat[maxIndex]){
                maxIndex = i;
            }
        }
        return sorozat[maxIndex];
    }
    
    private static int maximumKivalasztas() {
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
        int ker = 1;
        int i = 0;
        while(!(sorozat[i] < ker)){
            i++;
        }
        return sorozat[i];  
    }
    
    private static boolean eldontesEgy() {
        int ker = 1;
        int i = 0;
        while(i < sorozat.length && !(sorozat[i] > ker)){
            i++;
        }
        return i < sorozat.length;  
    }
    
    private static boolean eldontesMind() {
        int ker = 2;
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
        boolean van = i < sorozat.length;  
        /*if(van) {
            System.out.printf("A keresett elem (> %d):\n", ker);
        } else {
            System.out.println("Nincs a keresésnek megfelelő elem!");
        }*/
        return van;
    }
    
    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
    
}
