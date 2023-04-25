package com.example.pokedexprova

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedexprova.api.PokemonRepository

class TelaPokedex : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_pokedex)
        var botaoTipo: Button = findViewById<Button>(R.id.botaoTipos)
        botaoTipo.setOnClickListener({
            val teste = Intent(this@TelaPokedex, TelaTipos::class.java)
            startActivity(teste)
        })
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        Thread(Runnable {
            loadPokemons(recyclerView)
        }).start()
    }

    private fun loadPokemons(
        recyclerView: RecyclerView
    ) {
        val pokemonsApiResult = PokemonRepository.listPokemons()

        pokemonsApiResult?.results?.let {
            var number: Int = 1;
            val pokemons: List<Pokemon> = it.map { pokemonResult ->
                val pokemon = Pokemon(
                    "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/versions/generation-v/black-white/animated/$number.gif",
                    //"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/$number.png",
                    pokemonResult.name.capitalize()
                )
                number++
                pokemon
            }

            val layoutManager = GridLayoutManager(this, 2)

            recyclerView.post {
                recyclerView.layoutManager = layoutManager
                recyclerView.adapter = PokemonAdapter(pokemons)
            }
        }
    }

}