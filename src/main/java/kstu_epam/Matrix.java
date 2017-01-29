package kstu_epam;

public class Matrix {
    public static void main(String[] args) {
        App a = new App();
        a.fillMatrixA();
        a.showMatrixA();
        System.out.println();
        a.fillMatrixB();
        a.showMatrixB();
        System.out.println();
        UmnojMatrix b = new UmnojMatrix();
        b.multiplication();
        System.out.println();

    }
}
