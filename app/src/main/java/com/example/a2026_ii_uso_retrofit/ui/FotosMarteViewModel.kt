package com.example.a2026_ii_uso_retrofit.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.a2026_ii_uso_retrofit.data.FotoMarte
import com.example.a2026_ii_uso_retrofit.data.FotosMarteRepository
import kotlinx.coroutines.launch

class FotosMarteViewModel: ViewModel() {
    private val _listaFotosMarte = MutableLiveData<List<FotoMarte>>()
    val listaFotosMarte: LiveData<List<FotoMarte>> get() = _listaFotosMarte

    init {
        viewModelScope.launch {
            try {
                _listaFotosMarte.postValue(
                    FotosMarteRepository().getFotosMarte() ?: emptyList<FotoMarte>()
                )
            } catch (err: Exception)
            {
                Log.e("ERROR_RETROFIT", "Error retrofit: " + err.message)
            }


        }
    }
}