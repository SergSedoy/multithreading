package task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("main group");

        Thread tr1 = new MyThread("поточище № 1", mainGroup);
        Thread tr2 = new MyThread("поточище № 2", mainGroup);
        Thread tr3 = new MyThread("поточище № 3", mainGroup);
        Thread tr4 = new MyThread("поточище № 4", mainGroup);

        tr1.start();
        tr2.start();
        tr3.start();
        tr4.start();

        System.out.println("вас приветствует главный " + Thread.currentThread().getName());

        Thread.sleep(10000);

        mainGroup.interrupt();

    }
}
