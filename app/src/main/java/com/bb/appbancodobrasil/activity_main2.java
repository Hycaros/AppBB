package com.bb.appbancodobrasil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_main2 extends AppCompatActivity {
    Button btn_main2_qrcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_main2_qrcode = (Button)findViewById(R.id.btn_main2_qrcode);

    }
    public void QRCode(View view) {
        Intent it = new Intent(getBaseContext(), QRCode.class);
        startActivity(it);
    }


}
