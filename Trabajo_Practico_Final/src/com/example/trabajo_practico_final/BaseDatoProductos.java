package com.example.trabajo_practico_final;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDatoProductos extends SQLiteOpenHelper {

	public BaseDatoProductos(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		//Pichi no borren nada
	}

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		arg0.execSQL("create table productos(articulo text primary key,cantidad text)");

	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
