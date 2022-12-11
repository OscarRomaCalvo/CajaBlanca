package editorTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;

class NumAparicionesTest {
	Editor editorVacio;
	Editor editorLleno;
	
	@BeforeEach
	void SetUp() {
		editorVacio= new Editor();
		editorLleno= new Editor(); 
		editorLleno.cargarEditor("resources/practica.txt");
	}
	
	@Test
	void numAparicionesTest1() {
		assertThrows(IllegalArgumentException.class, () -> editorVacio.numApariciones(-1, 3,"Palabra"));
	}
	

	@Test
	void numAparicionesTest2() {
		assertThrows(IllegalArgumentException.class, () -> editorLleno.numApariciones(1, 99,"Palabra"));
	}
	
	@Test
	void numAparicionesTest3() {
		assertEquals(0,editorVacio.numApariciones(1, 0, "Palabra"));
	}
	
	@Test
	void numAparicionesTest4() {
		assertEquals(0,editorLleno.numApariciones(7, 4, "Palabra"));
	}
	
	@Test
	void numAparicionesTest5() {
		assertEquals(0,editorLleno.numApariciones(5, 5, "Palabra"));
	}
	
	@Test
	void numAparicionesTest6() {
		assertEquals(1,editorLleno.numApariciones(1, 1, "Hola"));
	}
	
	@Test
	void numAparicionesTest7() {
		assertEquals(0,editorLleno.numApariciones(1, 1, "Palabra"));
	}
}
