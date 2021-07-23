
public class GUI {
    public static void main(String[] args) {
        int[][] m = {{1,2,3},{4,5,6}};
        int[][] m2 = {{1,1,1},{1,1,1}};
        int[][] n = {{6,7,8},{6,6,6},{2,3,1}};
        Matrix M = new Matrix(m);
        Matrix N = new Matrix(n);
        Matrix V = MGen.createEN("4x2");
        //System.out.println(V);
        System.out.println(MGen.createGaus("4x5"));
    }
}