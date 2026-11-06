package JavaUebungen05;

public class Bruch {
    int zaehler;
    int nenner;

    void ausgeben() {
        System.out.println(zaehler + "/" + nenner);
    }

    void kuerzen() {
        var m = Math.abs(zaehler); //speichert in m den Wert von zaehler
        var n = Math.abs(nenner); //speicher in n den Wert von nenner
        var r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        zaehler /=n; //in n steht jetzt der ggT
        nenner /=n;
    }
}
