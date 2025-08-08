package pe.edu.vallegrande;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Auto y Motocicleta (Herencia)
        Vehiculo miAuto = new Auto("Toyota", "Corolla");
        Vehiculo miMoto = new Motocicleta("Yamaha", "MT-07");

        // Llamamos al método encender() (Polimorfismo en acción)
        miAuto.encender();
        miMoto.encender();
    }
}
