package view;
import javax.swing.JOptionPane;

import model.Aluno;


public class Execucao {
	
	public static void main(String[] args) {
		Aluno p = new Aluno();
		
		p.setNome(JOptionPane.showInputDialog("Digite seu nome"));
		p.setEndereco(JOptionPane.showInputDialog("Digite seu endereco"));
		p.setBairro(JOptionPane.showInputDialog("Digite seu bairro"));
		p.setCep(Long.parseLong(JOptionPane.showInputDialog("Digite seu cep")));
		p.setCidade(JOptionPane.showInputDialog("Digite sua cidade"));
		p.setEstado(JOptionPane.showInputDialog("Digite seu estado"));

		
		JOptionPane.showMessageDialog(null, p.getNome());
		JOptionPane.showMessageDialog(null, p.getEndereco());
		JOptionPane.showMessageDialog(null, p.getBairro());
		JOptionPane.showMessageDialog(null, p.getCep());
		JOptionPane.showMessageDialog(null, p.getCidade());
		JOptionPane.showMessageDialog(null, p.getEstado());

	}
}
