package igrica;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Window;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Slike extends JFrame{
	private GraphicsDevice grafulja;
	private Screen s;
	private Image pozadina;
	private Image slika;
	private boolean loaded;

	
	public Slike(){
		GraphicsEnvironment env= GraphicsEnvironment.getLocalGraphicsEnvironment();
		grafulja=env.getDefaultScreenDevice();
		
		
	}
	
	public void setFullScren(DisplayMode dm,JFrame window){
		window.setUndecorated(true);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		grafulja.setFullScreenWindow(window);
		
		if (dm != null && grafulja.isDisplayChangeSupported()) {
			try {
				grafulja.setDisplayMode(dm);
			} catch (Exception e) {
			}
		}
	}
		
		public Window getFullScreenWindow(){
			return grafulja.getFullScreenWindow();
		}
		
		public void restoreScreen(){
			Window w=grafulja.getFullScreenWindow();
			if (w!=null){
				w.dispose();
			}
			grafulja.setFullScreenWindow(null);
		
		
	}
	
		
		public static void main(String[] args) {
		DisplayMode dm= new DisplayMode(1366, 768, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
		
		Slike a= new Slike();
		
		a.run(dm);
		
		
		
	}
	
	
	public void run(DisplayMode dm){
		setBackground(Color.PINK);
		setForeground(Color.WHITE);
		setFont(new Font("Arial",Font.PLAIN,24));
		loaded=false;
		s= new Screen();
		
		try{
			s.setFullScren(dm, this);
			loadpics();
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
			}
		}finally{
			s.restoreScreen();
			
			
		}
		
	}
	
	private void loadpics() {
		pozadina= new ImageIcon("pozadina.jpg").getImage();
		slika= new ImageIcon("head.jpg").getImage();
		loaded=true;
		repaint();
	}

	public void paint(Graphics g){

		if (g instanceof Graphics2D){
			Graphics2D g2=(Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
//		if(loaded){
//			
//			g.drawImage(pozadina, 0, 0, null);
//			g.drawImage(slika, 170,180, null);
//	
//			
//		}

	
	}
	
}
