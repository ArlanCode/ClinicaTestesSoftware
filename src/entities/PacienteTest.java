package entities;

import java.time.LocalDate;

import application.Sistema;
import junit.framework.TestCase;

public class PacienteTest extends TestCase{
	Sistema sistema = new Sistema();
	Paciente paciente1 = new Paciente(1L, 99298151047L, LocalDate.of(2001, 5, 6), "Max");

	public void testAdicionarHistorico() {
		FichaAtendimento ficha = new FichaAtendimento("motivo teste", 1);
		paciente1.adicionarHistorico(ficha);
		assertEquals(paciente1.getFicha(1).getMotivoConsulta(), "motivo teste");

	}
}
