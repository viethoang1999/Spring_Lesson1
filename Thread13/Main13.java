package Thread.Thread13;

public class Main13 extends Thread {
    public static void main(String[] args) {
        GenNumber genNumber = new GenNumber();
        CheckNumber checkNumber = new CheckNumber();
        genNumber.start();
        checkNumber.start();
    }
}
