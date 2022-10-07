package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField nota1;
	private JTextField nota2;
	private JTextField nota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 255, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(78, 26, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		nota1 = new JTextField();
		nota1.setBounds(78, 55, 86, 20);
		contentPane.add(nota1);
		nota1.setColumns(10);
		
		nota2 = new JTextField();
		nota2.setBounds(78, 86, 86, 20);
		contentPane.add(nota2);
		nota2.setColumns(10);
		
		nota3 = new JTextField();
		nota3.setBounds(78, 117, 86, 20);
		contentPane.add(nota3);
		nota3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(22, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setBounds(22, 58, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2:");
		lblNewLabel_2.setBounds(22, 89, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nota 3:");
		lblNewLabel_3.setBounds(22, 120, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton calcular = new JButton("Calcular");
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				if(nota1.getText().isEmpty() || nota2.getText().isEmpty() || nota3.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Digite um número!");
				} else {
				
				String n1 = nota1.getText();
				Double nn1 = Double.valueOf(n1);
				String n2 = nota2.getText();
				Double nn2 = Double.valueOf(n2);
				String n3 = nota3.getText();
				Double nn3 = Double.valueOf(n3);
				
				JOptionPane.showMessageDialog(calcular, "Média: "+((nn1+nn2+nn3)/3));
				}
			}
		});
		calcular.setBounds(78, 194, 89, 23);
		contentPane.add(calcular);
	}
}
