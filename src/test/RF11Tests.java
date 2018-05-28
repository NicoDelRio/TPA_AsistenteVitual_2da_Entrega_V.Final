package test;

import clase.Asistente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RF11Tests {

	public final static String USUARIO = "delucas";

	Asistente jenkins;

	@Before
	public void setup() {
		jenkins = new Asistente("jenkins");
	}

	@Test
	public void unidadesDeMasa() {
		
		
		Assert.assertEquals(
				"@delucas 1 kilo equivale a 1000 gramos",
				jenkins.escuchar("@jenkins cu�ntos gramos son 1 kilo")
			);

		Assert.assertEquals(
				"@delucas 1000 gramos equivalen a 1 kilo",
				jenkins.escuchar("@jenkins cu�ntos kilos son 1000 gramos")
			);
		
		Assert.assertEquals(
				"@delucas 1000 gramos equivalen a 35.27 onzas",
				jenkins.escuchar("@jenkins cu�ntas onzas son 1000 gramos")
			);		

		Assert.assertEquals(
				"@delucas 1500 kilos equivalen a 1.50 toneladas",
				jenkins.escuchar("@jenkins cu�ntas toneladas son 1500 kilos")
			);

		Assert.assertEquals(
				"@delucas 1 kilo equivale a 35.27 onzas",
				jenkins.escuchar("@jenkins cu�ntas onzas son 1 kilo")
			);

		Assert.assertEquals(
				"@delucas 1 kilo equivale a 2.20 libras",
				jenkins.escuchar("@jenkins cu�ntas libras son 1 kilo")
			);

		Assert.assertEquals(
				"@delucas 1 kilo equivale a 0.16 stones",
				jenkins.escuchar("@jenkins cu�ntos stones son 1 kilo")
			);

		Assert.assertEquals(
				"@delucas 2 toneladas equivalen a 70548 onzas",
				jenkins.escuchar("@jenkins cu�ntas onzas son 2 toneladas")
			);

		Assert.assertEquals(
				"@delucas 2 toneladas equivalen a 4409.24 libras",
				jenkins.escuchar("@jenkins cu�ntas libras son 2 toneladas")
			);

		Assert.assertEquals(
				"@delucas 2 toneladas equivalen a 314.95 stones",
				jenkins.escuchar("@jenkins cu�ntos stones son 2 toneladas")
			);

		Assert.assertEquals(
				"@delucas 1 onza equivale a 0.06 libras",
				jenkins.escuchar("@jenkins cu�ntas libras son 1 onza")
			);
		
		Assert.assertEquals(
				"@delucas 1000 onzas equivalen a 62.50 libras",
				jenkins.escuchar("@jenkins cu�ntas libras son 1000 onzas")
			);

		Assert.assertEquals(
				"@delucas 1000 onzas equivalen a 4.46 stones",
				jenkins.escuchar("@jenkins cu�ntos stones son 1000 onzas")
			);

		Assert.assertEquals(
				"@delucas 1 stone equivale a 224 onzas",
				jenkins.escuchar("@jenkins cu�ntos onzas son 1 stone")
			);

		Assert.assertEquals(
				"@delucas 1 stone equivale a 14 libras",
				jenkins.escuchar("@jenkins cu�ntas libras son 1 stone")
			);

		Assert.assertEquals(
				"@delucas 2 stones equivalen a 448 onzas",
				jenkins.escuchar("@jenkins cu�ntos onzas son 2 stones")
			);

		Assert.assertEquals(
				"@delucas 2 stones equivalen a 28 libras",
				jenkins.escuchar("@jenkins cu�ntas libras son 2 stones")
			);

		Assert.assertEquals(
				"@delucas 448 onzas equivalen a 2 stones",
				jenkins.escuchar("@jenkins cu�ntos stones son 448 onzas")
			);

		Assert.assertEquals(
				"@delucas 28 libras equivalen a 2 stones",
				jenkins.escuchar("@jenkins cu�ntas stones son 28 libras")
			);

		Assert.assertEquals(
				"@delucas 224 onzas equivalen a 1 stone",
				jenkins.escuchar("@jenkins cu�ntos stones son 224 onzas")
			);

		Assert.assertEquals(
				"@delucas 14 libras equivalen a 1 stone",
				jenkins.escuchar("@jenkins cu�ntas stones son 14 libras")
			);
		
	// agregar tests para el otro tipo de unidades. El protocolo puede ser el mismo

	}
	
	@Test
	public void unidadesDeLongitud() {

	// agregar tests para el otro tipo de unidades. El protocolo puede ser el mismo

	}
	
	@Test
	public void unidadesDeVolumen() {

		Assert.assertEquals(
				"@delucas 2800 litros equivalen a 2.80 metros c�bicos",
				jenkins.escuchar("@jenkins cu�ntos metros c�bicos son 2800 litros")
			);

		Assert.assertEquals(
				"@delucas 1000 litros equivalen a 1 metro c�bico",
				jenkins.escuchar("@jenkins cu�ntos metros c�bicos son 1000 litros")
			);

		Assert.assertEquals(
				"@delucas 2 metros c�bicos equivalen a 2000 litros",
				jenkins.escuchar("@jenkins cu�ntos litros son 2 metros c�bicos")
			);

		Assert.assertEquals(
				"@delucas 1 metro c�bico equivale a 1000 litros",
				jenkins.escuchar("@jenkins cu�ntos litros son 1 metro c�bico")
			);


	// agregar tests para el otro tipo de unidades. El protocolo puede ser el mismo

	}

	@Test
	public void unidadesDeTiempo() {

	// agregar tests para el otro tipo de unidades. El protocolo puede ser el mismo

	}
	
}