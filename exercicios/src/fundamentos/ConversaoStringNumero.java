package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String number = JOptionPane
				.showInputDialog("Digite o primeiro número: ");
		String number2 = JOptionPane
				.showInputDialog("Digite o primeiro número: ");
		
		System.out.println(number + number2);
		
		double value = Double.parseDouble(number);
		double value2 = Double.parseDouble(number2);
		
		double sum = value + value2;
		
		System.out.println("A soma é: " + sum);
		System.out.println("A media é: " + sum/2);
	}
}
