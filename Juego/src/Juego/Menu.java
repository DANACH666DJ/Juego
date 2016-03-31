package Juego;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Menu implements KeyListener {
	
	MiCanvas canvas;

	public Menu(MiCanvas canvas) {
		this.canvas = canvas;
		this.canvas.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	    if(e.getKeyChar()=='a'){
	    	canvas.setterIestado_actual(MiCanvas.IESTADO_JUEGO);
	    	System.out.println("Imprimo la letra a");
	    }else if(e.getKeyChar()=='b'){
	    	canvas.setterIestado_actual(MiCanvas.IESTADO_MENU);
	    	System.out.println("Imprimo la letra b");
	    }
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
