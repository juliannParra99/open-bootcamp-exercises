//Enunciado del ejercicio
//
//Cree una clase Persona con las siguientes variables:
//edad
//nombre
//telefono
//
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable
// credito solo para esa clase.
//
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito,
// tienes que darles valor y mostrarlas por pantalla.
//
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo
// tenga la clase Trabajador.

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 23;
        cliente.nombre = "Ryan Rey.";
        cliente.telefono = 2020444;
        cliente.credito = "Diponible";

        System.out.println("La edad es "+ cliente.edad);
        System.out.println("El nombre del cliente es: " + cliente.nombre);
        System.out.println("El telefono es " + cliente.telefono);
        System.out.println("Credito: " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 24;
        trabajador.nombre = "Jhon Doe.";
        trabajador.telefono = 50509999;
        trabajador.salario = 300000;

        System.out.println("La edad es "+ trabajador.edad);
        System.out.println("El nombre del cliente es: " + trabajador.nombre);
        System.out.println("El telefono es " + trabajador.telefono);
        System.out.println("El salario es " + trabajador.salario);

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    String credito;

}
//final para que el contenido del cuerpo de la clase no se pueda heredar a otras
final class Trabajador extends Persona{
    int salario;
}

