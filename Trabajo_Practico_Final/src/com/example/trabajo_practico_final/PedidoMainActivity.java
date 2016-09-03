package com.example.trabajo_practico_final;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PedidoMainActivity extends Activity {
	private Button bt01, bt02;
	private String s;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pedido_main);
		
		// recuperar el numero de cliente
		Bundle b = getIntent().getExtras();
		s = b.getString("claveCli");
		

	}

	// metodo para cada boton de producto
	public void detalleProducto_cocaZero(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "cocazero");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}

	public void detalleProducto_coca(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "coca");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_cocalife(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "cocalife");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_cocalight(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "cocalight");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_fantanaranja(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "fantanaranja");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_fantanaranjazero(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "fantanaranjazero");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_fantalimon(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "fantalimon");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_fantapomelo(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "fantapomelo");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_sprite(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "sprite");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_spritezero(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "spritezero");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_crush(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "crush");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_powerade(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "powerade");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_cepita(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "cepita");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_aquarius(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "aquarius");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_bonaqua(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "bonaqua");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_fuzetea(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "fuzetea");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}
	public void detalleProducto_schweppes(View v) {
		Intent intento = new Intent(this, Detalle_ProductoMainActivity.class);
		intento.putExtra("tipoGaseosa", "schweppes");
		intento.putExtra("claveCli", s);
		startActivity(intento);

	}


	public void mostrarLista(View v) {

		Intent intento = new Intent(this, ListaFinal_MainActivity.class);
		intento.putExtra("claveCli", s);
		startActivity(intento);
	}

	public void volver(View v) {
		finish();
	}

}
