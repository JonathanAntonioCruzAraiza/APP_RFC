package com.example.mti.rfc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
  EditText edtNombrePersona, edtApellidoPaterno, edtApellidoMaterno;
  Button   btnCalcularRFC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.RFC);
        edtNombrePersona   = (EditText)findViewById(R.id.edtNombrePersona);
        edtApellidoPaterno = (EditText)findViewById(R.id.edtApellidoMaterno);
        edtApellidoMaterno = (EditText)findViewById(R.id.edtNombrePersona):

    }

    @Override
    public void onClick(View v) {
        String nombre = edtNombrePersona.toString();
        nombre = nombre.substring(1);



        switch(v.getId()) {
            case R.id.btnCalRFC:

                break;
        }
    }
}
