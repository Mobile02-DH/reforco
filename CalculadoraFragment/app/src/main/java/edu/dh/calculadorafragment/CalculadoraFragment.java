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
public class CalculadoraFragment extends Fragment {

    TextView textView;

    public CalculadoraFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view;
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_calculadora,  container, false);

        textView = view.findViewById(R.id.txtView);

        return view;
    }

    public void inserirTexto (String string){

        textView.setText(string);
    }

}
