package edu.dh.calculadorafragment;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

	private TextViewFragment textViewFragment;

	private FrameLayout flNumero;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		textViewFragment = new TextViewFragment();




			FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
			transaction.replace(R.id.flNumero, textViewFragment);
			transaction.commit();



	}

	public void inserirNumero(View view) {
		Button objButton = (Button) view;
		textViewFragment.setarString(objButton.getText().toString());

	}

	public void inserirOperacao(View view) {

	}
}
