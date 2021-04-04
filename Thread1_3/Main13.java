package Spring_Lesson1.Thread1_3;

public class Main13 {
    public static void main(String[] args) {
        GenNumber genNumber = new GenNumber();
        CheckNumber checkNumber = new CheckNumber();
        genNumber.start();
        checkNumber.start();
    }
}
