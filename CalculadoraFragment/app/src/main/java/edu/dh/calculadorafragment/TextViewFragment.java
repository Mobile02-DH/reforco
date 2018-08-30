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
public class TextViewFragment extends Fragment {
    private TextView textView;

    public void setarString (String s){
        textView.setText(s);
    }

    public TextViewFragment() {


        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_text_view, container, false);

        textView = view.findViewById(R.id.txtFelipe);

        return view;
    }

}
