package JavaUebungen03;

// Zahlentest - Ist eine Zahl positiv oder negativ

import javax.swing.JOptionPane;

public class Zahlentest {
    public static void main(String[] args) {

        var zahl = Double.parseDouble(JOptionPane.showInputDialog("Geben Sie eine Zahl ein:")); //Eingabe und Umwandlung in Double in einem Schritt
        if (zahl < 0) {
            JOptionPane.showMessageDialog(null, "Die Zahl ist negativ!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Die Zahl ist positiv!");
        }
    }
    
}
