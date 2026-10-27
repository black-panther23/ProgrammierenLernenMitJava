package JavaUebungen04;

public class Zeichensatz {

    public static void main(String[] args) {
        
        byte zahl = 30;             //Der Fehler beginnt bereits hier, da byte nur den wertebereich -128 bis 127 abdeckt und somit die while-Bedinungen nicht erreichen kann
        String zeichensatz = "";

        while (zahl < 128) {
            zeichensatz = zeichensatz + (char) zahl;
            zahl++;
        }
        System.out.println(zeichensatz);
    }
    
}
