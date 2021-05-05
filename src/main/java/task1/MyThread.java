package task1;

public class MyThread extends Thread {

    public MyThread(String name, ThreadGroup mainGroup) {
        super(mainGroup, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.println("вас приветствует " + getName());
                Thread.sleep(2000);
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
