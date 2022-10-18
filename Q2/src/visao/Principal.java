package visao;

import java.util.Scanner;
import java.util.ArrayList;
import dominio.Pessoa;
import java.time.LocalDate;  
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.Period;

public class Principal {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao, i;
		String nomeBusca, total;
		boolean achou = false;
		ArrayList<Pessoa> previdencia = new ArrayList<Pessoa>();
		Pessoa p;
		
		do {
			System.out.println("|| PREVIDÊNCIA SOCIAL ||");
			System.out.println("1 - Inserir pessoa");
			System.out.println("2 - Remover pessoa");
			System.out.println("3 - Exibir pessoas");
			System.out.println("4 - Sair");
			opcao = ler.nextInt();
			switch(opcao) {
				case 1: System.out.println("Digite o nome da pessoa: ");
					p = new Pessoa();
					ler.nextLine();
					p.setNome(ler.nextLine());
					System.out.println("Digite o nome da empresa: ");
					p.setNomeempresa(ler.nextLine());
					System.out.println("Digite data de admissão da pessoa (Formato: ANO-MÊS-DIA): ");
					LocalDate d1 = LocalDate.parse((ler.next()), DateTimeFormatter.ISO_LOCAL_DATE);
					p.setAdmissao(d1);
					System.out.println("Digite data de rescisão da pessoa (Formato: ANO-MÊS-DIA): ");
					LocalDate d2 = LocalDate.parse((ler.next()), DateTimeFormatter.ISO_LOCAL_DATE);
					p.setRescisão(d2);
					Period period = Period.between(d1, d2);
					int years = Math.abs(period.getYears());
				    int months = Math.abs(period.getMonths());
				    int days = Math.abs(period.getDays());
				    total = "Tempo trabalhado: "+years+" Ano(s), "+months+" Mes(es), "+days+" dia(s)";
				    p.setTempo(total);
					
					previdencia.add(p);
					break;
				case 2: System.out.println("Qual o nome da pessoa ?");
					nomeBusca = ler.next();
					for(i=0; i<previdencia.size(); i++) {
						if(previdencia.get(i).getNome().equals(nomeBusca)) {
							achou = true;
							previdencia.remove(previdencia.get(i));
							System.out.println("Pessoa removida");
							achou = false;
						}
					}
					if(!achou) {
						System.out.println("Pessoa não localizada");
					}
					break;
				case 3: 
					for(i=0; i<previdencia.size(); i++) {
						System.out.println("Nome: "+previdencia.get(i).getNome());
						System.out.println("Nome da empresa: "+previdencia.get(i).getNomeempresa());
						System.out.println("Data de admissão: "+previdencia.get(i).getAdmissao());
						System.out.println("Data de rescisão: "+previdencia.get(i).getRescisão());
						System.out.println(previdencia.get(i).getTempo());
					}
					break;
			}
		}while(opcao!=4);
	}
}
