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
 * */
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PruebaDiscoRigido {

	//Patrón Triple A (Arrange | Act | Assert)
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
	
	@Test
	public void queAlDarUnDiscoRigidoDeMarcaSeagateYDeAlmacenamiento10TBMeDeLaCantidadDeBLUERAYsQueEquivale() {
		//Arrange
		DiscoRigido unHDD = new DiscoRigido("Seagate",10);
		Integer cantidadDeBlueRayEsperada = 683;
		//Act
		Integer cantidadDeBlueRayObtenida = unHDD.calcularLaCantidadDeBlueRay();		
		//Assert
		assertEquals(cantidadDeBlueRayEsperada, cantidadDeBlueRayObtenida);	
		
	}
	
	@Test 
	public void queAlDarUnHardDiskDeMarcaWesternDigitalYDeAlmacenamiento32TBMeDeLaCantidadEnteraMayorDeDVDs() {
		//Arrange
		Integer almacenamientoTB = 32;
		Integer cantidadDVDs = (int)(almacenamientoTB*1024/4.5);
		DiscoRigido hardDisk = new DiscoRigido("Western Digital", almacenamientoTB);
		
		//Act
		Integer cantidadDVDsObtenido = hardDisk.calcularLaCantidadDeDVD();
		
		//Assert
		assertTrue(cantidadDVDs<cantidadDVDsObtenido);
		
	}
	
	//Patron Given (Dado) | When(Cuando) | Then (Entonces)
	@Test
	public void queAlDarUnDiscoRigidoDeMarcaHitachiYDeAlmacenamiento10TBMeDeLaCantidadDeBLUERAYsQueEquivale() {
		Integer almacenamientoTB = 20;
		String marcaDelHDD = "Hitachi";
		DiscoRigido unHDD = dadoQueExisteUnDiscoRigido(marcaDelHDD, almacenamientoTB);
		
		Integer cantidadDeBlueRaysObtenida = cuandoCalculoLaCantidadDeBlueRay(unHDD);
		
		entoncesLaCantidadDeBlueRayes(1366, cantidadDeBlueRaysObtenida);
		
	}


	private DiscoRigido dadoQueExisteUnDiscoRigido(String marcaDelHDD, Integer almacenamientoTB) {
		return new DiscoRigido(marcaDelHDD, almacenamientoTB);
	}
	
	private Integer cuandoCalculoLaCantidadDeBlueRay(DiscoRigido unHDD) {
		Integer cantidadBlueRays;
		
		return cantidadBlueRays = unHDD.calcularLaCantidadDeBlueRay();
		
	}
	
	private void entoncesLaCantidadDeBlueRayes(Integer cantidadDeBlueRaysEsperada, Integer cantidadDeBlueRaysObtenida) {
		assertEquals(cantidadDeBlueRaysEsperada, cantidadDeBlueRaysObtenida);
	}
	
}
