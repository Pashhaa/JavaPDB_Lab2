public class MatrixManipulator {
    public static int manipulate(){
        char [][] matrix = {{12, 11 ,10},
                {15, 25, 36},
                {24, 14, 18}};

        char[][] trMatrix = new char[3][3];

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print((int)matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n" + "Transponed matrix:");
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                trMatrix [i][j] = matrix[j][i];
            }
        }
        for (int i = 0; i < trMatrix.length; i++) {
            for (int j = 0; j < trMatrix[i].length; j++) {
                System.out.print((int)trMatrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        int max = 0;
        for (int i = 0; i < trMatrix.length; i++) {
            for (int j = 0; j < trMatrix[i].length; j++) {
                if ((int)trMatrix[i][j]>max){
                    max = (int)trMatrix[i][j];
                }
            }
            sum+=max;
        }
        return sum;
    }

}


