package ZuoYe.Max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Callable;

public class geTax implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        extracted(list);
        Thread.sleep(10);
        return Collections.max(list);
    }

    private static void extracted(ArrayList<Integer> list) {
        Random random =new Random();
        for (int i = 0; i < 100; i++) {
            int i1 = random.nextInt(200,500);
            list.add(i1);
        }
        System.out.println(Thread.currentThread().getName()+"@"+ list);
    }
}
