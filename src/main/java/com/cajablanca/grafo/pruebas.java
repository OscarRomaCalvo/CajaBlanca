package com.cajablanca.grafo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class pruebas {
	public static void main (String[] Args) {
		PrintStream standardOut = System.out;
		ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStreamCaptor));
		
		Grafo g = new Grafo("resources/Grafo/grafo3vertices.txt");
		Grafo resul = g.kruskal();
		resul.printGraph();
		String a = outputStreamCaptor.toString();
		System.out.println(a);
	}
}
