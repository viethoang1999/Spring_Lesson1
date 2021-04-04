package Spring_Lesson1.Thread12;

public class Main12 {
    public static void main(String[] args) {
        Thread12 mth = new Thread12("ABC", 3500);
        Thread12 mth1 = new Thread12("DEF", 2500);
        mth.start();
        mth1.start();
    }

}
