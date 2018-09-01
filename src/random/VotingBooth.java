package random;

import javax.swing.JOptionPane;

public class VotingBooth {

	public static void main(String[] args) {
		
		String years = JOptionPane.showInputDialog("How old are you? (in years)");
		int age = Integer.parseInt(years);
		if (age >= 18) {
			JOptionPane.showInputDialog(null, "Who do you think the next president should be?");
		}
		else if (age <= 18) {
			JOptionPane.showMessageDialog(null, "No one cares what you think.");
		}
		}
}
