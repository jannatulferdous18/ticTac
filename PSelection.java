package Game;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PSelection extends JFrame implements ActionListener{
	JButton b1=new JButton("Player vs Player");
	JButton b2=new JButton("Tournament");
	public PSelection(){
		setLocation(500,300);
		setSize(600 , 300);
		setLayout(new GridBagLayout());
		GridBagConstraints c=new GridBagConstraints();
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
		if(e.getSource()==b1)
		{
			setVisible(false);
			PvsP a=new PvsP();
		}
		if(e.getSource()==b2){
			setVisible(false);
			Tournament a=new Tournament();
		}
	}

}
