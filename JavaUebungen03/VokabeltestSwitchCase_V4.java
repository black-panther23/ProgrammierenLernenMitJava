package JavaUebungen03;

// Programm zum Testen auf Vokal. Mit der SwitchCase Methode werden die Vokale vorher definiert in einem Case. Default wird für alle anderen Fälle verwendet. 

import javax.swing.JOptionPane;

public class VokabeltestSwitchCase_V4 {
    public static void main(String[] args) {
        var eingabe = JOptionPane.showInputDialog("Geben sie einen Buchstaben ein: ");
        var c = eingabe.charAt(0);
        String message = switch (c) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                yield c + " ist ein Vokal!";
            }
            default -> {
                yield c + " ist kein Vokal!";
            }
        };
        JOptionPane.showMessageDialog(null, message);
    }
}
