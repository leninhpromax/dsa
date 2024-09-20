public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2+3) + "bc");
        System.out.println("bc" + (2+3));
        System.out.println("bc" + 2 + 3);

    }
}

//System.out.println(2 + "bc"); in ra => 2bc
//System.out.println(2 + 3 + "bc"); in ra => 5bc
//System.out.println((2+3) + "bc"); in ra => 5bc
//System.out.println("bc" + (2+3)); in ra => bc5
//System.out.println("bc" + 2 + 3); in ra => bc23