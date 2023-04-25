package com.example.pokedexprova

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.learnandroid.loginsqlite.DBHelper


class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        val DB = DBHelper(this)
        val botao : Button = findViewById<Button>(R.id.botaoCadastrar)

        botao.setOnClickListener(View.OnClickListener {
            var login = findViewById<EditText>(R.id.cadastroLogin).text.toString()
            var senha = findViewById<EditText>(R.id.cadastroSenha).text.toString()
            var senha2 = findViewById<EditText>(R.id.cadastroSenha2).text.toString()

            if (login == "" || senha == "" || senha2 == "") Toast.makeText(
                this@Cadastro,
                "POR FAVOR, PREENCHA TODOS OS CAMPOS!",
                Toast.LENGTH_SHORT
            ).show() else {
                if (senha == senha2) {
                    val conferirUsuario: Boolean = DB.checkusername(login)
                    if (conferirUsuario == false) {
                        val insert: Boolean = DB.insertData(login, senha)
                        if (insert == true) {
                            findViewById<EditText>(R.id.cadastroLogin).setText("")
                            findViewById<EditText>(R.id.cadastroSenha).setText("")
                            findViewById<EditText>(R.id.cadastroSenha2).setText("")
                            Toast.makeText(
                                this@Cadastro,
                                "CADASTRADO COM SUCESSO!",
                                Toast.LENGTH_SHORT
                            ).show()
                            val intent = Intent(applicationContext, MainActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(
                                this@Cadastro,
                                "NÃO FOI POSSÍVEL CADASTRAR!",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    } else {
                        Toast.makeText(
                            this@Cadastro,
                            "USUARIO JÁ EXISTENTE!",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    Toast.makeText(this@Cadastro, "SENHAS NÃO COINCIDEM!", Toast.LENGTH_SHORT)
                        .show()
                }
            }
           })
    }
}
