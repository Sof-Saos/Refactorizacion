public class Main {

    public static void main(String[] args) {
        //Objetos instanciados de los tipos de vehiculos
        Carro carrito = new Carro();
        Mula mulita = new Mula();
        Camion camioncito = new Camion();

        Comparendo comparendo =  new Comparendo();

        //Llamamos a construir foto multa
        comparendo.construirFotoMulta(80, carrito);
        comparendo.construirFotoMulta(200, mulita);
        comparendo.construirFotoMulta(78, camioncito);
    }
}