package dominio;

import java.time.LocalDate;

public class Emprego {
	private LocalDate admissao;
	private LocalDate rescisão;
	private String nomeempresa;
	private String tempo;

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getNomeempresa() {
		return nomeempresa;
	}

	public void setNomeempresa(String nomeempresa) {
		this.nomeempresa = nomeempresa;
	}
	public LocalDate getAdmissao() {
		return admissao;
	}
	public void setAdmissao(LocalDate admissao) {
		this.admissao = admissao;
	}
	public LocalDate getRescisão() {
		return rescisão;
	}
	public void setRescisão(LocalDate rescisão) {
		this.rescisão = rescisão;
	}
}
