package com.bb.appbancodobrasil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class central_atendimento extends AppCompatActivity {
    Button btn_central_atd_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_atendimento);

        btn_central_atd_voltar = (Button) findViewById(R.id.btn_central_atd_voltar);
    }
    public void voltar(View view){
        Intent it = new Intent(getBaseContext(), activity_csm_tela1.class);
        startActivity(it);
    }
}
