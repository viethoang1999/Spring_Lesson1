package Spring_Lesson1.Thread12;

public class Thread12 extends Thread{
    String name;
    int sleep;

    public Thread12(String name,int sleep){
        this.name=name;
        this.sleep=sleep;
        this.setName(name);
    }

    @Override
    public void run() {
        while (true){
            System.out.println(System.currentTimeMillis()+"Thread: "+name);
            try {
                Thread12.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
