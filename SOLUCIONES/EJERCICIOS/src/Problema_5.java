import java.util.*;
public class Problema_5 {
    public static void main(String[] args) {
        int[][] factor1, factor2, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE OPERACION | 1. SUMA | 2. RESTA | 3. MULTIPLICACION |");
        int op = sc.nextInt();
        System.out.println("Ingrese tamaño para la martriz");
        int tam = sc.nextInt();
        factor1=new int[tam][tam];
        factor2=new int[tam][tam];
        resultado=new int[tam][tam];
        for(int i = 0; i < factor1.length; i++){
            for(int j = 0; j < factor1[i].length; j++){
                factor1[i][j]=NumeroAletorio();
                factor2[i][j]=NumeroAletorio();
            }
        }
        switch (op) {
            case 1:
                System.out.println("SUMA DE MATRIZES");
                System.out.println("PIMERA MATIZ");
                for (int i = 0; i < factor1.length; i++) {
                    for (int j = 0; j < factor1[i].length; j++)
                        System.out.print(" ["+factor1[i][j]+"] ");
                    System.out.println();
                }
                System.out.println("SEGUNDA MATRIZ");
                for (int i = 0; i < factor2.length; i++) {
                    for (int j = 0; j < factor2[i].length; j++)
                        System.out.print(" ["+factor2[i][j]+"] ");
                    System.out.println();
                }
                System.out.println("resultado");
                SumaDeMatrizes(factor1, factor2, resultado);
                for (int i = 0; i < resultado.length; i++) {
                    for (int j = 0; j < resultado[i].length; j++)
                        System.out.print(" ["+resultado[i][j]+"] ");
                    System.out.println();
                }
            break;
            case 2:
                System.out.println("RESTA DE MATRIZES");
                System.out.println("PIMERA MATIZ");
                for (int i = 0; i < factor1.length; i++) {
                    for (int j = 0; j < factor1[i].length; j++)
                        System.out.print(" ["+factor1[i][j]+"] ");
                    System.out.println();
                }
                System.out.println("SEGUNDA MATRIZ");
                for (int i = 0; i < factor2.length; i++) {
                    for (int j = 0; j < factor2[i].length; j++)
                        System.out.print(" ["+factor2[i][j]+"] ");
                    System.out.println();
                }
                System.out.println("RESULTADO");
                RestaDeMatrizes(factor1, factor2, resultado);
                for (int i = 0; i < resultado.length; i++) {
                    for (int j = 0; j < resultado[i].length; j++)
                        System.out.print(" ["+resultado[i][j]+"] ");
                    System.out.println();
                }
            break;
            case 3:
                System.out.println("MULTIPLICACION DE MATRIZES");
                System.out.println("PIMERA MATIZ");
                for (int i = 0; i < factor1.length; i++) {
                    for (int j = 0; j < factor1[i].length; j++)
                        System.out.print(" ["+factor1[i][j]+"] ");
                    System.out.println();
                }
                System.out.println("SEGUNDA MATRIZ");
                for (int i = 0; i < factor2.length; i++) {
                    for (int j = 0; j < factor2[i].length; j++)
                        System.out.print(" ["+factor2[i][j]+"] ");
                    System.out.println();
                }
                System.out.println("RESULTADO");
                MultiplicacionDeMatrizes(factor1, factor2, resultado);
                for (int i = 0; i < resultado.length; i++) {
                    for (int j = 0; j < resultado[i].length; j++)
                        System.out.print(" ["+resultado[i][j]+"] ");
                    System.out.println();
                }
            break;
        }
        sc.close();
    }

    public static void SumaDeMatrizes(int matriz[][], int matriz1[][] , int resultado[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i][j] = matriz[i][j] + matriz1[i][j];
            }
        }
    }
    public static void RestaDeMatrizes(int matriz[][], int matriz1[][] , int resultado[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i][j] = matriz[i][j] - matriz1[i][j];
            }
        }
    }
    public static void MultiplicacionDeMatrizes(int matriz[][], int matriz1[][] , int resultado[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    resultado[i][j] += matriz[i][k] * matriz1[k][j];
                }
            }
        }
    }
    public static int NumeroAletorio(){
        Random ran = new Random();
        int r;
        r=ran.nextInt(10)+1;
        return r;
    }
}
