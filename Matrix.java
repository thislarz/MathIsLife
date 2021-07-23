public class Matrix {

    public int[][] matrix;
    
    public Matrix() {
        matrix = new int[0][0];
    }
    public Matrix(int[][] m) {
        matrix = m;
    }

    
    public Matrix add(Matrix A) {
        try{
            if(getCol()==A.getCol() && getRow()==A.getRow()) {
                Matrix temp = new Matrix(matrix);
                for(int x = 0; x<matrix.length;x++) {
                    for(int y = 0; y<matrix[0].length;y++) {
                        temp.matrix[x][y]+=A.matrix[x][y];
                    }
                }
                return temp;
            }
            throw new ArithmeticException("Matrix not the same size!");
        }
        catch(Exception e) {
            System.out.println(e);
            return(new Matrix());
        }
    }

    public void rowAdd(int r1, int r2) {
        for(int i=0; i<matrix[r1].length;i++) {
            matrix[r1][i]+=matrix[r2][i];
        }
    }
    public void rowMult(int r1, int a) {
        for(int i=0; i<matrix[r1].length;i++) {
            matrix[r1][i]*=a;
        }
    }

    public int getRow() {
        try{
            return matrix.length;
        }
        catch(Exception e) {
            return 0;
        }
    }
    public int getCol() {
        try{
            return matrix[0].length;
        }
        catch(Exception e) {
            return 0;
        }
    }
    public boolean isSquare() {
        return getCol()==getRow();
    }
    public String toString() {
        String temp = "[";
        for(int x=0;x<matrix.length;x++) {
            temp += "[";
            for(int y=0;y<matrix[0].length;y++) {
                if(y<matrix[0].length-1)
                    temp += matrix[x][y] + ",";
                else
                    temp += matrix[x][y];
            }
            temp += "]";
            if(x<matrix.length-1)
                temp +=",";
        }
        temp += "]";
        return temp;
    }
}