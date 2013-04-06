package PokerUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import Deck.Deck;
import Poker.Karta;
import Poker.Player;

public class Pokerui {
	private JFrame pokerui;
	private JTextArea player1;
	private JTextArea player2;
	private JTextArea player3;
	private JTextArea player4;
	private JTextArea player5;
	private JTextArea player6;
	private JTextArea flop;
	private JTextArea turn;
	private JTextArea river;
	private JTextArea debug;
	private JButton button;
	private JTextArea slika;
	
	public void go(){
		pokerui= new JFrame("Poker");
		pokerui.setLocation(50,50);
		pokerui.setLayout(new GridLayout(3,6));
		
		
		button=new JButton("Podijeli karte");
		pokerui.add(button);
		
		player1= new JTextArea();
		pokerui.add(player1);
		
		player2= new JTextArea();
		pokerui.add(player2);
		
		player3= new JTextArea();
		pokerui.add(player3);
		
		player4= new JTextArea();
		pokerui.add(player4);
		
		player5= new JTextArea();
		pokerui.add(player5);
		
		player6= new JTextArea();
		pokerui.add(player6);
		
		flop=new JTextArea();
		pokerui.add(flop);
		
		turn=new JTextArea();
		pokerui.add(turn);
		
		river=new JTextArea();
		pokerui.add(river);
		
		debug=new JTextArea();
		pokerui.add(debug);
		
		
		slika= new JTextArea();
		pokerui.add(slika);
		
		pokerui.setMinimumSize(new Dimension(400,300));
	
		pokerui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pokerui.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Karta[] f = new Karta[5];

				int brojIgraca = 6;
//				while (brojIgraca <= 0 || brojIgraca > 6) { //
//					System.out.println("Broj igraca?"); // broj
//					brojIgraca = unos.nextInt(); // igraca
//					unos.nextLine(); //
//				}

				ArrayList<Player> igraci = new ArrayList<>();
				for (int i = 0; i < brojIgraca; i++) {
					igraci.add(new Player());
				}

				Deck deck = new Deck();

				for (int i = 0; i < brojIgraca; i++) {
//					System.out.println("Ime igraca " + (i + 1) + ". :");
					igraci.get(i).ime = "Player"+i;
//					System.out.println();
				}

				podijeliKartePreflop(brojIgraca, igraci, deck);
//				System.out.println(igraci);
				
				f[0]= zajednickaKarta(deck);
				f[1]= zajednickaKarta(deck);
				f[2]= zajednickaKarta(deck);
//				
//				System.out.println("FLOP!!");
//				System.out.println(f[0] + "        " + f[1] + "        " + f[2]);
				
				f[3] = zajednickaKarta(deck);
				
//				System.out.println("TURN");
//				System.out.println(f[3]);

				f[4] = zajednickaKarta(deck);
				
//				System.out.println("RIVER");
//				System.out.println(f[4]);
//				System.out.println("\n\n\n");
//				for (Karta karta : deck.deck) {
//					System.out.println(karta);				// pokazuje ostale karte u decku
//				}
//				System.out.println(deck.deck.size());       // ispisuje broj kolko je karti ostalo u decku  
				player1.setText("");
				player2.setText("");
				player3.setText("");
				player4.setText("");
				player5.setText("");
				player6.setText("");
				flop.setText("");
				turn.setText("");
				river.setText("");
				debug.setText("");
				
				player1.append(igraci.get(0).toString());
				player2.append(igraci.get(1).toString());
				player3.append(igraci.get(2).toString());
				player4.append(igraci.get(3).toString());
				player5.append(igraci.get(4).toString());
				player6.append(igraci.get(5).toString());
				flop.append(f[0].toString()+" + "+f[1].toString()+" + "+f[2].toString());
				turn.append(" + "+f[3].toString());
				river.append(" + "+f[4].toString());
				debug.append(deck.deck.size()+" ");
				
					
				
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new Pokerui().go();
	}

	public BufferedImage getImage() throws IOException {
	  
	    File file = new File("/slike/poker" );
	    return ImageIO.read(file);
	}
private static Karta zajednickaKarta(Deck deck) {
	Karta f1;
	int random = (int) (Math.random() * deck.deck.size());
	f1 = deck.getDeck().get(random);
	deck.deck.remove(random);
	return f1;
}

private static void podijeliKartePreflop(int brojIgraca,
		ArrayList<Player> igraci, Deck deck) {
	for (int a = 0; a < 2; a++) {
		for (int b = 0; b < brojIgraca; b++) {
			if (a < 1) {

				int random = (int) (Math.random() * deck.deck.size());
				igraci.get(b).karta1 = deck.getDeck().get(random);

				deck.deck.remove(random);

			} else {
				int random = (int) (Math.random() * deck.deck.size());
				igraci.get(b).karta2 = deck.getDeck().get(random);
				deck.deck.remove(random);
			}
		}

	}
}

}