package dominio;

public class Quarto extends Porta{
	
	private PortaQuarto porta;
	private boolean banheiro;
	private float metragemquadrada;
	
	public Quarto(String cor, float largura, float altura, double peso, PortaQuarto porta, boolean banheiro,
			float metragemquadrada) {
		super(cor, largura, altura, peso);
		this.porta = porta;
		this.banheiro = banheiro;
		this.metragemquadrada = metragemquadrada;
	}

	public Quarto(String cor, float largura, float altura, double peso) {
		super(cor, largura, altura, peso);
	}
}
