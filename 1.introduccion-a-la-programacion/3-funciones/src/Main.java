//Primera parte:
//Crear una función con tres parámetros que sean números que se suman entre sí.
//Llamar a la función en el main y darle valores.
public class Main {
    public static void main(String[] args) {
        //primera parte
        //se inicializa la variable
        int resultado;
        //el resultado de la funcion se guarda en la variable y se muestra el resultado
        resultado = suma(10,15,5);
        System.out.println("El resultado de la suma es " + resultado);

        //se crea el objecto miCoche y se le añade una puerta
        Coche miCoche = new Coche();
        miCoche.aumentarPuerta();
        System.out.println("El coche tiene" + miCoche.puerta + "puertas");

    }
    //creacion de la funcion que suma los 3 parametros
    static int suma(int a, int b, int c) {
        return a + b+ c;
    }
}

//Segunda parte:
//Crear una clase coche.
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//Una función que incremente el número de puertas que tiene el coche.
//Crear un objeto miCoche en el main y añadirle una puerta.
//Mostrar el número de puertas que tiene el objeto.

//creacion de la clase "Coche", con una variable que indica la
//cantidad de puertas y un metodo que aumenta la cantidad de las puertas
class Coche{
    int puerta =4;
    public void aumentarPuerta(){
        this.puerta++;
    }
}