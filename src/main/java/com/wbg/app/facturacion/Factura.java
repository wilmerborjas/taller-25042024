package com.wbg.app.facturacion;

public class Factura {

	public void getFactura(Producto producto) {

		System.out.println("Nombre = " + producto.getNombre());
		System.out.println("Cantidad = " + producto.getCantidad());
		System.out.println("Valor = " + producto.getValorUnitario());

		double subtotal = producto.getCantidad() * producto.getValorUnitario();
		System.out.println("subtotal = " + subtotal);

		if (subtotal > 100) {
			double descuento = subtotal * 0.1;
			System.out.println("descuento = " + descuento);
			subtotal = subtotal - descuento;

			System.out.println("total a pagar  = " + subtotal);

		}

	}
}
