package principal;

public class Carro {
	private String nome;
	private String tamanho;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private String cor;
	
	public Carro () {
		
	}
	public Carro (String nome, String tamanho, Integer anoFabricacao, Integer anoModelo, String cor) {
		this.nome= nome;
		this.tamanho= tamanho;
		this.anoFabricacao= anoFabricacao;
		this.anoModelo = anoModelo;
		this.cor= cor;
	}
	
	public String getNome () {
		return this.nome;
	}
	public void setNome (String nome) {
		this.nome= nome;
	}
	
	public String getTamanho () {
		return this.tamanho;
	}
	public void setTamanho (String tamanho) {
		this.tamanho= tamanho;
	}
	
	public Integer getAnoFabricacao () {
		return this.anoFabricacao;
	}
	public void setAnoFabricacao (Integer anoFabricacao) {
		this.anoFabricacao= anoFabricacao;
	}
	
	public Integer getAnoModelo () {
		return this.anoModelo;
	}
	public void setAnoModelo (Integer anoModelo) {
		this.anoModelo= anoModelo;
	}
	
	public String getCor () {
		return this.cor;
	}
	public void setCor (String cor) {
		this.cor= cor;
	}
	
	public Integer tempoDeUso (Integer anoFabricacao) {
		return 2022-anoFabricacao;
	}
}
