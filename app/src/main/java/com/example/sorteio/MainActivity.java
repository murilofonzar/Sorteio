package com.example.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    EditText edInicial,edFinal;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edInicial = findViewById(R.id.editTextNumber2);
        edFinal = findViewById(R.id.editTextNumber3);
        textView = findViewById(R.id.numSorteado);
    }

    public void sorteiaNumero(View view){
        int vInicio, vFim, numSorteado;
        vInicio = Integer.parseInt(edInicial.getText().toString());
        vFim = Integer.parseInt(edFinal.getText().toString());
        numSorteado = (new Random().nextInt((vFim-vInicio)+1))+vInicio;
        textView.setText(Integer.toString(numSorteado));
    }
}