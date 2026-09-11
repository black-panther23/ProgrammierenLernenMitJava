package JavaUebungen01;

/* Kreisberechnung: Für einen Kreis werden der Umfang un der Flächeninhalt berechnet.
 * Der Radius wird beim Programmstart als erster Parameter und die Einheit wird als zweiter Parameter übergeben.
 */

public class Kreisberechnung3 {
    public static void main(String[] args) {
        var einheit = args[1];                              //Hier wird der 2. Parameter, also die Masseinheit, initialisiert
        var radius = Double.parseDouble(args[0]);
        var umfang = 2.0 * 3.1415926 * radius;
        var flaeche = 3.1415926 * radius * radius;
        System.out.print("Umfang: ");
        System.out.print(umfang + " " + einheit);
        System.out.println(" " + einheit);
        System.out.print("Fläche: ");
        System.out.print(flaeche);
        System.out.println(" " + einheit + '\u00b2');       //Damit das Hoch2 korrekt ausgegeben wird, wird das '\u00b2' benötigt
    }
}