/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {

	String NI;
        int X;
        NI = JOptionPane.showInputDialog("Ingrese Rango Inferior");
        X = Integer.parseInt(NI);
        String NF;
        int Y;
        NF = JOptionPane.showInputDialog("Ingrese Rango Superior");
        Y = Integer.parseInt(NF);
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