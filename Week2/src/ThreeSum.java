import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        //In in = new In("C:\\New folder\\algs4-data\\1Kints.txt"); // tạo luồng đọc từ file
        //In in = new In("C:\\New folder\\algs4-data\\2Kints.txt"); // tạo luồng đọc từ file
        //In in = new In("C:\\New folder\\algs4-data\\4Kints.txt"); // tạo luồng đọc từ file
        In in = new In("C:\\New folder\\algs4-data\\8Kints.txt"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        Arrays.sort(a);
        int count = 0;
        for (int i = 0; i < a.length - 2; i++) {
            int l = i + 1;
            int r = a.length - 1;
            while (l < r){
                if (a[i] + a[l] + a[r] == 0){
                    System.out.println(a[i] + " + " + a[l] + " + " + a[r] + "== 0");
                    count ++;
                    r--;
                    l++;
                } else if (a[i] + a[l] + a[r] < 0){
                    l++;
                } else if (a[i] + a[l] + a[r] > 0){
                    r--;
                }
            }
        }
        System.out.println("count : " + count);
    }
}
