package application;

import java.time.LocalDate;

import entities.Atendente;
import entities.Dentista;
import entities.Paciente;
import junit.framework.TestCase;

public class SistemaTest extends TestCase{
	Sistema sistema = new Sistema();
	
	public void testRemoveAtendente(){
		Atendente atendente1 = new Atendente(15L, 66587699073L, LocalDate.of(2000, 1, 10), "Pedro", "Manhã");
		sistema.addAtendentes(atendente1);
		assertTrue(sistema.verificarCadastroAtendente(66587699073L));
		
		sistema.removeAtendente(15L);
		assertFalse(sistema.verificarCadastroAtendente(66587699073L)); 
	}
	
	public void testRemovePaciente() {
		Paciente paciente = new Paciente(12L, 99298151047L, LocalDate.of(2001, 5, 6), "Max");
		sistema.addPacientes(paciente);
		assertTrue(sistema.verificarCadastroPaciente(99298151047L));
		
		sistema.removePaciente(12L);
		assertFalse(sistema.verificarCadastroPaciente(99298151047L));
		
	}
	
	public void testRemoveDentista() {
		Dentista dentista1 = new Dentista(7L, 59476935006L, LocalDate.of(1990, 10, 10), "Danilo", 1234, "Clínico geral");
		sistema.addDentistas(dentista1);
		assertTrue(sistema.verificarCadastroDenstista(59476935006L));
		
		sistema.removeDentista(7L);
		assertFalse(sistema.verificarCadastroDenstista(59476935006L));
	}
}
