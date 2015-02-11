package emiliasDogClass;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JTextPane;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldHuman;
	private JTextField textFieldDog;
	private JTextField textFieldGetInfo;
	private JTextField textFieldErrorMsg;
	
	static Human human;
	
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
		
		JTextArea txtrHumansAndDogs = new JTextArea();
		txtrHumansAndDogs.setText("Humans and Dogs");
		txtrHumansAndDogs.setBounds(156, 11, 115, 22);
		contentPane.add(txtrHumansAndDogs);
		
		JButton btnNewButton = new JButton("New Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//När du använder < 4 måste man ha minst 4 bokstäver, använd < 3
				if(textFieldHuman.getText().length() < 4){
					textFieldGetInfo.setText("Your name has to include atleast 3 letters"); 
				}else{
				human = new Human(textFieldHuman.getText());
				}
			}
		});
		btnNewButton.setBounds(243, 41, 128, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buy Dog");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(human == null){
					 textFieldErrorMsg.setText("I wanna know your name before you buy a dog.");
						
						}else{
							Dog Leon = new Dog(textFieldDog.getText());
							human.buyDog(Leon);
						}
			}
		});
		btnNewButton_1.setBounds(243, 67, 128, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Get Info");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldGetInfo.setText(human.getInfo());
			}
		});
		btnNewButton_2.setBounds(243, 102, 128, 23);
		contentPane.add(btnNewButton_2);
		
		textFieldHuman = new JTextField();
		textFieldHuman.setBounds(48, 42, 86, 20);
		contentPane.add(textFieldHuman);
		textFieldHuman.setColumns(10);
		
		textFieldDog = new JTextField();
		textFieldDog.setBounds(48, 68, 86, 20);
		contentPane.add(textFieldDog);
		textFieldDog.setColumns(10);
		
		JTextPane txtpnInfo = new JTextPane();
		txtpnInfo.setText("Info");
		txtpnInfo.setBounds(48, 105, 86, 20);
		contentPane.add(txtpnInfo);
		
		JTextPane txtpnErrorMsg = new JTextPane();
		txtpnErrorMsg.setText("Error Msg");
		txtpnErrorMsg.setBounds(48, 183, 86, 22);
		contentPane.add(txtpnErrorMsg);
		
		textFieldGetInfo = new JTextField();
		textFieldGetInfo.setEditable(false);
		textFieldGetInfo.setBounds(48, 136, 323, 36);
		contentPane.add(textFieldGetInfo);
		textFieldGetInfo.setColumns(10);
		
		textFieldErrorMsg = new JTextField();
		textFieldErrorMsg.setEditable(false);
		textFieldErrorMsg.setBounds(48, 216, 323, 34);
		contentPane.add(textFieldErrorMsg);
		textFieldErrorMsg.setColumns(10);
	}
}
