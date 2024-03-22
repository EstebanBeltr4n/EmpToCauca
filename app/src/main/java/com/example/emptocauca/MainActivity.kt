package com.example.emptocauca

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
/*
    lateinit var usuarioInput : EditText
    lateinit var contrasenaInput : EditText
    lateinit var loginBtn : EditText
*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        /*
        usuarioInput = findViewById(R.id.usuario_input)
        contrasenaInput = findViewById(R.id.contrasena_input)
        loginBtn = findViewById(R.id.login_Btn)
        


        loginBtn.setOnClickListener{
            val usuario = usuarioInput.text.toString()
            val contrasena = contrasenaInput.text.toString()
            Log.i("Test credenciales","Usuario: $usuario and Contrasena : $contrasena")
        }
        */

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
