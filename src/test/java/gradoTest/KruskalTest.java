package gradoTest;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Grafo;

class KruskalTest {
	private PrintStream standardOut = System.out;
	private ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

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
	void kruskalTest5a() {
		Grafo g = new Grafo("resources/Grafo/grafo3vertices.txt");
		
		Grafo resul = g.kruskal();
		resul.printGraph();
		String resulString=outputStreamCaptor.toString();
		
		outputStreamCaptor = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStreamCaptor));
		g.printGraph();
		String gString=outputStreamCaptor.toString();
		
		assertEquals(resulString, gString);
	}
	
	@Test
	void kruskalTest7() {
		Grafo g = new Grafo("resources/Grafo/grafo2vertices.txt");
		
		Grafo resul = g.kruskal();
		resul.printGraph();
		String resulString=outputStreamCaptor.toString();
		
		outputStreamCaptor = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStreamCaptor));
		g.printGraph();
		String gString=outputStreamCaptor.toString();
		
		assertEquals(resulString, gString);
	}
	

	
	

}
