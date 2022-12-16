package gradoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Grafo;

class TodosVisitadosTest {

	@Test
	void todosVisitadosTest1() {
		Grafo grafo = new Grafo();
		assertEquals("", grafo.componentsRelated());
	}
	
	@Test
	void todosVisitadosTest2() {
		Grafo grafo = new Grafo();
		grafo.addVertice(1);
		String sol = grafo.componentsRelated();
		assertEquals("[1]",sol);
	}

}
