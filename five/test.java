package ZuoYe.five;

public class test {
    public static void main(String[] args) {
        Choujiang choujiang =new Choujiang();

        Thread thread1=new Thread(choujiang);
        Thread thread2 =new Thread(choujiang);


            thread1.start();
            thread2.start();

    }
}
