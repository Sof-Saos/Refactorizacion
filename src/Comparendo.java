public class Comparendo {

    public Comparendo() {
    }

    public void construirFotoMulta(int velocidad, Vehiculo vehiculo) {
        int costePorAdquisicion = calcularComparendo(velocidad, vehiculo);
        String cuerpoMensajeCorreo = enviarCorreoFotomulta(vehiculo);

        if (costePorAdquisicion == -1) {
            System.out.println("No hay cálculo para el tipo de vehículo " + vehiculo.getClass().getName() + ". Correo: " + cuerpoMensajeCorreo);
        } else {
            System.out.println("Tipo de comparendo: " + costePorAdquisicion + "\nCorreo: " + cuerpoMensajeCorreo);
            System.out.println();
        }
    }

    public int calcularComparendo(int velocidad, Vehiculo vehiculo) {
        if (velocidad <= vehiculo.getLimiteInferior()) {
            return 0;
        } else if (velocidad >= vehiculo.getLimiteInferiorIntermedio() && velocidad <= vehiculo.getLimiteSuperior()) {
            return 1;
        }
        return 2;
    }

    public String enviarCorreoFotomulta(Vehiculo vehiculo) {
        if (vehiculo instanceof Camion ||  vehiculo instanceof Carro || vehiculo instanceof Mula) {
            String cuerpoMensaje = " | Cuerpo: Enviando correo para el vehiculo de tipo " + vehiculo.getClass().getName();
            String asunto = "Asunto: comparendo " + vehiculo.getClass().getName();
            return asunto + cuerpoMensaje;
        } else {
            return " Enviando correo con vehiculo desconocido";
        }
    }
}

