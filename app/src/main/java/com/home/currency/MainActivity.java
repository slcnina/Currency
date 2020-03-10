package com.home.currency;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editNTD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNTD = findViewById(R.id.editNTD);

        Button btnCnt = findViewById(R.id.btnCnt);
        btnCnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ntdStr = editNTD.getText().toString();
                if(ntdStr.equals("")){
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Problem")
                            .setMessage("Please enter your NTD amount")
                            .setPositiveButton("OK", null)
                            .show();
                }else{
                    int ntd = Integer.parseInt(ntdStr);
                    float result = ntd / 30.9f;
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Result")
                            .setMessage("USD is " + result)
                            .setPositiveButton("OK", null)
                            .show();
                }
            }
        });
    }
}
