package ZuoYe.one;

public class test {
    public static void main(String[] args) {
        WindouFile windouFile1=new WindouFile();
        WindouFile windouFile2=new WindouFile();
        windouFile1.setName("������");
        windouFile2.setName("������");
        windouFile2.start();
        windouFile1.start();
    }
}
