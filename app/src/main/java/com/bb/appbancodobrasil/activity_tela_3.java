package com.bb.appbancodobrasil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_tela_3 extends AppCompatActivity {
    Button btn_tela3_perfil;
    Button btn_tela3_agendamentos;
    Button bt_tela3_centralatd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_3);

        btn_tela3_perfil = (Button)findViewById(R.id.btn_tela3_perfil);
        btn_tela3_agendamentos = (Button)findViewById(R.id.btn_tela3_agendamentos);
        bt_tela3_centralatd = (Button)findViewById(R.id.bt_tela3_centralatd);
    }
    public void perfil2(View view){
        Intent it = new Intent(getBaseContext(),csm_tela2.class);
        startActivity(it);
    }
    public void agendamentos2(View view){
        Intent it = new Intent(getBaseContext(),activity_tela_2.class);
        startActivity(it);
    }
    public void centralatendimento(View view){
        Intent it = new Intent(getBaseContext(),central_atendimento.class);
        startActivity(it);
    }

}
