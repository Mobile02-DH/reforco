package edu.dh.calculadorafragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumeroFragment extends Fragment {
	TextView txtNumero;

	public NumeroFragment() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
													 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_numero, container, false);
		txtNumero = view.findViewById(R.id.txtNumero);
		return view;
	}

	public void colocarNumero(String n) {
		txtNumero.setText(n);
	}

}
