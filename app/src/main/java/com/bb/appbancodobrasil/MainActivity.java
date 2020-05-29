package com.bb.appbancodobrasil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    Button button;
    Button btn_main_entrar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        button = (Button)findViewById(R.id.btn_main_entrar);
        btn_main_entrar2 = (Button)findViewById(R.id.btn_main_entrar2);

    }

    public void Login_btn(View view){
        startActivity(new Intent(this,activity_csm_tela1.class));


    }
    public void Login_Prestador(View view){
        startActivity(new Intent(this,activity_tela_3.class));
    }
}








