package application;

import java.util.ArrayList;

import entities.Atendente;
import entities.Dentista;
import entities.FichaAtendimento;
import entities.Paciente;
import entities.Pagamento;

public class Sistema {
	private ArrayList<FichaAtendimento> fichasChamadas = new ArrayList<>();
	private ArrayList<Paciente> pacientes = new ArrayList<>();
	private ArrayList<Dentista> dentistas = new ArrayList<>();
	private ArrayList<Atendente> atendentes = new ArrayList<>();
	private ArrayList<Pagamento> pagamentos = new ArrayList<>();
	
	public Sistema() {
		
	}
		
	public FichaAtendimento chamarProximo() {
		return fichasChamadas.get(0);
	};
	
	public void concluirAtendimento() {
		Pagamento p = new Pagamento( fichasChamadas.get(0) );
		pagamentos.add(p);
		fichasChamadas.get(0).setAtendido(true);
		fichasChamadas.remove(0);
	}
	
	public String pagar(String tipo) {
		String texto = pagamentos.get(0).realizarPagamento(tipo);
		pagamentos.remove(0);
		return texto;
	}

	public boolean verificarCadastroPaciente(Long cpf) {
		for (Paciente paciente : pacientes) {
			if (paciente.getCpf().compareTo(cpf) ==  0) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean verificarCadastroAtendente(Long cpf) {
		for (Atendente atendente : atendentes) {
			if (atendente.getCpf().compareTo(cpf) ==  0) {
				return true;
			}
		}
		return false;
	}
	
	public boolean verificarCadastroDenstista(Long cpf) {
		for (Dentista dentista : dentistas) {
			if (dentista.getCpf().compareTo(cpf) ==  0) {
				return true;
			}
		}
		
		return false;
	}	
	
	public boolean verificarFichaAtendimento(Integer id) {
		for(FichaAtendimento ficha: fichasChamadas) {
			if(ficha.getId().compareTo(id)==0) {
				return true;
			}
		}
		return false;
	}

	public void addFichasChamadas(FichaAtendimento fichasChamada) {
		this.fichasChamadas.add(fichasChamada);
	}
	
	public ArrayList<FichaAtendimento> getFichasChamadas() {
		return fichasChamadas;
	}

	public void addPacientes(Paciente paciente) {
		this.pacientes.add(paciente);
	}
	
	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void addDentistas(Dentista dentista) {
		this.dentistas.add(dentista);
	}
	
	public ArrayList<Dentista> getDentistas() {
		return dentistas;
	}

	public void addAtendentes(Atendente atendente) {
		this.atendentes.add(atendente);
	}
	
	public ArrayList<Atendente> getAtendentes() {
		return atendentes;
	}

	public void addPagamentos(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
	}
	
	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}
	
	public void removePaciente(Long id) {
	    for (Paciente paciente : pacientes) {
	        if (paciente.getId().compareTo(id) == 0) {
	            pacientes.remove(paciente);
	            break;
	        }
	    }
	}
	
	public void removeAtendente(Long id) {
        for (Atendente atendente : atendentes) {
            if (atendente.getId().compareTo(id) == 0) {
                atendentes.remove(atendente);
                break;
            }
        }
        
    }
	public void removeDentista(Long id) {
	    for (Dentista dentista : dentistas) {
	        if (dentista.getId().compareTo(id) == 0) {
	            dentistas.remove(dentista);
	            break;
	        }
	    }
	}
    
	public void removeFichaAtendimento(Integer id) {
	    for (FichaAtendimento ficha : fichasChamadas) {
	        if (ficha.getId().compareTo(id) == 0) {
	            fichasChamadas.remove(ficha);
	            break;
	        }
	    }
	}
	

}
