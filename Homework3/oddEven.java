/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
        int X;
        X = Integer.parseInt(args[0].toString());
        // si el numero es impar
        if (X % 2 != 0) {
                System.out.println("numero es impar");}
        // si el numero es par
        else {
            System.out.println("numero es par");}

   }
}