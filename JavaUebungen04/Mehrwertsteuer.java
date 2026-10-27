package JavaUebungen04;

import javax.swing.JOptionPane;

public class Mehrwertsteuer {
    public static void main(String[] args) {
        var mwstsatz = 19.0;

        var betrag = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie den Rechnungsbetrag in € ein: "));
        System.out.println("Betrag: " + betrag);
        System.out.println("Schritt 1: " + (mwstsatz/100));
        System.out.println("Schritt 2: " + (mwstsatz/100*betrag));
        var mwst = mwstsatz / 100 * betrag;
        System.out.println("Mehrwertsteuer: " + mwst + "€19");
    }
}
