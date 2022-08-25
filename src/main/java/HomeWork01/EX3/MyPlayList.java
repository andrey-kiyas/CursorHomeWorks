package HomeWork01.EX3;

public class MyPlayList {
    public static void main(String[] args) throws InterruptedException {
        Thread genrePop = new Thread(new GenrePop());
        Thread genreRock = new Thread(new GenreRock());
        Thread genreJazz = new Thread(new GenreJazz());
        Thread genreClassic = new Thread(new GenreClassic());
        Thread genreOpera = new Thread(new GenreOpera());

        genrePop.start();
        genreRock.start();
        genreJazz.start();
        genreClassic.start();
        genreOpera.start();

        Thread.sleep(1000L);
        PlaylistFormation.print();
    }
}