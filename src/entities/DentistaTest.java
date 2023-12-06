package entities;

import java.time.LocalDate;

import application.Sistema;
import junit.framework.TestCase;

public class DentistaTest extends TestCase{
	Sistema sistema = new Sistema();
	Dentista dentista1 = new Dentista(1L, 59476935006L, LocalDate.of(1990, 10, 10), "Danilo", 1234, "Clínico geral");
	
	public void testAdcionarDetalhe() {
		FichaAtendimento ficha = new FichaAtendimento("Sem Detalhes", 1);
		dentista1.adicionarDetalhe("Detalhe Inserido Com Sucesso", ficha);
		assertEquals(ficha.getDetalhes(), "Detalhe Inserido Com Sucesso");
	}
	
	public void testAdicionarProcedimento() {
		FichaAtendimento ficha = new FichaAtendimento("Sem Detalhes", 1);
		dentista1.adicionarProcedimento("Procedimento Inserido Com Sucesso", ficha);
		assertEquals(ficha.getProcedimentos().get(0), "Procedimento Inserido Com Sucesso");
	}
		
	public void testProximoPaciente(){
		Atendente atendente1 = new Atendente(1L, 66587699073L, LocalDate.of(2000, 1, 10), "Pedro", "Manhã");
		Paciente paciente1 = new Paciente(1L, 99298151047L, LocalDate.of(2001, 5, 6), "Max");
		Paciente paciente2 = new Paciente(1L, 99298151047L, LocalDate.of(2001, 5, 6), "Breno");
		atendente1.inserirFicha(paciente1, "Consulta de Rotina", "Sem Detalhes", sistema, 1);
		atendente1.inserirFicha(paciente2, "Consulta de Rotina", "Sem Detalhes", sistema, 2);
		int idFichaProx = dentista1.proximoPaciente(sistema).getId();
		assertEquals(idFichaProx, 1);
	}
	
	public void testConcluirAtendimento() {
		Atendente atendente1 = new Atendente(1L, 66587699073L, LocalDate.of(2000, 1, 10), "Pedro", "Manhã");
		Paciente paciente1 = new Paciente(1L, 99298151047L, LocalDate.of(2001, 5, 6), "Max");
		Paciente paciente2 = new Paciente(1L, 99298151047L, LocalDate.of(2001, 5, 6), "Breno");
		atendente1.inserirFicha(paciente1, "Consulta de Rotina", "Sem Detalhes", sistema, 1);
		atendente1.inserirFicha(paciente2, "Consulta de Rotina", "Sem Detalhes", sistema, 2);
		dentista1.concluirAtendimento(sistema);
		int idFichaProx = dentista1.proximoPaciente(sistema).getId();
		assertEquals(idFichaProx, 2);
		assertTrue(paciente1.getFicha(1).getAtendido());
		
	
	}
}
