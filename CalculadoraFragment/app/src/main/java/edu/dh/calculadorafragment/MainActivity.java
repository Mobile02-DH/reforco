package edu.dh.calculadorafragment;

import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	NumeroFragment numeroFragment = new NumeroFragment();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		FragmentTransaction garcom = getSupportFragmentManager().beginTransaction();
		garcom.add(R.id.flNumero, numeroFragment); //elemento de destino, fragment a ser inserido
		garcom.commit();

	}

	public void inserirNumero(View view) {
		Button objButton = (Button) view;
		numeroFragment.colocarNumero(objButton.getText().toString());
	}

	public void inserirOperacao(View view) {

	}

	public void novaActivity(View view) {
		Intent objetivo = new Intent(this, SegundaActivity.class);
		startActivity(objetivo);
	}
}
