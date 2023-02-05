package ZuoYe.five;

import java.util.Arrays;
import java.util.Random;

public class Choujiang implements Runnable{

    static int[] JiangChi={10,5,20,50,100,200,500,800,2,80,300,700};

    public void run() {
        for (int i = 0; i < 100; i++) {

            extracted();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private synchronized void extracted() {
        Random random  =new Random();
        int i = random.nextInt(JiangChi.length);
        System.out.println(Thread.currentThread().getName()+"!"+JiangChi[i]);
    }
}
