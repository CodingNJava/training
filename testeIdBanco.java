package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

import java.sql.*;
import java.awt.Color;
import java.awt.Font;

public class Consulta extends JFrame {

	private JPanel contentPane;
	JLabel lblTelefone = new JLabel("");
	JLabel lblNome = new JLabel("");
	JButton btnConsultar = new JButton("Consultar");
	// conexao com o banco-------------------------

	private final static String url = "jdbc:mysql://localhost:3306/impacta";

	private final static String username = "root";
	private final static String password = "Imp@ct@";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	private String nome = null;
	private String telefone = null;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta frame = new Consulta();
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
	public Consulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setForeground(new Color(51, 51, 102));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel.setBounds(99, 40, 86, 14);
		contentPane.add(lblNewLabel);

		txtCodigo = new JTextField();
		txtCodigo.setBackground(new Color(153, 204, 255));
		txtCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		txtCodigo.setBounds(205, 37, 154, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setForeground(new Color(51, 51, 102));
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_1.setBounds(99, 101, 86, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Telefone:");
		lblNewLabel_2.setForeground(new Color(51, 51, 102));
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 12));
		lblNewLabel_2.setBounds(99, 170, 86, 14);
		contentPane.add(lblNewLabel_2);
		lblNome.setForeground(new Color(51, 51, 102));
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);

		// JLabel lblNome = new JLabel("New label");
		lblNome.setBounds(205, 101, 154, 14);
		contentPane.add(lblNome);
		lblTelefone.setForeground(new Color(51, 51, 102));
		lblTelefone.setHorizontalAlignment(SwingConstants.CENTER);

		// JLabel lblTelefone = new JLabel("New label");
		lblTelefone.setBounds(205, 170, 154, 14);
		contentPane.add(lblTelefone);
		btnConsultar.setForeground(Color.WHITE);
		btnConsultar.setBackground(new Color(51, 102, 204));

//		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
							
				openDB();
				mostra();
				closeDB();
				
			}
		});
		
		btnConsultar.setBounds(99, 223, 91, 23);
		contentPane.add(btnConsultar);

		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Centaur", Font.BOLD, 14));
		btnSair.setForeground(Color.WHITE);
		btnSair.setBackground(new Color(204, 51, 51));
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sair();
			}
		});
		btnSair.setBounds(369, 239, 63, 23);
		contentPane.add(btnSair);
		
		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.setForeground(Color.WHITE);
		btnLimparCampos.setBackground(new Color(51, 102, 204));
		btnLimparCampos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				limparCampos();
			}
		});
		btnLimparCampos.setBounds(205, 223, 154, 23);
		contentPane.add(btnLimparCampos);
	}

	// getter e setter--------------------------------------

	public JTextField getTxtCodigo() {
		return txtCodigo;
	}

	public void setTxtCodigo(JTextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// métodos------------------------------------

	public void limparCampos() {
		txtCodigo.setText("");
		lblNome.setText("");
		lblTelefone.setText("");
	}

	public void sair() {
		System.exit(0);
	}
	
	public void consultarBanco(){
		
		txtCodigo.getText();
	}
	

	
	public void openDB(){
		try{
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			System.out.println("\nConexão estabelecida com sucesso!\n");
		}catch(SQLException e){
			System.out.println("\nNão foi possível estabelecer conexão " + e + "\n");
			System.exit(1);
		}
	}
	
	public void closeDB(){
		try{
			con.close();
		}catch(SQLException e){
			System.out.println("\nNão foi possível fechar conexão " + e + "\n");
			System.exit(1);
		}
		
	}
	
	public void mostra(){
		String query;
		
		int codigo = Integer.parseInt(txtCodigo.getText());
		
		
		try{
			
			
			query = "SELECT * FROM alunos WHERE codigo =";
			System.out.println("\nMostrando dados.\n");
			
			rs = stmt.executeQuery(query + codigo);
			while(rs.next()){
				
				lblNome.setText(rs.getString("nome"));
				lblTelefone.setText(rs.getString("telefone"));
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("telefone"));
				
			}
		}catch(SQLException e){
			setNome(null);
			setTelefone(null);
		}
	}
}
