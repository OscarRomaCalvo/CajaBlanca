package editorTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import com.cajablanca.editor.Editor;
import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;

public class GetLineaTest {

	@Test
	public void getLineaTest1() {
		Editor editor = new Editor();
		assertThrows(EmptyCollectionException.class, () -> editor.getLinea(6));
	}

	@Test
	public void getLineaTest2() {
		Editor editor = new Editor();
		editor.cargarEditor("resources/practica.txt");
		assertThrows(IllegalArgumentException.class, () -> editor.getLinea(-1));
	}
	
	@Test
	public void getLineaTest3() {
		Editor editor = new Editor();
		editor.cargarEditor("resources/practica.txt");
		assertThrows(IllegalArgumentException.class, () -> editor.getLinea(99));
	}

	@Test
	public void getLineaTest4() throws EmptyCollectionException {
		Editor editor = new Editor();
		editor.cargarEditor("resources/practica.txt");
		AbstractSingleLinkedListImpl<String> lista = editor.getLinea(1);
		boolean iguales = true;
		ArrayList aux = new ArrayList();
		aux.add("Hola");
		int i=0;
		Iterator iterator = lista.iterator();
		String a= null;
		while(iterator.hasNext()) {
			a=(String) iterator.next();
			if(!a.equals(aux.get(i))) {
				iguales=false;
			}
			i++;
		}
		assertTrue(iguales);
	}
}
