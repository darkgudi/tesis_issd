package com.example.trabajo_practico_final;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Detalle_ProductoMainActivity extends Activity {
	private ListView listDetalle;
	private ArrayList<String> cocazero = new ArrayList<String>();
	private ArrayList<String> coca = new ArrayList<String>();
	private ArrayList<String> cocalife = new ArrayList<String>();
	private ArrayList<String> cocalight = new ArrayList<String>();
	private ArrayList<String> fantanaranja = new ArrayList<String>();
	private ArrayList<String> fantapomelo = new ArrayList<String>();
	private ArrayList<String> fantanaranjazero = new ArrayList<String>();
	private ArrayList<String> fantalimon = new ArrayList<String>();
	private ArrayList<String> sprite = new ArrayList<String>();
	private ArrayList<String> spritezero = new ArrayList<String>();
	private ArrayList<String> crush = new ArrayList<String>();
	private ArrayList<String> powerade = new ArrayList<String>();
	private ArrayList<String> cepita = new ArrayList<String>();
	private ArrayList<String> aquarius = new ArrayList<String>();
	private ArrayList<String> bonaqua = new ArrayList<String>();
	private ArrayList<String> fuzetea = new ArrayList<String>();
	
	private String cliente;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalle__producto_main);

		listDetalle = (ListView) findViewById(R.id.detalle_producto);

		
		cocazero.add("COCA COLA ZERO 237 X 12 PLASTICO	     1827");
		cocazero.add("SIX PACK LATA ZERO X 354 CC. 	         1874");
		cocazero.add("COCA COLA ZERO PET 500 X 6	         1816");
		cocazero.add("COCA COLA ZERO PET 1500 X 6	         1813");
		cocazero.add("COCA COLA ZERO PET 2,250 X 6	         1914");
		cocazero.add("COCA ZERO REP-PET  X 1,25 L. X 8 UN.	 1803");
		cocazero.add("COCA COLA ZERO PET 2000 X 8 Ret.	     1818");
		cocazero.add("Soda Kin 2,25 Lts.	                 2414");
		

		coca.add("237 cc.X PACK x 24	0442");
		coca.add("coca  237 cc. X 12	0427");
		coca.add("COCA ALUMINIO 250 ML. 0423");
		coca.add("LATA  SIX PACK X 354	0174");
		coca.add("pet cc 500 x 6	    0100");
		coca.add("Pet 500 cc x 12	    0116");
		coca.add("Ref-Pet 2.0	        0118");
		coca.add("Ref-Pet 2.500	        0454");
		coca.add("Ref-Pet 1 1/4	        0103");
		coca.add("litro vidrio x 12     0102");
		coca.add("Pet 1.0 x 9	        0429");
		coca.add("Pet 1.5 x 6	        0113");
		coca.add("Pet 2.0 x 6	        0110");
		coca.add("Pet 2.50 x 6	        0453");

		cocalife.add("COCA-COLA LIFE  237 X 12 CC.	    3527");
		cocalife.add("COCA-COLA LIFE LATA 354 CC. X 6	3574");
		cocalife.add("COCA-COLA LIFE  500 X 12 CC.	    3516");
		cocalife.add("COCA-COLA LIFE  1,5 L. X 6 CC.	3513");
		cocalife.add("COCA-COLA LIFE  2,25 L. X 6 CC. 	3514");
		
		cocalight.add("six pack latas light x 354 cc.	0274");
		cocalight.add("237 cc.	                        0242");
		cocalight.add("Pet 500 ccx 6	                0216");
		cocalight.add("Ref-Pet 2.0	                    0218");
		cocalight.add("Pet 1,5 x 6	                    0213");
		cocalight.add("Pet 2.25 x 6	                    0214");
		
		fantanaranja.add("Pet 500 cc x 2	    1116");
		fantanaranja.add("237 cc. X 24	        1190");
		fantanaranja.add("LATA SIX PACK X 354	1174");
		fantanaranja.add("Ref-Pet 2.0	        1118");
		fantanaranja.add("Ref-Pet 1 1/4	        1109");
		fantanaranja.add("Litro Vidrio	        1102");
		fantanaranja.add("Pet 1.5  x 6	        1113");
		fantanaranja.add("Pet 2.25 x 6	        1114");
		
		fantanaranjazero.add("Pet 500 cc x 6	3123");
		fantanaranjazero.add("Pet 1.5  x 6	    3113");
		fantanaranjazero.add("Pet 2,25 X 6	    3114");
		
		fantalimon.add("Pet 2,00  x 6	1414");
		
		fantapomelo.add("Pet 500 x 6	1221");
		fantapomelo.add("Pet 1.5 x 6	1211");
		fantapomelo.add("Pet 2,0 x 6	1214");
		
		sprite.add("Pet 500 cc x 12	    2016");
		sprite.add("237 cc.X24	        2090");
		sprite.add("LATA SIX PACK X 354	2074");
		sprite.add("Ref-Pet 2.0	        2018");
		sprite.add("Ref-Pet 1 1/4	    2003");
		sprite.add("Litro Vidrio	    2002");
		sprite.add("Pet 1.0 x 9         2029");
		sprite.add("Pet 1.5 x 6	        2013");
		sprite.add("Pet 2.25  x 6	    2014");

		spritezero.add("Pet 500 cc x6	        2321");
		spritezero.add("LATA X 354 X 6 UN	    2374");
		spritezero.add("REF-PET 2,0 L. X 8 UN.	2318");
		spritezero.add("Pet 1.5 x 6	            2313");
		spritezero.add("Pet 2,25  x 6	        2314");
		
		crush.add("LIMA LIMON 2,25 Lts.	0714");
		crush.add("NARANJA 2,25 Lts.	0614");
		
		powerade.add("Naranja 500 cc. x 6	            0673");
		powerade.add("Manzana 500 cc.x 6	            0773");
		powerade.add("Mountain Blas ( Mora) 500cc.x 6	0973");
		powerade.add("Naranja Light 500 cc.x 6	        0873");
		powerade.add("CITRUS  500 X 6	                0473");
		powerade.add("POWERADE MANDARINA 500 X6	        0373");
		powerade.add("FRUTAS TROPICALES 500 X 6	        0573");
		powerade.add("POWERADE LIMA LIMÓN 500X6	        0982");
		powerade.add("GOLD FEVER MANDARINA 500X6	    0983");
		powerade.add("Naranja 500 cc. x 6	            0986");
		powerade.add("Manzana 500 cc.x 6	            0987");
		powerade.add("Mountain Blas ( Mora) 500cc.x 6	0989");
		powerade.add("FRUTAS TROPICALES 500 X 6	        0985");
		powerade.add("moutain blas (mora) 995cc. X 6 	0999");
		powerade.add("frutas tropicales 995cc. X 6	    0995");
		powerade.add("manzana 995 cc. X 6	            0997");
		
		cepita.add("Naranja 200 cc.x 6 un.	            1280");
		cepita.add("Manzana 200 cc.x 6 un.	            1281");
		cepita.add("Multi Fruta 200 cc.x 6 un.	        1286");
		cepita.add("Pom,Rosado 200 cc. X 6 un.	        1282");
		cepita.add("NUTRIDEFENSAS BANANA MIX X6 200CC	1385");
		cepita.add("NUTRIDEFENSAS NARANJA X 6 200C	    1380");
		cepita.add("NUTRIDEFENSAS DURANZNO X6 200C	    1381");
		cepita.add("NUTRIDEFENSAS MANZANA  X6 200C	    1387");
		cepita.add("NUTRIDEFENSAS  UVA  X6  200C	    1382");
		cepita.add("NUTRIDEFENSAS NARANJA X 6 1,0 L.	1383");
		cepita.add("NUTRIDEFENSAS BANANA MIX  X 6 1,0 L.1386");
		cepita.add("NUTRIDEFENSAS MANZANA  X 6 1,0 L.	1388");
		cepita.add("NUTRIDEFENSAS DURAZNO MIX X6 1,0 L. 1384");
		cepita.add("Multifruta 1 lts. X 6 un.	        1087");
		cepita.add("Naranja 1 lt.x 6 un.	            1083");
		cepita.add("Manzana 1 lt.x 6 un.	            1084");
		cepita.add("Pom.Rosado 1 lt.x 6 un.	            1085");
		cepita.add("Naranja 1 lt.x 6 un.LIGHT	        1088");
		cepita.add("Naranja 1 lt.x 6 un.100 %	        1060");
		cepita.add("Manzana 1 lt.x 6 un.100 %	        1062");
		cepita.add("CEPITA BOTELLA NARANJA X 330CC.	    850 ");
		cepita.add("CEPITA BOTELLA DURAZNO X 330CC.	    851 ");
		cepita.add("CEPITA BOTELLA ANANA X 330CC.	    852 ");
		cepita.add("CEPITA BOTELLA NARANJA X 1,5 LTS.	860 ");
		cepita.add("CEPITA BOTELLA DURAZNO X 1,5 LTS.	861 ");
		cepita.add("CEPITA BOTELLA ANANA X 1,5 LTS.	    862 ");
		
		aquarius.add("Quarius Manzana 500 cc.	        1270");
		aquarius.add("Quarius Pomelo 500 cc.	        1272");
		aquarius.add("Quarius Pera 500 cc.	            1273");
		aquarius.add("aquiarius 500 cc.	                1265");
		aquarius.add("aquarius pomelo rosado 500 cc.	1267");
		aquarius.add("quarius naranja 500 cc	        1268");
		aquarius.add("Quarius Uva 500 cc.	            1269");
		aquarius.add("Quarius Multifrutas 500 cc.	    1244");
		aquarius.add("Aquarius lata 354cc.	");
		aquarius.add("Aquarius lata 354 cc.	");
		aquarius.add("Aquarius lata 354 cc.	");
		aquarius.add("aquarius pomelo rosado 1,5L. 	    1274");
		aquarius.add("Quarius Manzana 1,5 Lts.	        1275");
		aquarius.add("Quarius Pomelo 1,5 Lts.	        1276");
		aquarius.add("aquarius 1,5 Lts.	                1266");
		aquarius.add("Quarius Pera 1,5 Lts.	            1277");
		aquarius.add("Quarius Narj. 1,5 Lts.	        1278");
		aquarius.add("Quarius Uva 1,5 Lts.	            1279");
		aquarius.add("Quarius Multifruta X 1,5 Lts.	    1251");
		aquarius.add("AQUARIUS DELIGHT NARANJA X 500 CC	1237");
		aquarius.add("AQUARIUS DELIGHT PERA X 500 CC	1238");
		aquarius.add("AQUARIUS DELIGHT NARANJA X 1,5 LTS.1241");
		aquarius.add("AQUARIUS DELIGHT PERA X 1,5 LTS. 	 1242");
		aquarius.add("AQUARIUS LIMONADA X 6 	        1253");
		aquarius.add("AQUARIUS PERA X 6 	            1252");
		aquarius.add("AQUARIUS POMELO X6 	            1250");
		aquarius.add("AQUARIUS NARANJA X 6 	            1258");
		
		bonaqua.add("Bonaqua pet 1,5L. c/g x 6	2914");
		bonaqua.add("Bonaqua pet 1,5L. s/g x 6	2913");
		bonaqua.add("Bonaqua pet 2,0 L. s/g x6	2915");
		bonaqua.add("Bonaqua pet 2,50 L. s/g x6	2916");
		bonaqua.add("Bonaqua pet 500 c. c/g x 6	2912");
		bonaqua.add("Bonaqua pet 500 c. s/g x 6	2911");
		
		fuzetea.add("FUZE TEA  DURAZNO X 475 CC.	921");
		fuzetea.add("FUZE TEA  LIMON X 475 CC.	    920");
		fuzetea.add("FUZE TEA DURAZNO X 1,45 L. 	931");
		fuzetea.add("FUZE TEA LIMON X 1,45 L. 	    930");
		
		cambioList();
	}

	
	//metodo para cambiar la lista de productos
	public void cambioList() {
		Bundle b = getIntent().getExtras();
		String s = b.getString("tipoGaseosa");
		cliente=b.getString("claveCli");

		if (s.equals("cocazero")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, cocazero);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", cocazero.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		if (s.equals("coca")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, coca);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", coca.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("cocalife")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, cocalife);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", cocalife.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("cocalight")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, cocalight);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", cocalight.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("fantanaranja")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, fantanaranja);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", fantanaranja.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("fantanaranjazero")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, fantanaranjazero);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", fantanaranjazero.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		if (s.equals("fantalimon")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, fantalimon);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", fantalimon.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("fantapomelo")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, fantapomelo);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", fantapomelo.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("sprite")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, sprite);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", sprite.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("spritezero")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, spritezero);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", spritezero.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("crush")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, crush);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", crush.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("powerade")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, powerade);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", powerade.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("cepita")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, cepita);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", cepita.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("aquarius")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, aquarius);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", aquarius.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("bonaqua")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, bonaqua);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", bonaqua.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("fuzetea")) {

			ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, fuzetea);
			listDetalle.setAdapter(jose);
			listDetalle.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {

					Intent intento = new Intent(
							Detalle_ProductoMainActivity.this,
							Producto_CantidadMainActivity.class);
					intento.putExtra("titulo", fuzetea.get(arg2));
					intento.putExtra("claveCli",cliente);
					startActivity(intento);
				}
			});
		}
		
		if (s.equals("schweppes")) {

			/*ArrayAdapter jose = new ArrayAdapter(
					Detalle_ProductoMainActivity.this,
					android.R.layout.simple_list_item_1, cocalife);
			listDetalle.setAdapter(jose);*/
		}
	}
	
	public void volver(View v){
		Intent intento=new Intent(this,PedidoMainActivity.class);
		intento.putExtra("claveCli", cliente);
		startActivity(intento);
	}
}
