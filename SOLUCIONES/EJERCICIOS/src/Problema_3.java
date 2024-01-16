import java.util.*;
public class Problema_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE NOTA DEL PRIMER PARCIAL");
        double nota1= sc.nextDouble();
        System.out.println("INGRESE NOTA DEL SEGUNDO PARCIAL");
        double nota2=sc.nextDouble();
        System.out.println("INGRESE NOTA DEL TERCER PARCIAL");
        double nota3=sc.nextDouble();
        System.out.println("INGRESE NOTA DEL EXAMEN QUIMESTRAL");      
        double examen=sc.nextDouble();
        double total = Promedio(nota1, nota2, nota3, examen);
        if (total <=5) {
            System.out.println("PROMEDIO CUALITATIVO ES REGULAR => " + total);
        }else if (total<=8) {
            System.out.println("PROMEDIO CUALITATIVO ES BUENO => " + total);
        }else if (total<=9) {
            System.out.println("PROMEDIO CUALITATIVO ES MUY BUENO => " + total);
        }else if (total<=10) {
            System.out.println("PROMEDIO CUALITATIVO ES SOBRESALIENTE => " + total);
        }
        sc.close();
    }
    public static double Promedio(double nota1,double nota2,double nota3, double examen){
        double  promedio;
        promedio = ((nota1 + nota2 + nota3)/3)*0.8;
        promedio += examen * 0.2;
        return promedio;
    }
}
