package com.gb.my_calculator_lesson_second;

import android.media.VolumeShaper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.gb.my_calculator_lesson_second.R.id;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnClear;
    Button btnParentheses;
    Button btnExponent;
    Button btnDivide;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnMultiply;
    Button btnSix;
    Button btnFive;
    Button btnFour;
    Button btnSubtract;
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnAdd;
    Button btnPlusMinus;
    Button btnZero;
    Button btnPoint;
    Button btnEquals;
    Button btnDelete;
    EditText et;
    RadioButton btnStandard;
    RadioButton btnRed;
    RadioButton btnGreen;
    RadioButton btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MyApp.currentTheme);
        setContentView(R.layout.activity_main);

        btnRed = findViewById(id.radioButtonMaterialRed);
        btnStandard = findViewById(id.radioButtonMaterialStandard);
        btnGreen = findViewById(id.radioButtonMaterialGreen);
        btnBlue = findViewById(id.radioButtonMaterialBlue);
        btnClear = findViewById(R.id.clear);
        btnParentheses = findViewById(R.id.parentheses);
        btnExponent = findViewById(R.id.exponent);
        btnDivide = findViewById(R.id.divide);
        btnSeven = findViewById(R.id.seven);
        btnEight = findViewById(R.id.eight);
        btnNine = findViewById(R.id.nine);
        btnMultiply = findViewById(R.id.multiply);
        btnSix = findViewById(R.id.six);
        btnFive = findViewById(R.id.five);
        btnFour = findViewById(R.id.four);
        btnSubtract = findViewById(R.id.subtract);
        btnOne = findViewById(R.id.one);
        btnTwo = findViewById(R.id.two);
        btnThree = findViewById(R.id.three);
        btnAdd = findViewById(R.id.add);
        btnPlusMinus = findViewById(R.id.PlusMinus);
        btnZero = findViewById(R.id.zero);
        btnPoint = findViewById(R.id.point);
        btnEquals = findViewById(R.id.equals);
        btnDelete = findViewById(R.id.delete);
        et = findViewById(R.id.textView6);

        btnStandard.setOnClickListener(this);
        btnRed.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnGreen.setOnClickListener(this);

        btnClear.setOnClickListener(this);
        btnParentheses.setOnClickListener(this);
        btnExponent.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnPlusMinus.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnDelete.setOnClickListener(this);

    }

    Double first = 0.0;
    Double two = 0.0;
    int operation = 0;
    String input = "";

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        et.setText((String.format("%s%s", et.getText().toString(), btn.getText().toString())));

        switch (view.getId()) {

            case id.standard:{
                MyApp.currentTheme = R.style.myThemeDefault;
                break;
            }
            case id.radioButtonMaterialRed: {
                MyApp.currentTheme = R.style.myThemeRed;
                break;
            }
            case id.radioButtonMaterialGreen:{
                MyApp.currentTheme = R.style.myThemeGreen;
                break;
            }
            case id.radioButtonMaterialBlue:{
                MyApp.currentTheme = R.style.myThemeBlue;
                break;
            }

            case id.one:
            case id.two:
            case id.three:
            case id.four:
            case id.five:
            case id.six:
            case id.seven:
            case id.eight:
            case id.nine:
            case id.zero:
            case id.point:
                input += btn.getText().toString();
                break;

            case id.add: {
                two = first;
                first = Double.parseDouble(input);
                operation = 1;
                input = "";
                break;
            }
            case id.subtract: {
                two = first;
                first = Double.parseDouble(input);
                operation = 2;
                input = "";
                break;
            }

            case id.multiply: {
                two = first;
                first = Double.parseDouble(input);
                operation = 3;
                input = "";
                break;
            }
            case id.divide: {
                two = first;
                first = Double.parseDouble(input);
                operation = 4;
                input = "";
                break;
            }


            case id.equals: {
                two = first;
                first = Double.parseDouble(input);
                result();
                break;
            }
            case id.clear: {
                two = 0.0;
                first = 0.0;
                et.setText("");

                break;
            }



        }

        recreate();
    }

    void result() {
        switch (operation) {
            case 1: {
                et.setText(String.format("%.2f", two + first));
                break;
            }
            case 2: {
                et.setText(String.format("%.2f", two - first));
                break;
            }
            case 3: {
                et.setText(String.format("%.2f", two * first));
                break;
            }
            case 4: {
                et.setText(String.format("%.2f", two / first));
                break;
            }

        }
    }
}