package entities;

import java.util.ArrayList;

import junit.framework.TestCase;

public class PagamentoTest extends TestCase{
	
	public void testCalcularValorConsulta(){
		ArrayList<String> procedimentos = new ArrayList<>();
		procedimentos.add("obturacao");
		procedimentos.add("limpeza");
		
		Pagamento pag = new Pagamento();
		assertEquals(pag.calcularValorConsulta(procedimentos),220.0);
		
	}
	
	public void testRealizarPagamento() {
		FichaAtendimento ficha = new FichaAtendimento("consulta de rotina", 1);
		Pagamento pag = new Pagamento(ficha);
		pag.realizarPagamento("Pix");
		
		assertTrue(pag.getPago());
		assertEquals(pag.getTipo(), "Pix");
	}
}
