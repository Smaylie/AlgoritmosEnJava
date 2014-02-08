/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {

        int X;
        X = Integer.parseInt(args[0].toString());
        int Y;
        Y = Integer.parseInt(args[1].toString());
        int P = X;
        while (X != Y) {     
            if (P == X) {
                X++;
            } else {
            System.out.println(X);
            X++;
        }}
      
   }

}