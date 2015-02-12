package EmiliaAnimalsClasses;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class AnimalsGUI extends JFrame {

	private JPanel contentPane;
	
	ArrayList<Animal> animalList = new ArrayList<Animal>();




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalsGUI frame = new AnimalsGUI();
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
	public AnimalsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		JLabel lblAnimalList = new JLabel("Animal List");
		contentPane.add(lblAnimalList, BorderLayout.NORTH);
		
		//Katten skriver nu ut sin nursing time
		animalList.add(new Snake("slingrigus serpentus", false));
		animalList.add(new Dog("hund", "barkus svansus", true));
		animalList.add(new Cat("purrus meowus", 10, 5));
		animalList.add(new Snake("slingrigare serpentus", true));
		animalList.add(new Dog("barkussss svansigare", false, 8));


		for (int i = 0; i < animalList.size(); i++){
			textArea.append(animalList.get(i).getInfo() + "\n");
		}
		


	}

}
