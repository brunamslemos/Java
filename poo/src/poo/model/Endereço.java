package poo.model;

public class Endereço {

	
	// Posso ter vários tipos de endereço para um mesmo cliente
	public enum TipoEndereço {RESIDENCIAL, ENTREGA, TRABALHO}
	
	// O endereço de entrega pode não ser o endereço de moradia do cliente
	public String endereço;
	public String numero;
	public String complemento;
	public String bairro;
	public String cidade;
	public String estado;
	public String cep;
	
}
