package quiz3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EastWest extends JFrame {
	private static final long serialVersionUID = 1L;
	JButton east ;
	JButton west ;
	JPanel panel;
	public EastWest(){
		setTitle("EastWest");
		setLayout(new GridLayout(2,1,5,5));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
		panel = new JPanel();
		east = new JButton("East");
		west = new JButton("West");
		panel.add(east);
		east.addActionListener(new East());
		
		panel.add(west);
		west.addActionListener(new West());
		getContentPane().add(panel);
		
	}
	public class East extends JPanel implements  ActionListener{
		private static final long serialVersionUID = 1L;

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("East");
			JLabel east = new JLabel("East");
		
		}
	}
	
	public class West extends JPanel implements ActionListener{
		private static final long serialVersionUID = 1L;

		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("West");
		JLabel west = new JLabel("West");
	
		}
		
	}
	public static void main(String[] args){
		new EastWest();
	}
	
}
