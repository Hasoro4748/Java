package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class ComponentTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtPuls1;
	private JTextField txtPuls2;
	private JTextField txtPuls_re;
	private JTextField txtMinus1;
	private JTextField txtMinus2;
	private JTextField txtMinus_re;
	private JTextField txtMulti1;
	private JTextField txtMulti2;
	private JTextField txtMulti_re;
	private JTextField txtDiv1;
	private JTextField txtDiv2;
	private JTextField txtDiv_re;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest frame = new ComponentTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ComponentTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 693);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 97, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인1 버튼 클릭,");
			}
		});
		btn1.setBounds(12, 60, 97, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭");
			}
		});
		btn2.setBounds(121, 60, 97, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭...", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("YES 클릭!");
				}else {
					System.out.println("No 클릭!");
				}
			}
		});
		btn3.setBounds(230, 60, 97, 23);
		contentPane.add(btn3);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트필드 실습");
		lblNewLabel_2.setBounds(12, 93, 97, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setBounds(12, 118, 36, 15);
		contentPane.add(lblNewLabel_3);
		
		txtUid = new JTextField();
		txtUid.setBounds(54, 115, 116, 21);
		contentPane.add(txtUid);
		txtUid.setColumns(10);
		
		
		
		JLabel lbResultUid = new JLabel("결과 :");
		lbResultUid.setBounds(245, 118, 82, 15);
		contentPane.add(lbResultUid);
		
		JLabel lblNewLabel_3_1 = new JLabel("이름");
		lblNewLabel_3_1.setBounds(12, 147, 36, 15);
		contentPane.add(lblNewLabel_3_1);
		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = txtUid.getText();
				lbResultUid.setText("결과 : "+ uid);
				
			}
		});
		btnUid.setBounds(176, 114, 60, 23);
		contentPane.add(btnUid);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(54, 144, 116, 21);
		contentPane.add(txtName);
		
		
		
		JLabel lblNewLabel_3_1_1 = new JLabel("휴대폰");
		lblNewLabel_3_1_1.setBounds(12, 176, 36, 15);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lbResultName = new JLabel("결과 :");
		lbResultName.setBounds(245, 147, 82, 15);
		contentPane.add(lbResultName);
		
		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				
				lbResultName.setText("결과 : " +name);
			}
		});
		btnName.setBounds(176, 143, 60, 23);
		contentPane.add(btnName);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(54, 173, 116, 21);
		contentPane.add(txtHp);
		
		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHp.setBounds(176, 172, 60, 23);
		contentPane.add(btnHp);
		
		JLabel lbResultHp = new JLabel("결과 :");
		lbResultHp.setBounds(245, 176, 82, 15);
		contentPane.add(lbResultHp);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("덧셈");
		lblNewLabel_3_1_1_1.setBounds(12, 225, 36, 15);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		txtPuls1 = new JTextField();
		txtPuls1.setColumns(10);
		txtPuls1.setBounds(65, 222, 59, 21);
		contentPane.add(txtPuls1);
		
		
		
		JLabel lbResultHp_1 = new JLabel("+");
		lbResultHp_1.setBounds(141, 225, 14, 15);
		contentPane.add(lbResultHp_1);
		
		txtPuls2 = new JTextField();
		txtPuls2.setColumns(10);
		txtPuls2.setBounds(172, 222, 59, 21);
		contentPane.add(txtPuls2);
		
		JLabel lbResultHp_1_1 = new JLabel("=");
		lbResultHp_1_1.setBounds(248, 225, 14, 15);
		contentPane.add(lbResultHp_1_1);
		
		
		
		txtPuls_re = new JTextField();
		txtPuls_re.setColumns(10);
		txtPuls_re.setBounds(279, 222, 59, 21);
		contentPane.add(txtPuls_re);
		
		
		JButton btnPlus = new JButton("확인");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int p1 = Integer.parseInt(txtPuls1.getText());
				int p2 = Integer.parseInt(txtPuls2.getText());
				
				txtPuls_re.setText((p1 + p2) + "");
				
			}
		});
		btnPlus.setBounds(355, 221, 68, 23);
		contentPane.add(btnPlus);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("뺄셈");
		lblNewLabel_3_1_1_1_1.setBounds(12, 263, 36, 15);
		contentPane.add(lblNewLabel_3_1_1_1_1);
		
		txtMinus1 = new JTextField();
		txtMinus1.setColumns(10);
		txtMinus1.setBounds(65, 260, 59, 21);
		contentPane.add(txtMinus1);
		
		JLabel lbResultHp_1_2 = new JLabel("-");
		lbResultHp_1_2.setBounds(141, 263, 14, 15);
		contentPane.add(lbResultHp_1_2);
		
		txtMinus2 = new JTextField();
		txtMinus2.setColumns(10);
		txtMinus2.setBounds(172, 260, 59, 21);
		contentPane.add(txtMinus2);
		
		JLabel lbResultHp_1_1_1 = new JLabel("=");
		lbResultHp_1_1_1.setBounds(248, 263, 14, 15);
		contentPane.add(lbResultHp_1_1_1);
		
		txtMinus_re = new JTextField();
		txtMinus_re.setColumns(10);
		txtMinus_re.setBounds(279, 260, 59, 21);
		contentPane.add(txtMinus_re);
		
		JButton btnMinus = new JButton("확인");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int m1 = Integer.parseInt(txtMinus1.getText());
				int m2 = Integer.parseInt(txtMinus2.getText());
				
				txtMinus_re.setText((m1 - m2) + "");
				
			}
		});
		btnMinus.setBounds(355, 259, 68, 23);
		contentPane.add(btnMinus);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("곱셈");
		lblNewLabel_3_1_1_1_1_1.setBounds(12, 304, 36, 15);
		contentPane.add(lblNewLabel_3_1_1_1_1_1);
		
		txtMulti1 = new JTextField();
		txtMulti1.setColumns(10);
		txtMulti1.setBounds(65, 301, 59, 21);
		contentPane.add(txtMulti1);
		
		JLabel lbResultHp_1_2_1 = new JLabel("*");
		lbResultHp_1_2_1.setBounds(141, 304, 14, 15);
		contentPane.add(lbResultHp_1_2_1);
		
		txtMulti2 = new JTextField();
		txtMulti2.setColumns(10);
		txtMulti2.setBounds(172, 301, 59, 21);
		contentPane.add(txtMulti2);
		
		JLabel lbResultHp_1_1_1_1 = new JLabel("=");
		lbResultHp_1_1_1_1.setBounds(248, 304, 14, 15);
		contentPane.add(lbResultHp_1_1_1_1);
		
		txtMulti_re = new JTextField();
		txtMulti_re.setColumns(10);
		txtMulti_re.setBounds(279, 301, 59, 21);
		contentPane.add(txtMulti_re);
		
		JButton btnMulti = new JButton("확인");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int M1 = Integer.parseInt(txtMulti1.getText());
				int M2 = Integer.parseInt(txtMulti2.getText());
				
				txtMulti_re.setText((M1 * M2) + "");
			}
		});
		btnMulti.setBounds(355, 300, 68, 23);
		contentPane.add(btnMulti);
		
		JLabel lblNewLabel_3_1_1_1_1_1_1 = new JLabel("나눗셈");
		lblNewLabel_3_1_1_1_1_1_1.setBounds(12, 345, 45, 15);
		contentPane.add(lblNewLabel_3_1_1_1_1_1_1);
		
		txtDiv1 = new JTextField();
		txtDiv1.setColumns(10);
		txtDiv1.setBounds(65, 342, 59, 21);
		contentPane.add(txtDiv1);
		
		JLabel lbResultHp_1_2_1_1 = new JLabel("/");
		lbResultHp_1_2_1_1.setBounds(141, 345, 14, 15);
		contentPane.add(lbResultHp_1_2_1_1);
		
		txtDiv2 = new JTextField();
		txtDiv2.setColumns(10);
		txtDiv2.setBounds(172, 342, 59, 21);
		contentPane.add(txtDiv2);
		
		JLabel lbResultHp_1_1_1_1_1 = new JLabel("=");
		lbResultHp_1_1_1_1_1.setBounds(248, 345, 14, 15);
		contentPane.add(lbResultHp_1_1_1_1_1);
		
		txtDiv_re = new JTextField();
		txtDiv_re.setColumns(10);
		txtDiv_re.setBounds(279, 342, 59, 21);
		contentPane.add(txtDiv_re);
		
		JButton btnDiv = new JButton("확인");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int d1 = Integer.parseInt(txtDiv1.getText());
				int d2 = Integer.parseInt(txtDiv2.getText());
				
				txtDiv_re.setText(Math.round(((double)d1 / (double)d2)) + "");
			}
		});
		btnDiv.setBounds(355, 341, 68, 23);
		contentPane.add(btnDiv);
		
		JLabel lblNewLabel_4 = new JLabel("체크박스 실습");
		lblNewLabel_4.setBounds(12, 380, 97, 15);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(25, 405, 57, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(86, 405, 57, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(141, 405, 57, 23);
		contentPane.add(chk3);
		
		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(205, 405, 57, 23);
		contentPane.add(chk4);
		
		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(266, 405, 57, 23);
		contentPane.add(chk5);
		
		JLabel lbCheckBox = new JLabel("결과 :");
		lbCheckBox.setBounds(12, 434, 286, 15);
		contentPane.add(lbCheckBox);
		
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> cities = new ArrayList<>();
				
				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				
				lbCheckBox.setText("결과 : " + cities);
			}
		});
		btnCheck.setBounds(326, 405, 97, 23);
		contentPane.add(btnCheck);
		
		JLabel lblNewLabel_4_1 = new JLabel("테이블 실습");
		lblNewLabel_4_1.setBounds(12, 466, 97, 15);
		contentPane.add(lblNewLabel_4_1);
		
		table = new JTable();
		table.setBounds(12, 492, 411, 118);
		contentPane.add(table);
		
		String[] columnNames = {"아이디", "이름", "나이", "휴대폰"};
		DefaultTableModel model = new DefaultTableModel(columnNames,0);
		model.setRowCount(0);
		table.setModel(model);
		
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101","김유신",23,"010-1234-1001"));
				persons.add(new Person("a102","김춘추",21,"010-1234-1002"));
				persons.add(new Person("a103","장보고",33,"010-1234-1003"));
				persons.add(new Person("a104","강감찬",43,"010-1234-1004"));
				persons.add(new Person("a105","이순신",53,"010-1234-1005"));
				
				for(Person person : persons) {
					Object[] rowData = {person.getId(), person.getName(), person.getAge(), person.getHp()};
					model.addRow(rowData);
					
				}
			}
		});
		btnTable.setBounds(12, 620, 97, 23);
		contentPane.add(btnTable);
		
		
		
	}
}
