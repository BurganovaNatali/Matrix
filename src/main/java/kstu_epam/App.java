package kstu_epam;

public class App {

    int n = 3; //количество строк матрицы А
    int m = 2; //количество столбцов/строк матрицы А/B
    int l = 3; //l - количество столбцов матрицы B
    //сами матрицы
    int i, j, k;
    int[][] A;
    int[][] B;
    int[][] C;

    public void mA() { //заполнение А
        A = new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                A[i][j] = (int) (Math.random() * 20);
            }
        }
    }

    public void mvA(){ //вывод А
        System.out.println("Матрица А:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(A[i][j] + (j == m - 1 ? "\n" : "\t"));
            }

        }
    }

        public void mB() { //заполнение В
            B = new int[m][l];
            for (i = 0; i < m; i++) {
                for (j = 0; j < l; j++) {
                    B[i][j] = (int) (Math.random() * 20);
                }
            }
        }

        public void mvB() { //вывод В
            System.out.println("Матрица B:");
            for (i = 0; i < m; i++) {
                for (j = 0; j < l; j++) {
                    System.out.print(B[i][j] + (j == l - 1 ? "\n" : "\t"));
                }
            }
        }

         public void mC() { //произведение А и В
                C = new int[n][l];
                System.out.println("Произведение матриц A и B:");
                for (i = 0; i < n; i++) {
                    for (j = 0; j < l; j++) {
                        for (k = 0; k < m; k++) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                        System.out.print(C[i][j] + (j == l - 1 ? "\n" : "\t"));
                    }

                }
            }
        }