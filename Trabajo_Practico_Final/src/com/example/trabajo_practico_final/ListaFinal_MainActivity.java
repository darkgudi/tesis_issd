package com.example.trabajo_practico_final;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListaFinal_MainActivity extends Activity {
	private TextView numeroClienteFinal, tituloControl;
	private String numClienteFinal, producto, totalProductos, articuloCambio,
			cantidadCambio,cuerpoMail;
	private ListView listaFin;
	private ArrayList<String> listFinal = new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_final__main);
		
		numeroClienteFinal = (TextView) findViewById(R.id.textViewNumeroClienteListaFinal);
		tituloControl = (TextView) findViewById(R.id.textViewTituloControl);
		listaFin = (ListView) findViewById(R.id.listViewListaFinal);

		// recupero el numero de cliente
		Bundle b = getIntent().getExtras();
		numClienteFinal = b.getString("claveCli");
		// seteo en el titulo el numero del cliente
		numeroClienteFinal.setText(numClienteFinal);

		cargarItem();
		listaFin.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				TextView art = (TextView) arg1;
				String articulo = art.getText().toString();
				//Toast.makeText(ListaFinal_MainActivity.this, articulo,
					//	Toast.LENGTH_SHORT).show();
				Intent intento = new Intent(ListaFinal_MainActivity.this,
						Cambio_MainActivity.class);
				intento.putExtra("articulo", articulo);
				intento.putExtra("claveCli", numClienteFinal);
				startActivity(intento);
			}
		});

	}

	public void cargarItem() {
		BaseDatoProductos admin = new BaseDatoProductos(this, "Base", null, 1);
		SQLiteDatabase sql = admin.getWritableDatabase();
		Cursor registro = sql.rawQuery(
				"select articulo,cantidad from productos", null);
		while (registro.moveToNext()) {
			listFinal.add(registro.getString(0) + " cantidad:"
					+ registro.getString(1));
		}
		sql.close();
		ArrayAdapter<String> adaptador = new ArrayAdapter(this,
				android.R.layout.simple_list_item_1, listFinal);
		listaFin.setAdapter(adaptador);
	}

	public void enviar(View v) {
		// obtengo los elementos de la base de datos
		BaseDatoProductos admin = new BaseDatoProductos(this, "Base", null, 1);
		SQLiteDatabase sql = admin.getWritableDatabase();
		Cursor registros = sql.rawQuery("select articulo,cantidad from productos", null);
		cuerpoMail="";
		while (registros.moveToNext()) {
			cuerpoMail += registros.getString(0)+" Cantidad:"+registros.getString(1)+"\n\n";
		}
		sql.close();

		Intent intento1 = new Intent(Intent.ACTION_SEND);
		// vector donde van las direcciones de mail
		String[] mail = new String[2];
		mail[0] = "josegudi002@gmail.com";
		mail[1] = "gus.kof@hotmail.com";

		// ingresamos los mail al intent
		intento1.putExtra(android.content.Intent.EXTRA_EMAIL, mail);

		// ingresamos el titulo del mail
		intento1.putExtra(android.content.Intent.EXTRA_SUBJECT,
				"NUMERO DE CLIENTE: " + numClienteFinal);

		// CARGAR EL CUERPO DEL MAIL
		intento1.putExtra(android.content.Intent.EXTRA_TEXT, cuerpoMail +"\n \n");

		// indicamos que el contenido a enviar es texto plano
		intento1.setType("text/plain");
		startActivity(intento1);
		borrarTabla();
		

	}
	public void volver(View v) {
		Intent intento=new Intent(this,PedidoMainActivity.class);
		intento.putExtra("claveCli", numClienteFinal);
		startActivity(intento);
	}
	
	public void borrarTabla(){
		BaseDatoProductos admin = new BaseDatoProductos(this, "Base", null, 1);
		SQLiteDatabase sql = admin.getWritableDatabase();
		sql.execSQL("Delete from "+"productos");
		sql.close();
		
	}
	public void inicio(View v){
		borrarTabla();
		Intent intento=new Intent(this,Cliente_MainActivity.class);
		intento.putExtra("claveCli", numClienteFinal);
		startActivity(intento);
	}
	
}
