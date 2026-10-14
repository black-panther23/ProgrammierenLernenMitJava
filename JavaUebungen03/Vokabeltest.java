package JavaUebungen03;

// Programm zum Testen auf Vokal

import javax.swing.JOptionPane;

public class Vokabeltest {
    public static void main(String[] args) {
        var isVokal = false;
        var eingabe = JOptionPane.showInputDialog("Geben sie einen Buchstaben ein: ");
        var c = eingabe.charAt(0);
        if (c == 'a') {
            isVokal = true;
        } else {
            if (c == 'e') {
                isVokal = true;
            } else {
                if (c == 'i') {
                    isVokal = true;
                } else {
                    if (c == 'o') {
                        isVokal = true;
                    } else {
                        if (c == 'u') {
                            isVokal = true;
                        } else {
                            isVokal = false;
                        }
                    }
                }
            }
            if (isVokal) {
                JOptionPane.showMessageDialog(null, c + " ist ein Vokal!");
            } else {
                JOptionPane.showMessageDialog(null, c + " ist kein Vokal!");
            }
        }
    }
}
