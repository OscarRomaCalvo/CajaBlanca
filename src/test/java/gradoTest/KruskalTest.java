package gradoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Grafo;

class KruskalTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Test
	void kruskalTest1() {
		Grafo g = new Grafo();
		Grafo resul = g.kruskal();
		resul.printGraph();
		assertEquals(outputStreamCaptor.toString().trim(), "");
	}
	
	@Test
	void kruskalTest3() {
		Grafo g = new Grafo();
		g.addVertice(0);
		g.addVertice(1);
		Grafo resul = g.kruskal();
		resul.printGraph();
		assertEquals(outputStreamCaptor.toString().trim(), "");
	}
	
	

}
