package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import java.awt.Font;
import java.util.Calendar;

public class GUI extends JFrame {

	private JPanel contentPane;

	JLabel lblLine = new JLabel("");
	JLabel lblDestination = new JLabel("");
	JLabel lblAvgang = new JLabel("");
	JLabel lblLine2 = new JLabel("");
	JLabel lblLine3 = new JLabel("");
	JLabel lblDestination2 = new JLabel("");
	JLabel lblDestination3 = new JLabel("");
	JLabel lblAvgang2 = new JLabel("");
	JLabel lblAvgang3 = new JLabel("");
	JLabel lblForseningar = new JLabel("F\u00F6rseningar");
	JLabel lblDelay = new JLabel("");
	JLabel lblDelay2 = new JLabel("");
	JLabel lblDelay3 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUbtshallen = new JLabel("Ub\u00E5tshallen");
		lblUbtshallen.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblUbtshallen.setForeground(Color.ORANGE);
		lblUbtshallen.setBounds(10, 11, 414, 41);
		panel.add(lblUbtshallen);
		
		JLabel lblLinje = new JLabel("Linje");
		lblLinje.setForeground(Color.WHITE);
		lblLinje.setBounds(10, 63, 46, 14);
		panel.add(lblLinje);
		
		JLabel lblDestinationLabel = new JLabel("Destination");
		lblDestinationLabel.setForeground(Color.WHITE);
		lblDestinationLabel.setBounds(66, 63, 79, 14);
		panel.add(lblDestinationLabel);
		
		JLabel lblAvgr = new JLabel("Avg\u00E5r");
		lblAvgr.setForeground(Color.WHITE);
		lblAvgr.setBounds(287, 63, 46, 14);
		panel.add(lblAvgr);
		

		lblLine.setForeground(Color.WHITE);
		lblLine.setBounds(10, 92, 46, 14);
		panel.add(lblLine);
		

		
		lblDestination.setForeground(Color.WHITE);
		lblDestination.setBounds(66, 92, 197, 14);
		panel.add(lblDestination);
		

		
		lblAvgang.setForeground(Color.WHITE);
		lblAvgang.setBounds(287, 92, 46, 14);
		panel.add(lblAvgang);
		


		lblLine2.setForeground(Color.WHITE);
		lblLine2.setBounds(10, 108, 46, 14);
		panel.add(lblLine2);
		

		
		lblLine3.setForeground(Color.WHITE);
		lblLine3.setBounds(10, 123, 46, 14);
		panel.add(lblLine3);
		

		
		lblDestination2.setForeground(Color.WHITE);
		lblDestination2.setBounds(66, 108, 197, 14);
		panel.add(lblDestination2);
		

		
		lblDestination3.setForeground(Color.WHITE);
		lblDestination3.setBounds(66, 123, 197, 14);
		panel.add(lblDestination3);
		

		
		lblAvgang2.setForeground(Color.WHITE);
		lblAvgang2.setBounds(287, 108, 46, 14);
		panel.add(lblAvgang2);
		
		lblAvgang3.setForeground(Color.WHITE);
		lblAvgang3.setBounds(287, 123, 46, 14);
		panel.add(lblAvgang3);



		
		Lines lines = Parser.getStationResults(new Station("80046"));
		lblLine.setText(lines.getLines().get(0).getLine());
		lblLine2.setText(lines.getLines().get(1).getLine());
		lblLine3.setText(lines.getLines().get(2).getLine());
		lblDestination.setText(lines.getLines().get(0).getDestination());
		lblDestination2.setText(lines.getLines().get(1).getDestination());
		lblDestination3.setText(lines.getLines().get(2).getDestination());
		lblAvgang.setText(lines.getLines().get(0).getDepTime().get(Calendar.HOUR_OF_DAY)+":"+ lines.getLines().get(0).getDepTime().get(Calendar.MINUTE));
		lblAvgang2.setText(lines.getLines().get(1).getDepTime().get(Calendar.HOUR_OF_DAY)+":"+ lines.getLines().get(1).getDepTime().get(Calendar.MINUTE));
		lblAvgang3.setText(lines.getLines().get(2).getDepTime().get(Calendar.HOUR_OF_DAY)+":"+ lines.getLines().get(2).getDepTime().get(Calendar.MINUTE));
		lblForseningar.setForeground(Color.WHITE);
		lblForseningar.setBounds(343, 63, 81, 14);
		
		panel.add(lblForseningar);
		lblDelay.setForeground(Color.WHITE);
		lblDelay.setBounds(343, 92, 46, 14);
		
		panel.add(lblDelay);
		lblDelay2.setForeground(Color.WHITE);
		lblDelay2.setBounds(343, 108, 46, 14);
		
		panel.add(lblDelay2);
		lblDelay3.setForeground(Color.WHITE);
		lblDelay3.setBounds(343, 123, 46, 14);
		
		panel.add(lblDelay3);
		
		UpdateLabels();
		  
	}
	
	public void UpdateLabels (){
		
	}
	
}
