/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero mayor a cero, imprima el valor actual desde cero hasta antes de llegar dado valor.

*/

public class whileValue {   

   public static void main(String[] args) {
   	String NF;
        int Y;
        NF = JOptionPane.showInputDialog("Ingrese un valor");
        Y = Integer.parseInt(NF);
        int V = 0;
        while (V != Y) {
        System.out.println("El Valor Actual Es:" + V);
        V++;
        }
      
   }

}