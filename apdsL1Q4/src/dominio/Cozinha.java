package dominio;

public class Cozinha extends Porta {

	private PortaCozinha porta;
	private boolean americana;
	private float metragemquadrada;
	
	public Cozinha(String cor, float largura, float altura, double peso, PortaCozinha porta, boolean americana,
			float metragemquadrada) {
		super(cor, largura, altura, peso);
		this.porta = porta;
		this.americana = americana;
		this.metragemquadrada = metragemquadrada;
	}

	public Cozinha(String cor, float largura, float altura, double peso) {
		super(cor, largura, altura, peso);
	}
}
