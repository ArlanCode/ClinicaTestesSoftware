package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends User {
	
	private ArrayList<FichaAtendimento> historico = new ArrayList<>();
	
	public Paciente(Long id, Long cpf, LocalDate nascimento, String nome ) {
		super(id, cpf, nascimento, nome);
	}
	
	public Paciente() {
		
	}
	
	public void adicionarHistorico(FichaAtendimento ficha) {
		historico.add(ficha);
	}

	public ArrayList<FichaAtendimento> consultarHistorico() {
		return historico;
	}

	public void setHistorico(ArrayList<FichaAtendimento> historico) {
		this.historico = historico;
	}
	
	public FichaAtendimento getFicha(Integer id) {
		for(FichaAtendimento ficha: historico) {
			if(ficha.getId().compareTo(id) == 0) {	
				return ficha;
			}
		}
		return null;
		
	}

}
