package com.example.t5_a4_4s_bazangarduomiguelangel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText cajaDecimal, cajaBinario, cajaOctal, cajaHexadecimal, cajaNum;
    private CheckBox chkBinario, chkOctal, chkHexadecimal,chkDecimal;
    private RadioButton rbDecimal, rbBinario, rbOctal, rbHexa;
    private Conversor conversor = new Conversor();
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cajaNum = findViewById(R.id.caja_num);
        cajaBinario = findViewById(R.id.caja_binario);
        cajaOctal = findViewById(R.id.caja_octal);
        cajaHexadecimal = findViewById(R.id.caja_hexadecimal);
        cajaDecimal = findViewById(R.id.caja_decimal);
        radioGroup = findViewById(R.id.radioGroup);

        rbDecimal = findViewById(R.id.radio_decimal);
        rbBinario = findViewById(R.id.radio_binario);
        rbOctal = findViewById(R.id.radio_octal);
        rbHexa = findViewById(R.id.radio_hexa);

        chkBinario = findViewById(R.id.checkBox_binario);
        chkDecimal = findViewById(R.id.chk_decimal);
        chkOctal = findViewById(R.id.checkBox_octal);
        chkHexadecimal = findViewById(R.id.checkBox_hexadecimal);

        rbDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(cajaNum.getText().toString());
                rbDecimal = findViewById(radioGroup.getCheckedRadioButtonId());
                if(chkBinario.isChecked()){
                    cajaBinario.setText(String.valueOf(conversor.convertirBinario(num)));
                }else
                    cajaBinario.setText("");
                if(chkOctal.isChecked()){
                    cajaOctal.setText(String.valueOf(conversor.convertirOctal(num)));
                }else
                    cajaOctal.setText("");
                if(chkHexadecimal.isChecked()){
                    cajaHexadecimal.setText(String.valueOf(conversor.convertirHexadecimal(num)));
                }else
                    cajaHexadecimal.setText("");

            }
        });
        rbBinario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(cajaNum.getText().toString());
                rbBinario = findViewById(radioGroup.getCheckedRadioButtonId());
                if(chkDecimal.isChecked()){
                    cajaDecimal.setText(String.valueOf(conversor.convertirDecimal(num)));
                }else
                    cajaDecimal.setText("");
                if(chkOctal.isChecked()){
                    cajaOctal.setText(String.valueOf(conversor.convertirOctal(num)));
                }else
                    cajaOctal.setText("");
                if(chkHexadecimal.isChecked()){
                    cajaHexadecimal.setText(String.valueOf(conversor.convertirHexadecimal(num)));
                }else
                    cajaHexadecimal.setText("");

            }
        });
        rbOctal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(cajaNum.getText().toString());
                rbOctal = findViewById(radioGroup.getCheckedRadioButtonId());
                if(chkBinario.isChecked()){
                    cajaBinario.setText(String.valueOf(conversor.convertirBinario(num)));
                }else
                    cajaBinario.setText("");
                if(chkDecimal.isChecked()){
                    cajaDecimal.setText(String.valueOf(conversor.convertirDecimal(num)));
                }else
                    cajaDecimal.setText("");
                if(chkHexadecimal.isChecked()){
                    cajaHexadecimal.setText(String.valueOf(conversor.convertirHexadecimal(num)));
                }else
                    cajaHexadecimal.setText("");

            }
        });
        rbHexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(cajaNum.getText().toString());
                rbHexa = findViewById(radioGroup.getCheckedRadioButtonId());
                if(chkBinario.isChecked()){
                    cajaBinario.setText(String.valueOf(conversor.convertirBinario(num)));
                }else
                    cajaBinario.setText("");
                if(chkOctal.isChecked()){
                    cajaOctal.setText(String.valueOf(conversor.convertirOctal(num)));
                }else
                    cajaOctal.setText("");
                if(chkDecimal.isChecked()){
                    cajaDecimal.setText(String.valueOf(conversor.convertirHexadecimal(num)));
                }else
                    cajaDecimal.setText("");

            }
        });







    }
}
