class Coche: EncendidoApagado, Vehiculo {

    override var kmHora = 0.0
        set(value){
            if (value < 0){
                field = 0.0
            }else{
                field = value
            }
        }

    override var motorEncendido = false


    override fun encender(){
        println("El coche está encendido")
        motorEncendido = true
    }

    override fun apagar(){
        println("El coche está apagado")
        motorEncendido = false
    }

    override fun acelerar(valor: Int) {
        if (motorEncendido) {
            kmHora += valor
            println("El coche está acelerando. Velocidad actual: $kmHora km/hora.")
        } else {
            println("El motor está apagado")
        }
    }

    override fun frenar(valor: Int) {
        if(motorEncendido){
            kmHora -= valor
            println("El coche está frenando. Velocidad actual: $kmHora km/hora.")
        } else{
            println("El motor está apagado")
        }
    }


}

