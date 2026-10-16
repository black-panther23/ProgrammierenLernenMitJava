package JavaUebungen03;

// Programm zum Testen auf Vokal. Mit der SwitchCase Methode werden die Vokale vorher definiert in einem Case. Default wird für alle anderen Fälle verwendet. 

import javax.swing.JOptionPane;

public class VokabeltestSwitchCase_V3 {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie einen Buchstaben ein: ");
        var c = eingabe.charAt(0);
        switch (c) {
            case 'a', 'e', 'i', 'o', 'u' ->
                JOptionPane.showMessageDialog(null, c + " ist ein Vokal!");
            default ->
                JOptionPane.showMessageDialog(null, c + " ist kein Vokal!");
        }
    }
}
