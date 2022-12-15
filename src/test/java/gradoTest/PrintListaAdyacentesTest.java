package gradoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Grafo;

class PrintListaAdyacentesTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Test
	void printListaAdyacentesTest1() {
		Grafo a = new Grafo();
		a.addVertice(0);
		a.printListaAdyacentes(0);
		assertEquals("Adyacentes de 0:", outputStreamCaptor.toString().trim());
	}
	
	@Test
	void printListaAdyacentesTest2() {
		Grafo a = new Grafo("resources/Grafo/grafo2vertices.txt");
		a.printListaAdyacentes(0);
		assertEquals("Adyacentes de 0: 1", outputStreamCaptor.toString().trim());
	}

}
