package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcApp frame = new CalcApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Long _num = 0L;
	Long _pre_num = 0L;
	final int IDLE = 0;
	final int PLUS = 1;
	final int MINUS = 2;
	final int MULTI = 3;
	final int DIV = 4;
	final int TMP = 5;
	int cState = 0;
	/**
	 * Create the frame.
	 */
	public void cal() {
			switch(cState) {
			case IDLE:
				break;
			case PLUS:
				_pre_num= _pre_num + _num ;
				break;
			case MINUS:
				_pre_num= _pre_num - _num ;
				break;
			case MULTI:
				_pre_num= _pre_num * _num ;
				break;
			case DIV:
				_pre_num= _pre_num / _num ;
				break;
			default:
				break;
		}
	}
	public CalcApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		txtNum = new JTextField();
		txtNum.setFont(new Font("나눔고딕", Font.PLAIN, 29));
		txtNum.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNum.setText("0");
		txtNum.setBounds(12, 10, 316, 53);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(_pre_num != 0) {
					cal();
				}
				else {
					_pre_num = _num;
				}
				cState = PLUS;
				_num = 0L;
				txtNum.setText(_pre_num+"");
			}
		});
		btnPlus.setBounds(258, 344, 70, 70);
		contentPane.add(btnPlus);
		
		
		JButton btnMi = new JButton("-");
		btnMi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_pre_num != 0) {
					cal();
				}
				else {
					_pre_num = _num;
				}
				cState = MINUS;
				_num = 0L;
				txtNum.setText(_pre_num+"");
			}
		});
		btnMi.setBounds(258, 256, 70, 70);
		contentPane.add(btnMi);
		
		
		JButton btnEqu = new JButton("=");
		btnEqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(cState) {
					case IDLE:
						break;
					case PLUS:
						_num = _num + _pre_num;
						txtNum.setText(_num+"");
						break;
					case MINUS:
						_num = _pre_num - _num;
						txtNum.setText(_num+"");
						break;
					case MULTI:
						_num = _num * _pre_num;
						txtNum.setText(_num+"");
						break;
					case DIV:
						if(_num == 0) {
							txtNum.setText("0으로 나눌 수 없습니다.");
							return;
						}
						_num = _num / _pre_num;
						txtNum.setText(_num+"");
						break;
					default:
						break;
				}
				_pre_num = 0L;
				cState = TMP;
				
			}
		});
		btnEqu.setBounds(176, 344, 70, 70);
		contentPane.add(btnEqu);
		

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_num == 0) {
					txtNum.setText("0으로 나눌 수 없습니다.");
					return;
				}
				if(_pre_num != 0) {
					cal();
				}
				else {
					_pre_num = _num;
				}
				cState = DIV;
				_num = 0L;
				txtNum.setText(_pre_num+"");
			}
		});
		btnDiv.setBounds(258, 76, 70, 70);
		contentPane.add(btnDiv);
		
		
		JButton btnMul = new JButton("X");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(_pre_num != 0) {
					cal();
				}
				else {
					_pre_num = _num;
				}
				cState = MULTI;
				_num = 0L;
				txtNum.setText(_pre_num+"");
			}
		});
		btnMul.setBounds(258, 166, 70, 70);
		contentPane.add(btnMul);
		
		
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cState = IDLE;
				_num = 0L;
				_pre_num = 0L;
				txtNum.setText(_num + "");;
			}
		});
		btnClear.setBounds(12, 344, 70, 70);
		contentPane.add(btnClear);
		
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cState == TMP) {
					_num = 0L;
					cState = IDLE;
				}
				_num =_num * 10 + 7;
				txtNum.setText(_num + "");
			}
		});
		btn7.setBounds(12, 76, 70, 70);
		contentPane.add(btn7);
		
		
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cState == TMP) {
					_num = 0L;
					cState = IDLE;
				}
				_num =_num * 10 + 8;
				txtNum.setText(_num + "");
			}
		});
		btn8.setBounds(94, 76, 70, 70);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cState == TMP) {
					_num = 0L;
					cState = IDLE;
				}
				_num =_num * 10 + 9;
				txtNum.setText(_num + "");
			}
		});
		btn9.setBounds(176, 76, 70, 70);
		contentPane.add(btn9);
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cState == TMP) {
					_num = 0L;
					cState = IDLE;
				}
				_num =_num * 10 + 4;
				txtNum.setText(_num + "");
			}
		});
		btn4.setBounds(12, 166, 70, 70);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cState == TMP) {
					_num = 0L;
					cState = IDLE;
				}
				_num =_num * 10 + 5;
				txtNum.setText(_num + "");
			}
		});
		btn5.setBounds(94, 166, 70, 70);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cState == TMP) {
					_num = 0L;
					cState = IDLE;
				}
				_num =_num * 10 + 6;
				txtNum.setText(_num + "");
			}
		});
		btn6.setBounds(176, 166, 70, 70);
		contentPane.add(btn6);
		
		
		
		
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cState == TMP) {
					_num = 0L;
					cState = IDLE;
				}
				if(_num != 0L) {
					_num =_num * 10 + 0;
					txtNum.setText(_num + "");
				}
				else {
					
					txtNum.setText(0+"");
				}
				
			}
		});
		btn0.setBounds(94, 344, 70, 70);
		contentPane.add(btn0);
		
		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cState == TMP) {
					_num = 0L;
					cState = IDLE;
				}
				_num =_num * 10 + 3;
				txtNum.setText(_num + "");
			}
		});
		btn3.setBounds(176, 256, 70, 70);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cState == TMP) {
					_num = 0L;
					cState = IDLE;
				}
				_num =_num * 10 + 2;
				txtNum.setText(_num + "");
			}
		});
		btn2.setBounds(94, 256, 70, 70);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cState == TMP) {
					_num = 0L;
					cState = IDLE;
				}
				_num =_num * 10 + 1;
				txtNum.setText(_num + "");
			}
		});
		btn1.setBounds(12, 256, 70, 70);
		contentPane.add(btn1);
	}

}
