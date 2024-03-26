import lombok.extern.java.Log;

public class DzThread {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder stringBuilder = new StringBuilder("a");

        MyThread myThread1 = new MyThread(stringBuilder);
        myThread1.start();


        MyThread myThread2 = new MyThread(stringBuilder);
        myThread2.start();


        MyThread myThread3 = new MyThread(stringBuilder);
        myThread3.start();

    }
}
@Log
class MyThread extends Thread {
    private StringBuilder sb;

    public MyThread(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        synchronized (sb){
            for (int i = 0; i < 100; i++) {
               log.info("Значение " + i + ": " + sb);
            }
            char value = sb.charAt(0);
            value++;
            sb.setCharAt(0, value);
        }
    }
}
