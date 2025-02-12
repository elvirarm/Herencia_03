interface EncendidoApagado {

    var encendido: Boolean

    fun encender(){
        encendido = true
    }

    fun apagar(){

        encendido = false

    }
}