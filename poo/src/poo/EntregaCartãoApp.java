package poo;

import poo.model.Cliente;
import poo.model.Endereço;

public class EntregaCartãoApp {

	public static void main(String[] args) {
		
		Endereço endereco = new Endereço();
		endereco.cep = "000000";
		// dados do endereço
		
		Cliente cliente = new Cliente();
		
		// dados do cliente
		
		//tratamento de erros
		try {
			//adicionar o endereço no cliente por associação de classe, porém list nula
			cliente.adicionaEndereco(endereco);
			System.out.println("Endereço adicionado com sucesso!");
		} catch (Exception e) {
			System.err.println("Houve um erro ao adicionar endereco:" + e.getMessage());
		}
	
				
	}
	
	
}
