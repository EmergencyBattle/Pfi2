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

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.util.Calendar;
import java.util.Random;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldHour;
	private JTextField textFieldMinute;


	ClockLogic clockLogic; 


	JLabel labelTime = new JLabel("00:00:00");
	JLabel labelAlarmAt = new JLabel("00:00");

	
	
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
	
	
	public boolean beep = false;
	private boolean alarmSet = false;

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
		


		clockLogic = new ClockLogic(this);

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
				Random random = new Random();
				final float hue = random.nextFloat();
				// Saturation between 0.1 and 0.3
				final float saturation = (random.nextInt(2000) + 1000) / 10000f;
				final float luminance = 0.9f;
				final Color color = Color.getHSBColor(hue, saturation, luminance);
				contentPane.setBackground(color);
				
				alarmSet = true;
				beep = true;
				System.out.println(beep);
				
				labelAlarmAt.setText(textFieldHour.getText() +  ":" + textFieldMinute.getText());

			}
		});
		btnSetAlarm.setBounds(296, 193, 89, 23);
		contentPane.add(btnSetAlarm);
		
		JLabel lblAlarmAt = new JLabel("Alarm at");
		lblAlarmAt.setForeground(Color.WHITE);
		lblAlarmAt.setFont(new Font("Aharoni", Font.BOLD, 25));
		lblAlarmAt.setBounds(117, 161, 155, 28);
		contentPane.add(lblAlarmAt);
		
		labelAlarmAt.setHorizontalAlignment(SwingConstants.RIGHT);
		labelAlarmAt.setForeground(Color.WHITE);
		labelAlarmAt.setFont(new Font("Aharoni", Font.PLAIN, 30));
		labelAlarmAt.setBounds(198, 161, 111, 23);
		contentPane.add(labelAlarmAt);
		
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelAlarmAt.setText(null);
			}
		});
		btnClearAlarm.setFont(new Font("Aharoni", Font.BOLD, 11));
		btnClearAlarm.setBounds(134, 225, 162, 25);
		contentPane.add(btnClearAlarm);
	
	}
	

	
	public void setTimeOnLabel (String time){
		labelTime.setText(time);
	}
	
	public boolean activate;
	
	public void alarm (boolean activate){
			
			if (beep == true) {
			JOptionPane.showMessageDialog(null, "ALARM ALARM!", "ALARM!", JOptionPane.PLAIN_MESSAGE);
			
					Random random = new Random();
					final float hue = random.nextFloat();
					// Saturation between 0.1 and 0.3
					final float saturation = (random.nextInt(2000) + 1000) / 10000f;
					final float luminance = 0.9f;
					final Color color = Color.getHSBColor(hue, saturation, luminance);

					contentPane.setBackground(color);
					
			}
					
					activate = false;
					alarmSet = false;
					beep = false;


		
	}
}
