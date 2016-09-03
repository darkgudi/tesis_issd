package com.example.trabajo_practico_final;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Producto_CantidadMainActivity extends Activity {
	private TextView titulo, cliente;
	private Button unidad, decena;
	private int totalUnidad = 0, totalDecena = 0;
	private String titu, cantPro, clienteN;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_producto__cantidad_main);

		
		titulo = (TextView) findViewById(R.id.titulo_Producto);
		unidad = (Button) findViewById(R.id.unidad);
		decena = (Button) findViewById(R.id.decena);

		Bundle b = getIntent().getExtras();
		clienteN = b.getString("claveCli");
		titu = b.getString("titulo");
		titulo.setText(titu);
		
	}

	// botones agregar cantidad
	public void aumentarU(View v) {
		totalUnidad++;
		if (totalUnidad == 10) {
			totalUnidad = 0;
			unidad.setText("0");
		}
		unidad.setText(totalUnidad + "");
	}

	public void aumentarD(View v) {
		totalDecena++;
		if (totalDecena == 10) {
			totalDecena = 0;
			decena.setText("0");
		}
		decena.setText(totalDecena + "");
	}

	public void cargar(View v) {

		// cantidad de producto
		cantPro = decena.getText().toString() + unidad.getText().toString();

		// base de datos
		BaseDatoProductos admin = new BaseDatoProductos(this, "Base", null, 1);
		SQLiteDatabase sql = admin.getWritableDatabase();
		ContentValues registro = new ContentValues();
		registro.put("articulo", titu);
		registro.put("cantidad", cantPro);
		sql.insert("productos", null, registro);
		Toast.makeText(this, "Datos Cargados", Toast.LENGTH_SHORT).show();
		sql.close();
		Intent intento = new Intent(this, PedidoMainActivity.class);
		intento.putExtra("claveCli", clienteN);
		startActivity(intento);
	}
	public void volver(View v){
		Intent intento = new Intent(this, PedidoMainActivity.class);
		intento.putExtra("claveCli", clienteN);
		startActivity(intento);
	}
	
}
