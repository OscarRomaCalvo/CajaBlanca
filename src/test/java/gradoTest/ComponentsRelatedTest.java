package gradoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Arco;
import com.cajablanca.grafo.Grafo;

class ComponentsRelatedTest {

	@Test
	void componentsRelatedTest1() {
		Grafo grafo = new Grafo();
		String resul = grafo.componentsRelated();
		
		assertEquals("", resul);
	}
	
	@Test
	void componentsRelatedTest2() {
		Grafo grafo = new Grafo();
		grafo.addVertice(1);
		String resul = grafo.componentsRelated();
		
		assertEquals("[1]", resul);
	}
	
	@Test
	void componentsRelatedTest3() {
		Grafo grafo = new Grafo();
		Arco a= new Arco(1,2, 0);
		grafo.addArco(a);
		String resul = grafo.componentsRelated();
		
		assertEquals("[1 2]", resul);
	}

	@Test
	void componentsRelatedTest4() {
		Grafo grafo = new Grafo();
		Arco a= new Arco(1,2,0);
		grafo.addVertice(3);
		grafo.addArco(a);
		String resul = grafo.componentsRelated();
		
		assertEquals("[1 2][3]", resul);
	}
}
