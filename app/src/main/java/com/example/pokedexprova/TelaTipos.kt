package com.example.pokedexprova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.text.HtmlCompat

class TelaTipos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_tipos)
    }

    fun agua(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de ÁGUA:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Fogo, Terra, Pedra</p>\n<p><b>DESVANTAGEM:</b> Elétrico, Planta</p>\n<p><b>IMUNIDADE:</b> N/A</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun aco(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de AÇO:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Fada, Gelo e Pedra</p>\n<p><b>DESVANTAGEM:</b> Fada, Gelo e Pedra</p>\n<p><b>IMUNIDADE:</b> Venenoso</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun dragao(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de DRAGÃO:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Dragão</p>\n<p><b>DESVANTAGEM:</b> Dragão, Fada e Gelo</p>\n<p><b>IMUNIDADE:</b> N/A</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun eletrico(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de ELÉTRICO:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Água e Voador</p>\n<p><b>DESVANTAGEM:</b> Terrestre</p>\n<p><b>IMUNIDADE:</b> N/A</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun fantasma(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de FANTASMA:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Fantasma e Psíquico</p>\n<p><b>DESVANTAGEM:</b> Sombrio e Fantasma</p>\n<p><b>IMUNIDADE:</b> Normal e Lutador</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun planta(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de PLANTA:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Terrestre, Pedra e Água</p>\n<p><b>DESVANTAGEM:</b> Inseto, Fogo, Voador, Gelo e Venenoso</p>\n<p><b>IMUNIDADE:</b> N/A</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun fogo(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de FOGO:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Inseto, Planta, Gelo e Aço</p>\n<p><b>DESVANTAGEM:</b> Pedra, Terrestre e Água</p>\n<p><b>IMUNIDADE:</b> N/A</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun gelo(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de GELO:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Dragão, Voador, Planta e Terrestre</p>\n<p><b>DESVANTAGEM:</b> Lutador, Fogo, Pedra e Aço</p>\n<p><b>IMUNIDADE:</b> N/A</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun inseto(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de INSETO:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Sombrio, Planta e Psíquico</p>\n<p><b>DESVANTAGEM:</b> Fogo, Voador e Pedra</p>\n<p><b>IMUNIDADE:</b> N/A</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun lutador(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de LUTADOR:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Sombrio, Gelo, Normal, Pedra e Aço</p>\n<p><b>DESVANTAGEM:</b> Fada, Voador e Psíquico</p>\n<p><b>IMUNIDADE:</b> N/A</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun normal(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de NORMAL:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> N/A</p>\n<p><b>DESVANTAGEM:</b> Lutador</p>\n<p><b>IMUNIDADE:</b> Fantasma</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun sombrio(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de NOTURNO:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Fantasma, Psíquico</p>\n<p><b>DESVANTAGEM:</b> Inseto, Fada e Lutador</p>\n<p><b>IMUNIDADE:</b> Psíquico</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun pedra(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de PEDRA:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Inseto, Fogo, Voador e Gelo</p>\n<p><b>DESVANTAGEM:</b> Lutador, Planta, Terrestre, Aço e Água</p>\n<p><b>IMUNIDADE:</b> N/A</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun psiquico(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de PSÍQUICO:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Lutador, Venenoso</p>\n<p><b>DESVANTAGEM:</b> Inseto, Sombrio e Fantasma</p>\n<p><b>IMUNIDADE:</b> N/A</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun terra(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de TERRA:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Elétrico, Fogo, Venenoso, Pedra e Aço</p>\n<p><b>DESVANTAGEM:</b> Gelo, Planta e Água</p>\n<p><b>IMUNIDADE:</b> Elétrico</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }

    fun voador(view: View){
        val builder = AlertDialog.Builder(this@TelaTipos)
        builder.setTitle("Vantagens e desvantagens de VOADOR:")
        builder.setMessage(HtmlCompat.fromHtml("<p><b>VANTAGEM:</b> Inseto, Lutador e Planta</p>\n<p><b>DESVANTAGEM:</b> Elétrico, Gelo e Pedra</p>\n<p><b>IMUNIDADE:</b> Terrestre</p>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        builder.setNegativeButton(android.R.string.ok, null)
        builder.create().show()
    }
}