package com.example.adrianch.eva2_3_intents_paso_parametros;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    EditText editxttel, editxtsms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btn = (Button) findViewById(R.id.btn);
        editxtsms = (EditText) findViewById(R.id.editxtsms);
        editxttel = (EditText) findViewById(R.id.editxttel);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String txtTelefono = "smsto:"+editxttel.getText().toString();
        Intent intentEnviarMensaje = new Intent(Intent.ACTION_SENDTO, Uri.parse(txtTelefono));
        String txtMensaje = editxtsms.getText().toString();
        intentEnviarMensaje.putExtra("sms_body", txtMensaje);
        startActivity(intentEnviarMensaje);
    }
}

