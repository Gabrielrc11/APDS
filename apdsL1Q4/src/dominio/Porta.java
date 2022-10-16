package dominio;

public class Porta {
	private String cor;
	private float largura;
	private float altura;
	private double peso;

	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public float getLargura() {
		return largura;
	}
	
	public void setLargura(float largura) {
		this.largura = largura;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public boolean abrir() {
		return true;
	}
	
	public boolean fechar() {
		return false;
	}
	
	public Porta(String cor, float largura, float altura, double peso) {
		super();
		this.cor = cor;
		this.largura = largura;
		this.altura = altura;
		this.peso = peso;
	}
}
