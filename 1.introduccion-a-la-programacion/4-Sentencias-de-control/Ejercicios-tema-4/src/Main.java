//Enunciados del ejercicio:
//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
//
//Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile
// sea inferior a 3, el bloque de código que tendrá el bucle deberá:
//Incrementar el valor de la variable en uno cada vez que se ejecute.
//Mostrarlo por pantalla cada vez que se ejecute.
//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
//
//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable
// sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
//
//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
// Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
public class Main {
    public static void main(String[] args) {

        int numero = 0;
        if (numero > 0) {
            System.out.println("El numero " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("El numero " + numero + " es negativo");

        } else {
            System.out.println("EL numero es " + numero);
        }
        System.out.println("ejercicio con while");

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        System.out.println("ejercicio con do while " );


        int numeroDoWhile = 0;
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        }while (numeroDoWhile > 1);

        System.out.println("Ejercicio con For");

        for (  int numeroFor = 0; numeroFor <= 3 ; numeroFor = numeroFor + 1 ){
            System.out.println(numeroFor);

        }

        System.out.println("ejercicio con switch");

        String estacion = "VERANO";
        switch (estacion){

            case ("VERANO"):
                System.out.println("La estacion es " + estacion);
                break;
            case ("OTOÑO"):
                System.out.println("La estacion es " + estacion);
                break;
            case ("INVIERNO"):
                System.out.println("La estacion es " + estacion);
                break;
            case ("PRIMAVERA"):
                System.out.println("La estacion es " + estacion);
                break;
            default:
                System.out.println(estacion);


        }
    }
}