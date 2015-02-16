package eDigiClock;


import java.util.Calendar;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.util.Calendar;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldHour;
	private JTextField textFieldMinute;
	
	private ClockLogic clockLogic;

	JLabel labelTime = new JLabel("00:00:00");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setType(Type.POPUP);
		setTitle("Alarm...");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DigitalClockGUI.class.getResource("/Images/clockicon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlarmClock = new JLabel("Alarm...");
		lblAlarmClock.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarmClock.setForeground(Color.WHITE);
		lblAlarmClock.setFont(new Font("Aharoni", Font.PLAIN, 99));
		lblAlarmClock.setBounds(10, 22, 414, 87);
		contentPane.add(lblAlarmClock);
		

		labelTime.setHorizontalAlignment(SwingConstants.CENTER);
		labelTime.setForeground(Color.WHITE);
		labelTime.setFont(new Font("Aharoni", Font.PLAIN, 99));
		labelTime.setBounds(20, 90, 392, 80);
		contentPane.add(labelTime);
		
		textFieldHour = new JTextField();
		textFieldHour.setText("00");
		textFieldHour.setBounds(50, 194, 86, 20);
		contentPane.add(textFieldHour);
		textFieldHour.setColumns(10);
		
		textFieldMinute = new JTextField();
		textFieldMinute.setText("00");
		textFieldMinute.setBounds(174, 194, 86, 20);
		contentPane.add(textFieldMinute);
		textFieldMinute.setColumns(10);
		
		JLabel label_1 = new JLabel(":");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Aharoni", Font.BOLD, 20));
		label_1.setBounds(146, 186, 18, 34);
		contentPane.add(label_1);
		
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.setFont(new Font("Aharoni", Font.BOLD, 11));
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSetAlarm.setBounds(296, 193, 89, 23);
		contentPane.add(btnSetAlarm);
		
		JLabel lblAlarmAt = new JLabel("Alarm at");
		lblAlarmAt.setForeground(Color.WHITE);
		lblAlarmAt.setFont(new Font("Aharoni", Font.BOLD, 25));
		lblAlarmAt.setBounds(117, 161, 155, 28);
		contentPane.add(lblAlarmAt);
		
		JLabel LabelAlarmAt = new JLabel("00:00");
		LabelAlarmAt.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelAlarmAt.setForeground(Color.WHITE);
		LabelAlarmAt.setFont(new Font("Aharoni", Font.PLAIN, 30));
		LabelAlarmAt.setBounds(198, 161, 111, 23);
		contentPane.add(LabelAlarmAt);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClearAlarm.setFont(new Font("Aharoni", Font.BOLD, 11));
		btnClearAlarm.setBounds(134, 225, 162, 25);
		contentPane.add(btnClearAlarm);
	
	}
	
	public void setTimeOnLabel (String time){
		labelTime.setText(time);
	}
	
	
	
	public void alarm (){}
}
