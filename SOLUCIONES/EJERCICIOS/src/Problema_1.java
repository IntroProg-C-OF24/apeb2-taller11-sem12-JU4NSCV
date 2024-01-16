import java.util.*;
public class Problema_1 {
    static String pares=" ";
    static String impares=" ";
    static double promedio=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese filas para Matriz");
        int fila=sc.nextInt();
        System.out.println("Ingrese columnas para Matriz");
        int columna=sc.nextInt();
        int matriz[][]=new int[fila][columna];
        LlenadoMatriz(matriz);
        System.out.println("=============");
        System.out.println("Numeros pares");
        NumerosPares(matriz);
        System.out.println(pares);
        System.out.println("=============");
        System.out.println("Numeros impares");
        NumerosImares(matriz);
        System.out.println(impares);
        System.out.println("=============");
        for(int i = 0 ; i<matriz.length ; i++){
            for (int j = 0; j < matriz[i].length ;j++){
                System.out.print(" ["+matriz[i][j]+"]");
            }
            System.out.println();
        }
        PromedioMatriz(matriz, fila, columna);
        System.out.println("El promedio de la matriz es: " + promedio);
        sc.close();
    }

    public static void LlenadoMatriz(int matriz[][]){
        Random ran = new Random();  
        for(int i = 0 ; i<matriz.length ; i++){
            for (int j = 0; j < matriz[i].length ;j++){
                matriz[i][j] = ran.nextInt(10)+1;
            }
        }
    }

    public static void NumerosPares(int matriz[][]){
        for(int i = 0 ; i<matriz.length ; i++){
            for(int j = 0 ; j<matriz[i].length ; j++){
                if ((matriz[i][j]%2) == 0) {
                    pares += matriz[i][j]+" ";
                }
            }
        }
    }

    public static void NumerosImares(int matriz[][]) {
        for(int i = 0 ; i<matriz.length ; i++){
            for(int j = 0 ; j<matriz[i].length ; j++){
                if (!(matriz[i][j]%2==0)) {
                    impares += matriz[i][j]+" ";
                }
            }
        }
    }

    public static void PromedioMatriz(int matriz[][], int fila, int columna) {
        for(int i = 0 ; i<matriz.length ; i++){
            for (int j = 0; j < matriz[i].length ;j++){
                promedio += matriz[i][j];
            }
        }
        promedio /= fila+columna;
    }
    
}
