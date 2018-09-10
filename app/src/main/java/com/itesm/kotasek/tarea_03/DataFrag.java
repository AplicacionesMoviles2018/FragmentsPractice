package com.itesm.kotasek.tarea_03;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;


public class DataFrag extends Fragment {

    View view;
    LinearLayout linearLayout;

    public DataFrag() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_data, container, false);

        //tvData = view.findViewById(R.id.tvData);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        TextView tvData = view.findViewById(R.id.tvData);

        View v = getView();
        String fin = "";
        if(v != null){
            MainActivity activity = (MainActivity) getActivity();
            for (Data data: activity.getData()) {
                fin += data.toString();
            }
            tvData.setText(fin);
        }
    }
}
