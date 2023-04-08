package ar.edu.unlam.pb2.git.tdd;
/* Aplicare tdd a un ejercicio del TP N°2 de Programación Básica 1
 * 
 * Crear la clase DiscoRigido que contenga un atributo tamaño y un método que informe
 * cuantos cuántos dvd (4.5GB) equivale dicha capacidad y otro método que informe a
 * cuántos blue ray (15GB) equivalen. Crear la clase PruebaDiscoRigido que verifique el
 * correcto funcionamiento para los siguientes ejemplos:
 * 
 * a. seagate de 10 TB
 * b. hitachi de 20 TB
 * c. westernDigital de 32 TB
 * d. toshiba de 48 TB
 * 
 * */
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PruebaDiscoRigido {

	@Test
	public void queAlDarUnDiscoRigidoDeMarcaSeagateYDeAlmacenamiento10TBMeDeLaCantidadDeDVDsQueEquivale() {
		//Arrange
		DiscoRigido unHDD = new DiscoRigido("Seagate",10);
		Integer cantidadDeDVDEsperada = 2276;
		
		//Act
		Integer cantidadDeDVDObtenida = unHDD.calcularLaCantidadDeDVD();
				
		//Assert
		assertEquals(cantidadDeDVDEsperada, cantidadDeDVDObtenida);
		
	}

}
