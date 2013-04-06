package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;
public class xZaBrisati  {
    public static void main( String [] args ) {
         final JFrame frame = new JFrame();
         frame.setSize(400,400);
         frame.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			    frame.add( new JPanel() {
		             /**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					public void paint( Graphics g ) {
		                super.paintComponent(g);
		                Graphics2D g2 = (Graphics2D)g;

		                Line2D line = new Line2D.Double(40, 40, 300, 300);
		                g2.setColor(Color.blue);
		                g2.setStroke(new BasicStroke(10));
		                g2.draw(line);
		             }
		        });
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
     
        frame.setVisible( true );
    }
}