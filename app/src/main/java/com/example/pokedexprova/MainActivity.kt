//Alunos:
//Gabriel de Freitas Lima
//Igor Rubio Lazaroto
//João Vitor Perin
//Thiago Jungles Caron

package com.example.pokedexprova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button: Button = findViewById<Button>(R.id.botaoLogin)
        button.setOnClickListener({
            val intent = Intent(this@MainActivity, TelaPokedex::class.java)
            startActivity(intent)
        })

        var button2: Button = findViewById<Button>(R.id.botaoCadastro)
        button2.setOnClickListener({
            val intent = Intent(this@MainActivity, Cadastro::class.java)
            startActivity(intent)
        })
    }
}