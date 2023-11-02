public class Matriz {
    private int numero;
    private int fila;
    private int columna;

    public Matriz() {
    }

    public Matriz(int numero, int fila, int columna) {
        this.numero = numero;
        this.fila = fila;
        this.columna = columna;
    }

    public int[][] GenararMatriz(int numero, int fila, int columna){
        //Creacion de la matriz 5x5
        int[][] matriz = new int[5][5];
        //Se llena la matriz con cero para la visualizacion
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = 0;
            }
        }
        //Ubicacion de numero en la posicion deseada
        matriz[fila - 1][columna - 1] = numero;
        //Se generan los secuenciales en forma horizontal y vertical
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == fila-1){
                    matriz[i][j] = numero + Math.abs((columna-1) - j);
                }
                if (j == columna-1){
                    matriz[i][j] = numero + Math.abs((fila-1) - i);
                }
            }
        }
        return matriz;
    }

    public void VisualizarMatriz(int[][] matriz){
        //Visualizacion de la matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }




}
