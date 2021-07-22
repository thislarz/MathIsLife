public class Matrix {

    public int[][] matrix;

    public Matrix(int[][] m) {
        matrix = m;
    }


    public Matrix add(Matrix A) {
        return A;
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