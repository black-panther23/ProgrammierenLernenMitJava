package JavaUebungen03;

// Bestimmung des grössten gemeinsamen Teilers nach Euklid

import javax.swing.JOptionPane;

public class ggtEuklid {
    public static void main(String[] args) {

    var eingabe = JOptionPane.showInputDialog("Geben Sie den Wert m ein:"); //Defintion der Variable "eingabe"
    var m = Integer.parseInt(eingabe);										//Definition des Variablenwerts m
    eingabe = JOptionPane.showInputDialog("Geben Sie den Wert n ein:");	   
	var n = Integer.parseInt(eingabe);										//Definition des Variablenwerts n
	var r = Integer.parseInt();

	  while (r > 0) {		//Berechnung nur bei ungleichen Werten
	    m = n;
		n = r;
		r = m%n;
		
	    }
	}
	System.out.println("n = " + n);
    }

}
