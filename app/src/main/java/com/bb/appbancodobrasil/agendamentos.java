package com.bb.appbancodobrasil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class agendamentos extends AppCompatActivity {
    Button btn_main2_qrcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamentos);

        btn_main2_qrcode = (Button) findViewById(R.id.btn_main2_qrcode);

    }
    public void QRCodes(View view){
        Intent it = new Intent(getBaseContext(),QRCode.class);
        startActivity(it);
    }
}
