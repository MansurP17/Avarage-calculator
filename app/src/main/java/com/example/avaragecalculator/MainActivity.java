package com.example.avaragecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2, input3, input4, input5;
    Button btn;
    TextView natija;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1=findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
        input3=findViewById(R.id.input3);
        input4=findViewById(R.id.input4);
        input5=findViewById(R.id.input5);

        btn=findViewById(R.id.btn);

        natija=findViewById(R.id.answer);


        btn.setOnClickListener(v -> {
            float int1, int2, int3, int4, int5;

            int1=Integer.parseInt(input1.getText().toString());
            int2=Integer.parseInt(input2.getText().toString());
            int3=Integer.parseInt(input3.getText().toString());
            int4=Integer.parseInt(input4.getText().toString());
            int5=Integer.parseInt(input5.getText().toString());

            float hisoblash=(int1+int2+int3+int4+int5)/5;
            natija.setText(hisoblash + "");
        });
    }
}