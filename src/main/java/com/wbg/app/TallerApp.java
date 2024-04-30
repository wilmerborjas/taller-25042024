package com.wbg.app;

import com.wbg.app.animal.Perro;
import com.wbg.app.animal.Vaca;

public class TallerApp {
	public static void main(String[] args) {

		Perro perro = new Perro();
		perro.setNombre("Firu");
		perro.setEdad(10);
		perro.setPeso(12.5);

		System.out.println(
				"Perro: Nombre = " + perro.getNombre() + ", Edad = " + perro.getEdad() + ", Peso = " + perro.getPeso());

		Vaca vaca = new Vaca();
		vaca.setRaza("angus");
		vaca.setCantidadCuerno(2);
		vaca.setTamanio(2.55);

		System.out.println("Vaca: Raza = " + vaca.getRaza() + ", Cuernos = " + vaca.getCantidadCuerno() + ", Tamaño = "
				+ vaca.getTamanio());

	}
}
