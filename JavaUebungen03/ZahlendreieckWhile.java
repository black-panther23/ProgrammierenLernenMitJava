package JavaUebungen03;

// Ausgabe eines Zahlendreiecks beginnend bei 0 bis 9 mittels While-Schleife (kopfgesteuert)

public class ZahlendreieckWhile {
    public static void main(String[] args) {
        var zahl = 0;
        var ausgabe = "";

        while (zahl < 10) {
            ausgabe = ausgabe + zahl;        //Die Ausgabe wird um die aktuelle Zahl erweitert
            System.out.println(ausgabe);
            zahl++;                         //Aktuelle Zahl wird um 1 erhöht
        }
    }
    
}
