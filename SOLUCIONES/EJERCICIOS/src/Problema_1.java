import java.util.*;
public class Problema_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumerosPares();
        System.out.println("=============");
        NumerosImares();
        System.out.println("=============");
        System.out.println("Ingrese filas para Matriz");
        int fila=sc.nextInt();
        System.out.println("Ingrese columnas para Matriz");
        int columna=sc.nextInt();
        int matriz[][]=new int[fila][columna];
        PromedioMatriz(matriz, fila, columna);
        sc.close();
    }
    public static void NumerosPares(){
        System.out.println("Numeros pares");
        int limite = 10;
        for(int i=2; i<=limite*2 ; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void NumerosImares() {
        System.out.println("Numeros impares");
        int limite = 10;
        for(int i=1; i<=limite*2 ; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void PromedioMatriz(int matriz[][], int fila, int columna) {
        Random ran = new Random();
        double promedio=0;
        for(int i = 0 ; i<matriz.length ; i++){
            for (int j = 0; j < matriz[i].length ;j++){
                matriz[i][j] = ran.nextInt(10)+1;
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
