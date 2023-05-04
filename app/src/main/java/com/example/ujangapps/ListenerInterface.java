package com.example.ujangapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ListenerInterface extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listener_interface);

        Button btnPertama = findViewById(R.id.btn_pertama);
        Button btnKedua = findViewById(R.id.btn_kedua);
//      ERROR DIBAWAH HARUS DIKASIH implements di baris 8
        btnPertama.setOnClickListener(this);
        btnKedua.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String label = ((Button)view).getText().toString();
        Log.i("Status", label + "Telah ditekan");

    }
}