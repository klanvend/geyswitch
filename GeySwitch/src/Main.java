import javax.swing.JFrame;

public class Main {

	
	public static void main(String[] args) {
		PlayerCizici p;
		JFrame pencere=new JFrame("Aray�z");
		pencere.setVisible(true);
		pencere.setSize(1600,900);
		Menu m=new Menu();
		if(m.start==0) 
		{
			System.out.println("if girdi");
		pencere.add(m);
		pencere.addKeyListener(m);
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		while(m.start==0) 
		{
			System.out.println("a");
		}
		if(m.start==1)
		{
			p=new PlayerCizici(m.p);
			JFrame pencere2=new JFrame("GeySwitch");
			pencere2.setVisible(true);
			pencere.dispose();
			pencere2.setSize(1600,900);
			pencere2.add(p);
			pencere2.addKeyListener(p);
			System.out.println("else if girdi");
			pencere2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
				
	}
	}
	
