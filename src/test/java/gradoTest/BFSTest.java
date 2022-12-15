package gradoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Arco;
import com.cajablanca.grafo.Grafo;

class BFSTest {

	@Test
	void BFSTest1() {
		Grafo g = new Grafo();
		assertThrows(NoSuchElementException.class,()-> g.BFS(99));
	}

	@Test
	void BFSTest3() {
		Grafo g = new Grafo();
		g.addVertice(0);
		String solString = g.BFS(0);
		assertEquals(solString,"[0]");
	}
	
	@Test
	void BFSTest5() {
		Grafo g = new Grafo();
		g.addVertice(0);
		g.addVertice(1);
		g.addArco(new Arco(0, 1, 0));
		String solString = g.BFS(0);
		assertEquals(solString,"[0 1]");
	}
}
