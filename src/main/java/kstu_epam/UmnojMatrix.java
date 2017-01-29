package kstu_epam;


public class UmnojMatrix {
    int[][] c;
    private static final int N = 3; //количество строк матрицы А
    private static final int M = 2; //количество столбцов/строк матрицы А/B
    private static final int L = 3; //l - количество столбцов матрицы B
    private int [][] matrixA;
    private int [][] matrixB;
    private String h = "Произведение матриц A и B:";

    public void multiplication() { //произведение А и В
        c = new int[N][L];
        App d = new App();
        d.fillMatrixA();
        d.fillMatrixB();
        matrixA = d.fillMatrixA();
        matrixB = d.fillMatrixB();

        System.out.println(h);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < L; j++) {
                for (int k = 0; k < M; k++) {
                    c[i][j] += matrixA[i][k] * matrixB[k][j] ;
                }
                System.out.print(c[i][j] + (j == L - 1 ? "\n" : "\t"));
            }

        }
    }
}