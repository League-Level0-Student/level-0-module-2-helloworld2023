package random;

import javax.swing.JOptionPane;

public class RollerCoaster {

	public static void main(String[] args) {
		
		String height = JOptionPane.showInputDialog("What is your height in inches?");
		int inches = Integer.parseInt(height);
		if (inches >= 48) {
			JOptionPane.showMessageDialog(null, "You can ride the roller coaster!");
		}
		else if (inches < 48) {
			JOptionPane.showMessageDialog(null, "You need to grow more first.");
		} 
		
	}
	
}
