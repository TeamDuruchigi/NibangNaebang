package Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class uploadMyroomUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					uploadMyroomUI frame = new uploadMyroomUI();
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
	public uploadMyroomUI() {
		setTitle("니방내방 - 내방 소개하기");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("\uB2C8\uBC29\uB0B4\uBC29");
		titleLabel.setIcon(new ImageIcon(uploadMyroomUI.class.getResource("/Project/logo_small.png")));
		titleLabel.setBounds(20, 15, 187, 67);
		titleLabel.setFont(new Font("야놀자 야체 B", Font.BOLD, 50));
		contentPane.add(titleLabel);
		
		JPanel line2 = new JPanel();
		line2.setBackground(Color.BLACK);
		line2.setBounds(0, 96, 1600, 1);
		contentPane.add(line2);
		
		JButton movePage1 = new JButton("\uB0B4\uBC29 \uC810\uAC80\uD558\uAE30");
		movePage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				roomCheck r = new roomCheck();
				r.setVisible(true);
				setVisible(false);
			}
		});
		
		JPanel line2_1 = new JPanel();
		line2_1.setBackground(Color.LIGHT_GRAY);
		line2_1.setBounds(82, 189, 652, 1);
		contentPane.add(line2_1);
		
		JPanel line2_2 = new JPanel();
		line2_2.setBackground(Color.LIGHT_GRAY);
		line2_2.setBounds(82, 494, 652, 1);
		contentPane.add(line2_2);
		movePage1.setBounds(300, 20, 200, 60);
		movePage1.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage1.setFocusPainted(false);
		movePage1.setContentAreaFilled(false);
		movePage1.setBorderPainted(false);
		movePage1.setBackground(Color.BLUE);
		contentPane.add(movePage1);
		
		JButton movePage2 = new JButton("\uB2C8\uBC29 \uB79C\uB364\uB9E4\uCE6D");
		movePage2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				randomMatching r = new randomMatching();
				r.setVisible(true);
				setVisible(false);
			}
		});
		movePage2.setBounds(700, 20, 200, 60);
		movePage2.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage2.setFocusPainted(false);
		movePage2.setContentAreaFilled(false);
		movePage2.setBorderPainted(false);
		movePage2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(movePage2);
		
		JButton movePage3 = new JButton("\uB2C8\uBC29 \uCC3E\uC544\uBCF4\uAE30");
		movePage3.setBounds(900, 20, 200, 60);
		movePage3.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage3.setFocusPainted(false);
		movePage3.setContentAreaFilled(false);
		movePage3.setBorderPainted(false);
		movePage3.setBackground(Color.LIGHT_GRAY);
		contentPane.add(movePage3);
		
		JButton movePage4 = new JButton("\uB0B4\uBC29 \uC18C\uAC1C\uD558\uAE30");
		movePage4.setBounds(500, 20, 200, 60);
		movePage4.setFont(new Font("야놀자 야체 B", Font.PLAIN, 40));
		movePage4.setFocusPainted(false);
		movePage4.setContentAreaFilled(false);
		movePage4.setBorderPainted(false);
		movePage4.setBackground(Color.LIGHT_GRAY);
		contentPane.add(movePage4);
		
		JButton moveMail = new JButton();
		moveMail.setIcon(new ImageIcon(uploadMyroomUI.class.getResource("/Project/mail.png")));
		moveMail.setBounds(1490, 20, 75, 60);
		moveMail.setFocusPainted(false);
		moveMail.setContentAreaFilled(false);
		moveMail.setBorderPainted(false);
		contentPane.add(moveMail);
		
		JButton btnNewButton = new JButton("수정하기");
		btnNewButton.setBounds(637, 505, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("업로드하기");
		btnNewButton2.setBounds(375, 596, 97, 23);
		contentPane.add(btnNewButton2);
		
		JLabel nameLabel = new JLabel();
		nameLabel.setText(CurrentUser.getName());
		nameLabel.setFont(new Font("야놀자 야체 B", Font.PLAIN, 30));
		nameLabel.setIcon(new ImageIcon(uploadMyroomUI.class.getResource("/Project/personn.png")));
		nameLabel.setBounds(1220, 20, 250, 60);
		contentPane.add(nameLabel);
		
		JLabel infoLabel1 = new JLabel("내방 현황");
		infoLabel1.setBounds(60, 136, 57, 15);
		contentPane.add(infoLabel1);
		
		JLabel myLable_1 = new JLabel();
		myLable_1.setBounds(154, 222, 57, 15);
		if(CurrentUser.getGender() == 1)
			 myLable_1.setText("남자");
		else if(CurrentUser.getGender() == 2)
			 myLable_1.setText("여자");
		else
			myLable_1.setText("정보 없음");
		contentPane.add(myLable_1);
		
		JLabel myLable_2 = new JLabel("New label");
		myLable_2.setBounds(154, 247, 57, 15);
		contentPane.add(myLable_2);
		
		JLabel myLable_3 = new JLabel("New label");
		myLable_3.setBounds(154, 272, 57, 15);
		contentPane.add(myLable_3);
		
		JLabel myLable_4 = new JLabel("New label");
		myLable_4.setBounds(154, 297, 57, 15);
		contentPane.add(myLable_4);
		
		JLabel myLable_5 = new JLabel("New label");
		myLable_5.setBounds(154, 322, 57, 15);
		contentPane.add(myLable_5);
		
		JLabel myLable_6 = new JLabel("New label");
		myLable_6.setBounds(154, 347, 57, 15);
		contentPane.add(myLable_6);
		
		JLabel myLable_7 = new JLabel("New label");
		myLable_7.setBounds(154, 376, 57, 15);
		contentPane.add(myLable_7);
		
		JLabel myLable_8 = new JLabel("New label");
		myLable_8.setBounds(154, 401, 57, 15);
		contentPane.add(myLable_8);
		
		JLabel myLable_9 = new JLabel("New label");
		myLable_9.setBounds(154, 426, 57, 15);
		contentPane.add(myLable_9);
		
		JLabel myLable_10 = new JLabel("New label");
		myLable_10.setBounds(154, 451, 57, 15);
		contentPane.add(myLable_10);
		
		JLabel myLable_11 = new JLabel("New label");
		myLable_11.setBounds(331, 222, 57, 15);
		contentPane.add(myLable_11);
		
		JLabel myLable_12 = new JLabel("New label");
		myLable_12.setBounds(331, 247, 57, 15);
		contentPane.add(myLable_12);
		
		JLabel myLable_13 = new JLabel("New label");
		myLable_13.setBounds(331, 272, 57, 15);
		contentPane.add(myLable_13);
		
		JLabel myLable_14 = new JLabel("New label");
		myLable_14.setBounds(331, 297, 57, 15);
		contentPane.add(myLable_14);
		
		JLabel myLable_15 = new JLabel("New label");
		myLable_15.setBounds(331, 322, 57, 15);
		contentPane.add(myLable_15);
		
		JLabel myLable_16 = new JLabel("New label");
		myLable_16.setBounds(331, 347, 57, 15);
		contentPane.add(myLable_16);
		
		JLabel myLable_17 = new JLabel("New label");
		myLable_17.setBounds(331, 376, 57, 15);
		contentPane.add(myLable_17);
		
		JLabel myLable_18 = new JLabel("New label");
		myLable_18.setBounds(331, 401, 57, 15);
		contentPane.add(myLable_18);
		
		JLabel myLable_19 = new JLabel("New label");
		myLable_19.setBounds(331, 426, 57, 15);
		contentPane.add(myLable_19);
		
		JLabel myLable_20 = new JLabel("New label");
		myLable_20.setBounds(331, 451, 57, 15);
		contentPane.add(myLable_20);
		
		JLabel myLable_21 = new JLabel("New label");
		myLable_21.setBounds(430, 222, 57, 15);
		contentPane.add(myLable_21);
		
		JLabel myLable_22 = new JLabel("New label");
		myLable_22.setBounds(430, 247, 57, 15);
		contentPane.add(myLable_22);
		
		JLabel myLable_23 = new JLabel("New label");
		myLable_23.setBounds(430, 272, 57, 15);
		contentPane.add(myLable_23);
		
		JLabel myLable_24 = new JLabel("New label");
		myLable_24.setBounds(430, 297, 57, 15);
		contentPane.add(myLable_24);
		
		JLabel myLable_25 = new JLabel("New label");
		myLable_25.setBounds(430, 322, 57, 15);
		contentPane.add(myLable_25);
		
		JLabel myLable_26 = new JLabel("New label");
		myLable_26.setBounds(430, 347, 57, 15);
		contentPane.add(myLable_26);
		
		JLabel myLable_27 = new JLabel("New label");
		myLable_27.setBounds(554, 197, 57, 15);
		contentPane.add(myLable_27);
		
		JLabel myLable_28 = new JLabel("New label");
		myLable_28.setBounds(554, 222, 57, 15);
		contentPane.add(myLable_28);
		
		JLabel myLable_29 = new JLabel("New label");
		myLable_29.setBounds(554, 247, 57, 15);
		contentPane.add(myLable_29);
		
		JLabel myLable_30 = new JLabel("New label");
		myLable_30.setBounds(554, 272, 57, 15);
		contentPane.add(myLable_30);
		
		JLabel myLable_31 = new JLabel("New label");
		myLable_31.setBounds(554, 297, 57, 15);
		contentPane.add(myLable_31);
		
		JLabel myLable_32 = new JLabel("New label");
		myLable_32.setBounds(554, 322, 57, 15);
		contentPane.add(myLable_32);
		
		JLabel myLable_33 = new JLabel("New label");
		myLable_33.setBounds(554, 347, 57, 15);
		contentPane.add(myLable_33);
		
		JLabel myLable_34 = new JLabel("New label");
		myLable_34.setBounds(554, 376, 57, 15);
		contentPane.add(myLable_34);
	}
}