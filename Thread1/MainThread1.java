package Spring_Lesson1.Thread1;

public class MainThread1 {
    public static void main(String[] args) {
            for (int i = 0; i < 50; i++) {
                Thread thread = new Thread1(i);
                thread.setName("Thread: " + i);
                thread.start();
            }

    }
}
