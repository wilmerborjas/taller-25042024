package com.wbg.app.facturacion;

public class Producto {
	private String nombre;
	private int cantidad;
	private double valorUnitario;

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorUnitario() {
		return this.valorUnitario;
	}

}
