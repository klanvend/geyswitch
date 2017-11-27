import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class PlayerCizici extends JPanel implements KeyListener,ActionListener{
	Rectangle d,c;
	Player[] p;
	int oyuncusayisi;
	public PlayerCizici(Player[] g) 
	{
	super();
	addKeyListener(this);
	Timer t1=new Timer(150,this);
	d=new Rectangle(0, 0,1600,50);
	c=new Rectangle(0,800,1600,50);
	diziKlonla(g);
	oyuncusayisi=p.length+1;
	System.out.println(oyuncusayisi);
	t1.start();
	}
	public void diziKlonla(Player[] g)
	{
		p=new Player[g.length];
		for(int i=0;i<p.length;i++)
		{
			p[i]=g[i];
		}
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(int i=0;i<oyuncusayisi-1;i++)
		{
			p[i].ekranaCiz(g);
			repaint();
		}
		g.setColor(Color.BLACK);
		g.fillRect((int)d.getX(), (int)d.getY(),(int)d.getWidth(),(int)d.getHeight());
		g.fillRect((int)c.getX(), (int)c.getY(),(int)c.getWidth(),(int)c.getHeight());
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<oyuncusayisi-1;i++)
		{
			p[i].HaraketEt();
			p[i].GravityEffect(p,oyuncusayisi,i);
		}
	}
	@Override
	public void keyPressed(KeyEvent e) {
		for(int i=0;i<oyuncusayisi-1;i++) {
		if(e.getKeyCode()==p[i].tus)
			{p[i].Reverse();
			System.out.println("reverse");
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
