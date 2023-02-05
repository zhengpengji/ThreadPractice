package ZuoYe.Max;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        geTax geTax1 =new geTax();
        geTax geTax2 =new geTax();
        geTax geTax3 =new geTax();

        FutureTask<Integer> futureTask1 =new FutureTask<>(geTax1);
        FutureTask<Integer> futureTask2 =new FutureTask<>(geTax2);
        FutureTask<Integer> futureTask3 =new FutureTask<>(geTax3);

        Thread thread0 =new Thread(futureTask1);
        Thread thread1 =new Thread(futureTask2);
        Thread thread2 =new Thread(futureTask3);

        thread0.start();
        thread1.start();
        thread2.start();
        System.out.println(futureTask1.get());
        System.out.println(futureTask2.get());
        System.out.println(futureTask3.get());
    }
}
