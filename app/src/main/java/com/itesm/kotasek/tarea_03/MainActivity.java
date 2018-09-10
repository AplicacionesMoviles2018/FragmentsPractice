package com.itesm.kotasek.tarea_03;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity implements CapturarFrag.OnDataPass {

    LinkedList<Data> dataList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void capturar(View v){
        CapturarFrag fragCapturar = new CapturarFrag();
        FragmentTransaction transaccion = getSupportFragmentManager().beginTransaction();
        transaccion.replace(R.id.contFrag, fragCapturar);
        transaccion.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        transaccion.addToBackStack(null);
        transaccion.commit();
    }

    public void consultar(View v){
        DataFrag fragData = new DataFrag();
        FragmentTransaction transaccion = getSupportFragmentManager().beginTransaction();
        transaccion.replace(R.id.contFrag, fragData);
        transaccion.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        transaccion.addToBackStack(null);
        transaccion.commit();
    }

    @Override
    public void onDataPass(Data data) {
        Log.d("LOG","hello " + data);
        dataList.add(data);
    }

    public LinkedList<Data> getData(){
        return dataList;
    }

    public void dialogue(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Debes llenar ambos campos");
        builder.setTitle("Pssst");

        AlertDialog dialogue = builder.create();
        builder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });
        builder.show();
    }
}
