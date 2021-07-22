
public class GUI {
    public static void main(String[] args) {
        int[][] m = {{1,2,3},{4,5,6}};
        int[][] n = {{6,7,8},{6,6,6},{2,3,1}};
        Matrix M = new Matrix(m);
        Matrix N = new Matrix(n);
        System.out.println(M.isSquare());
    }
}