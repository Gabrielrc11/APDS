package dominio;

public class Sala extends Porta {

	private PortaSala portaentrada;
	private float metragemquadrada;
	private Porta portaauxiliar;
	
	public Sala(String cor, float largura, float altura, double peso, PortaSala portaentrada, float metragemquadrada,
			Porta portaauxiliar) {
		super(cor, largura, altura, peso);
		this.portaentrada = portaentrada;
		this.metragemquadrada = metragemquadrada;
		this.portaauxiliar = portaauxiliar;
	}
	
	public Sala(String cor, float largura, float altura, double peso) {
		super(cor, largura, altura, peso);
	}
	
}
