package JavaUebungen03;

// Bestimmung des grössten gemeinsamen Teilers?

import javax.swing.JOptionPane;

public class WasSollDas {
    public static void main(String[] args) {

		var eingabe = JOptionPane.showInputDialog("Geben Sie den Wert m ein:"); //Definition der Variable "eingabe"
		var m = Integer.parseInt(eingabe);                                                //Definition des Variablenwerts m
		eingabe = JOptionPane.showInputDialog("Geben Sie den Wert n ein:");
		var n = Integer.parseInt(eingabe);                                                //Definition des Variablenwerts n

		while (m != n) {        //Berechnung nur bei ungleichen Werten
			if (m > n) {        //Prüfung ob m grösser ist → Relevant für die Berechnungsmethode
				m = m - n;
			} else {
				n = n - m;
			}
		}
		System.out.println("m = " + m);
	}

}