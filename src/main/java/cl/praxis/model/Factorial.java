package cl.praxis.model;

public class Factorial {

    public static int calcularFactorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

