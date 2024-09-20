import edu.princeton.cs.algs4.*;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        In in = new In("C:\\New folder\\algs4-data\\2Kints.txt"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        // xử lý dữ liệu trong mảng a
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < a.length; i++){
            if (!newSet.contains(-a[i])){
                newSet.add(a[i]);
            } else {
                System.out.println(a[i] + " + " + (-a[i]));
            }
        }
    }
}
