

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Somatorio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;
	JLabel lblSoma = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Somatorio frame = new Somatorio();
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
	public Somatorio() {
		setBackground(SystemColor.desktop);
		setTitle("Somat\u00F3rio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(BorderFactory.createCompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNum1 = new JLabel("Num1");
		lblNum1.setForeground(new Color(51, 51, 51));
		lblNum1.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNum1.setBounds(55, 55, 50, 20);
		contentPane.add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Num2");
		lblNum2.setForeground(new Color(51, 51, 51));
		lblNum2.setFont(new Font("Calibri", Font.BOLD, 16));
		lblNum2.setBounds(55, 99, 50, 20);
		contentPane.add(lblNum2);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(172, 55, 90, 20);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(172, 99, 90, 20);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		//ação do botão resultado-------------------------------------------
		JButton btnSomar = new JButton("Somar");
		btnSomar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			    try{
			      somar();
					
				} catch (Exception e2) {
					e2.printStackTrace();
					System.out.println("Digite apenas números.");
				}
				
			}
		});
		
		btnSomar.setBackground(new Color(0, 51, 153));
		btnSomar.setForeground(new Color(255, 255, 255));
		btnSomar.setFont(new Font("Calibri", Font.BOLD, 12));
		btnSomar.setBounds(55, 211, 90, 20);
		contentPane.add(btnSomar);
		
		
		//----------------------------------------------------------------
		JButton btnLimpar = new JButton("Limpar");
		//limpando os dados dos campos
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limparCampos();
			}
		});
		
		btnLimpar.setBackground(new Color(0, 51, 153));
		btnLimpar.setForeground(new Color(255, 255, 255));
		btnLimpar.setFont(new Font("Calibri", Font.BOLD, 12));
		btnLimpar.setBounds(172, 211, 90, 20);
		contentPane.add(btnLimpar);
		
		//------------------------------------------------------------------
		JButton btnSair = new JButton("Fechar");
		
		//limpando os dados dos campos--------------------------------------
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sair();
			}
		});
		
		btnSair.setBackground(new Color(0, 51, 153));
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnSair.setBounds(291, 211, 90, 20);
		contentPane.add(btnSair);
		
		//-------------------------------------------------------
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(new Color(51, 51, 51));
		lblResultado.setFont(new Font("Calibri", Font.BOLD, 16));
		lblResultado.setBounds(55, 162, 90, 20);
		contentPane.add(lblResultado);
		
		//---------------------------------------------------
	//	JLabel lblSoma = new JLabel("");
		lblSoma.setForeground(new Color(51, 51, 51));
		lblSoma.setFont(new Font("Calibri", Font.BOLD, 16));
		lblSoma.setBounds(172, 165, 90, 20);
		contentPane.add(lblSoma);
	}
	
	JLabel lblSoma = new JLabel("");
		
	public void somar(){
		
		double valor1 = Double.parseDouble(txtNum1.getText());
		double valor2 = Double.parseDouble(txtNum2.getText());
		
		
		Double resultado = 0.00;
		resultado = valor1 + valor2;
		
		lblSoma.setText(resultado.toString());
				
	}
	
	public void limparCampos(){
		txtNum1.setText("");
		txtNum2.setText("");
	}
	
	
	public void sair(){
		System.exit(0);
	}
	
	
	public JTextField getTxtNum1() {
		return txtNum1;
	}

	public void setTxtNum1(JTextField txtNum1) {
		this.txtNum1 = txtNum1;
	}

	public JTextField getTxtNum2() {
		return txtNum2;
	}

	public void setTxtNum2(JTextField txtNum2) {
		this.txtNum2 = txtNum2;
	}
	
	
	
}
