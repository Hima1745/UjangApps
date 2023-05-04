package com.example.ujangapps;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText etNama;
    public Button btnSubmit, btnPindah;
    public TextView txtNama;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);


        etNama = findViewById(R.id.et_sample);
        btnSubmit = findViewById(R.id.btn_submit);
        txtNama = findViewById(R.id.text_1);
        btnPindah = findViewById(R.id.btn_pindah);


        //onclick btnSubmit untuk ambil data dari edittext kemudian diambil oleh textview
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNama.setText(etNama.getText().toString());
            }
        });

        //onclick btnPindah untuk beralih dari act 1 menuju act 2
        btnPindah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent itn = new Intent(getApplicationContext(), SecondActivity.class);
//                untuk pindah dengan membawa data
                itn.putExtra("bawa_data", etNama.getText().toString());
                startActivity(itn);
                finish();
            }
        });


    }
}