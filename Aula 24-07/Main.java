package principal;

public class Main {

	public static void main(String[] args) {
		Carro Uno = new Carro ();
		Carro Siena = new Carro ("Grand Siena", "Grande", 2018, 2018, "Branco");
		Uno.setNome("Uno Vivace");
		Uno.setTamanho("Pequeno");
		Uno.setAnoFabricacao(2011);
		Uno.setAnoModelo(2012);
		Uno.setCor("Prata");
		System.out.println(Uno.getNome()+" "+Uno.getTamanho()+" "+Uno.getAnoFabricacao()+" "+Uno.getAnoModelo()+" "+Uno.getCor());
		System.out.println(Uno.tempoDeUso(Uno.getAnoFabricacao()));
	}

}
