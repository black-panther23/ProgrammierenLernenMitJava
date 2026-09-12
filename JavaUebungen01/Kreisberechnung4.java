package JavaUebungen01;

/* Kreisberechnung: Der Radius für eine Kreis und die Einheit
 * werden über die Tastatur eingegeben. Anschliessen werden
* der Umfang und der Flächeninahlt berechnet
 */

import javax.swing.*;

public class Kreisberechnung4 {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
        var radius = Double.parseDouble(eingabe);
        eingabe = JOptionPane.showInputDialog("Geben Sie die Einheit ein: ");
        var einheit = eingabe;                              //Hier wird der 2. Parameter, also die Masseinheit, initialisiert
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