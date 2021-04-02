package Thread.Thread13;

import java.util.Random;

public class Thread13 extends Thread {
    public static int sleep = 2000;
    public static int year;
    public static boolean flag;
}

class GenNumber extends Thread {
    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            Thread13.year = random.nextInt(999) + 1000;
            System.out.println(Thread.currentThread().getName() + "So 4 chu so: " + Thread13.year);
            Thread13.flag = true;
            try {
                Thread.sleep(Thread13.sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class CheckNumber extends Thread {
    @Override
    public void run() {
        while (true) {
            if (Thread13.flag = true) {
                if (Thread13.year % 4 == 0 && Thread13.year % 100 != 0) {
                    System.out.println(Thread.currentThread().getName() + "nam " + Thread13.year + "la nam nhuan");
                } else {
                    System.out.println(Thread13.currentThread().getName() + "nam " + Thread13.year + "ko la nam nhuan");
                }
                ;
                Thread13.flag = false;
            }
            try {
                Thread13.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}




