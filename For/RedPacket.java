package ZuoYe.For;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class RedPacket {
    public  ArrayBlockingQueue<Double> redPakect() throws InterruptedException {
        ArrayBlockingQueue<Double> arrayBlockingQueue = new ArrayBlockingQueue<>(3);
        int n = 100;
        Random random = new Random();

        double v = random.nextDouble(100);

        double B = random.nextDouble(100);
        double C;
        while (true) {
            if ((v + B) < 100){
             C = 100-v-B;
                break;
            }else {
                double H = random.nextDouble(100);
                B=H;
            }
        }
        arrayBlockingQueue.put(v);
        arrayBlockingQueue.put(B);
        arrayBlockingQueue.put(C);

       return arrayBlockingQueue;

    };


}
