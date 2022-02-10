package com.gb.my_calculator_lesson_second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class ThemeActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton btnStandard;
    RadioButton btnRed;
    RadioButton btnGreen;
    RadioButton btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);


        btnRed = findViewById(R.id.radioButtonMaterialRed);
        btnStandard = findViewById(R.id.radioButtonMaterialStandard);
        btnGreen = findViewById(R.id.radioButtonMaterialGreen);
        btnBlue = findViewById(R.id.radioButtonMaterialBlue);

        btnStandard.setOnClickListener(this);
        btnRed.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnGreen.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.standard: {
                MyApp.currentTheme = R.style.myThemeDefault;
                break;
            }
            case R.id.radioButtonMaterialRed: {
                MyApp.currentTheme = R.style.myThemeRed;
                break;
            }
            case R.id.radioButtonMaterialGreen: {
                MyApp.currentTheme = R.style.myThemeGreen;
                break;
            }
            case R.id.radioButtonMaterialBlue: {
                MyApp.currentTheme = R.style.myThemeBlue;
                break;
            }

        }
        recreate();
    }
}