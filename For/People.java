package ZuoYe.For;

import java.util.concurrent.ArrayBlockingQueue;

public class People extends Thread{
    public static ArrayBlockingQueue<Double> A;
    public People(ArrayBlockingQueue<Double> B){
        A=B;
    }

    @Override
    public void run() {
       if (A.size()!=0){
           try {
               System.out.println(Thread.currentThread().getName()+"�����˺��"+A.take());
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }else {
           System.out.println(Thread.currentThread().getName()+"û���������");
       }
    }
}
