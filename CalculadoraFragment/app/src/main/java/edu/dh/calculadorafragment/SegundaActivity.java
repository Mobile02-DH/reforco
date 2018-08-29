package edu.dh.calculadorafragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SegundaActivity extends AppCompatActivity {

	NumeroFragment numeroFragment = new NumeroFragment();
	EditText edtTexto;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);

		edtTexto = findViewById(R.id.edtTexto);

		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		ft.add(R.id.flFragment, numeroFragment);
		ft.commit();
	}

	public void colocarTexto(View view){
		String texto = edtTexto.getText().toString();
		if (!texto.equals("")) {
			numeroFragment.colocarNumero(texto);
		}
	}

}
