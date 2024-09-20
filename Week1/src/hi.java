public class hi {
    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[0]);
        System.out.println(". How are you?");
        }

}

// bài 4
// java Hi: lỗi. Tẻminal đưa ra: Hi, Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
// java Hi @!&^%: in ra "Hi, @!. How are you?" còn báo lỗi không nhận diện được những kí tự sau
// java Hi 1234: Hi, 1234. How are you?
// java Hi.class Bob: lỗi không in ra do không có hi
// java Hi.java Bob: lỗi
// java Hi Alice Bob: in ra Hi, Alice. How are you?