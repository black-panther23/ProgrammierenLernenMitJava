package JavaUebungen03;

//  Überprüfung, ob ein Jahr ein Schaltjahr ist

import javax.swing.JOptionPane;

public class Schaltjahr {
    public static void main(String[] args) {
        
    var jahr = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Jahreszahl ein:")); //Umwandlung auf Integer direkt bei Eingabe
	if ((jahr % 400) == 0) {                                                
        JOptionPane.showMessageDialog(null, "Das Jahr " + jahr + " ist ein Schaltjahr!"); //Sonderprüfung für Regel mit 400 Jahren
    } else {
    if ((jahr % 100) == 0) {
        JOptionPane.showMessageDialog(null, "Das Jahr " + jahr + " ist kein Schaltjahr!"); //Alle 100 Jahre ist kein Schaltjahr
        } else {
        if ((jahr % 4) == 0) {
            JOptionPane.showMessageDialog(null, "Das Jahr " + jahr + " ist ein Schaltjahr!"); //Alle 4 Jahre ist ein Schaltjahr
            } else {
                JOptionPane.showMessageDialog(null, "Das Jahr " + jahr + " ist kein Schaltjahr!");
                }
            }
        }
    }
}
