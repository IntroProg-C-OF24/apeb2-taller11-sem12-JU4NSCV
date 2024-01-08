import java.util.*;
public class Problema_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();        
        System.out.println("Ingrese filas para Matriz");
        int fila=sc.nextInt();
        System.out.println("Ingrese columnas para Matriz");
        int columna=sc.nextInt();
        int matriz[][]=new int[fila][columna];
        for(int i = 0 ; i<matriz.length ; i++){
            for (int j = 0; j < matriz[i].length ;j++){
                matriz[i][j] = ran.nextInt(10)+1;
            }
        }
        System.out.println("=============");
        NumerosPares(matriz);
        System.out.println("=============");
        NumerosImares(matriz);
        System.out.println("=============");
        PromedioMatriz(matriz, fila, columna);
        sc.close();
    }
    public static void NumerosPares(int matriz[][]){
        System.out.println("Numeros pares");
        for(int i = 0 ; i<matriz.length ; i++){
            for(int j = 0 ; j<matriz[i].length ; j++){
                if ((matriz[i][j]%2) == 0) {
                    System.out.print(matriz[i][j]+" ");
                }
            }
        }
         System.out.println();
    }
    public static void NumerosImares(int matriz[][]) {
        System.out.println("Numeros impares");
        for(int i = 0 ; i<matriz.length ; i++){
            for(int j = 0 ; j<matriz[i].length ; j++){
                if (!(matriz[i][j]%2==0)) {
                    System.out.print(matriz[i][j]+" ");
                }
            }
        }
        System.out.println();
    }

    public static void PromedioMatriz(int matriz[][], int fila, int columna) {
        double promedio=0;
        for(int i = 0 ; i<matriz.length ; i++){
            for (int j = 0; j < matriz[i].length ;j++){
                promedio += matriz[i][j];
            }
        }
        for(int i = 0 ; i<matriz.length ; i++){
            for (int j = 0; j < matriz[i].length ;j++){
                System.out.print(" ["+matriz[i][j]+"]");
            }
            System.out.println();
        }
        promedio /= fila+columna;
        System.out.println("El promedio de la matriz es: "+ promedio);
    }
    
}
