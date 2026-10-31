package com.example.aprendeaaprendermobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declaramos los elementos de la pantalla
    private EditText etEmail, etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculamos las variables con los ID que pusimos en el diseño XML
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Programamos qué pasa cuando hacen clic en el botón Ingresar
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String correo = etEmail.getText().toString().trim();
                String contrasena = etPassword.getText().toString().trim();

                // Validación básica de campos vacíos
                if (correo.isEmpty() || contrasena.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor completa todos los campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Mensaje temporal de éxito (aquí después conectaremos tu API de Node.js)
                    Toast.makeText(MainActivity.this, "¡Conectando con Aprende a Aprender!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}