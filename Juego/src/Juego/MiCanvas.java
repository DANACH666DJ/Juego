package Juego;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MiCanvas extends Canvas {
	
	public static int IESTADO_MENU=1;
	public static int IESTADO_JUEGO=2;
	public int iestado_actual=IESTADO_JUEGO;
	

	/**
	 * 
	 */
	private static final long serialVersionUID= 1L;
	
	public MiCanvas(){
		super();
	}
	
	public void setterIestado_actual(int iestado_actual){
		this.iestado_actual=iestado_actual;
		repaint();
	}
	
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D gr2d=(Graphics2D)g;
		if(iestado_actual==IESTADO_MENU){
			paintMenu(gr2d);
			
			
		}else if(iestado_actual==IESTADO_JUEGO){
			paintJuego(gr2d);
		}
		
		
//		gr2d.setColor(Color.RED);
//		gr2d.drawLine(1,1,100,100);
//		gr2d.setColor(Color.BLUE);
//		gr2d.drawString("Hola", 10, 100);
//		gr2d.setColor(Color.black);
//		gr2d.drawString("Mundo", 50, 15);
//		gr2d.setColor(Color.orange);
//		gr2d.drawRect(1, 2, 100, 100);
//		gr2d.setColor(Color.GREEN);
//		gr2d.drawRect(1, 2, 100, 100);
	
		
		
	}
	
	public void paintMenu(Graphics2D g){
		g.setColor(Color.RED);
		g.drawString("Menu", 10, 100);
		
	}
	
	public void paintJuego(Graphics2D g){
		g.setColor(Color.BLUE);
		g.drawString("Juego", 10, 100);
		
	}
	
}
