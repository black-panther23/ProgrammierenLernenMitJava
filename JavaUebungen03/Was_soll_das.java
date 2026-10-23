package JavaUebungen03;

// Bestimmung des grössten gemeinsamen Nenners?
import javax.swing.JOptionPane;

public class Was_soll_das {
    public static void main(String[] args) {
        var m = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie den Wert m ein:"));
        var n = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie den Wert n ein:"));

        while (m != n) {
            if (m > n) {
              m = m - n;
            } else {
              n = n - m;
            }
            System.out.println(m);
            
        }
    }
    
}
