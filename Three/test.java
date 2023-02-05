package ZuoYe.Three;

public class test {
    public static void main(String[] args) {
        getNumber getNumber1 =new getNumber();
        getNumber getNumber2 =new getNumber();
        Thread thread =new Thread(getNumber1);
        Thread thread1=new Thread(getNumber2);
        thread1.start();
        thread.start();

    }
}
