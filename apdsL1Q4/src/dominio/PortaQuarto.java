package dominio;

public class PortaQuarto extends Porta{

	public boolean abrir() {
		return true;
	}
	
	public boolean fechar() {
		return false;
	}

	public PortaQuarto(String cor, float largura, float altura, double peso) {
		super(cor, largura, altura, peso);
	}
}
