package entities;

import java.time.LocalDate;

import application.Sistema;
import junit.framework.TestCase;

public class AtendentTest extends TestCase{
	Sistema sistema = new Sistema();
	
	Atendente atendente1 = new Atendente(1L, 66587699073L, LocalDate.of(2000, 1, 10), "Pedro", "Manhã");
	
	public void testCadastrarPaciente() {
		atendente1.cadastrarPaciente(sistema, 1L, 99298151047L, LocalDate.of(2001, 5, 6), "Max");
		assertTrue(atendente1.consultarCadastro(99298151047L, sistema));
		assertFalse(atendente1.consultarCadastro(19298151047L, sistema));

	}
	
	public void testInserirFicha() {
		Paciente paciente = new Paciente(1L, 99298151047L, LocalDate.of(2001, 5, 6), "Max");
		atendente1.inserirFicha(paciente, "Consulta de Rotina", "Sem Detalhes", sistema, 1);
		assertTrue(sistema.verificarFichaAtendimento(1));
		assertFalse(sistema.verificarFichaAtendimento(2));

	}

}
