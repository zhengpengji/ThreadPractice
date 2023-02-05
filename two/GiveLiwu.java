package ZuoYe.two;

public class GiveLiwu extends Thread{
    static int liWu = 100;

    @Override
    public void run() {
        synchronized (GiveLiwu.class){
            while (liWu>10) {
                liWu--;
                System.out.println(Thread.currentThread().getName()+"送出一份礼物,还剩下"+liWu);
            }
        }
    }
}
