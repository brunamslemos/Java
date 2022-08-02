package poo;

import poo.model.Cliente;
import poo.model.Endereço;

public class EntregaCartãoApp {

	public static void main(String[] args) {
		
		Endereço endereco = new Endereço();
		// dados do endereço
		
		Cliente cliente = new Cliente();
		// dados do cliente
	
		
		//adicionar o endereço no cliente por associação de classe, porém list nula
		cliente.adicionaEndereco(endereco);
		System.out.println("Endereço adicionado com sucesso!");
		
	}
	
	
}
