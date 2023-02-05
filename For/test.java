package ZuoYe.For;

import java.util.concurrent.ArrayBlockingQueue;

public class test {
    public static void main(String[] args) throws InterruptedException {
//        int i=100000;
//        double max=0;
//
//        while (i!=0) {
//            RedPacket Packet =new RedPacket();
//            ArrayBlockingQueue<Double> doubles = Packet.redPakect();
//            System.out.println(doubles);
//            for (int i1 = 0; i1 < doubles.size(); i1++) {
//                double a =doubles.take();
//                if (max<a){
//                    max=a;
//                }
//            }
//            i--;
//        }
//        System.out.println(max);
        RedPacket redPacket =new RedPacket();
        ArrayBlockingQueue<Double> doubles = redPacket.redPakect();
        People people1= new People(doubles);
        People people2= new People(doubles);
        People people3= new People(doubles);  People people4= new People(doubles);  People people5= new People(doubles);
        people1.setName("°¢Ïè");
        people1.start();
        people2.start();
        people3.start();
        people4.start();
        people5.start();



    }
}
