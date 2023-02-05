package ZuoYe.one;

public class WindouFile extends Thread{
    static int Number = 1000;

    @Override
    public void run() {
        extracted();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private synchronized void extracted() { {
            while (true) {
                if (Number > 0) {
                        Number--;
                        System.out.println(Thread.currentThread().getName()+"手冲次数"+Number);

                } else {
                    System.out.println(Thread.currentThread().getName()+"精尽人亡");
                    break;
                }
            }
        }
    }
}
