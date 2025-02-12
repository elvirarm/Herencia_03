class Telefono(val marca: String,
               val modelo: String):DispositivoElectronico, EncendidoApagado {

    override fun reiniciar() {
        println("El teléfono se está reiniciando")
    }

    override fun apagar() {
        println("El teléfono está apagado")
    }

    override fun encender() {
        println("El teléfono está encendido")

    }

}