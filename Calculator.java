import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;


public class Calculator {

	private JFrame frame;
	private JTextField JText;
	String s=new String();
	int value1,value2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setForeground(Color.GRAY);
		frame.setBounds(100, 100, 532, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JText = new JTextField();
		JText.setBounds(57, 17, 365, 61);
		frame.getContentPane().add(JText);
		JText.setColumns(10);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				s=s+"1";
				JText.setText(s);
			}
		});
		button1.setBounds(27, 159, 50, 35);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				s=s+"2";
				JText.setText(s);
			}
		});
		button2.setBounds(102, 159, 50, 35);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				s=s+"3";
				JText.setText(s);
			}
		});
		button3.setBounds(175, 159, 50, 35);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				s=s+"4";
				JText.setText(s);
			}
		});
		button4.setBounds(27, 205, 50, 35);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				s=s+"5";
				JText.setText(s);
			}
		});
		button5.setBounds(102, 205, 50, 35);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				s=s+"6";
				JText.setText(s);
			}
		});
		button6.setBounds(176, 205, 49, 35);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				s=s+"7";
				JText.setText(s);
			}
		});
		button7.setBounds(27, 251, 50, 32);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s=s+"8";
				JText.setText(s);
			}
		});
		button8.setBounds(102, 250, 50, 34);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				s=s+"9";
				JText.setText(s);
			}
		});
		button9.setBounds(175, 250, 50, 34);
		frame.getContentPane().add(button9);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s=s+"+";
		        JText.setText(s);
			}
		});
		plus.setFont(new Font("Tahoma", Font.PLAIN, 11));
		plus.setBounds(322, 202, 50, 40);
		frame.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s=s+"-";
		        JText.setText(s);
			}
		});
		minus.setBounds(382, 203, 50, 35);
		frame.getContentPane().add(minus);
		
		JButton multi = new JButton("*");
		multi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s=s+"*";
		        JText.setText(s);
			}
		});
		multi.setBounds(322, 247, 50, 40);
		frame.getContentPane().add(multi);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s=s+"/";
		        JText.setText(s);
			}
		});
		div.setBounds(382, 243, 50, 40);
		frame.getContentPane().add(div);
		
		
		
		JButton modulus = new JButton("%");
		modulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s=s+"%";
		        JText.setText(s);
			}
		});

		modulus.setBounds(345, 158, 77, 37);
		frame.getContentPane().add(modulus);
		
		JButton equal = new JButton("=");
	    equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String [] st=s.split("-|\\+|\\*|/|%");
				value1 = Integer.parseInt(st[0]);
				value2 = Integer.parseInt(st[1]);
				if(s.contains("+"))
		              JText.setText(Integer.toString(value1+value2));
		          if(s.contains("-"))
		              JText.setText(Integer.toString(value1-value2));
		          if(s.contains("*"))
		              JText.setText(Integer.toString(value1*value2));
		          if(s.contains("/")){
		        	  if(value2==0){
		        		  JText.setText("Division Can not be Done ");
		        	  }
		        	  else
		        	  JText.setText(Integer.toString(value1/value2));
		          }
		          if(s.contains("%")){
		        	  JText.setText(Integer.toString(value1%value2));
		          }
			}
		});
		equal.setBounds(437, 159, 41, 124);
		frame.getContentPane().add(equal);
		
		JButton  button0= new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s=s+"0";
				JText.setText(s);
			}
		});
		button0.setBounds(235, 202, 77, 40);
		frame.getContentPane().add(button0);
	}
}
