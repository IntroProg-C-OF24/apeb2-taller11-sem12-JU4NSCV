import java.util.*;

public class Problema_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("Ingrese nombre del usuario");
        String nombre = sc.next();
        System.out.println("Ingrese cedula");
        int ced = sc.nextInt();
        do {
            System.out.println("Seleccione | 1. Plantilla de luz | 2. Valor de inmueble | 3. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("PLANTILLA DE LUZ");
                    System.out.println("Ingrese costo del kilovatio");
                    double costokv = sc.nextDouble();
                    System.out.println("Ingrese los kilovatios al mes");
                    double numkv = sc.nextDouble();
                    CalculoKilovatio(nombre, ced, costokv, numkv);
                    break;
                case 2:
                    System.out.println("IMPUESTO AL PREDIO");
                    System.out.println("Ingrese el precio del inmuble");
                    double precio = sc.nextDouble();
                    CostoInmueble(nombre, ced, precio);
                    break;
            }
        } while (op != 3);
        sc.close();
    }

    public static void CalculoKilovatio(String nombre, int ced, double costokv, double numkv) {
        double plantilla = costokv * numkv;
        System.out.println("Cliente " + nombre + " con cédula " + ced + " debe cancelar el valor de $" + plantilla);
    }

    public static void CostoInmueble(String nombre, int ced, double precio) {
        double predio = precio * 0.02;
        System.out.println("Cliente " + nombre + " con cédula " + ced + " tiene un bien inmueble valorado en $" + precio
                + " y tiene que pagar de predio $" + predio);
    }
}
