# Ejercicio.  Uso de Retrofit

El ejercicio muestra el uso de *Retrofit* para consumir un servicio *API REST* sobre fotos de marte,
emplea el método *GET* para obtener la lista con las URL de las fotos en formato JSON, esta lista es 
mostrada en un control *RecycleView* y las fotos son leídas con *Glide*.  

La aplicación utiliza los controles: **RecycleView**, **ImageView**  y emplea las bibliotecas **Retrofit** 
con el converson *Gson* para el mapero de objetos JSON a objetos en Kotlin, también usa **Glide** para 
leer imágenes disponibles en el servicio web.




<div>
    <img src="./images/MainActivity1.png"  alt="Captura de pantalla de la activity principal con la lista de fotos de marte" width="200" >
</div>
<p>
<b>Figura 1.</b> Captura de pantalla de la Activity principal con la lista de fotos de marte
</p>



# Enlaces de referencias para la capa UI

1. [UI Layer] (https://developer.android.com/topic/architecture/ui-layer?hl=es-419) Descripción general de la capa UI
2. [ViewBinding] (https://developer.android.com/topic/libraries/view-binding?hl=es-419) Vinculación de vistas
3. [View Model] (https://developer.android.com/topic/libraries/architecture/views/viewmodel?hl=es-419) Descripción general de ViewModel
4. [LiveData] (https://developer.android.com/topic/libraries/architecture/livedata?hl=es-419) Descripción general LiveData

# Enlaces de referencias para la capa de Datos

1. [Data Layer] (https://developer.android.com/topic/architecture/data-layer?hl=es-419) Descripción general de la capa de datos
2. [Glide] (https://bumptech.github.io/glide/) Página principal de la biblioteca GLIDE para leer imágenes en Internet 
3. [Retrofit] (https://lysine.dev/retrofit/) Página principal de la biblioteca RETROFIT para consumir servicios API REST 
4. [Courutinas] (https://developer.android.com/kotlin/coroutines) Courutinas de Kotlin en Android 
