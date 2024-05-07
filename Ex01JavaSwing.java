package javaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex01JavaSwing {

	public static void main(String[] args) {
		JFrame quadro = new JFrame();
		
		JButton botao = new JButton("Click aqui");
		botao.setBounds(130,100,100,40);
		quadro.add(botao);
		quadro.setSize(400,500);
		quadro.setLayout(null);
		quadro.setVisible(true);

	}

}
