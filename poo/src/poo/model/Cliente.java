 package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	public Integer código;
	public String nome;
	public String cpf;
	
	private List<Endereço> enderecos;
	
	public void adicionaEndereco(Endereço endereco) {
		if (endereco == null) {
			throw new NullPointerException("Endereço não pode ser nulo");
		}
		
		if (endereco.cep == null) {
			throw new NullPointerException("CEP não pode ser nulo");
		}
		
		getEnderecos().add(endereco);
	}
	
	// Quando for entrar, ele vai verificar se o atributo é nulo ou não, e se não for, ele adiciona 
	private List<Endereço> getEnderecos(){
		if (enderecos == null) {
			enderecos = new ArrayList<Endereço>();
		}
		return enderecos;
	}
}
