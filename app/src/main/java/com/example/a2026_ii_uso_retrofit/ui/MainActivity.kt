package com.example.a2026_ii_uso_retrofit.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a2026_ii_uso_retrofit.R
import com.example.a2026_ii_uso_retrofit.data.FotoMarte
import com.example.a2026_ii_uso_retrofit.data.FotosMarteRepository
import com.example.a2026_ii_uso_retrofit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val viewModel: FotosMarteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Se establece el viewBinding
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //Se inicia recycleView
        binding.rvFotos.layoutManager = LinearLayoutManager(this)
        binding.rvFotos.adapter = FotosMarteAdapter( emptyList() )

        //Crea el observador de la lista
        viewModel.listaFotosMarte.observe(this, { nuevaLista ->
            val adapter = FotosMarteAdapter( nuevaLista)
            binding.rvFotos.swapAdapter(adapter, false)

        })
    }

}