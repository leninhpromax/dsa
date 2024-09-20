import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        double a = sr.nextDouble();
        double x = Math.cos(a) * Math.cos(a) + Math.sin(a) * Math.sin(a);
        if ( x == 1.0 ){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println(x);
        sr.close();

    }
}

//Tại sao kết quả không phải lúc nào cũng chính xác bằng 1?? Vì máy tính có giới hạn tài nguyên
// cho từng biến nên khi tính ra cos hoặc sin thì máy tính sẽ tính đến giá trị gần nhất để không
// bị tràn bộ nhớ do đó thì khi cộng lại sẽ xảy ra sai số