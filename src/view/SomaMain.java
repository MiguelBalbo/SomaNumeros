package view;
import javax.swing.JOptionPane;

import controller.SomaControl;
public class SomaMain {

	public static void main(String[] args) {
		SomaControl nat = new SomaControl();
		
		//aqui ele pede pro usuário colocar um número
		 int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
		//aqui ele leva o número digitado pra função e coloca o resultado na var Naturais 
		 int naturais = nat.naturais(n);
		//aqui ele exibe
		 JOptionPane.showMessageDialog(null,naturais);
	}
	
}