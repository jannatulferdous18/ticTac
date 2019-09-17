package Game;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Project extends JFrame implements ActionListener{
			
				JButton b1=new JButton("New Game");
				JButton b2=new JButton("LeaderBoard");
				JButton b3=new JButton("Exit");
				public Project(){
				setLocation(500,300);
				
			    setSize(600, 300);
			    setLayout(new GridBagLayout());
			    setVisible(true);
			    GridBagConstraints c=new GridBagConstraints();
			    c.insets=new Insets(10, 10, 10,10);
			    c.fill=GridBagConstraints.HORIZONTAL;
				c.gridx=0;
				c.gridy=0;
				add(b1,c);
				setLayout(new GridBagLayout());
				c.gridx=0;
				c.gridy=1;
				add(b2,c);
				c.gridx=0;
				c.gridy=2;
				add(b3,c);
				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
			}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1){
		setVisible(false);
		PSelection a= new PSelection();
	}
}
}
