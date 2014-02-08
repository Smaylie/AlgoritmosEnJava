/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   	
	int resultado = 1;
        String NF;
        int X;
        NF = JOptionPane.showInputDialog("Ingrese un número");
        X = Integer.parseInt(NF);
        for (int Px = 1; Px <= X; Px++) {
            resultado = resultado * Px;
        }
        System.out.println("el producto es: "+resultado);
      
   }

}