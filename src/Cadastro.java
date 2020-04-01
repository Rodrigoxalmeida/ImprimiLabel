import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField tfCargo;
	private JTextField tfNome;
	private JTextField tfTelefone;
	private JTextField tfSexo;
	private JTextField tfSalario;
	private JTextField tfComissao;
	private JTextField tfBonus;
	private JTextField tfCargo2;
	private JTextField tfNome2;
	private JTextField tfTelefone2;
	private JTextField tfBonus2;
	private JTextField tfComissao2;
	private JTextField tfsalario2;
	private JTextField tfsexo2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(10, 11, 46, 14);
		contentPane.add(lblCargo);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 36, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 61, 75, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblSexo = new JLabel("sexo");
		lblSexo.setBounds(10, 86, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblSalarioBase = new JLabel("Sal\u00E1rio Base");
		lblSalarioBase.setBounds(10, 111, 86, 14);
		contentPane.add(lblSalarioBase);
		
		JLabel lblComisso = new JLabel("Comiss\u00E3o");
		lblComisso.setBounds(10, 136, 75, 14);
		contentPane.add(lblComisso);
		
		JLabel lblBnus = new JLabel("B\u00F4nus");
		lblBnus.setBounds(10, 161, 59, 14);
		contentPane.add(lblBnus);
		
		tfCargo = new JTextField();
		tfCargo.setBounds(89, 11, 86, 20);
		contentPane.add(tfCargo);
		tfCargo.setColumns(10);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(89, 36, 86, 20);
		contentPane.add(tfNome);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(89, 61, 86, 20);
		contentPane.add(tfTelefone);
		
		tfSexo = new JTextField();
		tfSexo.setColumns(10);
		tfSexo.setBounds(89, 86, 86, 20);
		contentPane.add(tfSexo);
		
		tfSalario = new JTextField();
		tfSalario.setColumns(10);
		tfSalario.setBounds(89, 108, 86, 20);
		contentPane.add(tfSalario);
		
		tfComissao = new JTextField();
		tfComissao.setColumns(10);
		tfComissao.setBounds(89, 139, 86, 20);
		contentPane.add(tfComissao);
		
		tfBonus = new JTextField();
		tfBonus.setColumns(10);
		tfBonus.setBounds(89, 164, 86, 20);
		contentPane.add(tfBonus);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(185, 11, 59, 14);
		contentPane.add(lblResultado);
		
		tfCargo2 = new JTextField();
		tfCargo2.setEditable(false);
		tfCargo2.setColumns(10);
		tfCargo2.setBounds(254, 11, 86, 20);
		contentPane.add(tfCargo2);
		
		tfNome2 = new JTextField();
		tfNome2.setEditable(false);
		tfNome2.setColumns(10);
		tfNome2.setBounds(254, 36, 86, 20);
		contentPane.add(tfNome2);
		
		tfTelefone2 = new JTextField();
		tfTelefone2.setEditable(false);
		tfTelefone2.setColumns(10);
		tfTelefone2.setBounds(254, 61, 86, 20);
		contentPane.add(tfTelefone2);
		
		tfBonus2 = new JTextField();
		tfBonus2.setEditable(false);
		tfBonus2.setColumns(10);
		tfBonus2.setBounds(254, 164, 86, 20);
		contentPane.add(tfBonus2);
		
		tfComissao2 = new JTextField();
		tfComissao2.setEditable(false);
		tfComissao2.setColumns(10);
		tfComissao2.setBounds(254, 139, 86, 20);
		contentPane.add(tfComissao2);
		
		tfsalario2 = new JTextField();
		tfsalario2.setEditable(false);
		tfsalario2.setColumns(10);
		tfsalario2.setBounds(254, 108, 86, 20);
		contentPane.add(tfsalario2);
		
		tfsexo2 = new JTextField();
		tfsexo2.setEditable(false);
		tfsexo2.setColumns(10);
		tfsexo2.setBounds(254, 86, 86, 20);
		contentPane.add(tfsexo2);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// pega o texto digitado dos campos e joga na variavel
				String Cargo = tfCargo.getText();
				String Nome = tfNome.getText();
				String Telefone = tfTelefone.getText();
				String Sexo = tfSexo.getText();
				String Salario = tfSalario.getText();
				String Comissao = tfComissao.getText();
				String Bonus = tfBonus.getText();
				
				// imprimi os dados em outro textfield 
				tfCargo2.setText(Cargo);
				tfNome2.setText(Nome);
				tfTelefone2.setText(Telefone);
				tfsexo2.setText(Sexo);
				tfsalario2.setText(Salario);
				tfComissao2.setText(Comissao);
				tfBonus2.setText(Bonus);
				
				
				
			}
		});
		btnSalvar.setBounds(155, 209, 89, 23);
		contentPane.add(btnSalvar);
	}
}
