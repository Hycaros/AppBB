package com.bb.appbancodobrasil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class activity_csm_tela1 extends AppCompatActivity {
        Button btn_perfil_csm;
        Button btn_seguro_csm;
        Button btn_agendamentos_csm;
        Button btn_centraldeatendimento_csm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csm_tela1);

        btn_perfil_csm = (Button) findViewById(R.id.btn_perfil_csm);
        btn_seguro_csm = (Button) findViewById(R.id.btn_seguro_csm);
        btn_agendamentos_csm = (Button) findViewById(R.id.btn_agendamentos_csm);
        btn_centraldeatendimento_csm = (Button) findViewById(R.id.btn_centraldeatendimento_csm);

    }
    public void agendament(View view){
        Intent it = new Intent(this,activity_main2.class);
        startActivity(it);
    }
    public void perfil(View view){
        Intent it = new Intent(getBaseContext(), perfil.class);
        startActivity(it);
    }
    public void seguros(View view){
        Intent it = new Intent(getBaseContext(), csm_seguro.class);
        startActivity(it);
    }
    public void centralatdn(View view){
        Intent it = new Intent(getBaseContext(), central_atendimento.class);
        startActivity(it);
    }






}
