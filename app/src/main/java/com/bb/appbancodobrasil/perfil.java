package com.bb.appbancodobrasil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perfil extends AppCompatActivity {
    Button btn_csm_agendamento_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        btn_csm_agendamento_voltar = (Button) findViewById(R.id.btn_csm_agendamento_voltar);
    }
    public void Voltar(View view) {
        Intent it = new Intent(getBaseContext(), activity_csm_tela1.class);
        startActivity(it);
    }
}
