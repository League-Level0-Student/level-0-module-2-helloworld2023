package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {

		int ticket;
		ticket = new Random().nextInt((26 - 20) + 1) + 20;
		int ticket2 = new Random().nextInt((81 - 70) + 1) + 70;
		int ticket3 = new Random().nextInt((36 - 30) + 1) + 30;
		int ticket4 = new Random().nextInt((61 - 55) + 1) + 55;
		int ticket5 = new Random().nextInt((10 - 0) + 1) + 10;

		JOptionPane.showMessageDialog(null, ticket + " " + ticket2 + " " + ticket3 + " " + ticket4 + " " + ticket5);
	}
}
