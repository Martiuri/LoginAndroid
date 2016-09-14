package com.example.marti.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class primero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primero);
        Button boton =(Button) findViewById(R.id.ingresar);
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String usuario=((EditText)findViewById(R.id.txtusuario)).getText().toString();
                String password=((EditText)findViewById(R.id.txtpassword)).getText().toString();
                if(usuario.equals("martin")&& password.equals("martin"))
                {
                    Intent nuevoform= new Intent(primero.this,segundo.class);
                    startActivity(nuevoform);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"usuario incorrecto",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
