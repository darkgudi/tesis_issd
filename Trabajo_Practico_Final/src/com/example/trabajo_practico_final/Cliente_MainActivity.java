package com.example.trabajo_practico_final;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class Cliente_MainActivity extends Activity {
	private EditText numeroCli;
	private String clave;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cliente__main);
		
		
		numeroCli=(EditText)findViewById(R.id.editTextNumeroCliente);
		
	}
	
	public void ingresar(View v){
		clave=numeroCli.getText().toString();
		
		numeroCli.setText("");
		
		if(clave.equals("")){
			Toast.makeText(this, "Ingrese numero de cliente", Toast.LENGTH_LONG).show();
		}else{
			Intent intento=new Intent(this, PedidoMainActivity.class);
			
			//se guarda el numero de cliente
			intento.putExtra("claveCli", clave);
			intento.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intento);
		}
		
		
	}
	public void salir(View v){
		finish();
	}
}
