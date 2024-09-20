public class Exercise8 {
    //Quadratic.java
        public static void main(String[] args) {
            double b = Double.parseDouble(args[0]);
            double c = Double.parseDouble(args[1]);
            double discriminant = b*b - 4.0*c;
            double sqroot = Math.sqrt(discriminant);
            double root1 = (-b + sqroot) / 2.0;
            double root2 = (-b - sqroot) / 2.0;
            System.out.println(root1);
            System.out.println(root2);
        }
}

// đây là phương trình tính ra nghiệm của phương trình: x^2 + bx + c = 0
// nếu muốn tính căn bậc 2 cảu 1 số thì ta sẽ cho b = 0 thì phương trình sẽ trở thành x^2 = -c
