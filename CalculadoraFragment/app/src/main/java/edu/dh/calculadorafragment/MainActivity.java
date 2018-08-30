package edu.dh.calculadorafragment;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {
	BlankFragment txtFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		txtFragment = new BlankFragment();
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

		fragmentTransaction.add(R.id.flNumero, txtFragment);
		fragmentTransaction.commit(); // commit/consolidar

	}

	public void inserirNumero(View view) {
		Button botao = (Button) view;
		txtFragment.setTxtQualquerCoisa(botao.getText().toString());
	}

	public void inserirOperacao(View view) {

	}

	@Override
	public void onFragmentInteraction(Uri uri) {

	}
}
