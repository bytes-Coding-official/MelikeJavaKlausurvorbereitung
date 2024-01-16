package probeklausur;

public class Matrix {

    public static void main(String[] args) {

    }


    public boolean quadratischeMatrix(int[][] matrix) {

        if (matrix.length != matrix[0].length)
            return false;

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[0].length; i++) {
                if (i == j && matrix[i][j] != 1) {
                    return false;
                } else if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }


    public int[][] doppelteMatrix(int[][] matrix) {
        int[][] neue_matrix = new int[matrix.length * 2][matrix[0].length * 2];

        //Weiß
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, neue_matrix[i], 0, matrix[0].length);
        }
        //grün
        for (int i = matrix.length; i < neue_matrix[0].length; i++) {
            if (neue_matrix[0].length - matrix.length >= 0) System.arraycopy(matrix[i - matrix.length], matrix.length - matrix.length, neue_matrix[i], matrix.length, neue_matrix[0].length - matrix.length);
        }
        //gelb
        for (int i = 0; i < matrix.length; i++) {
            if (neue_matrix[0].length - matrix.length >= 0) System.arraycopy(matrix[i], matrix.length - matrix.length, neue_matrix[i], matrix.length, neue_matrix[0].length - matrix.length);
        }
        //blau
        for (int i = matrix.length; i < neue_matrix[0].length; i++) {
            System.arraycopy(matrix[i - matrix.length], 0, neue_matrix[i], 0, matrix.length);
        }
        return neue_matrix;
    }
}
