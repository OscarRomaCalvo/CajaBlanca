package com.cajablanca.grafo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class pruebas {
	public static void main (String[] Args) {

		Grafo g = new Grafo("resources/Grafo/prueba.txt");

		String a = g.componentsRelated();
		
		System.out.println("*************************");
		System.out.println(a);
	}
}
