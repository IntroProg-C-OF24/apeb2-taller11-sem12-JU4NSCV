import java.util.*;
public class Problema_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoja la operacion | 1. AREA CUADRADO | 2. AREA TRIANGULO | 3. AREA RECTANGULO");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese lado de cuadrado");
                double lad = sc.nextDouble();
                System.out.print("El area del cuadrado es: " + AreaCuadrado(lad));
                
            break;
            case 2:
                System.out.println("Ingrese base de triangualo");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura del triangualo");
                double altura = sc.nextDouble();
                System.out.print("El area del triangualo es: " + AreaTriangulo(base, altura));
            break;
            case 3:
                System.out.println("Ingrese base de rectangulo");
                base = sc.nextDouble();
                System.out.println("Ingrese la altura del rectangulo");
                altura = sc.nextDouble();
                System.out.print("El area del rectangulo es: " + AreaRectangulo(base, altura));
            break;
            default:System.out.println("Operacion Incorrecta");
                break;
        }
        sc.close();
    }
    public static double AreaCuadrado(double lad){
        double area;
        area = lad * lad * lad * lad;
        return area;
    }
    public static double AreaTriangulo(double base,double altura){
        double area;
        area = (base * altura)/2;
        return area;
    }
    public static double AreaRectangulo(double base,double altura){
        double area;
        area = base * altura;
        return area;
    }
}
