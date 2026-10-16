package JavaUebungen03;

// Programm zum Raten einer Zahl. Die Zahl wird im Code iniziert und die Ergebnise in Treffer, Knapp daneben und Daneben aufgetrennt. 

import javax.swing.JOptionPane;

public class Zahlenraten {
    public static void main(String[] args) {
        var eingabezahl = Integer.parseInt(JOptionPane.showInputDialog("Erraten Sie eine Zahl zwischen 1 und 10:"));
        switch (eingabezahl) {
	    case 6:
	        JOptionPane.showMessageDialog(null, "Treffer!");
	        break;
	    case 4:
	    case 5:
	    case 7:
	    case 8:
	        JOptionPane.showMessageDialog(null, "Knapp daneben!");
	        break;
	    default:
	        JOptionPane.showMessageDialog(null, "Daneben!");
	    }
    }

}
