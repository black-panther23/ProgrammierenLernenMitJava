package JavaUebung01;

// Kreisberechnung: Für einen Kreis mit dem Radius 5 cm werden der Umfang und der Flächeninhalt berechnet 


public class Kreisberechnung {
    public static void main(String[] args) {
        var radius = 5.0;
        var umfang = 2.0 * 3.1415926 * radius;
        var flaeche = 3.1415926 * radius * radius;
        System.out.print("Umfang: ");
        System.out.println(umfang);
        System.out.print("Fläche: ");
        System.out.println(flaeche);
    }
}
