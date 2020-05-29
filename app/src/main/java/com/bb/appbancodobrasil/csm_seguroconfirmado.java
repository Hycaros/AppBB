package com.bb.appbancodobrasil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class csm_seguroconfirmado extends AppCompatActivity {
    Button btn_agendado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csm_seguroconfirmado);

        btn_agendado = (Button) findViewById(R.id.btn_agendado);
    }
    public void agendado(View view){
        Intent it = new Intent(getBaseContext(),activity_csm_tela1.class);
        startActivity(it);
    }
}
