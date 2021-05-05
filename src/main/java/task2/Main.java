package task2;

import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<MyCallable> list = new ArrayList<>();

        MyCallable myCallable = new MyCallable();
        MyCallable myCallable1 = new MyCallable();
        MyCallable myCallable2 = new MyCallable();
        MyCallable myCallable3 = new MyCallable();

        list.add(myCallable);
        list.add(myCallable1);
        list.add(myCallable2);
        list.add(myCallable3);

        final ExecutorService threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        List<Future<Integer>> tasks = threadPool.invokeAll(list);
       /* Integer t = threadPool.invokeAny(list);
        System.out.println(t);*/ // демонстрация метода invokeAny для получения результата самого быстрого потока)
        for (Future<Integer> task : tasks) {
            System.out.println("вывод в главном потоке " + Thread.currentThread().getName() + " , результат " + task.get());
        }
        threadPool.shutdown();
    }
}
