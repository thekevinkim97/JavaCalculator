package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	private JButton btnNeg;
	private JButton btnRem;
	private JButton btnDiv;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnMult;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnSub;
	private JButton btn0;
	private JButton btnDec;
	private JButton btnEqual;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnAdd;

	double firstNum;
	double secondNum;
	double result;
	String operator;
	String answer;
	
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
		frame.setBounds(100, 100, 320, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 284, 32);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//-----Row 1-----
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String clear = null;
				
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					clear = strB.toString();
					txtDisplay.setText(clear);
				}
				
			}
		});
		btnClear.setBackground(Color.BLACK);
		btnClear.setFont(new Font("Sitka Heading", Font.ITALIC, 24));
		btnClear.setBounds(10, 54, 60, 50);
		frame.getContentPane().add(btnClear);
		
		btnNeg = new JButton("+/-");
		btnNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double rev = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				rev = rev*(-1);
				txtDisplay.setText(String.valueOf(rev));
			}
		});
		btnNeg.setBackground(Color.BLACK);
		btnNeg.setFont(new Font("Sitka Heading", Font.ITALIC, 18));
		btnNeg.setBounds(80, 54, 60, 50);
		frame.getContentPane().add(btnNeg);
		
		btnRem = new JButton("%");
		btnRem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operator = "%";
			}
		});
		btnRem.setBackground(Color.ORANGE);
		btnRem.setFont(new Font("Sitka Heading", Font.ITALIC, 24));
		btnRem.setBounds(150, 54, 60, 50);
		frame.getContentPane().add(btnRem);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operator = "/";
			}
		});
		btnDiv.setBackground(Color.ORANGE);
		btnDiv.setFont(new Font("Sitka Heading", Font.ITALIC, 24));
		btnDiv.setBounds(220, 54, 60, 50);
		frame.getContentPane().add(btnDiv);
		
		//-----Row 2-----
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(Number);
			}
		});
		btn7.setFont(new Font("Sitka Heading", Font.BOLD, 24));
		btn7.setBounds(10, 115, 60, 50);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(Number);
			}
		});
		btn8.setFont(new Font("Sitka Heading", Font.BOLD, 24));
		btn8.setBounds(80, 115, 60, 50);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(Number);
			}
		});
		btn9.setFont(new Font("Sitka Heading", Font.BOLD, 24));
		btn9.setBounds(150, 115, 60, 50);
		frame.getContentPane().add(btn9);
		
		btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operator = "*";
			}
		});
		btnMult.setBackground(Color.ORANGE);
		btnMult.setFont(new Font("Sitka Heading", Font.ITALIC, 24));
		btnMult.setBounds(220, 115, 60, 50);
		frame.getContentPane().add(btnMult);
		
		//-----Row 3-----
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(Number);
			}
		});
		btn4.setFont(new Font("Sitka Heading", Font.BOLD, 24));
		btn4.setBounds(10, 176, 60, 50);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(Number);
			}
		});
		btn5.setFont(new Font("Sitka Heading", Font.BOLD, 24));
		btn5.setBounds(80, 176, 60, 50);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(Number);
			}
		});
		btn6.setFont(new Font("Sitka Heading", Font.BOLD, 24));
		btn6.setBounds(150, 176, 60, 50);
		frame.getContentPane().add(btn6);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operator = "-";
			}
		});
		btnSub.setBackground(Color.ORANGE);
		btnSub.setFont(new Font("Sitka Heading", Font.ITALIC, 24));
		btnSub.setBounds(220, 176, 60, 50);
		frame.getContentPane().add(btnSub);
		
		//-----Row 4-----
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(Number);
			}
		});
		btn1.setFont(new Font("Sitka Heading", Font.BOLD, 24));
		btn1.setBounds(10, 237, 60, 50);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(Number);
			}
		});
		btn2.setFont(new Font("Sitka Heading", Font.BOLD, 24));
		btn2.setBounds(80, 237, 60, 50);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(Number);
			}
		});
		btn3.setFont(new Font("Sitka Heading", Font.BOLD, 24));
		btn3.setBounds(150, 237, 60, 50);
		frame.getContentPane().add(btn3);
		
		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operator = "+";
			}
		});
		btnAdd.setBackground(Color.ORANGE);
		btnAdd.setFont(new Font("Sitka Heading", Font.ITALIC, 24));
		btnAdd.setBounds(220, 237, 60, 50);
		frame.getContentPane().add(btnAdd);
		
		//-----Row 5-----
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(Number);
			}
		});
		btn0.setFont(new Font("Sitka Heading", Font.BOLD, 24));
		btn0.setBounds(10, 298, 130, 50);
		frame.getContentPane().add(btn0);
		
		btnDec = new JButton(".");
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number = txtDisplay.getText() + btnDec.getText();
				txtDisplay.setText(Number);
			}
		});
		btnDec.setBackground(Color.BLACK);
		btnDec.setFont(new Font("Sitka Heading", Font.ITALIC, 24));
		btnDec.setBounds(150, 298, 60, 50);
		frame.getContentPane().add(btnDec);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				secondNum = Double.parseDouble(txtDisplay.getText());
				switch (operator) {
					case "+":
						result = firstNum + secondNum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
						break;
					case "-":
						result = firstNum - secondNum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
						break;
					case "*":
						result = firstNum * secondNum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
						break;
					case "/":
						result = firstNum / secondNum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
						break;
					case "%":
						result = firstNum % secondNum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
						break;
				}
				
			}
		});
		btnEqual.setForeground(Color.BLACK);
		btnEqual.setBackground(Color.ORANGE);
		btnEqual.setFont(new Font("Sitka Heading", Font.ITALIC, 24));
		btnEqual.setBounds(220, 298, 60, 50);
		frame.getContentPane().add(btnEqual);
	}
}
