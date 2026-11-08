package com.example.a2026_ii_uso_retrofit.data


class FotosMarteRepository {
    suspend fun getFotosMarte(): List<FotoMarte>{

        val response = FotoMarteAPIDataSource.servicio.getFotos()

        if (response.isSuccessful) {
            // regresar el resultado
            val listaFotos = response.body()?: emptyList()
            //Actualizar la vista
            return listaFotos
        }
        else {
            //Mensaje del error
            return emptyList()
        }

    }
}