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
                        System.out.println(Thread.currentThread().getName()+"�ֳ����"+Number);

                } else {
                    System.out.println(Thread.currentThread().getName()+"��������");
                    break;
                }
            }
        }
    }
}
