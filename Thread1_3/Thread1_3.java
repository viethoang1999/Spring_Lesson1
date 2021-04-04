package Spring_Lesson1.Thread1_3;


    import java.util.Random;
    public class Thread1_3 extends Thread {
        public static int sleep = 2000;
        public static int year;
        public static boolean flag;
    }

    class GenNumber extends Thread {
        @Override
        public void run() {
            while (true) {
                Random random = new Random();
                Thread1_3.year = random.nextInt(999) + 1000;
                System.out.println(Thread.currentThread().getName() + "So 4 chu so: " + Thread1_3.year);
                Thread1_3.flag = true;
                try {
                    Thread.sleep(Thread1_3.sleep);
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
                if (Thread1_3.flag = true) {
                    if (Thread1_3.year % 4 == 0 && Thread1_3.year % 100 != 0) {
                        System.out.println(Thread.currentThread().getName() + "nam " + Thread1_3.year + "la nam nhuan");
                    } else {
                        System.out.println(Thread1_3.currentThread().getName() + "nam " + Thread1_3.year + "ko la nam nhuan");
                    }
                    ;
                    Thread1_3.flag = false;
                }
                try {
                    Thread1_3.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }






