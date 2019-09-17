package Game;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Play extends JFrame implements ActionListener {

	int p = 0;
	String x,y;
	boolean win = false;
	boolean draw = false;
	int count = 0;
	char a[][] = { { '0', '0', '0', '0' }, { '0', '0', '0', '0' },
			{ '0', '0', '0', '0' }, { '0', '0', '0', '0' } };

	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();

	public Play(String x,String y) {
		setLocation(500,300);
		setSize(600, 600);
		this.x=x;
		this.y=y;
		setTitle(""+x + "  vs  " +y);

		setLayout(new GridLayout(3, 3));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 9; i++) {
			if (p > 1) {
				p = 0;
			}
			if (e.getSource() == b1 && win == false && a[0][0] == '0') {
				if (p == 0) {
					b1.setText("O");
					a[0][0] = 'O';
					// count++;
				} else {
					b1.setText("X");
					a[0][0] = 'X';
					// count++;
				}
				count++;
				p++;
			} else if (e.getSource() == b2 && win == false && a[0][1] == '0') {
				if (p == 0) {
					b2.setText("O");
					a[0][1] = 'O';
					// count++;
				} else {
					b2.setText("X");
					a[0][1] = 'X';
					// count++;
				}
				count++;
				p++;
			} else if (e.getSource() == b3 && win == false && a[0][2] == '0') {
				if (p == 0) {
					b3.setText("O");
					a[0][2] = 'O';
					// count++;
				} else {
					b3.setText("X");
					a[0][2] = 'X';
					// count++;
				}
				count++;
				p++;
			} else if (e.getSource() == b4 && win == false && a[1][0] == '0') {
				if (p == 0) {
					b4.setText("O");
					a[1][0] = 'O';
					// count++;
				} else {
					b4.setText("X");
					a[1][0] = 'X';
					// count++;
				}
				count++;
				p++;
			} else if (e.getSource() == b5 && win == false && a[1][1] == '0') {
				if (p == 0) {
					b5.setText("O");
					a[1][1] = 'O';
					// count++;
				} else {
					b5.setText("X");
					a[1][1] = 'X';
					// count++;
				}
				count++;
				p++;
			} else if (e.getSource() == b6 && win == false && a[1][2] == '0') {
				if (p == 0) {
					b6.setText("O");
					a[1][2] = 'O';
					// count++;
				} else {
					b6.setText("X");
					a[1][2] = 'X';
					// count++;
				}
				count++;
				p++;
			} else if (e.getSource() == b7 && win == false && a[2][0] == '0') {
				if (p == 0) {
					b7.setText("O");
					a[2][0] = 'O';
					// count++;
				} else {
					b7.setText("X");
					a[2][0] = 'X';
					// count++;
				}
				count++;
				p++;
			} else if (e.getSource() == b8 && win == false && a[2][1] == '0') {
				if (p == 0) {
					b8.setText("O");
					a[2][1] = 'O';
					// count++;
				} else {
					b8.setText("X");
					a[2][1] = 'X';
					// count++;
				}
				count++;
				p++;
			} else if (e.getSource() == b9 && win == false && a[2][2] == '0') {
				if (p == 0) {
					b9.setText("O");
					a[2][2] = 'O';
					// count++;
				} else {
					b9.setText("X");
					a[2][2] = 'X';
					// count++;
				}
				count++;
				p++;

			}
		}
		  for(int i1=0;i1<3;i1++)
          {
              for(int j=0;j<3;j++)
              {

                  if((a[i1][j]=='O' && a[i1+1][j]=='O' && a[i1+2][j]=='O') || (a[i1][j]=='O' && a[i1][j+1]=='O' && a[i1][j+2]=='O') || (a[0][0]=='O' && a[1][1]=='O' && a[2][2]=='O') || ( a[0][2]=='O' && a[1][1]=='O' && a[2][0]=='O'))
                  {
                   win=true;   
                  }
                 else  if(a[i1][j]=='X' && a[i1+1][j]=='X' && a[i1+2][j]=='X' || a[i1][j]=='X' && a[i1][j+1]=='X' && a[i1][j+2]=='X' || a[0][0]=='X' && a[1][1]=='X' && a[2][2]=='X' || a[0][2]=='X' && a[1][1]=='X' && a[2][0]=='X')
                  {
                      
                     win =true;
                  }

              }
              if(win==true)
              break;
          }
            if(win==true)
          {
            	if(p==1){
            		   JOptionPane.showMessageDialog(this,"" +x + "  Won the Game"
                               ,"This is the dialog title", JOptionPane.PLAIN_MESSAGE);
            		
            	}
            	else{
         		   JOptionPane.showMessageDialog(this,"" +y + "  Won the Game"
                           ,"This is the dialog title", JOptionPane.PLAIN_MESSAGE);
        		
            		
            	}
            	
          //   System.out.printf("Player %d  Won\n");
              //break;
          }

       else if(count==9)
       {
         //  System.out.printf("Game is drawn\n");
    	   draw=true;
    	   setVisible(false);
    	   JOptionPane.showMessageDialog(this, "        			Game is Drawn" 
                   ,"This is the dialog title", JOptionPane.PLAIN_MESSAGE);
    	   Play a=new Play(x,y);
    	   
       }
	}

}
