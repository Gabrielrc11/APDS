package dominio;

public class PortaCozinha extends Porta{

	public boolean abrir() {
		return true;
	}
	
	public boolean fechar() {
		return false;
	}

	public PortaCozinha(String cor, float largura, float altura, double peso) {
		super(cor, largura, altura, peso);
	}
	
}
