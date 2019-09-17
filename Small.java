package Game;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Small extends JFrame implements ActionListener{

		String w,x,y,z;
		JLabel group1=new JLabel("Group A: ");
		JLabel l1=new JLabel("1.");
		JTextField t1=new JTextField(20);
		JLabel l2=new JLabel("2.");
		JTextField t2=new JTextField(20);
		JLabel group2=new JLabel("Group B");
		JLabel l3=new JLabel("1.");
		JTextField t3=new JTextField(20);
		JLabel l4=new JLabel("2.");
		JTextField t4=new JTextField(20);
		JButton b=new JButton("Start");
		public Small(){
			setLocation(500,300);
			setTitle("2X2 Tournament");
			setSize(600, 300);
			setVisible(true);
			setLayout(new FlowLayout());
			add(group1);
			add(l1);
			add(t1);
			add(l2);
			add(t2);
			add(group2);
			add(l3);
			add(t3);
			add(l4);
			add(t4);
			add(b);
			b.addActionListener(this);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String w=(t1.getText());
		String x=(t2.getText());
		String y=(t3.getText());
		String z=(t4.getText());
		 if(e.getSource()==b){
			 setVisible(false);
			 Play a=new Play(w,x);
			 if(a.win==true){
			 Play b=new Play(y,z);
			 }
		 }
	}

}
