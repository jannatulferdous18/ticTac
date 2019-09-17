package Game;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PvsP extends JFrame implements ActionListener {
	
			JLabel l1=new JLabel("Player 1");
			JTextField t1=new JTextField(20);
			JLabel l2= new JLabel("Player 2");
			JTextField t2=new JTextField(20);
			JButton b=new JButton("Start");
			public PvsP (){
				setLocation(500,300);
				setSize(600, 300);
				setLayout(new GridBagLayout());
				GridBagConstraints c=new GridBagConstraints();
			   // GridBagConstraints c=new GridBagConstraints();
			    c.insets=new Insets(10, 10, 10,10);
			    c.fill=GridBagConstraints.HORIZONTAL;
				c.gridx=0;
				c.gridy=0;
				add(l1,c);
				c.gridx=0;
				c.gridy=1;
				add(t1,c);
				c.gridx=0;
				c.gridy=2;
				add(l2,c);
				c.gridx=0;
				c.gridy=3;
				add(t2,c);
				c.gridx=0;
				c.gridy=4;
				add(b,c);
				setVisible(true);
				b.addActionListener(this);
			}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String x=(t1.getText());
		String y=(t2.getText());
		if(e.getSource()==b){
			setVisible(false);
			Play a=new Play(x,y);
		}
	}

}
