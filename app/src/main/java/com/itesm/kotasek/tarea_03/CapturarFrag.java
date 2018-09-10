package com.itesm.kotasek.tarea_03;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CapturarFrag extends Fragment implements View.OnClickListener {

    Button btn;
    EditText etMat;
    TextView etNom;
    View view;
    OnDataPass dataPasser;

    public interface OnDataPass {
        void onDataPass(Data data);
    }

    public CapturarFrag() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_capturar, container, false);
        btn = view.findViewById(R.id.btnGuardar);
        etMat = view.findViewById(R.id.etMat);
        etNom = view.findViewById(R.id.etNom);
        btn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        dataPasser.onDataPass(new Data(etMat.getText().toString(),etNom.getText().toString()));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        dataPasser = (OnDataPass) context;
    }


}
