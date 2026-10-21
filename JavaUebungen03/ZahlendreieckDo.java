package JavaUebungen03;

// Ausgabe eines Zahlendreiecks beginnend bei 0 bis 9 mittels Do-Schleife (Fussgesteuert)

public class ZahlendreieckDo {
    public static void main(String[] args) {
        var zahl = 0;
        var ausgabe = "";

        do {
            ausgabe = ausgabe + zahl;
            System.out.println(ausgabe);
            zahl++;
        } while (zahl < 10);
    }
    
}
