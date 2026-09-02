package com.example.mercadomobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private CheckBox arrozCheckBox;
    private CheckBox feijaoCheckBox;
    private CheckBox escovaDentesCheckBox;
    private CheckBox acucarCheckBox;
    private CheckBox leiteCheckBox;

    private Button visualizarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        arrozCheckBox = findViewById(R.id.arrozCheckBox);
        feijaoCheckBox = findViewById(R.id.feijaoCheckBox);
        escovaDentesCheckBox = findViewById(R.id.escovaDentesCheckBox);
        acucarCheckBox = findViewById(R.id.acucarCheckBox);
        leiteCheckBox = findViewById(R.id.leiteCheckBox);

        visualizarButton = findViewById(R.id.visualizarButton);

        visualizarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularTotal();
            }
        });
    }

    private void calcularTotal() {

        double total = 0;

        if (arrozCheckBox.isChecked()) {
            total += 35.00;
        }

        if (feijaoCheckBox.isChecked()) {
            total += 5.00;
        }

        if (escovaDentesCheckBox.isChecked()) {
            total += 2.00;
        }

        if (acucarCheckBox.isChecked()) {
            total += 3.00;
        }

        if (leiteCheckBox.isChecked()) {
            total += 12.00;
        }

        DecimalFormat df = new DecimalFormat("0.00");

        String formattedTotal = df.format(total);

        Toast.makeText(
                MainActivity.this,
                "Total: R$ " + formattedTotal,
                Toast.LENGTH_SHORT
        ).show();
    }
}