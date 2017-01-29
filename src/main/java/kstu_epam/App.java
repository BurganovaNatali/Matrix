package kstu_epam;

public class App {

    private static final int N = 3; //количество строк матрицы А
    private static final int M = 2; //количество столбцов/строк матрицы А/B
    private static final int L = 3; //l - количество столбцов матрицы B
    private String g = "Матрица А:";
    private String o = "Матрица B:";
    //сами матрицы

    int[][] a;
    int[][] b;


    public int[][] fillMatrixA() { //заполнение А
        a = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = (int) (Math.random() * 20);
            }
        }
        return a;
    }

    public void showMatrixA() { //вывод А
        System.out.println(g);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(a[i][j] + (j == M - 1 ? "\n" : "\t"));


            }
        }
    }

        public int[][] fillMatrixB() { //заполнение В
            b = new int[M][L];
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < L; j++) {
                    b[i][j] = (int) (Math.random() * 20);
                }
            }
            return b;
        }

        public void showMatrixB() { //вывод В
            System.out.println(o);
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < L; j++) {
                    System.out.print(b[i][j] + (j == L - 1 ? "\n" : "\t"));
                }
            }
        }

        }