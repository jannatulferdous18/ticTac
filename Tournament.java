package Game;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tournament extends JFrame implements ActionListener{

	JButton b1=new JButton("2X2");
	JButton b2=new JButton("4X4");
	public Tournament(){
		setLocation(500,300);
		setTitle("Tournament");
		setSize(600,300 );
		setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
	 //   GridBagConstraints c=new GridBagConstraints();
	    c.insets=new Insets(10, 10, 10,10);
	    c.fill=GridBagConstraints.HORIZONTAL;
		add(b1);
		c.gridx=0;
		c.gridy=1;
		add(b2,c);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1){
			setVisible(false);
			Small s1=new Small();
			}
		else if(e.getSource()==b2){
			setVisible(false);
			Big a=new Big();
		}
	}

}
