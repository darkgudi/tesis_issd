package com.example.trabajo_practico_final;
//pichis
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Cambio_MainActivity extends Activity {
	private TextView cambioProducto, cambioCantidad;
	private String articulo, s, cantidad, cliente;
	private int totalUnidad = 0, totalDecena = 0, cantidadTotal = 0;
	private Button unidad, decena;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cambio__main);

		cambioProducto = (TextView) findViewById(R.id.textViewTituloProductoCambio);
		cambioCantidad = (TextView) findViewById(R.id.textViewCantidadProductoCambio);
		decena = (Button) findViewById(R.id.buttonDecenaCambio);
		unidad = (Button) findViewById(R.id.buttonUnidadCambio);

		Bundle b = getIntent().getExtras();
		cliente = b.getString("claveCli");
		String s = b.getString("articulo");

		/*
		 * Split divide un string por la expresion que le pasamos por parametro
		 * Y almacena las partes en un array. Por ejemplo: String telefono =
		 * "444-555-666" Si le hacemos un split String[] nrosSeparados =
		 * telefonos.split("-"); nrosSeparados[0] = "444"; nrosSeparados[1] =
		 * "555"; nrosSeparados[2] = "666";
		 */

		String[] primary = s.split(" cantidad");
		String primaryF = primary[0].toString();

		recuperar(primaryF);
	}

	public void recuperar(String s) {
		BaseDatoProductos admin = new BaseDatoProductos(this, "Base", null, 1);
		SQLiteDatabase sql = admin.getWritableDatabase();
		Cursor registro = sql.rawQuery(
				"select cantidad from productos where articulo='" + s + "'",
				null);
		if (registro.moveToNext()) {
			cambioProducto.setText(s);
			cambioCantidad.setText("cantidad: " + registro.getString(0));
		}
		sql.close();
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

	// modificar cantidad
	public void modificar(View v) {
		cantidad = decena.getText().toString() + unidad.getText().toString();
		BaseDatoProductos admin = new BaseDatoProductos(this, "Base", null, 1);
		SQLiteDatabase sql = admin.getWritableDatabase();
		ContentValues registro = new ContentValues();
		registro.put("articulo", cambioProducto.getText().toString());
		registro.put("cantidad", cantidad);
		int cant = sql.update("productos", registro, "articulo='"
				+ cambioProducto.getText().toString() + "'", null);
		if (cant == 1) {
			Toast.makeText(this, "Datos modificados", Toast.LENGTH_LONG).show();
		}
		sql.close();
		Intent intento = new Intent(this, ListaFinal_MainActivity.class);
		intento.putExtra("claveCli", cliente);
		startActivity(intento);
		//Toast.makeText(this, cliente + "", Toast.LENGTH_SHORT).show();
	}

	public void borrar(View v) {
		BaseDatoProductos admin = new BaseDatoProductos(this, "Base", null, 1);
		SQLiteDatabase sql = admin.getWritableDatabase();
		int cant = sql.delete("productos", "articulo='"
				+ cambioProducto.getText().toString() + "'", null);
		if (cant == 1) {
			Toast.makeText(this, "Datos borrados", Toast.LENGTH_LONG).show();
		}
		sql.close();
		Intent intento = new Intent(this, ListaFinal_MainActivity.class);
		intento.putExtra("claveCli", cliente);
		startActivity(intento);
	}

}
