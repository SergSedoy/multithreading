package task2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println("я поток со счетчиком " + Thread.currentThread().getName() + ", выведено сообщений " + count);

            Thread.sleep(1000);
        }
        return count;
    }
}
