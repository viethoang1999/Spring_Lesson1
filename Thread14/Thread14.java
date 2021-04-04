package Spring_Lesson1.Thread14;

import java.util.*;

public class Thread14 {
    public static String key = null;
    public static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put("Monday", " Thu 2");
        map.put("Tuesday", " Thu 3");
        map.put("Wenesday", "Thu 4");
        map.put("Thurday", "Thu 5");
        map.put("Friday", " Thu 6");
        map.put("Saturday", " Thu 7");
        map.put("Sunday", "Chu nhat");

        Number number = new Number();
        Thread genDay = new GenDay(number);
        genDay.setName("Day:");
        Thread checkDay=new CheckDay(number);
        genDay.setName("Thu: ");
        checkDay.start();
        genDay.start();
    }
}

class Number {
    public synchronized void check() {
        if (Thread14.key != null) {
            String value = Thread14.map.get(Thread14.key);
            System.out.println( value);
            Thread14.key = null;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void gen() {
        if (Thread14.key == null) {
            int index = new Random().nextInt(7);
            Set keys = Thread14.map.keySet();
            List<String> keyList = new ArrayList<>(keys);
            Thread14.key = keyList.get(index);
            System.out.print( Thread14.key);
        }
    }
}

class GenDay extends Thread {
    Number number;

    public GenDay(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (true) {
            number.gen();
        }
    }
}

class CheckDay extends Thread {
    Number number;

    public CheckDay(Number number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (true) {
            number.check();
        }
    }
}

