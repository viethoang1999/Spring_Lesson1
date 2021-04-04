package Spring_Lesson1.Thread1;

public class Thread1 extends Thread {
    int n;
    public Thread1(int n) {
        this.n = n;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "STT: " + n);
    }
}
