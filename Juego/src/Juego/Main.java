package Juego;

import javax.swing.JFrame;

public class Main {
	static JFrame jfPrincipal;

	public Main() {

	}

	public static void main(String[] args) {
		jfPrincipal = new JFrame();
		jfPrincipal.setBounds(300, 300, 800, 800);

		MiCanvas micanvas = new MiCanvas();
		Menu menu=new Menu(micanvas);
		
		jfPrincipal.add(micanvas);

		jfPrincipal.setVisible(true);

		micanvas.repaint();
		

	}

}
