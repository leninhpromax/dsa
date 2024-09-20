
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.UF;


public class Unionfind {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        byte count = 0, count2 = 1;
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                count++;
            }
            if (count < N-1){
                count2 ++;
            }
        }
        if (count < N-1){
            System.out.println("FAILED");
        } else {
            System.out.println(count2);
        }
    }
}