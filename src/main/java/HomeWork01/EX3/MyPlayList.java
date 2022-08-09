package HomeWork01.EX3;

public class MyPlayList {
    public static void main(String[] args) throws InterruptedException {
        Thread genre1 = new Thread(new Genre1());
        Thread genre2 = new Thread(new Genre2());
        Thread genre3 = new Thread(new Genre3());
        Thread genre4 = new Thread(new Genre4());
        Thread genre5 = new Thread(new Genre5());

        genre1.start();
        genre2.start();
        genre3.start();
        genre4.start();
        genre5.start();

        Thread.sleep(1000L);
        PlaylistFormation.print();
    }
}