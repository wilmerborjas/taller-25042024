package com.wbg.app;

import com.wbg.app.facturacion.Factura;
import com.wbg.app.facturacion.Producto;

public class TallerApp {
	public static void main(String[] args) {
		Producto producto = new Producto();
		producto.setNombre("Lavadora");
		producto.setCantidad(2);
		producto.setValorUnitario(1200);

		Factura factura = new Factura();
		factura.getFactura(producto);

	}
}
