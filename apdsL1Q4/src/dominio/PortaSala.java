package dominio;

public class PortaSala extends Porta{
	
	public boolean abrir() {
		return true;
	}
	
	public boolean fechar() {
		return false;
	}
	
	public PortaSala(String cor, float largura, float altura, double peso) {
		super(cor, largura, altura, peso);
	}
}