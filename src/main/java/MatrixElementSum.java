public class MatrixElementSum {
    public static void main(String[] args) {

    }
    int solution(int[][] matrix) {

        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    for(int k = i; k < matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                }
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
