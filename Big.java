package Game;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Big extends JFrame implements ActionListener{

		JLabel group1=new JLabel("Group A: ");
		JLabel l1=new JLabel("1.");
		JTextField t1=new JTextField(20);
		JLabel l2=new JLabel("2.");
		JTextField t2=new JTextField(20);
		JLabel l3=new JLabel("3.");
		JTextField t3=new JTextField(20);
		JLabel l4=new JLabel("4.");
		JTextField t4=new JTextField(20);
		JLabel group2=new JLabel("Group B");
		JLabel l5=new JLabel("1.");
		JTextField t5=new JTextField(20);
		JLabel l6=new JLabel("2.");
		JTextField t6=new JTextField(20);
		JLabel l7=new JLabel("3.");
		JTextField t7=new JTextField(20);
		JLabel l8=new JLabel("4.");
		JTextField t8=new JTextField(20);
		JButton b=new JButton("Start");
		public Big(){
			setLocation(500,300);
			setTitle("4X4 Tournament");
			setSize(600, 300);
			setVisible(true);
			setLayout(new FlowLayout());
			add(group1);
			add(l1);
			add(t1);
			add(l2);
			add(t2);
			add(l3);
			add(t3);
			add(l4);
			add(t4);
			add(group2);
			add(l5);
			add(t5);
			add(l6);
			add(t6);
			add(l7);
			add(t7);
			add(l8);
			add(t8);
			add(b);
			b.addActionListener(this);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource()==b){
			 setVisible(false);
		 }
	}

}
