import java.util.Random; 
public class MGen{
    public static Matrix createGaus(String s) {
        Random rand = new Random();
        boolean printDocs = true;
        int col = getDim(s)[1];
        int row = getDim(s)[0];
        Matrix matrix = createEN(s);
        
        for(int i=0;i<row*3;i++) {
            int a = rand.nextInt(10);
            
            if(a>=3) {
                int b;
                int c;
                do {
                    b = rand.nextInt(row);
                    c = rand.nextInt(row);
                } while(b==c);
                
                matrix.rowAdd(b, c);
                if(printDocs) {
                    System.out.println("Added "+(c+1) + " to " + (b+1));
                }
            }
            else {
                int b = rand.nextInt(row);
                int c = rand.nextInt(4)+2;
                matrix.rowMult(b, c);
                if(printDocs) {
                    System.out.println("Multiplied "+(b+1) + " with " + (c));
                }
            }
        }
        
        return matrix;
    }
    



    public static Matrix createEN(int x) {
        int[][] temp = new int[x][x];
        for(int i=0;i<x;i++) {
            temp[i][i]=1;
        }
        return new Matrix(temp);
    }
    public static Matrix createEN(String s) {
        int col = getDim(s)[0];
        int row = getDim(s)[1];
        int[][] matrix = new int[col][row];

        if(col>=row) {
            for(int i=0;i<row;i++) {
                matrix[i][i]=1;
            }
        }
        else {
            for(int i=0;i<col;i++) {
                matrix[i][i]=1;
            }
        }
        return new Matrix(matrix);
    }

    //getDim could be made more robust
    //getDim takes an Argument String e.g. "2x5" or "1x4"
    private static int[] getDim(String s) {
        int[] dim = new int[2];
        String[] splitString = s.split("x");
        dim[0] = Integer.parseInt(splitString[0]);
        dim[1] = Integer.parseInt(splitString[1]);
        return dim;
    }
}