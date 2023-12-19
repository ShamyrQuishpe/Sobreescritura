// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Perro perro = new Perro();
        Gato gato = new Gato();
        animal.hacerSonido();
        perro.hacerSonido();
        gato.hacerSonido();
||
        Vehiculo vehiculo = new Vehiculo();
        Coche coche = new Coche();
        Bicicleta bicicleta = new Bicicleta();
        Avion avion = new Avion();

        vehiculo.acelerar();
        coche.acelerar();
        bicicleta.acelerar();
        avion.acelerar();
    }
}