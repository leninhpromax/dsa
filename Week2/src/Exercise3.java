public class Exercise3 {
    public static void main(String[] args) {
        boolean a = true,b = true;
        //boolean a = true,b = false;
        //boolean a = false,b = true;
        //boolean a = false,b = false;
        boolean c = (!(a && b) && (a ||  b)) || ((a && b) || !(a || b));
        System.out.println(c);
    }
}

//theo kết quả chương trình thì nó luôn cho kết quả là "true"
// chứng minh theo biểu thức logic toán
// ta có: !(a&&b)=¬a∣∣¬b hay !(a&&b)=¬a∣∣¬b <=> ((¬a∣∣¬b)&&a)∣∣((¬a∣∣¬b)&&b)
// ta lại có: