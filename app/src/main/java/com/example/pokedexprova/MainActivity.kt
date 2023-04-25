//Alunos:
//Gabriel de Freitas Lima
//Igor Rubio Lazaroto
//João Vitor Perin
//Thiago Jungles Caron

package com.example.pokedexprova

import android.R.attr.password
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.learnandroid.loginsqlite.DBHelper


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val DB = DBHelper(this)
        var button: Button = findViewById<Button>(R.id.botaoLogin)
        button.setOnClickListener(View.OnClickListener {
            var login = findViewById<EditText>(R.id.login).text.toString()
            var senha = findViewById<EditText>(R.id.senha).text.toString()
            if (login == "" || senha == "") Toast.makeText(
                this@MainActivity,
                "PREENCHA TODOS OS CAMPOS!",
                Toast.LENGTH_SHORT
            ).show() else {
                val conferirLogin: Boolean = DB.checkusernamepassword(login, senha)
                if (conferirLogin == true) {
                    Toast.makeText(this@MainActivity, "LOGIN FEITO COM SUCESSO!", Toast.LENGTH_SHORT)
                        .show()
                    findViewById<EditText>(R.id.login).setText("")
                    findViewById<EditText>(R.id.senha).setText("")
                    val intent = Intent(applicationContext, TelaPokedex::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this@MainActivity, "CREDENCIAIS INVÁLIDAS!", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        })

        var button2: Button = findViewById<Button>(R.id.botaoTelaCadastro)
        button2.setOnClickListener({
            val intent = Intent(this@MainActivity, Cadastro::class.java)
            startActivity(intent)
        })
    }
}