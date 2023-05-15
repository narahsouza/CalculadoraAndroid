package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double valor1, valor2, resultado;
    TextView textViewResultado;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSoma = findViewById(R.id.buttonSoma);
        Button buttonSubtrai = findViewById(R.id.buttonSubtrai);
        Button buttonMultiplica = findViewById(R.id.buttonMultiplica);
        Button buttonDivide = findViewById(R.id.buttonDivide);

        textViewResultado = findViewById(R.id.textViewResultado);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
    }

    public void somar(View v) {
        valor1 = Double.parseDouble(editText1.getText().toString());
        valor2 = Double.parseDouble(editText2.getText().toString());
        resultado = valor1 + valor2;
        textViewResultado.setText(String.valueOf(resultado));
    }

    public void subtrair(View v) {
        valor1 = Double.parseDouble(editText1.getText().toString());
        valor2 = Double.parseDouble(editText2.getText().toString());
        resultado = valor1 - valor2;
        textViewResultado.setText(String.valueOf(resultado));
    }

    public void multiplicar(View v) {
        valor1 = Double.parseDouble(editText1.getText().toString());
        valor2 = Double.parseDouble(editText2.getText().toString());
        resultado = valor1 * valor2;
        textViewResultado.setText(String.valueOf(resultado));
    }

    public void dividir(View v) {
        valor1 = Double.parseDouble(editText1.getText().toString());
        valor2 = Double.parseDouble(editText2.getText().toString());
        resultado = valor1 / valor2;
        textViewResultado.setText(String.valueOf(resultado));
    }
}