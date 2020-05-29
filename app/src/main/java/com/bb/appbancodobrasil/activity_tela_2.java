package com.bb.appbancodobrasil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class activity_tela_2 extends AppCompatActivity {
    Button btn_main2_qrcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_2);

        btn_main2_qrcode = (Button)findViewById(R.id.btn_main2_qrcode);
    }
    public void QRCode2(View view){
        Intent it = new Intent(this,QRCode.class);
        startActivity(it);

    }

}
