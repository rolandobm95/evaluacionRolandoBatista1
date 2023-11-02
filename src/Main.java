import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Se instancia la clase matriz
        Matriz matriz = new Matriz();

        int numero = 0;
        int fila = 0;
        int columna = 0;

        //Validacion y entrada de datos
        do {
            System.out.print("Ingrese el numero entero que desea posicionar en la matriz: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                break;
            } else {
                System.out.println("Entrada no es un valor válido.");
                scanner.next(); // Limpiar el búfer de entrada para evitar un bucle infinito
            }
        }while(true);
        do {
            System.out.print("Ingrese la fila donde desea posicionar el numero: ");
            if (scanner.hasNextInt()) {
                fila = scanner.nextInt();
                if (fila >= 1 && fila <= 5){
                    break;
                } else {
                    System.out.println("El numero de fila debe estar entre 1 y 5");
                }
            } else {
                System.out.println("Entrada no es un valor válido.");
                scanner.next(); // Limpiar el búfer de entrada para evitar un bucle infinito
            }
        }while(true);
        do {
            System.out.print("Ingrese la columna donde desea posicionar el numero: ");
            if (scanner.hasNextInt()) {
                columna = scanner.nextInt();
                if (columna >= 1 && columna <= 5){
                    break;
                } else {
                    System.out.println("El numero de columna debe estar entre 1 y 5");
                }
            } else {
                System.out.println("Entrada no es un valor válido.");
                scanner.next(); // Limpiar el búfer de entrada para evitar un bucle infinito
            }
        }while(true);

        //Se almacena la matriz resultante para visualizarla
        int[][]M1 = matriz.GenararMatriz(numero, fila, columna);
        matriz.VisualizarMatriz(M1);

    }
}